package com.tybob14.gtovervolt.data.recipe.addition;

import com.enderio.base.common.init.EIOItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.materials.IntegratedMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class EnderIORecipeAddition {
    public static void init(Consumer<FinishedRecipe> provider) {
        ALLOY_SMELTER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/copper_alloy_ingot")).duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(ingot, IntegratedMaterials.CopperAlloy)).inputItems(new UnificationEntry(ingot, Copper)).inputItems(new UnificationEntry(dust, Silicon)).save(provider);
        ALLOY_SMELTER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/pulsating_alloy_ingot")).duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(ingot, IntegratedMaterials.PulsatingAlloy)).inputItems(new UnificationEntry(ingot, Iron)).inputItems(new UnificationEntry(dust, EnderPearl)).save(provider);
        ALLOY_SMELTER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/soularium_ingot")).duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(ingot, IntegratedMaterials.Soularium)).inputItems(new UnificationEntry(ingot, Gold)).inputItems(new ItemStack(Blocks.SOUL_SAND, 2)).save(provider);
        ALLOY_SMELTER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/redstone_alloy_ingot")).duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(ingot, IntegratedMaterials.RedstoneAlloy)).inputItems(new UnificationEntry(ingot, Iron)).inputItems(new UnificationEntry(dust, Redstone), 2).save(provider);

        BLAST_RECIPES.recipeBuilder(GTOvervolt.id("enderio/energetic_alloy_ingot")).duration(1000).EUt(GTValues.V[MV]).blastFurnaceTemp(1800).outputItems(ChemicalHelper.get(ingot, IntegratedMaterials.EnergeticAlloy)).inputItems(new UnificationEntry(ingot, Gold)).inputItems(new UnificationEntry(dust, Redstone)).inputItems(new UnificationEntry(dust, Glowstone)).save(provider);

        MIXER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/conductive_alloy_dust")).duration(200).EUt(GTValues.V[LV]).outputItems(ChemicalHelper.get(TagPrefix.dust, IntegratedMaterials.ConductiveAlloy)).inputItems(new UnificationEntry(dust, IntegratedMaterials.CopperAlloy)).inputItems(new UnificationEntry(dust, Iron)).inputItems(new UnificationEntry(dust, Redstone)).save(provider);
        MIXER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/vibrant_alloy_dust")).duration(200).EUt(GTValues.V[MV]).outputItems(ChemicalHelper.get(TagPrefix.dust, IntegratedMaterials.VibrantAlloy)).inputItems(new UnificationEntry(dust, IntegratedMaterials.EnergeticAlloy)).inputItems(new UnificationEntry(dust, EnderPearl)).save(provider);
        MIXER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/dark_steel_dust")).duration(200).EUt(GTValues.V[MV]).outputItems(ChemicalHelper.get(TagPrefix.dust, IntegratedMaterials.DarKSteel)).inputItems(new UnificationEntry(dust, Obsidian), 4).inputItems(new UnificationEntry(dust, Carbon), 2).inputItems(new UnificationEntry(dust, Steel)).save(provider);
        MIXER_RECIPES.recipeBuilder(GTOvervolt.id("enderio/end_steel_dust")).duration(200).EUt(GTValues.V[HV]).outputItems(ChemicalHelper.get(TagPrefix.dust, IntegratedMaterials.EndSteel)).inputItems(new UnificationEntry(dust, IntegratedMaterials.DarKSteel)).inputItems(new UnificationEntry(dust, Endstone), 4).inputItems(new UnificationEntry(dust, Obsidian), 4).save(provider);

        MACERATOR_RECIPES.recipeBuilder(GTOvervolt.id("enderio/grains_of_prescience")).duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.PRESCIENT_POWDER).inputItems(EIOItems.PRESCIENT_CRYSTAL).save(provider);
        MACERATOR_RECIPES.recipeBuilder(GTOvervolt.id("enderio/grains_of_vibrancy")).duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.VIBRANT_POWDER).inputItems(EIOItems.VIBRANT_CRYSTAL).save(provider);
        MACERATOR_RECIPES.recipeBuilder(GTOvervolt.id("enderio/grains_of_piezallity")).duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.PULSATING_POWDER).inputItems(EIOItems.PULSATING_CRYSTAL).save(provider);
        MACERATOR_RECIPES.recipeBuilder(GTOvervolt.id("enderio/grains_of_ender")).duration(100).EUt(GTValues.V[ULV]).outputItems(EIOItems.ENDER_CRYSTAL_POWDER).inputItems(EIOItems.ENDER_CRYSTAL).save(provider);

    }
}
