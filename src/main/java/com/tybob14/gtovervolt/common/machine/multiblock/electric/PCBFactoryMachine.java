package com.tybob14.gtovervolt.common.machine.multiblock.electric;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.util.RelativeDirection;
import net.minecraft.core.BlockPos;

import java.util.Comparator;
import java.util.function.Function;


public class PCBFactoryMachine extends WorkableElectricMultiblockMachine {

    public PCBFactoryMachine(IMachineBlockEntity holder) {
        super(holder);

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
