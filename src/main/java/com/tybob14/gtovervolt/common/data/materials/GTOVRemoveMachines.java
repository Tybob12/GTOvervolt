package com.tybob14.gtovervolt.common.data.materials;

import com.gregtechceu.gtceu.api.registry.GTRegistries;
import net.minecraft.resources.ResourceLocation;

import static com.gregtechceu.gtceu.api.GTValues.ALL_TIERS;


public class GTOVRemoveMachines {

     public static void init() {
        GTRegistries.MACHINES.remove(new ResourceLocation("gtceu:bronze_large_boiler"));
        GTRegistries.MACHINES.remove(new ResourceLocation("gtceu:steel_large_boiler"));
        GTRegistries.MACHINES.remove(new ResourceLocation("gtceu:titanium_large_boiler"));
        GTRegistries.MACHINES.remove(new ResourceLocation("gtceu:tungstensteel_large_boiler"));

    }
}
