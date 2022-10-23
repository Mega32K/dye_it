package com.mega.dyeit;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("dye_it")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Main {
    public static final String MOD_ID = "dye_it";

    public Main() {
        MinecraftForge.EVENT_BUS.register(this);
    }

}
