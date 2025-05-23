package com.tybob14.gtovervolt.common.machine.multiblock.electric;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import com.tybob14.gtovervolt.api.block.ISteamMachineCasingType;
import com.tybob14.gtovervolt.common.block.PipeCasing;
import com.tybob14.gtovervolt.common.block.SteamMachineCasing;

public class SteamPresserMachine extends WorkableElectricMultiblockMachine {

    private IPipeCasingType pipeCasing = PipeCasing.PipeCasingType.BRONZE;
    private ISteamMachineCasingType steamCasing = SteamMachineCasing.CasingType.BRONZE;

    public SteamPresserMachine(IMachineBlockEntity holder) {
        super(holder);
    }

    @Override
    public void onStructureFormed() {
        super.onStructureFormed();
        if (getMultiblockState().getMatchContext().get("PipeCasingType") instanceof IPipeCasingType pipeCasing){
            this.pipeCasing = pipeCasing;
        }

        if (getMultiblockState().getMatchContext().get("PipeCasingType") instanceof ISteamMachineCasingType steamCasing){
            this.steamCasing = steamCasing;

        }



    }


    public void updateTexture(){
        if (steamCasing.getMaterial() == GTMaterials.Bronze){

            GTCEu.id("block/casings/steam/bronze/side");
        }
    }

    public int getTier() {
        return steamCasing.getTier();
    }

}