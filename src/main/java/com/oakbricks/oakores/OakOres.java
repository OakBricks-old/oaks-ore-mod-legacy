package com.oakbricks.oakores;

import com.oakbricks.oakores.registry.RegisterBlocks;
import com.oakbricks.oakores.registry.RegisterItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class OakOres implements ModInitializer {

	public static final String MOD_ID = "oaksores";


	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "general"),
			() -> new ItemStack(Blocks.COBBLESTONE));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		RegisterBlocks.registerBlocks();
		RegisterItems.registerItems();
		System.out.println("Hello Fabric world!");
	}
}
