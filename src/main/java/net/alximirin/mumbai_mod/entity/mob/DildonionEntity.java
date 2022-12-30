package net.alximirin.mumbai_mod.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class DildonionEntity extends ZombieEntity {
    public DildonionEntity(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
        setCustomName(Text.translatable("Dildonion"));
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        setCustomNameVisible(true);
    }
}
