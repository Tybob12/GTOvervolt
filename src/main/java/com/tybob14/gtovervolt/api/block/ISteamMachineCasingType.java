package com.tybob14.gtovervolt.api.block;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import org.jetbrains.annotations.NotNull;

public interface ISteamMachineCasingType{

    @NotNull
    String getName();

    int getTier();

    Material getMaterial();

}
