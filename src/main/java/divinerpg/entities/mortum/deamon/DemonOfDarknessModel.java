package divinerpg.entities.mortum.deamon;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class DemonOfDarknessModel extends DivineModel<DemonOfDarkness> {
    ModelRenderer Main_Body;
    ModelRenderer Lower_Body;
    ModelRenderer Legbottom1;
    ModelRenderer Legbottom2;
    ModelRenderer Legbottom3;
    ModelRenderer Legbottom4;
    ModelRenderer Legbottom5;
    ModelRenderer Legbottom6;
    ModelRenderer Legbottom7;
    ModelRenderer Legbottom8;
    ModelRenderer Legbottom9;
    ModelRenderer Legbottom10;
    ModelRenderer Legbottom11;
    ModelRenderer Legbottom12;
    ModelRenderer Legbottom13;
    ModelRenderer Legbottom14;
    ModelRenderer Legbottom15;
    ModelRenderer Legbottom16;
    ModelRenderer Legbottom17;
    ModelRenderer Legbottom18;
    ModelRenderer Legbottom19;
    ModelRenderer Legbottom20;
    ModelRenderer Legbottom21;
    ModelRenderer Legbottom22;
    ModelRenderer Legbottom23;
    ModelRenderer Legbottom24;
    ModelRenderer Legbottom25;

    public DemonOfDarknessModel()
    {
        textureWidth = 64;
        textureHeight = 32;

        Main_Body = new ModelRenderer(this, 0, 0);
        Main_Body.func_228300_a_(0F, 0F, 0F, 10, 6, 10);
        Main_Body.setRotationPoint(-6F, 6F, 2F);
        Main_Body.setTextureSize(64, 32);
        Main_Body.mirror = true;
        setRotation(Main_Body, 0F, 1.570796F, 0F);
        Lower_Body = new ModelRenderer(this, 39, 20);
        Lower_Body.func_228300_a_(0F, 0F, 0F, 6, 6, 6);
        Lower_Body.setRotationPoint(-4F, 9F, 0F);
        Lower_Body.setTextureSize(64, 32);
        Lower_Body.mirror = true;
        setRotation(Lower_Body, 0F, 1.570796F, 0F);
        Legbottom1 = new ModelRenderer(this, 14, 5);
        Legbottom1.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom1.setRotationPoint(4F, 8F, 0F);
        Legbottom1.setTextureSize(64, 32);
        Legbottom1.mirror = true;
        setRotation(Legbottom1, 0F, 0F, 0F);
        Legbottom2 = new ModelRenderer(this, 14, 5);
        Legbottom2.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom2.setRotationPoint(4F, 8F, -7F);
        Legbottom2.setTextureSize(64, 32);
        Legbottom2.mirror = true;
        setRotation(Legbottom2, 0F, 0F, 0F);
        Legbottom3 = new ModelRenderer(this, 14, 18);
        Legbottom3.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom3.setRotationPoint(4F, 1F, -5F);
        Legbottom3.setTextureSize(64, 32);
        Legbottom3.mirror = true;
        setRotation(Legbottom3, -1.570796F, 1.570796F, 0F);
        Legbottom4 = new ModelRenderer(this, 14, 18);
        Legbottom4.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom4.setRotationPoint(4F, 1F, 2F);
        Legbottom4.setTextureSize(64, 32);
        Legbottom4.mirror = true;
        setRotation(Legbottom4, -1.570796F, 1.570796F, 0F);
        Legbottom5 = new ModelRenderer(this, 14, 18);
        Legbottom5.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom5.setRotationPoint(-2F, 15F, -4F);
        Legbottom5.setTextureSize(64, 32);
        Legbottom5.mirror = true;
        setRotation(Legbottom5, -1.570796F, 1.570796F, 0F);
        Legbottom6 = new ModelRenderer(this, 14, 18);
        Legbottom6.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom6.setRotationPoint(2F, 15F, -4F);
        Legbottom6.setTextureSize(64, 32);
        Legbottom6.mirror = true;
        setRotation(Legbottom6, -1.570796F, 1.570796F, 0F);
        Legbottom7 = new ModelRenderer(this, 14, 18);
        Legbottom7.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom7.setRotationPoint(-2F, 15F, 0F);
        Legbottom7.setTextureSize(64, 32);
        Legbottom7.mirror = true;
        setRotation(Legbottom7, -1.570796F, 1.570796F, 0F);
        Legbottom8 = new ModelRenderer(this, 14, 18);
        Legbottom8.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom8.setRotationPoint(2F, 15F, 0F);
        Legbottom8.setTextureSize(64, 32);
        Legbottom8.mirror = true;
        setRotation(Legbottom8, -1.570796F, 1.570796F, 0F);
        Legbottom9 = new ModelRenderer(this, 14, 18);
        Legbottom9.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom9.setRotationPoint(0F, 1F, 2F);
        Legbottom9.setTextureSize(64, 32);
        Legbottom9.mirror = true;
        setRotation(Legbottom9, -1.570796F, 1.570796F, 0F);
        Legbottom10 = new ModelRenderer(this, 14, 18);
        Legbottom10.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom10.setRotationPoint(0F, 1F, -5F);
        Legbottom10.setTextureSize(64, 32);
        Legbottom10.mirror = true;
        setRotation(Legbottom10, -1.570796F, 1.570796F, 0F);
        Legbottom11 = new ModelRenderer(this, 14, 18);
        Legbottom11.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom11.setRotationPoint(4F, 1F, -2F);
        Legbottom11.setTextureSize(64, 32);
        Legbottom11.mirror = true;
        setRotation(Legbottom11, -1.570796F, 1.570796F, 0F);
        Legbottom12 = new ModelRenderer(this, 14, 18);
        Legbottom12.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom12.setRotationPoint(0F, 1F, -2F);
        Legbottom12.setTextureSize(64, 32);
        Legbottom12.mirror = true;
        setRotation(Legbottom12, -1.570796F, 1.570796F, 0F);
        Legbottom13 = new ModelRenderer(this, 14, 5);
        Legbottom13.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom13.setRotationPoint(4F, 8F, -4F);
        Legbottom13.setTextureSize(64, 32);
        Legbottom13.mirror = true;
        setRotation(Legbottom13, 0F, 0F, 0F);
        Legbottom14 = new ModelRenderer(this, 14, 18);
        Legbottom14.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom14.setRotationPoint(-4F, 1F, -5F);
        Legbottom14.setTextureSize(64, 32);
        Legbottom14.mirror = true;
        setRotation(Legbottom14, -1.570796F, 1.570796F, 0F);
        Legbottom15 = new ModelRenderer(this, 14, 18);
        Legbottom15.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom15.setRotationPoint(-4F, 1F, -2F);
        Legbottom15.setTextureSize(64, 32);
        Legbottom15.mirror = true;
        setRotation(Legbottom15, -1.570796F, 1.570796F, 0F);
        Legbottom16 = new ModelRenderer(this, 14, 18);
        Legbottom16.func_228300_a_(0F, 0F, 0F, 2, 2, 5);
        Legbottom16.setRotationPoint(-4F, 1F, 2F);
        Legbottom16.setTextureSize(64, 32);
        Legbottom16.mirror = true;
        setRotation(Legbottom16, -1.570796F, 1.570796F, 0F);
        Legbottom17 = new ModelRenderer(this, 14, 5);
        Legbottom17.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom17.setRotationPoint(4F, 5F, -7F);
        Legbottom17.setTextureSize(64, 32);
        Legbottom17.mirror = true;
        setRotation(Legbottom17, 0F, 0F, 0F);
        Legbottom18 = new ModelRenderer(this, 14, 5);
        Legbottom18.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom18.setRotationPoint(4F, 5F, -4F);
        Legbottom18.setTextureSize(64, 32);
        Legbottom18.mirror = true;
        setRotation(Legbottom18, 0F, 0F, 0F);
        Legbottom19 = new ModelRenderer(this, 14, 5);
        Legbottom19.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom19.setRotationPoint(4F, 5F, 0F);
        Legbottom19.setTextureSize(64, 32);
        Legbottom19.mirror = true;
        setRotation(Legbottom19, 0F, 0F, 0F);
        Legbottom20 = new ModelRenderer(this, 14, 5);
        Legbottom20.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom20.setRotationPoint(-9F, 5F, -7F);
        Legbottom20.setTextureSize(64, 32);
        Legbottom20.mirror = true;
        setRotation(Legbottom20, 0F, 0F, 0F);
        Legbottom21 = new ModelRenderer(this, 14, 5);
        Legbottom21.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom21.setRotationPoint(-9F, 5F, -4F);
        Legbottom21.setTextureSize(64, 32);
        Legbottom21.mirror = true;
        setRotation(Legbottom21, 0F, 0F, 0F);
        Legbottom22 = new ModelRenderer(this, 14, 5);
        Legbottom22.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom22.setRotationPoint(-9F, 5F, 0F);
        Legbottom22.setTextureSize(64, 32);
        Legbottom22.mirror = true;
        setRotation(Legbottom22, 0F, 0F, 0F);
        Legbottom23 = new ModelRenderer(this, 14, 5);
        Legbottom23.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom23.setRotationPoint(-9F, 8F, 0F);
        Legbottom23.setTextureSize(64, 32);
        Legbottom23.mirror = true;
        setRotation(Legbottom23, 0F, 0F, 0F);
        Legbottom24 = new ModelRenderer(this, 14, 5);
        Legbottom24.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom24.setRotationPoint(-9F, 8F, -4F);
        Legbottom24.setTextureSize(64, 32);
        Legbottom24.mirror = true;
        setRotation(Legbottom24, 0F, 0F, 0F);
        Legbottom25 = new ModelRenderer(this, 14, 5);
        Legbottom25.func_228300_a_(0F, 0F, 0F, 3, 2, 2);
        Legbottom25.setRotationPoint(-9F, 8F, -7F);
        Legbottom25.setTextureSize(64, 32);
        Legbottom25.mirror = true;
        setRotation(Legbottom25, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(DemonOfDarkness entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        this.Legbottom1.rotateAngleX =
        this.Legbottom2.rotateAngleX =
        this.Legbottom3.rotateAngleX =
        this.Legbottom4.rotateAngleX =
        this.Legbottom5.rotateAngleX =
        this.Legbottom6.rotateAngleX =
        this.Legbottom7.rotateAngleX =
        this.Legbottom8.rotateAngleX =
        this.Legbottom9.rotateAngleX =
        this.Legbottom10.rotateAngleX =
        this.Legbottom11.rotateAngleX =
        this.Legbottom12.rotateAngleX =
        this.Legbottom13.rotateAngleX =
        this.Legbottom14.rotateAngleX =
        this.Legbottom15.rotateAngleX =
        this.Legbottom16.rotateAngleX =
        this.Legbottom17.rotateAngleX =
        this.Legbottom18.rotateAngleX =
        this.Legbottom19.rotateAngleX =
        this.Legbottom20.rotateAngleX =
        this.Legbottom21.rotateAngleX =
        this.Legbottom22.rotateAngleX =
        this.Legbottom23.rotateAngleX =
        this.Legbottom24.rotateAngleX =
        this.Legbottom25.rotateAngleX = 0.2F * MathHelper.sin(ageInTicks * 0.3F) + 0.4F;
    }
}