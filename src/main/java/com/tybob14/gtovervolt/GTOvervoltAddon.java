package com.tybob14.gtovervolt;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries;
import com.tybob14.gtovervolt.common.worldgen.OTGOres;


@GTAddon
public class GTOvervoltAddon implements IGTAddon {
    @Override
    public GTRegistrate getRegistrate() {
        return GTOvervoltRegistries.REGISTRATE;
    }

    @Override
    public void initializeAddon() {

    }

    @Override
    public void registerOreVeins() {
        OTGOres.init();
    }

    @Override
    public String addonModId() {
        return GTOvervolt.MOD_ID;
    }

    @Override
    public void registerElements() {
        IGTAddon.super.registerElements();
    }
}
