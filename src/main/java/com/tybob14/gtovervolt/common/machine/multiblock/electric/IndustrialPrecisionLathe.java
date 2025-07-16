package com.tybob14.gtovervolt.common.machine.multiblock.electric;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import com.tybob14.gtovervolt.common.block.PipeCasing;
import net.minecraft.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class IndustrialPrecisionLathe extends WorkableElectricMultiblockMachine {


    private IPipeCasingType pipeCasing = PipeCasing.PipeCasingType.BRONZE;

    public IndustrialPrecisionLathe(IMachineBlockEntity holder) {
        super(holder);
    }

    @Override
    public void onStructureFormed() {
        super.onStructureFormed();
        if (getMultiblockState().getMatchContext().get("PipeCasingType") instanceof IPipeCasingType pipeCasing) {
            this.pipeCasing = pipeCasing;
        }


    }

    public int getTier() {
        return pipeCasing.getTier();
    }
}
