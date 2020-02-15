package divinerpg.entities.twilight.samek;

import divinerpg.entities.base.render.DivineRender;
import divinerpg.utils.CachedTexture;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class SamekRender extends DivineRender<MobEntity, SamekModel> {
    public SamekRender(EntityRendererManager manager) {
        super(manager, new SamekModel(), 0, "");
    }

    @Nullable
    @Override
    public ResourceLocation getEntityTexture(MobEntity entity) {
        return CachedTexture.ENTITIES.getTexture(entity.getType().getRegistryName().getPath());
    }
}
