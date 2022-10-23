package com.mega.dyeit.mixin;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ItemColors.class)
public interface ItemColorsAccesser {
    @Accessor("itemColors")
    java.util.Map<net.minecraftforge.registries.IRegistryDelegate<Item>, ItemColor> getItemColors();

    @Accessor("itemColors")
    void setItemColors(java.util.Map<net.minecraftforge.registries.IRegistryDelegate<Item>, ItemColor> itemColors);
}
