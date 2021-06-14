package org.oakbricks.oakores.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.oakbricks.oakores.OakOres;

@EventBusSubscriber(modid = OakOres.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {

        final Item[] items = new Item[]{
                new Item().setRegistryName(OakOres.MODID, "purpi").setCreativeTab(CreativeTabs.MISC)
        };

    }

}
