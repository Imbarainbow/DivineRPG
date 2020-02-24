package divinerpg.entities.base;

import divinerpg.entities.goal.MeleeGoal;
import divinerpg.utils.properties.item.ICreateFireball;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.BossInfo;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerBossInfo;
import net.minecraftforge.fml.network.NetworkHooks;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class DivineBoss extends MonsterEntity implements IRangedAttackMob {
    protected final ServerBossInfo info;
    private final static String colorKey = "ProgressbarColor";
    private final static String specialNameKey = "EntityName";
    private PrioritizedGoal ranged;

    @Deprecated
    private DivineBoss(World world) {
        this(EntityType.WITHER, world, BossInfo.Color.PURPLE, 300);
    }

    public DivineBoss(EntityType<? extends MonsterEntity> type, World world, BossInfo.Color color, int experience) {
        super(type, world);

        info = new ServerBossInfo(getDisplayName(), color, BossInfo.Overlay.PROGRESS);
        info.setDarkenSky(true);

        this.experienceValue = experience;

        enablePersistence();
    }

    /**
     * Gets random color
     */
    protected static BossInfo.Color randomColor() {
        return randomColor(Arrays.asList(BossInfo.Color.values()));
    }

    public static BossInfo.Color randomColor(Collection<BossInfo.Color> colors) {
        Random random = new Random();
        int i = random.nextInt(colors.size());
        return colors.stream().skip(i).findFirst().get();
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(6, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(7, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(7, new RandomWalkingGoal(this, 1));

        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
    }

    @Override
    protected void registerAttributes() {
        super.registerAttributes();

        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3);
        this.getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(50);
    }

    @Override
    public void addTrackingPlayer(ServerPlayerEntity player) {
        super.addTrackingPlayer(player);
        info.addPlayer(player);
    }

    @Override
    public void removeTrackingPlayer(ServerPlayerEntity player) {
        super.removeTrackingPlayer(player);
        info.removePlayer(player);
    }

    @Override
    protected void spawnDrops(DamageSource source) {
        Entity entity = source.getTrueSource();

        int i = net.minecraftforge.common.ForgeHooks.getLootingLevel(this, entity, source);
        this.captureDrops(new java.util.ArrayList<>());

        boolean flag = this.recentlyHit > 0;
        if (this.canDropLoot() && this.world.getGameRules().getBoolean(GameRules.DO_MOB_LOOT)) {
            this.dropLoot(source, flag);
            this.dropSpecialItems(source, i, flag);
        }

        this.dropInventory();

        Collection<ItemEntity> drops = captureDrops(null);
        if (!net.minecraftforge.common.ForgeHooks.onLivingDrops(this, source, drops, i, recentlyHit > 0)
                && !drops.isEmpty()) {

            onDrop(drops);
        }
    }

    @Override
    public final boolean isNonBoss() {
        return false;
    }

    @Override
    public void read(CompoundNBT compound) {
        super.read(compound);

        if (compound.contains(colorKey))
            info.setColor(BossInfo.Color.byName(compound.getString(colorKey)));

        if (compound.contains(specialNameKey))
            setCustomName(new StringTextComponent(compound.getString(specialNameKey)));
    }

    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);

        compound.putString(colorKey, info.getColor().getName());

        if (hasCustomName() && getCustomName() != null)
            compound.putString(specialNameKey, this.getCustomName().getFormattedText());
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////
    // Helping methods
    ///////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    protected void updateAITasks() {
        super.updateAITasks();

        this.info.setPercent(this.getHealth() / this.getMaxHealth());

        if (ranged != null)
            rangedDamageTask();
    }

    protected void putInPlayerInventory(List<ItemEntity> drops, PlayerEntity player) {
        while (!drops.isEmpty()) {
            ItemStack stack = drops.get(0).getItem();
            if (!player.inventory.addItemStackToInventory(stack))
                break;

            drops.remove(0);
        }
    }

    protected void putDropInTheWorld(List<ItemEntity> drops) {
        while (!drops.isEmpty()) {
            world.addEntity(drops.get(0));
            drops.remove(0);
        }
    }

    /**
     * Launches current arrow
     *
     * @param target - victim
     * @param bullet - arrow entity
     * @param <T>    - type of arrow entity
     */
    protected <T extends Entity & IProjectile> void launchArrow(LivingEntity target, T bullet) {
        double x = target.serverPosX - this.serverPosX;
        double y = target.getBoundingBox().minY + (double) (target.getHeight() / 3.0F) - bullet.serverPosY;
        double z = target.serverPosZ - this.serverPosZ;
        double xzVec = (double) MathHelper.sqrt(x * x + z * z);

        bullet.shoot(x, y + xzVec * (double) 0.2F, z, getArrowVelocity(), getInaccuracy());
        this.playSound(getShootSound(), 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.world.addEntity(bullet);
    }

    protected float getInaccuracy() {
        return 14 - this.world.getDifficulty().getId() * 4;
    }

    protected float getArrowVelocity() {
        return 1.6F;
    }

    /**
     * Creates fireball and launch it
     *
     * @param target         - victim
     * @param createFireball - create fireball func
     * @return
     */
    protected Entity createFireball(LivingEntity target, ICreateFireball createFireball) {
        double distance = this.getDistanceSq(target);
        float f = MathHelper.sqrt(MathHelper.sqrt(distance)) * 0.5F;

        double x = target.serverPosX - this.serverPosX;
        double y = target.getBoundingBox().minY + (double) (target.getHeight() / 2.0F) - (this.serverPosY + (double) (this.getHeight() / 2.0F));
        double z = target.serverPosZ - this.serverPosZ;

        return createFireball.createFireball(this.world, this, x + this.getRNG().nextGaussian() * (double) f, y, z + this.getRNG().nextGaussian() * (double) f);
    }

    protected SoundEvent getShootSound() {
        return SoundEvents.ENTITY_SKELETON_SHOOT;
    }

    /**
     * Init attack target ai
     */
    protected void initAI(boolean isArcher, boolean isMeelee) {
        if (isMeelee) {
            this.goalSelector.addGoal(2, new MeleeGoal(this, 1, true));
        }

        if (isArcher) {
            initArcher(20);
        }
    }

    protected void initArcher(int attackTime) {
        ranged = new PrioritizedGoal(1, new RangedAttackGoal(this, 1, attackTime, (float) getAttribute(SharedMonsterAttributes.FOLLOW_RANGE).getValue()));
    }

    /**
     * Init base attributes
     */
    protected void initAttr(float health, float attack, float armor) {
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(health);
        this.getAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(attack);
        this.getAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(armor);
    }

    /**
     * Puts item into slot and gives no chanse to drop it
     *
     * @param type - slot type
     * @param item - item
     */
    protected void putItem(EquipmentSlotType type, IItemProvider item) {
        PeacefullDivineMonster.putItem(this, type, item);
    }

    /////////////////////
    // Private
    ////////////////////
    private void onDrop(Collection<ItemEntity> items) {
        List<ItemEntity> actual = items.stream().filter(x -> x != null && !x.getItem().isEmpty()).collect(Collectors.toList());
        if (actual.isEmpty())
            return;

        if (attackingPlayer != null) {
            putInPlayerInventory(actual, attackingPlayer);
        }

        if (actual.isEmpty())
            return;

        putDropInTheWorld(actual);
    }

    private void rangedDamageTask() {
        if (ranged == null)
            return;

        if (ranged.isRunning()) {
            if (ranged.shouldContinueExecuting()) {
                ranged.tick();
            } else {
                ranged.resetTask();
            }
        } else if (ranged.shouldExecute()) {
            ranged.startExecuting();
        }
    }
}