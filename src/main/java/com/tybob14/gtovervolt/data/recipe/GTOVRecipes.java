package com.tybob14.gtovervolt.data.recipe;

import com.lowdragmc.lowdraglib.Platform;
import com.tybob14.gtovervolt.data.recipe.addition.AE2RecipeAddition;
import com.tybob14.gtovervolt.data.recipe.addition.GTOVCircuitRecipes;
import com.tybob14.gtovervolt.data.recipe.addition.GTRecipeAddition;
import com.tybob14.gtovervolt.data.recipe.addition.PlatinumLineRecipes;
import com.tybob14.gtovervolt.data.recipe.removal.AE2RecipeRemoval;
import com.tybob14.gtovervolt.data.recipe.removal.GTRecipeRemoval;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GTOVRecipes {

    public static void newInit(Consumer<FinishedRecipe> provider) {
        GTRecipeAddition.init(provider);
        GTOVCircuitRecipes.init(provider);
        PlatinumLineRecipes.init(provider);

        if (Platform.isModLoaded("ae2")) AE2RecipeAddition.init(provider);


    }

    public static void removedInit(Consumer<ResourceLocation> provider) {
        GTRecipeRemoval.init(provider);
        if (Platform.isModLoaded("ae2")) AE2RecipeRemoval.init(provider);

    }
}
