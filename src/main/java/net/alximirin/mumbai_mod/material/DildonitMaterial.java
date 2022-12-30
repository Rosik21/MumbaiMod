package net.alximirin.mumbai_mod.material;

import net.alximirin.mumbai_mod.registry.RegistryItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DildonitMaterial implements ToolMaterial {
    public static final DildonitMaterial INSTANCE = new DildonitMaterial();

    @Override
    public int getDurability() {
        return 69;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(RegistryItem.DILDONIT_INGOT);
    }

}
