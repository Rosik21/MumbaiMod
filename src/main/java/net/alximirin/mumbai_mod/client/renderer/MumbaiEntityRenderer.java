package net.alximirin.mumbai_mod.client.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ZombieEntityRenderer;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.util.Identifier;

import static net.alximirin.mumbai_mod.MumbaiMod.MOD_ID;

public class MumbaiEntityRenderer extends ZombieEntityRenderer {
    public MumbaiEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ZombieEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/mumbai/mumbai.png");
    }
}
