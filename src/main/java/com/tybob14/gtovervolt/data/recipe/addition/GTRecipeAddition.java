package com.tybob14.gtovervolt.data.recipe.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.GTOVMachines;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.plate;
import static com.gregtechceu.gtceu.common.data.GTMaterials.TungstenSteel;

public class GTRecipeAddition {
    public static void init(Consumer<FinishedRecipe> provider) {

        VanillaRecipeHelper.addShapedRecipe(provider, GTOvervolt.id("gtovervolt/machine/fluid_extractor"), new ItemStack(GTOVMachines.LARGE_EXTRACTOR.getBlock()), "ABA", "CDE", "ABA", 'A', new UnificationEntry(plate, TungstenSteel), 'B', CustomTags.IV_CIRCUITS, 'C', GTItems.CONVEYOR_MODULE_EV, 'D', GTBlocks.MACHINE_CASING_EV, 'E', GTItems.ELECTRIC_PUMP_EV);


    }
}
