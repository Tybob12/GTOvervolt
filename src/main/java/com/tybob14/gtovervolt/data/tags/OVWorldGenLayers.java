package com.tybob14.gtovervolt.data.tags;

import com.gregtechceu.gtceu.api.data.worldgen.IWorldGenLayer;
import com.gregtechceu.gtceu.api.data.worldgen.WorldGeneratorUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import org.jetbrains.annotations.NotNull;
import org.openjdk.nashorn.internal.objects.annotations.Getter;

import java.util.Set;

public enum OVWorldGenLayers implements IWorldGenLayer, StringRepresentable {
    ALL_DIM("stone", new TagMatchTest(OVBlockTagLoader.ALL_ORE_REPLACEABLE), Set.of(Level.OVERWORLD.location(), Level.END.location(), Level.NETHER.location(), new ResourceLocation("gtovervolt:moon")));

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

