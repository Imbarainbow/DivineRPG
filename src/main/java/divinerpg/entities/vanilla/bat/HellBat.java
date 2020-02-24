package divinerpg.entities.vanilla.bat;

import divinerpg.registry.EntitiesRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class HellBat extends JungleBat {
    public HellBat(World world) {
        super(EntitiesRegistry.hell_bat, world);
    }

    public HellBat(EntityType<? extends Entity> type, World world) {
        this(world);
    }

    @Override
    protected void onHit(@Nonnull LivingEntity victim) {
        victim.setFire(5);
    }

    @Override
    public void livingTick() {
        super.livingTick();

        world.addParticle(ParticleTypes.FLAME, serverPosX + getRandom(), serverPosX + getRandom(), serverPosZ + getRandom(),
                getRandom() / 10, getRandom() / 10, getRandom() / 10);
    }

    private float getRandom() {
        return rand.nextFloat() * 2 - 1;
    }
}