package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.api.recipe.modifier.ModifierFunction;
import com.gregtechceu.gtceu.api.recipe.modifier.RecipeModifier;
import net.minecraft.world.item.crafting.Recipe;
import org.jetbrains.annotations.NotNull;

public class GTOVRecipeModifiers {

    public static @NotNull ModifierFunction coilSpeedDiscount(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        double durationMult = 1;

        if (!(machine instanceof CoilWorkableElectricMultiblockMachine coilMachine)) {
            return RecipeModifier.nullWrongType(CoilWorkableElectricMultiblockMachine.class, machine);
        }
        if (1-(coilMachine.getCoilTier()*.1) < 0.1) {
            durationMult = 0.1;
        }else{
            durationMult = (1-(coilMachine.getCoilTier()*.1));
        }

        var oc = OverclockingLogic.NON_PERFECT_OVERCLOCK_SUBTICK.getModifier(machine, recipe, coilMachine.getOverclockVoltage());
        if (coilMachine.getCoilTier() > 0) {
            var coilModifier = ModifierFunction.builder()
                    .eutMultiplier(0.8)
                    .durationMultiplier(Math.pow(0.1, coilMachine.getCoilTier()))
                    .build();
            oc = oc.andThen(coilModifier);
        }
        return oc;
    }

    public static @NotNull ModifierFunction LATHE_OC(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        if (!(machine instanceof WorkableElectricMultiblockMachine electricMachine)) {
            return RecipeModifier.nullWrongType(WorkableElectricMultiblockMachine.class, machine);
        }

        var oc = OverclockingLogic.NON_PERFECT_OVERCLOCK_SUBTICK.getModifier(machine, recipe, electricMachine.getOverclockVoltage());
                var modifer = ModifierFunction.builder()
                    .eutMultiplier(0.8)
                    .build();
            oc = oc.andThen(modifer);
        return oc;
    }

    public static @NotNull ModifierFunction ELECTRIC_COMPRESSOR_OC(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        if (!(machine instanceof WorkableElectricMultiblockMachine electricMachine)) {
            return RecipeModifier.nullWrongType(WorkableElectricMultiblockMachine.class, machine);
        }
        var oc = OverclockingLogic.NON_PERFECT_OVERCLOCK_SUBTICK.getModifier(machine, recipe, electricMachine.getOverclockVoltage());
        var modifer = ModifierFunction.builder()
                .eutMultiplier(0.9)
                .build();
        oc = oc.andThen(modifer);
        return oc;
    }

}
