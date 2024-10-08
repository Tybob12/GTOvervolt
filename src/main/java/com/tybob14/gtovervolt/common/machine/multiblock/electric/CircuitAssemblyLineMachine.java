package com.tybob14.gtovervolt.common.machine.multiblock.electric;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.capability.recipe.IRecipeHandler;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.util.RelativeDirection;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.config.ConfigHolder;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

import static com.gregtechceu.gtceu.api.capability.recipe.ItemRecipeCapability.CAP;

public class CircuitAssemblyLineMachine extends WorkableElectricMultiblockMachine {
    public CircuitAssemblyLineMachine(IMachineBlockEntity holder) {
        super(holder);
    }

    @Override
    public boolean beforeWorking(@Nullable GTRecipe recipe) {
        if (ConfigHolder.INSTANCE.machines.orderedAssemblyLineItems) {

            var recipeInputs = recipe.inputs.get(CAP);
            var itemInputInventory = Objects
                    .requireNonNullElseGet(getCapabilitiesProxy().get(IO.IN, CAP),
                            Collections::<IRecipeHandler<?>>emptyList)
                    .stream()
                    .filter(handler -> !handler.isProxy())
                    .map(container -> container.getContents().stream().filter(ItemStack.class::isInstance)
                            .map(ItemStack.class::cast).toList())
                    .filter(container -> !container.isEmpty())
                    .toList();

            if (itemInputInventory.size() < recipeInputs.size()) return false;

            for (int i = 0; i < recipeInputs.size(); i++) {
                var itemStack = itemInputInventory.get(i).get(0);
                Ingredient recipeStack = CAP.of(recipeInputs.get(i).content);
                if (!recipeStack.test(itemStack)) {
                    return false;
                }
            }
        }
        return super.beforeWorking(recipe);
    }

    @Override
    public void onStructureFormed() {
        getDefinition().setPartSorter(Comparator.comparing(it -> multiblockPartSorter().apply(it.self().getPos())));
        super.onStructureFormed();
    }

    private Function<BlockPos, Integer> multiblockPartSorter() {
        return RelativeDirection.RIGHT.getSorter(getFrontFacing(), getUpwardsFacing(), isFlipped());
    }
}
