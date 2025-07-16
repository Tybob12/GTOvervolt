package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.api.recipe.modifier.ModifierFunction;
import com.gregtechceu.gtceu.api.recipe.modifier.RecipeModifier;
import com.tybob14.gtovervolt.api.machine.multiblock.TieredSteamParallelMultiblockMachine;
import org.jetbrains.annotations.NotNull;

public class GTOVRecipeModifiers {

    public static @NotNull ModifierFunction coilSpeedDiscount(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        double durationMult = 1;


        if (!(machine instanceof CoilWorkableElectricMultiblockMachine coilMachine)) {
            return RecipeModifier.nullWrongType(CoilWorkableElectricMultiblockMachine.class, machine);
        }

        if (1 - (coilMachine.getCoilTier() * .1) < 0.1) {
            durationMult = 0.1;
        } else {
            durationMult = (1 - (coilMachine.getCoilTier() * .1));
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

    public static @NotNull ModifierFunction highPressureSteam(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        if (!(machine instanceof TieredSteamParallelMultiblockMachine steamMachine)) {
            return RecipeModifier.nullWrongType(TieredSteamParallelMultiblockMachine.class, machine);
        }

        System.out.println(steamMachine.getTier());
        if (steamMachine.getTier() == 1) {
            return ModifierFunction.builder().durationMultiplier(0.5).build();
        } else {
            return ModifierFunction.builder().durationMultiplier(1).build();
        }


    }

    /*public static @NotNull ModifierFunction autoclaveOverclock(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        if (!(machine instanceof CoilWorkableElectricMultiblockMachine coilMachine)) {
            return RecipeModifier.nullWrongType(CoilWorkableElectricMultiblockMachine.class, machine);
        }

        int maxParallel = 12 * (coilMachine.getTier() + 1);
        int parallels = ParallelLogic.getParallelAmount(machine, recipe, maxParallel);
        if (parallels == 0) return ModifierFunction.NULL;

        double durationModifier = coilMachine.getCoilTier() > 0 ? 1.0 / (1.0 + 0.25 * coilMachine.getCoilTier()) : 1.0;
        double parallelEUtMultiplier = parallels * 0.8;
        double realEUt = RecipeHelper.getRealEUt(recipe) * parallelEUtMultiplier;

        ModifierFunction baseModifier = GTRecipe::copy;

        //Apply energy discount, coil benefits, and parallel calculation
        ModifierFunction coilModifier = ModifierFunction.builder()
                .modifyAllContents(ContentModifier.multiplier(parallels))
                .parallels(parallels)
                .eutMultiplier(parallelEUtMultiplier)
                .durationMultiplier(durationModifier)
                .build();

        // Calculate overclocks (number of times realEUt can be multiplied by 4 before exceeding max voltage)
        int overclocks = 0;
        double scaledEUt = realEUt;
        while (scaledEUt * 4 <= coilMachine.getMaxVoltage()) {
            scaledEUt *= 4;
            overclocks++;
        }

        // Only apply overclock modifier if at least one overclock is valid
        if (overclocks > 0) {
            // Find the closest voltage in GTValues.V to the base EUt, then step up by overclocks
            int nearestIndex = -1;
            double smallestDiff = Double.MAX_VALUE;
            double baseEUt = RecipeHelper.getRealEUt(recipe);

            for (int i = 0; i < GTValues.V.length; i++) {
                double diff = Math.abs(GTValues.V[i] - baseEUt);
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                    nearestIndex = i;
                }
            }

            int targetIndex = nearestIndex + overclocks;
            if (targetIndex >= GTValues.V.length) {
                throw new IllegalArgumentException("Overclock target voltage exceeds GTValues.V limit.");
            }

            long overclockVoltage = GTValues.V[targetIndex];
            ModifierFunction ocModifier = OverclockingLogic.NON_PERFECT_OVERCLOCK_SUBTICK
                    .getModifier(machine, recipe, overclockVoltage);

            return baseModifier.andThen(coilModifier).andThen(ocModifier);
        }

        return baseModifier.andThen(coilModifier);
    }

    public static @NotNull ModifierFunction latheOverclock(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        if (!(machine instanceof WorkableElectricMultiblockMachine electricMachine)) {
            return RecipeModifier.nullWrongType(WorkableElectricMultiblockMachine.class, machine);
        }

        int nearestIndex = -1;
        double smallestDiff = Double.MAX_VALUE;

        for (int j= 0; j < GTValues.V.length; j++) {
            double diff = Math.abs(GTValues.V[j] - electricMachine.getMaxVoltage());
            if (diff < smallestDiff) {
                smallestDiff = diff;
                nearestIndex = j;
            }
        }

        int maxParallel = electricMachine.getTier() + (nearestIndex * 12);
        int parallels = ParallelLogic.getParallelAmount(machine, recipe, maxParallel);
        if (parallels == 0) return ModifierFunction.NULL;

        double parallelEUtMultiplier = parallels * 0.8;
        double realEUt = RecipeHelper.getRealEUt(recipe) * parallelEUtMultiplier;

        ModifierFunction baseModifier = GTRecipe::copy;

        //Apply energy discount, coil benefits, and parallel calculation
        ModifierFunction coilModifier = ModifierFunction.builder()
                .modifyAllContents(ContentModifier.multiplier(parallels))
                .parallels(parallels)
                .eutMultiplier(parallelEUtMultiplier)
                .build();

        // Calculate overclocks (number of times realEUt can be multiplied by 4 before exceeding max voltage)
        int overclocks = 0;
        double scaledEUt = realEUt;
        while (scaledEUt * 4 <= electricMachine.getMaxVoltage()) {
            scaledEUt *= 4;
            overclocks++;
        }

        // Only apply overclock modifier if at least one overclock is valid
        if (overclocks > 0) {
            // Find the closest voltage in GTValues.V to the base EUt, then step up by overclocks
            nearestIndex = -1;
            smallestDiff = Double.MAX_VALUE;
            double baseEUt = RecipeHelper.getRealEUt(recipe);

            for (int i = 0; i < GTValues.V.length; i++) {
                double diff = Math.abs(GTValues.V[i] - baseEUt);
                if (diff < smallestDiff) {
                    smallestDiff = diff;
                    nearestIndex = i;
                }
            }

            int targetIndex = nearestIndex + overclocks;
            if (targetIndex >= GTValues.V.length) {
                throw new IllegalArgumentException("Overclock target voltage exceeds GTValues.V limit.");
            }

            long overclockVoltage = GTValues.V[targetIndex];
            ModifierFunction ocModifier = OverclockingLogic.NON_PERFECT_OVERCLOCK_SUBTICK
                    .getModifier(machine, recipe, overclockVoltage);

            return baseModifier.andThen(coilModifier).andThen(ocModifier);
        }

        return baseModifier.andThen(coilModifier);
    }

   /* public static @NotNull ModifierFunction LATHE_OC(@NotNull MetaMachine machine, @NotNull GTRecipe recipe) {
        if (!(machine instanceof WorkableElectricMultiblockMachine electricMachine)) {
            return RecipeModifier.nullWrongType(WorkableElectricMultiblockMachine.class, machine);
        }

        var oc = OverclockingLogic.NON_PERFECT_OVERCLOCK_SUBTICK.getModifier(machine, recipe, electricMachine.getOverclockVoltage());
        var modifer = ModifierFunction.builder()
                .eutMultiplier(0.8)
                .build();
        oc = oc.andThen(modifer);
        return oc;
    }*/


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
