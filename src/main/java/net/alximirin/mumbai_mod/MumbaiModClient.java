package net.alximirin.mumbai_mod;

import net.alximirin.mumbai_mod.client.model.MumbaiEntityModel;
import net.alximirin.mumbai_mod.client.renderer.MumbaiEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.alximirin.mumbai_mod.registry.RegistryMob;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class MumbaiModClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_MUMBAI_LAYER = new EntityModelLayer(new Identifier(MumbaiMod.MOD_ID, "mumbai"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(RegistryMob.MUMBAI, MumbaiEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_MUMBAI_LAYER, MumbaiEntityModel::getTexturedModelData);
    }
}
