package com.oakbricks.oakores.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class BlockClass {
    //this class is for blocks only, please register blocks in com.oakbricks.oakores.registry.RegisterBlocks
    public static final Block PURPI_BLOCK = new Block(FabricBlockSettings.of(Material.METAL));
    public static final Block PURPI_ORE = new Block(FabricBlockSettings.of(Material.STONE));

}
