package net.alximirin.mumbai_mod.registry;

import net.alximirin.mumbai_mod.MumbaiMod;
import net.alximirin.mumbai_mod.entity.mob.MumbaiEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegistryMob {
    public static final EntityType<MumbaiEntity> MUMBAI = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MumbaiMod.MOD_ID, "mumbai"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MumbaiEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build()
    );

    public static void init() {
        FabricDefaultAttributeRegistry.register(
                MUMBAI,
                MumbaiEntity
                        .createHostileAttributes()
                        .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 35.0)
                        .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.23)
                        .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0)
                        .add(EntityAttributes.GENERIC_ARMOR, 2.0)
                        .add(EntityAttributes.ZOMBIE_SPAWN_REINFORCEMENTS));
    }
}
