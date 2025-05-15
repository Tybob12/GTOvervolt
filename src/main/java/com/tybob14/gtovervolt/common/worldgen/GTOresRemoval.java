package com.tybob14.gtovervolt.common.worldgen;

import com.gregtechceu.gtceu.api.registry.GTRegistries;

public class GTOresRemoval {


    public static void init() {
        GTRegistries.ORE_VEINS.registry().clear();
    }
}
