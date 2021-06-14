package com.oakbricks.oakores.registry;

import com.oakbricks.oakores.OakOres;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.oakbricks.oakores.blocks.BlockClass;

public class RegisterBlocks {

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(OakOres.MOD_ID, "purpi_block"), BlockClass.PURPI_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(OakOres.MOD_ID, "purpi_ore"), BlockClass.PURPI_ORE);
    }
}
