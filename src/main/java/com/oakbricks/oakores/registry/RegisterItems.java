package com.oakbricks.oakores.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import static com.oakbricks.oakores.OakOres.MOD_ID;
import static com.oakbricks.oakores.items.ItemsClass.*;

public class RegisterItems {

    public static void  registerItems() {

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "purpi"), PURPI);

    }

}
