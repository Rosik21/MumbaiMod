package net.fabricmc.example;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class Materials implements ToolMaterial {
    public static final Materials INSTANCE = new Materials();
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
        return Ingredient.ofItems(Ingots.DILDONIT);
    }

}
