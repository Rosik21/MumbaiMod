package net.alximirin.mumbai_mod.client.renderer;

import net.alximirin.mumbai_mod.MumbaiModClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

import static net.alximirin.mumbai_mod.MumbaiMod.MOD_ID;

public class DildonionEntityRenderer extends MobEntityRenderer<ZombieEntity, ZombieEntityModel<ZombieEntity>> {
    public DildonionEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new ZombieEntityModel<>(context.getPart(MumbaiModClient.MODEL_DILDONION_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(ZombieEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/dildonion/dildonion.png");
    }
}
