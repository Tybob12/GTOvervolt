package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.recipe.FluidRecipeCapability;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.tybob14.gtovervolt.GTOvervolt;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.Collections;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MULTIBLOCK;
import static com.lowdragmc.lowdraglib.gui.texture.ProgressTexture.FillDirection.LEFT_TO_RIGHT;


public class GTOVRecipeTypes  {

    public static GTRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
        var recipeType = new GTRecipeType(GTOvervolt.id(name), group, proxyRecipes);
        GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
        GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
        GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
        return recipeType;
    }
    public final static GTRecipeType CIRCUIT_ASSEMBLY_LINE_RECIPES = register("circuit_assembly_line", MULTIBLOCK)
            .setMaxIOSize(6, 1, 1, 0).setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.CIRCUIT_OVERLAY)
            .setProgressBar(GuiTextures.PROGRESS_BAR_CIRCUIT_ASSEMBLER, LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.ASSEMBLER)
            .setMaxTooltips(4)
            .onRecipeBuild((recipeBuilder, provider) -> {
                if (recipeBuilder.input.getOrDefault(FluidRecipeCapability.CAP, Collections.emptyList()).isEmpty() &&
                        recipeBuilder.tickInput.getOrDefault(FluidRecipeCapability.CAP, Collections.emptyList())
                                .isEmpty()) {
                    recipeBuilder.copy(new ResourceLocation(recipeBuilder.id.toString() + "_soldering_alloy"))
                            .inputFluids(GTMaterials.SolderingAlloy
                                    .getFluid(Math.max(1, (GTValues.L / 2) * recipeBuilder.getSolderMultiplier())))
                            .save(provider);
                    recipeBuilder.inputFluids(
                            GTMaterials.Tin.getFluid(Math.max(1, GTValues.L * recipeBuilder.getSolderMultiplier())));
                }
            });

    public final static GTRecipeType PCB_FACTORY_RECIPES = register("pcb_factory", MULTIBLOCK)
            .setMaxIOSize(6, 1, 4, 0).setEUIO(IO.IN)
            .setSlotOverlay(false, false, GuiTextures.MOLECULAR_OVERLAY_1)
            .setProgressBar(GuiTextures.PROGRESS_BAR_CIRCUIT_ASSEMBLER, LEFT_TO_RIGHT)
            .setSound(GTSoundEntries.CHEMICAL)
            .setMaxTooltips(4);
    public static void init() {

    }
}
