package net.alximirin.mumbai_mod;

import net.alximirin.mumbai_mod.registry.RegistryMob;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MumbaiMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MOD_ID = "mumbai_mod";
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dildo_sergay"), Dildos.DILDO_SERGAY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dildonit"), Ingots.DILDONIT);

		RegistryMob.init();
	}
}
