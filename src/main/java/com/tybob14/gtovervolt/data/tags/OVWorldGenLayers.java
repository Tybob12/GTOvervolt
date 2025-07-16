package com.tybob14.gtovervolt.data.tags;

import com.gregtechceu.gtceu.api.data.worldgen.IWorldGenLayer;
import com.gregtechceu.gtceu.api.data.worldgen.WorldGeneratorUtils;
import com.tybob14.gtovervolt.common.worldgen.GTOVDimensions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import org.jetbrains.annotations.NotNull;
import org.openjdk.nashorn.internal.objects.annotations.Getter;

import java.util.Set;

public enum OVWorldGenLayers implements IWorldGenLayer, StringRepresentable {
    ALL_DIM("stone", new TagMatchTest(OVBlockTagLoader.ALL_ORE_REPLACEABLE), Set.of(
            Level.OVERWORLD.location(),
            Level.END.location(),
            Level.NETHER.location(),
            GTOVDimensions.A_CENTAURI_BB.location(),
            GTOVDimensions.ANUBIS.location(),
            GTOVDimensions.ASTEROID_BELT.location(),
            GTOVDimensions.BARNARDC.location(),
            GTOVDimensions.BARNARDE.location(),
            GTOVDimensions.BARNARDF.location(),
            GTOVDimensions.CALLISTO.location(),
            GTOVDimensions.CERES.location(),
            GTOVDimensions.DEEP_DARK.location(),
            GTOVDimensions.DEIMOS.location(),
            GTOVDimensions.ENCELADUS.location(),
            GTOVDimensions.EUROPA.location(),
            GTOVDimensions.GANYMEDE.location(),
            GTOVDimensions.HAUMEA.location(),
            GTOVDimensions.HORUS.location(),
            GTOVDimensions.IO.location(),
            GTOVDimensions.KUIPER_BELT.location(),
            GTOVDimensions.MAAHES.location(),
            GTOVDimensions.MAKEMAKE.location(),
            GTOVDimensions.MARS.location(),
            GTOVDimensions.MEHEN_BELT.location(),
            GTOVDimensions.MERCURY.location(),
            GTOVDimensions.MIRANDA.location(),
            GTOVDimensions.MOON.location(),
            GTOVDimensions.NEPER.location(),
            GTOVDimensions.OBERON.location(),
            GTOVDimensions.PHOBOS.location(),
            GTOVDimensions.PLUTO.location(),
            GTOVDimensions.PROTEUS.location(),
            GTOVDimensions.ROSS128B.location(),
            GTOVDimensions.ROSS128BA.location(),
            GTOVDimensions.SETH.location(),
            GTOVDimensions.T_CETI_E.location(),
            GTOVDimensions.TITAN.location(),
            GTOVDimensions.TRITON.location(),
            GTOVDimensions.VEGA_B.location(),
            GTOVDimensions.VENUS.location()));

    private final String name;
    @SuppressWarnings("NonFinalFieldInEnum")
    private Set<ResourceLocation> levels;
    @SuppressWarnings("NonFinalFieldInEnum")
    private RuleTest target;

    OVWorldGenLayers(String name, RuleTest target, Set<ResourceLocation> levels) {
        this.name = name;
        this.target = target;
        this.levels = levels;
        WorldGeneratorUtils.WORLD_GEN_LAYERS.put(name, this);
    }

    @Override
    @NotNull
    public String getSerializedName() {
        return name;
    }

    @Override
    public boolean isApplicableForLevel(ResourceLocation level) {
        return levels.contains(level);
    }

    @Getter
    public Set<ResourceLocation> getLevels() {
        return this.levels;
    }

    @Getter
    public void setLevels(final Set<ResourceLocation> levels) {
        this.levels = levels;
    }

    @Getter
    public RuleTest getTarget() {
        return this.target;
    }

    @Getter
    public void setTarget(final RuleTest target) {
        this.target = target;
    }
}

