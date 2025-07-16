package com.tybob14.gtovervolt.common.block;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.gtovervolt.api.block.ISteamMachineCasingType;
import lombok.Getter;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class SteamMachineCasing extends Block {

    public ISteamMachineCasingType casingType;

    public SteamMachineCasing(Properties properties, ISteamMachineCasingType casingType) {
        super(properties);
        this.casingType = casingType;
    }

    public enum CasingType implements StringRepresentable, ISteamMachineCasingType {
        BRONZE("bronze", GTMaterials.Bronze),
        STEEL("steel", GTMaterials.Steel);

        @NotNull
        @Getter
        private final String name;

        @NotNull
        @Getter
        private final Material material;


        CasingType(String name, Material material) {
            this.name = name;
            this.material = material;
        }

        @Override
        @NotNull
        public String getSerializedName() {
            return name;
        }

        public int getTier() {
            return this.ordinal();
        }

        @NotNull
        @Override
        public String toString() {
            return getName();
        }
    }
}
