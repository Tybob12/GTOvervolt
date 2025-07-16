package com.tybob14.gtovervolt.common.machine.multiblock.electric;

import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import com.tybob14.gtovervolt.common.block.PipeCasing;
import org.jetbrains.annotations.NotNull;
import org.openjdk.nashorn.internal.objects.annotations.Getter;

public class IndustrialAutoclave extends CoilWorkableElectricMultiblockMachine {

    private IPipeCasingType pipeCasing = PipeCasing.PipeCasingType.BRONZE;
    private ICoilType coilType = CoilBlock.CoilType.CUPRONICKEL;

    public IndustrialAutoclave(IMachineBlockEntity holder) {
        super(holder);
    }

    @Override
    public void onStructureFormed() {
        super.onStructureFormed();
        if (getMultiblockState().getMatchContext().get("PipeCasingType") instanceof IPipeCasingType pipeCasing) {
            this.pipeCasing = pipeCasing;
        }
        if (getMultiblockState().getMatchContext().get("CoilType") instanceof ICoilType coil) {
            this.coilType = coil;
        }

    }

    public int getCoilTier() {
        return coilType.getTier();
    }

    @Getter
    @NotNull
    public ICoilType getCoilType() {
        return this.coilType;
    }

    public int getTier() {
        return pipeCasing.getTier();
    }
}
