package com.mega.dyeit.manager;

import com.mega.dyeit.mixin.ItemColorsAccesser;
import com.mega.dyeit.mixin.MinecraftAccesser;
import net.minecraft.client.Minecraft;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ItemColorManager {

    public static void register(Item item, ItemColor color) {
        Minecraft.getInstance().getItemColors().register(color, item);
    }

    public static int getColor(Item item, int i) {
        return Minecraft.getInstance().getItemColors().getColor(new ItemStack(item), i);
    }

    public static void setItemColors(ItemColors itemColors) {
        MinecraftAccesser accesser = (MinecraftAccesser) Minecraft.getInstance();
        accesser.set(itemColors);
    }

    public static java.util.Map<net.minecraftforge.registries.IRegistryDelegate<Item>, ItemColor> getIRegistryDelegate() {
        ItemColorsAccesser accesser = (ItemColorsAccesser) Minecraft.getInstance().getItemColors();
        return accesser.getItemColors();
    }

    public static void setIRegistryDelegate(java.util.Map<net.minecraftforge.registries.IRegistryDelegate<Item>, ItemColor> registryDelegate) {
        ItemColorsAccesser accesser = (ItemColorsAccesser) Minecraft.getInstance().getItemColors();
        accesser.setItemColors(registryDelegate);
    }
}
