package divinerpg.entities.vanilla.wildfire;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import divinerpg.entities.base.render.DivineBipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class WildfireModel extends DivineBipedModel<Wildfire> {
    public ModelRenderer P1;
    public ModelRenderer P2;
    public ModelRenderer P3;
    public ModelRenderer P4;
    public ModelRenderer P5;
    public ModelRenderer P6;
    public ModelRenderer P7;
    public ModelRenderer P8;
    public ModelRenderer P9;
    public ModelRenderer P10;
    public ModelRenderer P11;
    public ModelRenderer P12;
    public ModelRenderer P13;
    public ModelRenderer P14;
    public ModelRenderer P15;
    public ModelRenderer P16;
    public ModelRenderer P17;

    public WildfireModel() {
        bipedLeftArm = new ModelRenderer(this, 40, 16);
        bipedLeftArm.func_228300_a_(-1F, -2F, -2F, 4, 12, 4);
        bipedLeftArm.setRotationPoint(7F, 2F, 0F);
        bipedLeftArm.setTextureSize(64, 32);
        bipedLeftArm.mirror = true;
        setRotation(bipedLeftArm, 0F, 0F, 0F);
        bipedRightLeg = new ModelRenderer(this, 0, 16);
        bipedRightLeg.func_228300_a_(-2F, 0F, -2F, 4, 12, 4);
        bipedRightLeg.setRotationPoint(-3F, 12F, 0F);
        bipedRightLeg.setTextureSize(64, 32);
        bipedRightLeg.mirror = true;
        setRotation(bipedRightLeg, 0F, 0F, 0F);
        bipedLeftLeg = new ModelRenderer(this, 0, 16);
        bipedLeftLeg.func_228300_a_(-2F, 0F, -2F, 4, 12, 4);
        bipedLeftLeg.setRotationPoint(3F, 12F, 0F);
        bipedLeftLeg.setTextureSize(64, 32);
        bipedLeftLeg.mirror = true;
        setRotation(bipedLeftLeg, 0, 0, 0);
        bipedRightArm = new ModelRenderer(this, 40, 16);
        bipedRightArm.func_228300_a_(-3F, -2F, -2F, 4, 12, 4);
        bipedRightArm.setRotationPoint(-7F, 2F, 0F);
        bipedRightArm.setTextureSize(64, 32);
        bipedRightArm.mirror = true;
        setRotation(bipedRightArm, 0F, 0F, 0F);


        // do not need them
        bipedHead = new ModelRenderer(this, 0, 0);
        bipedBody = new ModelRenderer(this, 0, 0);
        bipedHeadwear = new ModelRenderer(this, 0, 0);


        P1 = new ModelRenderer(this, 32, 17);
        P1.func_228300_a_(-4F, -13F, -1F, 2, 8, 2);
        P1.setRotationPoint(6F, -6F, 9F);
        P1.setTextureSize(64, 32);
        P1.mirror = true;
        setRotation(P1, 0.7853982F, 0F, 0F);
        P2 = new ModelRenderer(this, 16, 16);
        P2.func_228300_a_(-4F, 0F, -2F, 5, 12, 4);
        P2.setRotationPoint(4F, 0F, 0F);
        P2.setTextureSize(64, 32);
        P2.mirror = true;
        setRotation(P2, 0F, 0F, 0F);
        P3 = new ModelRenderer(this, 40, 16);
        P3.func_228300_a_(-1F, -3F, -2F, 2, 4, 6);
        P3.setRotationPoint(5F, -1F, -1F);
        P3.setTextureSize(64, 32);
        P3.mirror = true;
        setRotation(P3, 0F, 0F, 0F);
        P4 = new ModelRenderer(this, 43, 18);
        P4.func_228300_a_(1F, -2F, -2F, 1, 2, 4);
        P4.setRotationPoint(4F, 2F, 0F);
        P4.setTextureSize(64, 32);
        P4.mirror = true;
        setRotation(P4, 0F, 0F, 0F);
        P5 = new ModelRenderer(this, 40, 16);
        P5.func_228300_a_(-2F, -3F, -2F, 6, 2, 4);
        P5.setRotationPoint(7F, 1F, 0F);
        P5.setTextureSize(64, 32);
        P5.mirror = true;
        setRotation(P5, 0F, 0F, 0F);
        P6 = new ModelRenderer(this, 40, 16);
        P6.func_228300_a_(-2F, -3F, -2F, 6, 2, 4);
        P6.setRotationPoint(-9F, 1F, 0F);
        P6.setTextureSize(64, 32);
        P6.mirror = true;
        setRotation(P6, 0F, 0F, 0F);
        P7 = new ModelRenderer(this, 40, 16);
        P7.func_228300_a_(-1F, -3F, -2F, 2, 4, 6);
        P7.setRotationPoint(-5F, -1F, -1F);
        P7.setTextureSize(64, 32);
        P7.mirror = true;
        setRotation(P7, 0F, 0F, 0F);
        P8 = new ModelRenderer(this, 43, 18);
        P8.func_228300_a_(1F, -2F, -2F, 1, 2, 4);
        P8.setRotationPoint(-7F, 2F, 0F);
        P8.setTextureSize(64, 32);
        P8.mirror = true;
        setRotation(P8, 0F, 0F, 0F);
        P9 = new ModelRenderer(this, 23, 19);
        P9.func_228300_a_(-3F, -2F, -2F, 3, 9, 2);
        P9.setRotationPoint(-10F, -1F, 1F);
        P9.setTextureSize(64, 32);
        P9.mirror = true;
        setRotation(P9, 0F, 0F, 2.530727F);
        P10 = new ModelRenderer(this, 23, 19);
        P10.func_228300_a_(-3F, -2F, -2F, 3, 9, 2);
        P10.setRotationPoint(8F, -3F, 1F);
        P10.setTextureSize(64, 32);
        P10.mirror = true;
        setRotation(P10, 0F, 0F, -2.530727F);
        P11 = new ModelRenderer(this, 32, 0);
        P11.func_228300_a_(-3F, -8F, -4F, 6, 12, 6);
        P11.setRotationPoint(0F, 1F, 0F);
        P11.setTextureSize(64, 32);
        P11.mirror = true;
        setRotation(P11, -0.3490659F, 0F, 0F);
        P12 = new ModelRenderer(this, 32, 17);
        P12.func_228300_a_(-4F, -13F, -1F, 2, 8, 2);
        P12.setRotationPoint(0F, -6F, 9F);
        P12.setTextureSize(64, 32);
        P12.mirror = true;
        setRotation(P12, 0.7853982F, 0F, 0F);
        P13 = new ModelRenderer(this, 19, 22);
        P13.func_228300_a_(-5F, -14F, -1F, 4, 4, 4);
        P13.setRotationPoint(6F, 1F, -1F);
        P13.setTextureSize(64, 32);
        P13.mirror = true;
        setRotation(P13, -0.3490659F, 0F, 0F);
        P14 = new ModelRenderer(this, 19, 22);
        P14.func_228300_a_(-5F, -14F, -1F, 4, 4, 4);
        P14.setRotationPoint(0F, 1F, -1F);
        P14.setTextureSize(64, 32);
        P14.mirror = true;
        setRotation(P14, -0.3490659F, 0F, 0F);
        P15 = new ModelRenderer(this, 32, 17);
        P15.func_228300_a_(-4F, -13F, -1F, 2, 8, 2);
        P15.setRotationPoint(0F, 2F, 0F);
        P15.setTextureSize(64, 32);
        P15.mirror = true;
        setRotation(P15, -0.3490659F, 0F, 0F);
        P16 = new ModelRenderer(this, 32, 17);
        P16.func_228300_a_(-4F, -13F, -1F, 2, 8, 2);
        P16.setRotationPoint(6F, 2F, 0F);
        P16.setTextureSize(64, 32);
        P16.mirror = true;
        setRotation(P16, -0.3490659F, 0F, 0F);
        P17 = new ModelRenderer(this, 16, 16);
        P17.func_228300_a_(-4F, 0F, -2F, 5, 12, 4);
        P17.setRotationPoint(-1F, 0F, 0F);
        P17.setTextureSize(64, 32);
        P17.mirror = true;
        setRotation(P17, 0F, 0F, 0F);
    }

    @Override
    public Iterable<ModelRenderer> getBodyParts() {
        return Iterables.concat(super.getBodyParts(),
                ImmutableList.of(
                        P1,
                        P2,
                        P3,
                        P4,
                        P5,
                        P6,
                        P7,
                        P8,
                        P9,
                        P10,
                        P11,
                        P12,
                        P13,
                        P14,
                        P15,
                        P16,
                        P17));
    }
}
