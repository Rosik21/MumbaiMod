package net.alximirin.mumbai_mod.registry;

import net.alximirin.mumbai_mod.MumbaiMod;
import net.alximirin.mumbai_mod.material.DildonitMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.alximirin.mumbai_mod.MumbaiMod.MOD_ID;

public class RegistryItem {
    public static final Item DILDONIT_INGOT = new Item (
            new FabricItemSettings()
                    .group(MumbaiMod.ITEM_GROUP_MUMBAI_MOD));

    public static final SwordItem DILDO_SERGAY = new SwordItem(
            DildonitMaterial.INSTANCE,
            69-1, -2f,
            new FabricItemSettings()
                    .group(MumbaiMod.ITEM_GROUP_MUMBAI_MOD));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dildo_sergay"), DILDO_SERGAY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dildonit_ingot"), DILDONIT_INGOT);
    }
}
