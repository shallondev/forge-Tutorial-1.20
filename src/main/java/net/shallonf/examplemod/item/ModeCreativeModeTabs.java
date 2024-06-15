package net.shallonf.examplemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.shallonf.examplemod.ExampleMod;

public class ModeCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MODID);



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register((eventBus));
    }
}
