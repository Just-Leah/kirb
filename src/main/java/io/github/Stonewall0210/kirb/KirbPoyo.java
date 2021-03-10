package io.github.Stonewall0210.kirb;

import io.github.Stonewall0210.kirb.mobs.kirb.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KirbPoyo implements ModInitializer {
	public static final EntityType<kirb> KIRB = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier("kirbpoyo", "kirb"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, kirb::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
	);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Poyo");
		FabricDefaultAttributeRegistry.register(KIRB, kirb.createMobAttributes());
	}
}
