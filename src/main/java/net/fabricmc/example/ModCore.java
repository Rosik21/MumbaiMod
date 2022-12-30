package net.fabricmc.example;
import net.fabricmc.example.mobs.Mumbai;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.text.html.parser.Entity;

public class ModCore implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MOD_ID = "first_mod";
	public static final EntityType<Mumbai> MUMBAI_ENTITY = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID,"mumbai"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Mumbai::new).dimensions(EntityDimensions.fixed(1, 2)).build()
	);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dildo_sergay"), Dildos.DILDO_SERGAY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dildonit"), Ingots.DILDONIT);
		FabricDefaultAttributeRegistry.register(MUMBAI_ENTITY, Mumbai.createMobAttributes().add(EntityAttributes.GENERIC_ATTACK_DAMAGE, Double.MAX_VALUE).add(EntityAttributes.GENERIC_MAX_HEALTH, 100).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 50).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.6));
	}
}
