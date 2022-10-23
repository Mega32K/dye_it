package com.mega.dyeit.mixin;

import com.mega.dyeit.IColorItem;
import com.mega.dyeit.manager.ItemColorManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.main.GameConfig;
import net.minecraft.core.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(method = "<init>", at = @At("RETURN"))
    public void init(GameConfig p_91084_, CallbackInfo ci) {
        Registry.ITEM.forEach(s -> {
            if (s instanceof IColorItem colorItem)
                ItemColorManager.register(s, (s1, s2) -> colorItem.getItemColor(s1));
        });
    }
}
