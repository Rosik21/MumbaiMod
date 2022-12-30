package net.alximirin.mumbai_mod.registry;

import net.alximirin.mumbai_mod.MumbaiMod;
import net.alximirin.mumbai_mod.material.DildonitMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.alximirin.mumbai_mod.MumbaiMod.MOD_ID;

public class RegistryItem {
    public static final Item DILDONIT_INGOT;
    public static final Item MUMBAI_SPAWN_EGG;

    public static final SwordItem DILDO_SERGAY_SWORD;

    static {
        DILDONIT_INGOT = new Item (
                new FabricItemSettings()
                        .group(MumbaiMod.ITEM_GROUP_MUMBAI_MOD));


        DILDO_SERGAY_SWORD = new SwordItem(
                DildonitMaterial.INSTANCE,
                69-1, -2f,
                new FabricItemSettings()
                        .group(MumbaiMod.ITEM_GROUP_MUMBAI_MOD));


        MUMBAI_SPAWN_EGG = new SpawnEggItem(
                RegistryMob.MUMBAI,
                5921370,
                2631720,
                new FabricItemSettings()
                        .group(MumbaiMod.ITEM_GROUP_MUMBAI_MOD));
    }

    public static void initialize() {
        register("dildo_sergay", DILDO_SERGAY_SWORD);
        register("dildonit_ingot", DILDONIT_INGOT);
        register("mumbai_spawn_egg", MUMBAI_SPAWN_EGG);
    }

    private static <T extends Item> void register(String path, T item) {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, path), item);
    }
}
