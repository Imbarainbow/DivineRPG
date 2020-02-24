package divinerpg.entities.skythern.fiend;

import divinerpg.entities.base.render.DivineModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// TODO fix manager
public class SkythernFiendModel extends DivineModel<SkythernFiend> {
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer connector;
    ModelRenderer head1;
    ModelRenderer Spear2;
    ModelRenderer Shape1;

    public SkythernFiendModel() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.head = new ModelRenderer(this, 0, 0);
        this.head.func_228300_a_(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.setTextureSize(64, 32);
        this.head.mirror = true;
        this.setRotation(this.head, 0.0F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 16, 16);
        this.body.func_228300_a_(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.setTextureSize(64, 32);
        this.body.mirror = true;
        this.setRotation(this.body, 0.0F, 0.0F, 0.0F);
        this.rightarm = new ModelRenderer(this, 40, 16);
        this.rightarm.func_228300_a_(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.rightarm.setTextureSize(64, 32);
        this.rightarm.mirror = true;
        this.setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
        this.leftarm = new ModelRenderer(this, 40, 16);
        this.leftarm.func_228300_a_(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.leftarm.setTextureSize(64, 32);
        this.leftarm.mirror = true;
        this.setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
        this.rightleg = new ModelRenderer(this, 0, 16);
        this.rightleg.func_228300_a_(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.rightleg.setTextureSize(64, 32);
        this.rightleg.mirror = true;
        this.setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
        this.leftleg = new ModelRenderer(this, 0, 16);
        this.leftleg.func_228300_a_(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.leftleg.setTextureSize(64, 32);
        this.leftleg.mirror = true;
        this.setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
        this.connector = new ModelRenderer(this, 0, 20);
        this.connector.func_228300_a_(0.0F, 0.0F, 0.0F, 4, 4, 6);
        this.connector.setRotationPoint(-2.0F, -6.0F, -9.0F);
        this.connector.setTextureSize(64, 32);
        this.connector.mirror = true;
        this.setRotation(this.connector, 0.0F, 0.0F, 0.0F);
        this.head1 = new ModelRenderer(this, 32, 0);
        this.head1.func_228300_a_(0.0F, 0.0F, 0.0F, 8, 8, 8);
        this.head1.setRotationPoint(-4.0F, -8.0F, -16.0F);
        this.head1.setTextureSize(64, 32);
        this.head1.mirror = true;
        this.setRotation(this.head1, 0.0F, 0.0F, 0.0F);
        this.Spear2 = new ModelRenderer(this, -2, 0);
        this.Spear2.func_228300_a_(0.0F, 0.0F, 0.0F, 1, 1, 13);
        this.Spear2.setRotationPoint(5.5F, 10.0F, -15.0F);
        this.Spear2.setTextureSize(64, 32);
        this.Spear2.mirror = true;
        this.setRotation(this.Spear2, 0.0F, 0.0F, 0.0F);
        this.Shape1 = new ModelRenderer(this, 0, 0);
        this.Shape1.func_228300_a_(0.0F, 0.0F, 0.0F, 1, 1, 13);
        this.Shape1.setRotationPoint(-7.0F, 10.0F, -15.0F);
        this.Shape1.setTextureSize(64, 32);
        this.Shape1.mirror = true;
        this.setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
    }


    @Override
    public void setRotationAngles(SkythernFiend entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setRotationAngles(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        this.head1.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
        this.head1.rotateAngleX = headPitch / (180F / (float) Math.PI);
        this.rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
        this.rightarm.rotateAngleZ = 0.0F;
        this.leftarm.rotateAngleZ = 0.0F;

        this.Spear2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 2.0F * limbSwingAmount * 0.5F;
        this.Shape1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;

        this.Spear2.rotateAngleZ = 0.0F;
        this.Shape1.rotateAngleZ = 0.0F;

        this.rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightleg.rotateAngleY = 0.0F;
        this.leftleg.rotateAngleY = 0.0F;
    }
}