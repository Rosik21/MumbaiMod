package net.alximirin.mumbai_mod.client.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.entity.mob.ZombieEntity;

public class MumbaiEntityModel extends BipedEntityModel<ZombieEntity> {
    public MumbaiEntityModel(ModelPart modelPart) {
        super(modelPart);
    }

    @Override
    public void setAngles(ZombieEntity livingEntity, float f, float g, float h, float i, float j) {
        super.setAngles(livingEntity, f, g, h, i, j);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();

        modelPartData.addChild(
                EntityModelPartNames.HEAD,
                ModelPartBuilder
                        .create()
                        .uv(0, 0)
                        .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                ModelTransform.pivot(0F, 0F, 0F));

        modelPartData.addChild(
                EntityModelPartNames.HAT,
                ModelPartBuilder
                        .create()
                        .uv(32, 0)
                        .cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                ModelTransform.pivot(0F, 0F, 0F));

        modelPartData.addChild(
                EntityModelPartNames.BODY,
                ModelPartBuilder
                        .create()
                        .uv(16, 16)
                        .cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F),
                ModelTransform.pivot(0F, 0F, 0F));

        modelPartData.addChild(
                EntityModelPartNames.RIGHT_ARM,
                ModelPartBuilder
                        .create()
                        .uv(40, 16)
                        .cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(-5.0F, 2.0F, 0F));

        modelPartData.addChild(
                EntityModelPartNames.LEFT_ARM,
                ModelPartBuilder
                        .create()
                        .uv(40, 16)
                        .mirrored()
                        .cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(5.0F, 2.0F, 0F));

        modelPartData.addChild(
                EntityModelPartNames.RIGHT_LEG,
                ModelPartBuilder
                        .create()
                        .uv(0, 16)
                        .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(-1.9F, 12.0F, 0.0F));

        modelPartData.addChild(
                EntityModelPartNames.LEFT_LEG,
                ModelPartBuilder
                        .create()
                        .uv(0, 16)
                        .mirrored()
                        .cuboid(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F),
                ModelTransform.pivot(1.9F, 12.0F, 0.0F));

        return TexturedModelData.of(modelData, 64, 64);
    }
}
