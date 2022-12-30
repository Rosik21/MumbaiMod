package net.alximirin.mumbai_mod;

import net.alximirin.mumbai_mod.registry.RegistryItem;
import net.alximirin.mumbai_mod.registry.RegistryMob;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MumbaiMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final String MOD_ID = "mumbai_mod";

	public static final ItemGroup ITEM_GROUP_MUMBAI_MOD = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "mumbai_mod"), () -> new ItemStack(RegistryItem.DILDONIT_INGOT));

	@Override
	public void onInitialize() {
		RegistryItem.initialize();
		RegistryMob.initialize();
	}
}
