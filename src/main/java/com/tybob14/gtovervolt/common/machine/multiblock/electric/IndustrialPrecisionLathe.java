package com.tybob14.gtovervolt.common.machine.multiblock.electric;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.api.capability.IControllable;
import com.gregtechceu.gtceu.api.capability.IMiner;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.feature.IDataInfoProvider;
import com.gregtechceu.gtceu.api.machine.feature.ITieredMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableMultiblockMachine;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.FusionReactorMachine;
import com.lowdragmc.lowdraglib.syncdata.field.ManagedFieldHolder;
import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import com.tybob14.gtovervolt.api.block.ISteamMachineCasingType;
import com.tybob14.gtovervolt.common.block.PipeCasing;
import com.tybob14.gtovervolt.common.block.SteamMachineCasing;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.block.Block;
import org.openjdk.nashorn.internal.objects.annotations.Getter;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Arrays;

import static com.gregtechceu.gtceu.api.GTValues.LuV;
import static com.gregtechceu.gtceu.api.GTValues.ZPM;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;

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
        if (getMultiblockState().getMatchContext().get("PipeCasingType") instanceof IPipeCasingType pipeCasing){
            this.pipeCasing = pipeCasing;
        }



    }

    public int getTier() {
        return pipeCasing.getTier();
    }
}
