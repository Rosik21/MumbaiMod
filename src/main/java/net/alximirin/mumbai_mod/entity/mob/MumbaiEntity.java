package net.alximirin.mumbai_mod.entity.mob;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
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

    @Override
    public boolean isBaby() {
        return false;
    }

    @Override
    protected boolean isAffectedByDaylight() {
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
/*        if (this.world.isClient) {
            return null;
        } else {
            return this.brain.hasMemoryModule(MemoryModuleType.ATTACK_TARGET) ? SoundEvents.ENTITY_ZOGLIN_ANGRY : SoundEvents.ENTITY_ZOGLIN_AMBIENT;
        }*/
        return null; // TODO
    }
}
