package divinerpg.registry;

import divinerpg.DivineRPG;
import divinerpg.entities.apalachia.warrior.EnchantedWarrior;
import divinerpg.entities.apalachia.warrior.EnchantedWarriorRender;
import divinerpg.entities.base.DivineFireball;
import divinerpg.entities.bosses.ancient.AncientEntity;
import divinerpg.entities.bosses.ancient.AncientEntityRender;
import divinerpg.entities.bosses.ayeraco.Ayeraco;
import divinerpg.entities.bosses.ayeraco.AyeracoRender;
import divinerpg.entities.bosses.deamon.TwilightDemon;
import divinerpg.entities.bosses.deamon.TwilightDemonRender;
import divinerpg.entities.bosses.densos.Densos;
import divinerpg.entities.bosses.densos.DensosRender;
import divinerpg.entities.bosses.densos.Reyvor;
import divinerpg.entities.bosses.etheral.EternalArcher;
import divinerpg.entities.bosses.etheral.EternalArcherRender;
import divinerpg.entities.bosses.fiend.SoulFiend;
import divinerpg.entities.bosses.fiend.SoulFiendRender;
import divinerpg.entities.bosses.fiend.pet.SoulSpider;
import divinerpg.entities.bosses.fiend.pet.SoulSpiderRender;
import divinerpg.entities.bosses.karot.Karot;
import divinerpg.entities.bosses.karot.KarotRender;
import divinerpg.entities.bosses.scorcher.KingOfScorchers;
import divinerpg.entities.bosses.scorcher.KingScorcherRender;
import divinerpg.entities.bosses.vamacheron.Vamacheron;
import divinerpg.entities.bosses.vamacheron.VamacheronRender;
import divinerpg.entities.bosses.watcher.Watcher;
import divinerpg.entities.bosses.watcher.WatcherRender;
import divinerpg.entities.eden.archer.SunArcher;
import divinerpg.entities.eden.archer.SunArcherRender;
import divinerpg.entities.eden.bunny.angry.AngryBunny;
import divinerpg.entities.eden.bunny.angry.AngryBunnyRender;
import divinerpg.entities.eden.bunny.pet.Bunny;
import divinerpg.entities.eden.bunny.pet.BunnyRender;
import divinerpg.entities.eden.feet.Greenfeet;
import divinerpg.entities.eden.feet.GreenfeetRender;
import divinerpg.entities.eden.madivel.Madivel;
import divinerpg.entities.eden.madivel.MadivelRender;
import divinerpg.entities.fireball.FrostFireball;
import divinerpg.entities.fireball.ScorcherFireball;
import divinerpg.entities.iceika.alicanto.Alicanto;
import divinerpg.entities.iceika.alicanto.AlicantoRender;
import divinerpg.entities.iceika.archer.FrostArcher;
import divinerpg.entities.iceika.archer.FrostArcherRender;
import divinerpg.entities.iceika.fractile.Fractite;
import divinerpg.entities.iceika.fractile.FractiteRender;
import divinerpg.entities.iceika.frosty.Frosty;
import divinerpg.entities.iceika.frosty.FrostyRender;
import divinerpg.entities.iceika.glacide.Glacide;
import divinerpg.entities.iceika.glacide.GlacideRender;
import divinerpg.entities.iceika.hastreus.Hastreus;
import divinerpg.entities.iceika.hastreus.HastreusRender;
import divinerpg.entities.iceika.merchant.WorkshopMerchantRender;
import divinerpg.entities.iceika.merchant.entities.WorkshopMerchant;
import divinerpg.entities.iceika.merchant.entities.WorkshopTinkerer;
import divinerpg.entities.iceika.rollum.Rollum;
import divinerpg.entities.iceika.rollum.RollumRender;
import divinerpg.entities.mortum.basilisk.Basilisk;
import divinerpg.entities.mortum.basilisk.BasiliskRender;
import divinerpg.entities.mortum.deamon.DemonOfDarkness;
import divinerpg.entities.mortum.deamon.DemonOfDarknessRender;
import divinerpg.entities.mortum.sorcerer.Sorcerer;
import divinerpg.entities.mortum.sorcerer.SorcererRender;
import divinerpg.entities.mortum.stealer.SoulStealer;
import divinerpg.entities.mortum.stealer.SoulStealerRender;
import divinerpg.entities.projectiles.Bullet.BulletEntity;
import divinerpg.entities.projectiles.Bullet.BulletEntityRender;
import divinerpg.entities.projectiles.DivineArrow.DivineArrow;
import divinerpg.entities.projectiles.DivineArrow.DivineArrowRender;
import divinerpg.entities.projectiles.ItemBulletEntity;
import divinerpg.entities.projectiles.SoulFiendShot;
import divinerpg.entities.skythern.fiend.SkythernFiend;
import divinerpg.entities.skythern.fiend.SkythernFiendRender;
import divinerpg.entities.skythern.megalith.Megalith;
import divinerpg.entities.skythern.megalith.MegalithRender;
import divinerpg.entities.twilight.archer.ArcherRender;
import divinerpg.entities.twilight.archer.entiites.EnchantedArcher;
import divinerpg.entities.twilight.archer.entiites.SkythernArcher;
import divinerpg.entities.twilight.archer.twilight.TwilightArcher;
import divinerpg.entities.twilight.archer.twilight.TwilightArcherRender;
import divinerpg.entities.twilight.cadilion.CadilionRender;
import divinerpg.entities.twilight.cadilion.enitities.ApalachiaCadilion;
import divinerpg.entities.twilight.cadilion.enitities.EdenCadilion;
import divinerpg.entities.twilight.cadilion.enitities.MortumCadilion;
import divinerpg.entities.twilight.cadilion.enitities.WildwoodCadilion;
import divinerpg.entities.twilight.cori.CoriRender;
import divinerpg.entities.twilight.cori.entities.AdvancedCori;
import divinerpg.entities.twilight.cori.entities.WeakCori;
import divinerpg.entities.twilight.golem.GolemRender;
import divinerpg.entities.twilight.golem.entities.ApalachiaGolem;
import divinerpg.entities.twilight.golem.entities.SkythernGolem;
import divinerpg.entities.twilight.golem.entities.WildwoodGolem;
import divinerpg.entities.twilight.mystic.MysticRender;
import divinerpg.entities.twilight.mystic.entities.Mystic;
import divinerpg.entities.twilight.mystic.entities.Spellbinder;
import divinerpg.entities.twilight.samek.SamekRender;
import divinerpg.entities.twilight.samek.entities.Samek;
import divinerpg.entities.twilight.samek.entities.Verek;
import divinerpg.entities.twilight.tomo.TomoRender;
import divinerpg.entities.twilight.tomo.entities.ApalachiaTomo;
import divinerpg.entities.twilight.tomo.entities.EdenTomo;
import divinerpg.entities.twilight.tomo.entities.WildwoodTomo;
import divinerpg.entities.vanilla.arid.AridWarrior;
import divinerpg.entities.vanilla.arid.AridWarriorRender;
import divinerpg.entities.vanilla.bat.DivineBatRender;
import divinerpg.entities.vanilla.bat.HellBat;
import divinerpg.entities.vanilla.bat.JungleBat;
import divinerpg.entities.vanilla.bat.rainbour.Rainbour;
import divinerpg.entities.vanilla.bat.rainbour.RainbourRender;
import divinerpg.entities.vanilla.crab.king.KingCrab;
import divinerpg.entities.vanilla.crab.king.KingCrabRender;
import divinerpg.entities.vanilla.crab.regular.Crab;
import divinerpg.entities.vanilla.crab.regular.CrabRender;
import divinerpg.entities.vanilla.crawler.CrawlerRender;
import divinerpg.entities.vanilla.crawler.cave.CaveCrawler;
import divinerpg.entities.vanilla.crawler.desert.DesertCrawler;
import divinerpg.entities.vanilla.cyclop.cave.Cavelops;
import divinerpg.entities.vanilla.cyclop.cave.CavelopsRender;
import divinerpg.entities.vanilla.cyclop.regular.Cyclops;
import divinerpg.entities.vanilla.cyclop.regular.CyclopsRender;
import divinerpg.entities.vanilla.dramcryx.enthralled.EnthralledDramcryx;
import divinerpg.entities.vanilla.dramcryx.enthralled.EnthralledDramcryxRender;
import divinerpg.entities.vanilla.dramcryx.jungle.JungleDramcryx;
import divinerpg.entities.vanilla.dramcryx.jungle.JungleDramcryxRender;
import divinerpg.entities.vanilla.eye.Eye;
import divinerpg.entities.vanilla.eye.EyeRender;
import divinerpg.entities.vanilla.frost.Frost;
import divinerpg.entities.vanilla.frost.FrostRender;
import divinerpg.entities.vanilla.glacon.Glacon;
import divinerpg.entities.vanilla.glacon.GlaconRender;
import divinerpg.entities.vanilla.grue.Grue;
import divinerpg.entities.vanilla.grue.GrueRender;
import divinerpg.entities.vanilla.jack.JackOMan;
import divinerpg.entities.vanilla.jack.JackOManRender;
import divinerpg.entities.vanilla.koblin.Kobblin;
import divinerpg.entities.vanilla.koblin.KobblinRender;
import divinerpg.entities.vanilla.miner.Miner;
import divinerpg.entities.vanilla.miner.MinerRender;
import divinerpg.entities.vanilla.pig.HellPig;
import divinerpg.entities.vanilla.pig.HellPigRender;
import divinerpg.entities.vanilla.rotatick.Rotatick;
import divinerpg.entities.vanilla.rotatick.RotatickRender;
import divinerpg.entities.vanilla.scorcher.Scorcher;
import divinerpg.entities.vanilla.scorcher.ScorcherRender;
import divinerpg.entities.vanilla.spider.ender.EnderSpider;
import divinerpg.entities.vanilla.spider.ender.EnderSpiderRender;
import divinerpg.entities.vanilla.spider.hell.HellSpider;
import divinerpg.entities.vanilla.spider.hell.HellSpiderRender;
import divinerpg.entities.vanilla.spider.jungle.JungleSpider;
import divinerpg.entities.vanilla.spider.jungle.JungleSpiderRender;
import divinerpg.entities.vanilla.spider.pumpkin.PumpkinSpider;
import divinerpg.entities.vanilla.spider.pumpkin.PumpkinSpiderRender;
import divinerpg.entities.vanilla.triplets.EnderTriplets;
import divinerpg.entities.vanilla.triplets.EnderTripletsRender;
import divinerpg.entities.vanilla.watcher.ender.EnderWatcher;
import divinerpg.entities.vanilla.watcher.ender.EnderWatcherRender;
import divinerpg.entities.vanilla.wildfire.Wildfire;
import divinerpg.entities.vanilla.wildfire.WildfireRender;
import divinerpg.entities.vanilla.worm.SaguaroWorm;
import divinerpg.entities.vanilla.worm.SaguaroWormRender;
import divinerpg.entities.wildwood.begemoth.Behemoth;
import divinerpg.entities.wildwood.begemoth.BehemothRender;
import divinerpg.entities.wildwood.epiphite.Epiphite;
import divinerpg.entities.wildwood.epiphite.EpiphiteRender;
import divinerpg.entities.wildwood.mage.Mage;
import divinerpg.entities.wildwood.mage.MageRender;
import divinerpg.entities.wildwood.wolf.MoonWolf;
import divinerpg.entities.wildwood.wolf.MoonWolfRender;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Function;

