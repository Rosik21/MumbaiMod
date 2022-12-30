package net.fabricmc.example.mobs;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class Mumbai extends MobEntity {

    public Mumbai(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }
}
