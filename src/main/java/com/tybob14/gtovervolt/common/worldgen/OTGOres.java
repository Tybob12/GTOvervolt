package com.tybob14.gtovervolt.common.worldgen;

import com.gregtechceu.gtceu.api.data.worldgen.GTLayerPattern;
import com.gregtechceu.gtceu.api.data.worldgen.GTOreDefinition;
import com.gregtechceu.gtceu.api.data.worldgen.WorldGenLayers;
import com.gregtechceu.gtceu.api.data.worldgen.generator.indicators.SurfaceIndicatorGenerator;
import com.gregtechceu.gtceu.common.data.GTOres;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

@SuppressWarnings("unused")
public class OTGOres extends GTOres {

    public static final GTOreDefinition INFINITY_OVERWORLD = create(GTOvervolt.id("infinity"), vein -> vein
            .clusterSize(30).density(0.3f).weight(40)
            .layer(WorldGenLayers.STONE)
            .heightRangeUniform(10, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(2).mat(Gold).size(1, 4))
                            .layer(l -> l.weight(1).mat(Iron).size(1, 2))
                            .layer(l -> l.weight(1).mat(Aluminium).size(1, 1))
                            .build())
            )
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Iron)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
            ));

    public static void init() {

    }
}
