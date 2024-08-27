package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tybob14.gtovervolt.GTOvervolt;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

public class GTOvervoltCreativeModeTabs {
    public static RegistryEntry<CreativeModeTab> GTOVERVOLT = REGISTRATE.defaultCreativeTab(GTOvervolt.MOD_ID,
                    builder -> builder.displayItems(new GTCreativeModeTabs.RegistrateDisplayItemsGenerator(GTOvervolt.MOD_ID, REGISTRATE))
                            .icon(GTOVItems.OPTICAL_MAINFRAME_UIV::asStack)
                            .title(Component.literal("GT Overvolt"))
                            .build())
            .register();

    public static void init() {

    }

}