@Mod.EventBusSubscriber(modid = DivineRPG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DivineRPG.MODID)
public class EntitiesRegistry {

    @ObjectHolder("bullet_item_entity")
    public static EntityType<ItemBulletEntity> bullet_item_entity = null;
    @ObjectHolder("bullet_entity")
    public static EntityType<BulletEntity> bullet_entity = null;
    @ObjectHolder("arrow_entity")
    public static EntityType<DivineArrow> arrow_entity = null;

    @ObjectHolder("divine_fireball")
    public static EntityType<DivineFireball> divine_fireball = null;
    @ObjectHolder("frost_shot")
    public static EntityType<FrostFireball> frost_shot = null;

    @ObjectHolder("soul_fiend_shot")
    public static EntityType<SoulFiendShot> soul_fiend_shot;

    @ObjectHolder("entrhralled_dramcryx")
    public static EntityType<EnthralledDramcryx> entrhralled_dramcryx = null;
    @ObjectHolder("crab")
    public static EntityType<Crab> crab = null;
    @ObjectHolder("jungle_dramcryx")
    public static EntityType<JungleDramcryx> jungle_dramcryx = null;
    @ObjectHolder("frost")
    public static EntityType<Frost> frost = null;
    @ObjectHolder("glacon")
    public static EntityType<Glacon> glacon = null;
    @ObjectHolder("rotatick")
    public static EntityType<Rotatick> rotatick = null;
    @ObjectHolder("king_crab")
    public static EntityType<KingCrab> king_crab = null;
    @ObjectHolder("jungle_spider")
    public static EntityType<JungleSpider> jungle_spider = null;
    @ObjectHolder("hell_spider")
    public static EntityType<HellSpider> hell_spider = null;
    @ObjectHolder("ender_spider")
    public static EntityType<EnderSpider> ender_spider = null;
    @ObjectHolder("ender_watcher")
    public static EntityType<EnderWatcher> ender_watcher = null;
    @ObjectHolder("ender_triplets")
    public static EntityType<EnderTriplets> ender_triplets = null;
    @ObjectHolder("scorcher")
    public static EntityType<Scorcher> scorcher = null;
    @ObjectHolder("scorcher_fireball")
    public static EntityType<ScorcherFireball> scorcher_fireball = null;
    @ObjectHolder("wildfire")
    public static EntityType<Wildfire> wildfire = null;
    @ObjectHolder("grue")
    public static EntityType<Grue> grue = null;
    @ObjectHolder("cave_crawler")
    public static EntityType<CaveCrawler> cave_crawler = null;
    @ObjectHolder("desert_crawler")
    public static EntityType<DesertCrawler> desert_crawler = null;
    @ObjectHolder("cavelops")
    public static EntityType<Cavelops> cavelops = null;
    @ObjectHolder("cyclops")
    public static EntityType<Cyclops> cyclops = null;
    @ObjectHolder("miner")
    public static EntityType<Miner> miner = null;
    @ObjectHolder("jungle_bat")
    public static EntityType<JungleBat> jungle_bat = null;
    @ObjectHolder("hell_bat")
    public static EntityType<HellBat> hell_bat = null;
    @ObjectHolder("eye")
    public static EntityType<Eye> eye = null;
    @ObjectHolder("kobblin")
    public static EntityType<Kobblin> koblin = null;
    @ObjectHolder("rainbour")
    public static EntityType<Rainbour> rainbour = null;
    @ObjectHolder("saguaro_worm")
    public static EntityType<SaguaroWorm> saguaro_worm = null;
    @ObjectHolder("arid_warrior")
    public static EntityType<AridWarrior> arid_warrior = null;
    @ObjectHolder("pumpkin_spider")
    public static EntityType<PumpkinSpider> pumpkin_spider = null;
    @ObjectHolder("eden_tomo")
    public static EntityType<EdenTomo> eden_tomo = null;
    @ObjectHolder("wildwood_tomo")
    public static EntityType<WildwoodTomo> wildwood_tomo = null;
    @ObjectHolder("apalachia_tomo")
    public static EntityType<ApalachiaTomo> apalachia_tomo = null;
    @ObjectHolder("eden_cadillion")
    public static EntityType<EdenCadilion> eden_cadillion = null;
    @ObjectHolder("wildwood_cadillion")
    public static EntityType<WildwoodCadilion> wildwood_cadillion = null;
    @ObjectHolder("apalachia_cadillion")
    public static EntityType<ApalachiaCadilion> apalachia_cadillion = null;
    @ObjectHolder("mortum_cadillion")
    public static EntityType<MortumCadilion> mortum_cadillion = null;
    @ObjectHolder("weak_cori")
    public static EntityType<WeakCori> weak_cori;
    @ObjectHolder("advanced_cori")
    public static EntityType<AdvancedCori> advanced_cori;
    @ObjectHolder("moon_wolf")
    public static EntityType<MoonWolf> moon_wolf;
    @ObjectHolder("hell_pig")
    public static EntityType<HellPig> hell_pig;
    @ObjectHolder("bunny")
    public static EntityType<Bunny> bunny;
    @ObjectHolder("angry_bunny")
    public static EntityType<AngryBunny> angry_bunny;
    @ObjectHolder("greenfeet")
    public static EntityType<Greenfeet> greenfeet;
    @ObjectHolder("madivel")
    public static EntityType<Madivel> madivel;
    @ObjectHolder("sun_archer")
    public static EntityType<SunArcher> sun_archer;
    @ObjectHolder("epiphite")
    public static EntityType<Epiphite> epiphite;
    @ObjectHolder("wildwood_golem")
    public static EntityType<WildwoodGolem> wildwood_golem;
    @ObjectHolder("apalachia_golem")
    public static EntityType<ApalachiaGolem> apalachia_golem;
    @ObjectHolder("skythern_golem")
    public static EntityType<SkythernGolem> skythern_golem;
    @ObjectHolder("enchanted_archer")
    public static EntityType<EnchantedArcher> enchanted_archer;
    @ObjectHolder("enchanted_warrior")
    public static EntityType<EnchantedWarrior> enchanted_warrior;
    @ObjectHolder("spellbinder")
    public static EntityType<Spellbinder> spellbinder;
    @ObjectHolder("mystic")
    public static EntityType<Mystic> mystic;
    @ObjectHolder("samek")
    public static EntityType<Samek> samek;
    @ObjectHolder("skythern_fiend")
    public static EntityType<SkythernFiend> skythern_fiend;
    @ObjectHolder("verek")
    public static EntityType<Verek> verek;
    @ObjectHolder("mage")
    public static EntityType<Mage> mage;
    @ObjectHolder("skythern_archer")
    public static EntityType<SkythernArcher> skythern_archer;
    @ObjectHolder("twilight_archer")
    public static EntityType<TwilightArcher> twilight_archer;
    @ObjectHolder("megalith")
    public static EntityType<Megalith> megalith;
    @ObjectHolder("demon_of_darkness")
    public static EntityType<DemonOfDarkness> demon_of_darkness;
    @ObjectHolder("basilisk")
    public static EntityType<Basilisk> basilisk;
    @ObjectHolder("sorcerer")
    public static EntityType<Sorcerer> sorcerer;
    @ObjectHolder("soul_stealer")
    public static EntityType<SoulStealer> soul_stealer;
    @ObjectHolder("vamacheron")
    public static EntityType<Vamacheron> vamacheron;
    @ObjectHolder("ayeraco")
    public static EntityType<Ayeraco> ayeraco;
    @ObjectHolder("behemoth")
    public static EntityType<Behemoth> behemoth;
    @ObjectHolder("ancient_entity")
    public static EntityType<AncientEntity> ancient_entity;
    @ObjectHolder("twilight_demon")
    public static EntityType<TwilightDemon> twilight_demon;
    @ObjectHolder("the_watcher")
    public static EntityType<Watcher> the_watcher;
    @ObjectHolder("densos")
    public static EntityType<Densos> densos;
    @ObjectHolder("reyvor")
    public static EntityType<Reyvor> reyvor;
    @ObjectHolder("eternal_archer")
    public static EntityType<EternalArcher> eternal_archer;
    @ObjectHolder("soul_fiend")
    public static EntityType<SoulFiend> soul_fiend;
    @ObjectHolder("soul_spider")
    public static EntityType<SoulSpider> soul_spider;
    @ObjectHolder("karot")
    public static EntityType<Karot> karot;
    @ObjectHolder("king_of_scorchers")
    public static EntityType<KingOfScorchers> king_of_scorchers;
    @ObjectHolder("alicanto")
    public static EntityType<Alicanto> alicanto;
    @ObjectHolder("fractite")
    public static EntityType<Fractite> fractite;
    @ObjectHolder("workshop_merchant")
    public static EntityType<WorkshopMerchant> workshop_merchant;
    @ObjectHolder("workshop_tinkerer")
    public static EntityType<WorkshopTinkerer> workshop_tinkerer;
    @ObjectHolder("jack_o_man")
    public static EntityType<? extends JackOMan> jack_o_man;
    @ObjectHolder("frost_archer")
    public static EntityType<? extends FrostArcher> frost_archer;
    @ObjectHolder("frosty")
    public static EntityType<? extends Frosty> frosty;
    @ObjectHolder("glacide")
    public static EntityType<? extends Glacide> glacide;
    @ObjectHolder("rollum")
    public static EntityType<? extends Rollum> rollum;
    @ObjectHolder("hastreus")
    public static EntityType<? extends Hastreus> hastreus;


