package net.alximirin.mumbai_mod.entity.mob;

import net.alximirin.mumbai_mod.registry.RegistryItem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.brain.MemoryModuleType;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
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
    protected boolean burnsInDaylight() {
        return false;
    }

    @Override
    protected boolean canConvertInWater() {
        return false;
    }

    @Override
    public Iterable<ItemStack> getHandItems() {
        return DefaultedList.ofSize(1, new ItemStack(RegistryItem.DILDO_SERGAY_SWORD)); // TODO
    }

    @Override
    public Iterable<ItemStack> getArmorItems() {
        return super.getArmorItems(); // TODO
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
