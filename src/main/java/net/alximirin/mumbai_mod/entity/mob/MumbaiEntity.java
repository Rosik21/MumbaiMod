package net.alximirin.mumbai_mod.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class MumbaiEntity extends ZombieEntity {
    public MumbaiEntity(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);
        setCustomName(Text.translatable("Mumbai"));
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        setCustomNameVisible(true);
    }
}
