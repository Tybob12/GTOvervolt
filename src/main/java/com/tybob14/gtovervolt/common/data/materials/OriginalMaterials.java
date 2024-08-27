package com.tybob14.gtovervolt.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.properties.FluidPipeProperties;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.WireProperties;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

@SuppressWarnings("unused")
public class OriginalMaterials {

    public static void init() {


    }

    public static void modifyMaterials() {

        WroughtIron.setProperty(PropertyKey.FLUID_PIPE, new FluidPipeProperties(2500, 3600, true, true, false, false));

        Zinc.setProperty(PropertyKey.WIRE, new WireProperties(32, 1, 2));

        Titanium.setProperty(PropertyKey.WIRE, new WireProperties(2048, 4, 4));

        Duranium.setProperty(PropertyKey.WIRE, new WireProperties(524288, 1, 16));

    }

}
