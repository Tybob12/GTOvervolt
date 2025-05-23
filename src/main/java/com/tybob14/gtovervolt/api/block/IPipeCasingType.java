package com.tybob14.gtovervolt.api.block;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import org.jetbrains.annotations.NotNull;

public interface IPipeCasingType {
    @NotNull
    String getName();

    int getTier();

    int getLevel();


    Material getMaterial();
}
