package com.tybob14.gtovervolt.common.block;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import lombok.Getter;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.NotNull;

public class PipeCasing extends Block {

    public IPipeCasingType pipeCasingType;

    public PipeCasing(BlockBehaviour.Properties properties, IPipeCasingType pipeCasingType) {
        super(properties);
        this.pipeCasingType = pipeCasingType;
    }

    public enum PipeCasingType implements StringRepresentable, IPipeCasingType {
        BRONZE("bronze", 1, GTMaterials.Bronze),
        STEEL("steel", 2, GTMaterials.Steel),
        TITANIUM("titanium", 3, GTMaterials.Titanium),
        TUNGSTENSTEEL("tungstensteel", 4, GTMaterials.TungstenSteel);

        @NotNull
        @Getter
        private final String name;

        @NotNull
        @Getter
        private final Material material;

        @Getter
        private final int level;

        PipeCasingType(String name, int level, Material material) {
            this.name = name;
            this.material = material;
            this.level = level;
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