    @SubscribeEvent
    public static void registerRenders(final RegistryEvent.Register<EntityType<?>> e) {
        IForgeRegistry<EntityType<?>> registry = e.getRegistry();

        registerBulletEntity(registry, ItemBulletEntity::new, w -> bullet_item_entity.create(w), "bullet_item_entity");
        registerBulletEntity(registry, BulletEntity::new, w -> bullet_entity.create(w), "bullet_entity");
        registerBulletEntity(registry, DivineArrow::new, w -> arrow_entity.create(w), "arrow_entity");
        registerBulletEntity(registry, FrostFireball::new, w -> frost_shot.create(w), "frost_fireball");
        registerBulletEntity(registry, ScorcherFireball::new, w -> scorcher_fireball.create(w), "scorcher_fireball");
        registerBulletEntity(registry, DivineFireball::new, w -> divine_fireball.create(w), "divine_fireball");
        registerBulletEntity(registry, SoulFiendShot::new, w -> soul_fiend_shot.create(w), "soul_fiend_shot");

        registerSingle(registry, EnthralledDramcryx::new, "entrhralled_dramcryx", 1.35F, 1.75F);
        registerSingle(registry, Crab::new, "crab", 1.1F, 0.8F);
        registerSingle(registry, JungleDramcryx::new, "jungle_dramcryx", 1, 1.3F);
        registerSingle(registry, Frost::new, "frost", 1, 1);
        registerSingle(registry, Glacon::new, "glacon", 0.8F, 1.4f);
        registerSingle(registry, Rotatick::new, "rotatick", 0.85F, 1);
        registerSingle(registry, KingCrab::new, "king_crab", 1.8F, 1.7F);
        registerSingle(registry, JungleSpider::new, "jungle_spider", 1.4F, 0.9F);
        registerSingle(registry, HellSpider::new, "hell_spider", 1.4F, 0.9F);
        registerSingle(registry, EnderSpider::new, "ender_spider", 0.5F, 0.55F);
        registerSingle(registry, EnderWatcher::new, "ender_watcher", 0.7F, 0.9F);
        registerSingle(registry, EnderTriplets::new, "ender_triplets", 0.7F, 0.9F);
        registerImmunedToFire(registry, Scorcher::new, "scorcher", 1.2F, 2);
        registerSingle(registry, Wildfire::new, "wildfire", 0.8F, 2.2F);
        registerSingle(registry, Grue::new, "grue", 0.8F, 1.9F);
        registerSingle(registry, CaveCrawler::new, "cave_crawler", 1, 1.5F);
        registerSingle(registry, DesertCrawler::new, "desert_crawler", 1, 1.5F);
        registerSingle(registry, Cavelops::new, "cavelops", 1.2F, 4);
        registerSingle(registry, Cyclops::new, "cyclops", 1.2F, 4);
        registerSingle(registry, Miner::new, "miner", 0.6F, 2);
        registerSingle(registry, JungleBat::new, "jungle_bat", 0.7F, 1);
        registerSingle(registry, HellBat::new, "hell_bat", 0.7F, 1);
        registerSingle(registry, Eye::new, "eye", 1.3F, 2);
        registerSingle(registry, Kobblin::new, "kobblin", 0.75F, 1);
        registerSingle(registry, Rainbour::new, "rainbour", 1, 1);
        registerSingle(registry, SaguaroWorm::new, "saguaro_worm", 1, 3);
        registerSingle(registry, AridWarrior::new, "arid_warrior", 1.4F, 2.8f);
        registerSingle(registry, PumpkinSpider::new, "pumpkin_spider", 0.6F, 0.85F);

        // Twilight
        registerSingle(registry, EdenTomo::new, "eden_tomo", 1, 1);
        registerSingle(registry, WildwoodTomo::new, "wildwood_tomo", 1, 1);
        registerSingle(registry, ApalachiaTomo::new, "apalachia_tomo", 1, 1);

        registerSingle(registry, EdenCadilion::new, "eden_cadillion", 1, 1.5F);
        registerSingle(registry, WildwoodCadilion::new, "wildwood_cadillion", 1, 1.5F);
        registerSingle(registry, ApalachiaCadilion::new, "apalachia_cadillion", 1, 1.5F);
        registerSingle(registry, MortumCadilion::new, "mortum_cadillion", 1, 1.5F);

        registerSingle(registry, WeakCori::new, "weak_cori", 0.6F, 1.5F);
        registerSingle(registry, AdvancedCori::new, "advanced_cori", 0.6F, 1.5F);

        registerSingle(registry, WildwoodGolem::new, "wildwood_golem", 1.3F, 2.9F);
        registerSingle(registry, ApalachiaGolem::new, "apalachia_golem", 1.3F, 2.9F);
        registerSingle(registry, SkythernGolem::new, "skythern_golem", 1.3F, 2.9F);

        registerSingle(registry, Spellbinder::new, "spellbinder", 0.5F, 2.2F);
        registerSingle(registry, Mystic::new, "mystic", 0.5F, 2.2F);

        registerSingle(registry, EnchantedWarrior::new, "enchanted_warrior", 0.6F, 2);
        registerSingle(registry, Samek::new, "samek", 0.6F, 2);
        registerSingle(registry, SkythernFiend::new, "skythern_fiend", 0.6F, 2);
        registerSingle(registry, Verek::new, "verek", 0.6F, 2);

        registerSingle(registry, EnchantedArcher::new, "enchanted_archer", 1.8F, 3.0F);
        registerSingle(registry, SkythernArcher::new, "skythern_archer", 1.8F, 3.0F);
        registerSingle(registry, TwilightArcher::new, "twilight_archer", 1.8F, 3.0F);

        registerSingle(registry, MoonWolf::new, EntityClassification.CREATURE, "moon_wolf", 1.25F, 1);
        registerSingle(registry, HellPig::new, EntityClassification.CREATURE, "hell_pig", 1, 0.9F);
        registerSingle(registry, Bunny::new, EntityClassification.CREATURE, "bunny", 0.5F, 0.7F);

        registerSingle(registry, AngryBunny::new, "angry_bunny", 1.1F, 1.8F);
        registerSingle(registry, Greenfeet::new, "greenfeet", 1, 2);
        registerSingle(registry, Madivel::new, "madivel", 0.6F, 2.9F);
        registerSingle(registry, SunArcher::new, "sun_archer", 0.8F, 2.2F);

        registerImmunedToFire(registry, Epiphite::new, "epiphite", 0.9F, 1.3F);
        registerImmunedToFire(registry, Watcher::new, "the_watcher", 4, 4);


        registerSingle(registry, Mage::new, "mage", 0.5F, 2.2F);
        registerSingle(registry, Megalith::new, "megalith", 1.2F, 4);
        registerSingle(registry, DemonOfDarkness::new, "demon_of_darkness", 0.8F, 1.6F);
        registerSingle(registry, Basilisk::new, "basilisk", 0.7F, 0.8F);
        registerSingle(registry, Sorcerer::new, "sorcerer", 0.5F, 2.2F);
        registerSingle(registry, SoulStealer::new, "soul_stealer", 0.8F, 2);
        registerSingle(registry, Vamacheron::new, "vamacheron", 1.45F, 2.2F);
        registerSingle(registry, Behemoth::new, "behemoth", 1, 1.2F);
        registerSingle(registry, Ayeraco::new, "ayeraco", 2.8F, 1.2F);
        registerSingle(registry, AncientEntity::new, "ancient_entity", 6, 10);
        registerSingle(registry, TwilightDemon::new, "twilight_demon", 2, 4);
        registerSingle(registry, Densos::new, "densos", 1, 2.5F);
        registerSingle(registry, Reyvor::new, "reyvor", 1, 2.5F);
        registerSingle(registry, EternalArcher::new, "eternal_archer", 3, 5);
        registerSingle(registry, SoulSpider::new, "soul_spider", 0.3F, 0.5F);
        registerSingle(registry, SoulFiend::new, "soul_fiend", 0.8F, 2);
        registerSingle(registry, Karot::new, "karot", 3.25F, 4);
        registerImmunedToFire(registry, KingOfScorchers::new, "king_of_scorchers", 2, 2.5F);

        registerImmunedToFire(registry, Alicanto::new, "alicanto", 1.2F, 1.6F);
        registerImmunedToFire(registry, Fractite::new, "fractite", 1.2F, 1.6F);
        registerImmunedToFire(registry, WorkshopMerchant::new, "workshop_merchant", 1, 2);
        registerImmunedToFire(registry, WorkshopTinkerer::new, "workshop_tinkerer", 1, 2);
        registerImmunedToFire(registry, JackOMan::new, "jack_o_man", 1, 2);
        registerImmunedToFire(registry, FrostArcher::new, "frost_archer", 0.6F, 2);
        registerImmunedToFire(registry, Frosty::new, "frosty", 0.9F, 2.5F);
        registerImmunedToFire(registry, Glacide::new, "glacide", 0.9F, 2);
        registerImmunedToFire(registry, Rollum::new, "rollum", 1.2F, 2);
        registerImmunedToFire(registry, Hastreus::new, "hastreus", 1, 1.9F);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRender() {
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();

        // projectiles
        registerForOneRender(BulletEntityRender::new, bullet_entity, frost_shot, scorcher_fireball, soul_fiend_shot);

        RenderingRegistry.registerEntityRenderingHandler(arrow_entity, DivineArrowRender::new);
        RenderingRegistry.registerEntityRenderingHandler(bullet_item_entity, factory -> new SpriteRenderer<>(factory, itemRenderer));

        RenderingRegistry.registerEntityRenderingHandler(entrhralled_dramcryx, EnthralledDramcryxRender::new);
        RenderingRegistry.registerEntityRenderingHandler(jungle_dramcryx, JungleDramcryxRender::new);
        RenderingRegistry.registerEntityRenderingHandler(crab, CrabRender::new);
        RenderingRegistry.registerEntityRenderingHandler(frost, FrostRender::new);
        RenderingRegistry.registerEntityRenderingHandler(glacon, GlaconRender::new);
        RenderingRegistry.registerEntityRenderingHandler(rotatick, RotatickRender::new);
        RenderingRegistry.registerEntityRenderingHandler(king_crab, KingCrabRender::new);
        RenderingRegistry.registerEntityRenderingHandler(jungle_spider, JungleSpiderRender::new);
        RenderingRegistry.registerEntityRenderingHandler(hell_spider, HellSpiderRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ender_spider, EnderSpiderRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ender_watcher, EnderWatcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ender_triplets, EnderTripletsRender::new);
        RenderingRegistry.registerEntityRenderingHandler(scorcher, ScorcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(wildfire, WildfireRender::new);
        RenderingRegistry.registerEntityRenderingHandler(grue, GrueRender::new);

        registerForOneRender(CrawlerRender::new, cave_crawler, desert_crawler);

        RenderingRegistry.registerEntityRenderingHandler(cavelops, CavelopsRender::new);
        RenderingRegistry.registerEntityRenderingHandler(cyclops, CyclopsRender::new);
        RenderingRegistry.registerEntityRenderingHandler(miner, MinerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(jungle_bat, DivineBatRender::new);

        RenderingRegistry.registerEntityRenderingHandler(hell_bat, DivineBatRender::new);
        RenderingRegistry.registerEntityRenderingHandler(eye, EyeRender::new);
        RenderingRegistry.registerEntityRenderingHandler(koblin, KobblinRender::new);
        RenderingRegistry.registerEntityRenderingHandler(rainbour, RainbourRender::new);
        RenderingRegistry.registerEntityRenderingHandler(saguaro_worm, SaguaroWormRender::new);
        RenderingRegistry.registerEntityRenderingHandler(arid_warrior, AridWarriorRender::new);
        RenderingRegistry.registerEntityRenderingHandler(pumpkin_spider, PumpkinSpiderRender::new);


        registerForOneRender(TomoRender::new, eden_tomo, wildwood_tomo, apalachia_tomo);
        registerForOneRender(CadilionRender::new, eden_cadillion, wildwood_cadillion, apalachia_cadillion, mortum_cadillion);

        registerForOneRender(CoriRender::new, weak_cori, advanced_cori);
        registerForOneRender(GolemRender::new, wildwood_golem, apalachia_golem, skythern_golem);
        registerForOneRender(MysticRender::new, spellbinder, mystic);
        registerForOneRender(SamekRender::new, samek, verek);
        registerForOneRender(ArcherRender::new, enchanted_archer, skythern_archer);
        registerForOneRender(DensosRender::new, densos, reyvor);
        registerForOneRender(WorkshopMerchantRender::new, workshop_merchant, workshop_tinkerer);

        RenderingRegistry.registerEntityRenderingHandler(moon_wolf, MoonWolfRender::new);
        RenderingRegistry.registerEntityRenderingHandler(hell_pig, HellPigRender::new);
        RenderingRegistry.registerEntityRenderingHandler(bunny, BunnyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(angry_bunny, AngryBunnyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(greenfeet, GreenfeetRender::new);
        RenderingRegistry.registerEntityRenderingHandler(madivel, MadivelRender::new);
        RenderingRegistry.registerEntityRenderingHandler(sun_archer, SunArcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(epiphite, EpiphiteRender::new);
        RenderingRegistry.registerEntityRenderingHandler(enchanted_archer, ArcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(enchanted_warrior, EnchantedWarriorRender::new);
        RenderingRegistry.registerEntityRenderingHandler(skythern_fiend, SkythernFiendRender::new);
        RenderingRegistry.registerEntityRenderingHandler(mage, MageRender::new);
        RenderingRegistry.registerEntityRenderingHandler(twilight_archer, TwilightArcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(megalith, MegalithRender::new);
        RenderingRegistry.registerEntityRenderingHandler(demon_of_darkness, DemonOfDarknessRender::new);
        RenderingRegistry.registerEntityRenderingHandler(basilisk, BasiliskRender::new);
        RenderingRegistry.registerEntityRenderingHandler(sorcerer, SorcererRender::new);
        RenderingRegistry.registerEntityRenderingHandler(soul_stealer, SoulStealerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(vamacheron, VamacheronRender::new);
        RenderingRegistry.registerEntityRenderingHandler(behemoth, BehemothRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ayeraco, AyeracoRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ancient_entity, AncientEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(twilight_demon, TwilightDemonRender::new);
        RenderingRegistry.registerEntityRenderingHandler(the_watcher, WatcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(eternal_archer, EternalArcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(soul_spider, SoulSpiderRender::new);
        RenderingRegistry.registerEntityRenderingHandler(soul_fiend, SoulFiendRender::new);
        RenderingRegistry.registerEntityRenderingHandler(karot, KarotRender::new);
        RenderingRegistry.registerEntityRenderingHandler(king_of_scorchers, KingScorcherRender::new);

        RenderingRegistry.registerEntityRenderingHandler(alicanto, AlicantoRender::new);
        RenderingRegistry.registerEntityRenderingHandler(fractite, FractiteRender::new);
        RenderingRegistry.registerEntityRenderingHandler(jack_o_man, JackOManRender::new);
        RenderingRegistry.registerEntityRenderingHandler(frost_archer, FrostArcherRender::new);
        RenderingRegistry.registerEntityRenderingHandler(frosty, FrostyRender::new);
        RenderingRegistry.registerEntityRenderingHandler(glacide, GlacideRender::new);
        RenderingRegistry.registerEntityRenderingHandler(rollum, RollumRender::new);
        RenderingRegistry.registerEntityRenderingHandler(hastreus, HastreusRender::new);
    }

    private static <T extends Entity> void registerImmunedToFire(IForgeRegistry<EntityType<?>> registry, Function<World, T> createFunc, String name, float width, float height) {
        registry.register(
                EntityType.Builder.<T>create((type, world) -> createFunc.apply(world), EntityClassification.MONSTER)
                        .setCustomClientFactory((spawnEntity, world) -> createFunc.apply(world))
                        .size(width, height)
                        .immuneToFire()
                        .build(name).setRegistryName(DivineRPG.MODID, name)
        );
    }

    private static <T extends Entity> void registerSingle(IForgeRegistry<EntityType<?>> registry, Function<World, T> createFunc, String name, float width, float height) {
        registerSingle(registry, createFunc, EntityClassification.MONSTER, name, width, height);
    }

    private static <T extends Entity> void registerSingle(IForgeRegistry<EntityType<?>> registry, Function<World, T> createFunc, EntityClassification classification,
                                                          String name, float width, float height) {
        registry.register(
                EntityType.Builder.<T>create((type, world) -> createFunc.apply(world), classification)
                        .setCustomClientFactory((spawnEntity, world) -> createFunc.apply(world))
                        .size(width, height)
                        .build(name).setRegistryName(DivineRPG.MODID, name)
        );
    }

    private static <T extends Entity> void registerForOneRender(IRenderFactory<T> render, EntityType<? extends T>... types) {
        for (EntityType<? extends T> type : types) {
            RenderingRegistry.registerEntityRenderingHandler(type, render);
        }
    }


    private static <T extends Entity> void registerBulletEntity(IForgeRegistry<EntityType<?>> registry, EntityType.IFactory<T> factoryIn,
                                                                Function<World, T> createFunc, String name) {
        registry.register(EntityType.Builder.create(factoryIn, EntityClassification.MISC)
                .size(0.2F, 0.2F)
                .setUpdateInterval(5)
                .setTrackingRange(256)
                .setShouldReceiveVelocityUpdates(true)
                // Need to be set for client to see the entity
                .setCustomClientFactory((type, world) -> createFunc.apply(world))
                .build(name)
                .setRegistryName(DivineRPG.MODID, name));
    }
}