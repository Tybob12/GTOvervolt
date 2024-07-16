package com.tybob14.gtovervolt.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.*;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty.*;

import static com.tybob14.gtovervolt.common.data.materials.ChemistryMaterials.*;
import static com.tybob14.gtovervolt.common.data.materials.PrimaryMaterials.*;

@SuppressWarnings("unused")
public class OriginalMaterials {

    public static void init(){


    }

    public static void modifyMaterials(){

        WroughtIron.setProperty(PropertyKey.FLUID_PIPE, new FluidPipeProperties(2500, 3600, true, true, false, false));

        Zinc.setProperty(PropertyKey.WIRE, new WireProperties(32, 1, 2));

        Titanium.setProperty(PropertyKey.WIRE, new WireProperties(2048, 4, 4));

        Duranium.setProperty(PropertyKey.WIRE, new WireProperties(524288, 1, 16));

    }

}
