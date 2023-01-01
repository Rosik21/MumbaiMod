package net.alximirin.mumbai_mod.entity.mob;

import net.alximirin.mumbai_mod.registry.RegistryItem;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class MumbaiEntity extends ZombieEntity {
    public MumbaiEntity(EntityType<? extends ZombieEntity> entityType, World world) {
        super(entityType, world);

        setCustomName(Text.translatable("Mumbai"));
        setCustomNameVisible(true);
        setStackInHand(Hand.MAIN_HAND, new ItemStack(RegistryItem.DILDO_SERGAY_SWORD));

        DefaultedList<ItemStack> armorItems = (DefaultedList<ItemStack>) this.getArmorItems();
        armorItems.set(3, new ItemStack(Items.LEATHER_HELMET));
        armorItems.set(2, new ItemStack(Items.LEATHER_CHESTPLATE));
        armorItems.set(1, new ItemStack(Items.LEATHER_LEGGINGS));
        armorItems.set(0, new ItemStack(Items.LEATHER_BOOTS));
    }

    @Override // TODO OOOOO
    protected SoundEvent getAmbientSound() {
/*        if (this.world.isClient) {
            return null;
        } else {
            return this.brain.hasMemoryModule(MemoryModuleType.ATTACK_TARGET) ? SoundEvents.ENTITY_ZOGLIN_ANGRY : SoundEvents.ENTITY_ZOGLIN_AMBIENT;
        }*/
        return null;
    }

    @Override
    protected void initCustomGoals() {
        super.initCustomGoals();
        this.targetSelector.add(6, new ActiveTargetGoal<>(this, LivingEntity.class, true));
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
}
