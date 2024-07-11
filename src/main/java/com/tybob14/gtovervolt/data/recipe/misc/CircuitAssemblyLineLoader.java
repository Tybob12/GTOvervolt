package com.tybob14.gtovervolt.data.recipe.misc;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tybob14.gtovervolt.common.data.GTOVRecipeTypes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;


import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class CircuitAssemblyLineLoader {

    public static void init(Consumer<FinishedRecipe> provider) {
        GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES.recipeBuilder("microprocessor")
                .EUt(16).duration(200)
                .inputItems(BASIC_CIRCUIT_BOARD)
                .inputItems(INTEGRATED_LOGIC_CIRCUIT)
                .inputItems(CustomTags.RESISTORS, 2)
                .inputItems(CustomTags.DIODES, 2)
                .inputItems(wireFine, Copper, 2)
                .inputItems(bolt, Tin, 2)
                .outputItems(INTEGRATED_CIRCUIT_LV, 2)
                .save(provider);
    }
}
