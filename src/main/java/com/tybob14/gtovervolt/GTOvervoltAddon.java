package com.tybob14.gtovervolt;

import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries;
import com.tybob14.gtovervolt.common.worldgen.OTGOres;
import com.tybob14.gtovervolt.data.recipe.GTOVRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;


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

    @Override
    public void removeRecipes(Consumer<ResourceLocation> provider) {
        GTOVRecipes.removedInit(provider);
    }

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        GTOVRecipes.newInit(provider);
    }
}
