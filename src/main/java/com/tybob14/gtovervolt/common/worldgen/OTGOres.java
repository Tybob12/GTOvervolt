package com.tybob14.gtovervolt.common.worldgen;

import com.gregtechceu.gtceu.api.data.worldgen.GTLayerPattern;
import com.gregtechceu.gtceu.api.data.worldgen.GTOreDefinition;
import com.gregtechceu.gtceu.api.data.worldgen.generator.indicators.SurfaceIndicatorGenerator.IndicatorPlacement;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.DikeVeinGenerator.DikeBlockDefinition;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.VeinedVeinGenerator.VeinBlockDefinition;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTOres;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.materials.PrimaryMaterials;
import com.tybob14.gtovervolt.data.tags.OVWorldGenLayers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.Level;

public class OTGOres extends GTOres {
    public static final GTOreDefinition URANIUM_238_VEIN = create(GTOvervolt.id("uranium_238_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(20).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.DEIMOS.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.CERES.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.ENCELADUS.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.MEHEN_BELT.location()}).heightRangeUniform(20, 30).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.Uraninite).size(4);
            }).secondary((b) -> {
                b.mat(GTMaterials.Uraninite).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.Uranium238).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.Uranium238);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Uraninite);
        });
    });
    public static final GTOreDefinition SCHEELITE_VEIN = create(GTOvervolt.id("scheelite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(50, 64)).density(0.7F).weight(10).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.END.location(), GTOVDimensions.DEIMOS.location(), GTOVDimensions.MARS.location(), GTOVDimensions.ASTEROID_BELT.location(), GTOVDimensions.CALLISTO.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.ENCELADUS.location(), GTOVDimensions.OBERON.location(), GTOVDimensions.TRITON.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(20, 60).dikeVeinGenerator((generator) -> {
            generator.withBlock(new DikeBlockDefinition(GTMaterials.Scheelite, 3, 20, 60)).withBlock(new DikeBlockDefinition(GTMaterials.Tungstate, 2, 35, 55)).withBlock(new DikeBlockDefinition(GTMaterials.Lithium, 1, 20, 40));
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Scheelite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition PLUTONIUM_239_VEIN = create(GTOvervolt.id("plutonium_239_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(5).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.CALLISTO.location(), GTOVDimensions.CERES.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.IO.location()}).heightRangeUniform(5, 40).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.Uranium238).size(4);
            }).secondary((b) -> {
                b.mat(GTMaterials.Plutonium239).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.Thorium).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.Thorium);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Plutonium239);
        });
    });
    public static final GTOreDefinition SULFUR_VEIN = create(GTOvervolt.id("sulfur_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(90).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.NETHER.location(), GTOVDimensions.DEIMOS.location(), GTOVDimensions.MARS.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.IO.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.ANUBIS.location()}).heightRangeUniform(5, 20).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(NETHER_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Sulfur).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Pyrite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Sphalerite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Sulfur).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition DIAMOND_VEIN = create(GTOvervolt.id("diamond_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(30).heightRangeUniform(-55, -30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.MIRANDA.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDF.location()}).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.Graphite).size(4);
            }).secondary((b) -> {
                b.mat(GTMaterials.Graphite).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.Diamond).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.Coal);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Diamond).density(0.1F).placement(IndicatorPlacement.ABOVE).radius(2);
        });
    });
    public static final GTOreDefinition INFINITY_CATALYST_VEIN = create(GTOvervolt.id("infinity_catalyst_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(15).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.ANUBIS.location()}).heightRangeUniform(-60, -40).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.Neutronium).size(4);
            }).secondary((b) -> {
                b.mat(PrimaryMaterials.Adamantium).size(3);
            }).between((b) -> {
                b.mat(PrimaryMaterials.InfinityCatalyst).size(3);
            }).sporadic((b) -> {
                b.mat(PrimaryMaterials.Bedrockium);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.InfinityCatalyst);
        });
    });
    public static final GTOreDefinition LAPIS_VEIN = create(GTOvervolt.id("lapis_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(40, 52)).density(0.75F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.END.location(), GTOVDimensions.DEIMOS.location(), GTOVDimensions.CERES.location(), GTOVDimensions.ENCELADUS.location(), GTOVDimensions.VEGA_B.location(), GTOVDimensions.MEHEN_BELT.location()}).heightRangeUniform(-60, 10).dikeVeinGenerator((generator) -> {
            generator.withBlock(new DikeBlockDefinition(GTMaterials.Lazurite, 3, -60, 10)).withBlock(new DikeBlockDefinition(GTMaterials.Sodalite, 2, -50, 0)).withBlock(new DikeBlockDefinition(GTMaterials.Lapis, 2, -50, 0)).withBlock(new DikeBlockDefinition(GTMaterials.Calcite, 1, -40, 10));
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Lapis).density(0.15F).placement(IndicatorPlacement.ABOVE).radius(3);
        });
    });
    public static final GTOreDefinition MOLYBDENUM_VEIN = create(GTOvervolt.id("molybdenum_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(5).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.END.location(), Level.NETHER.location(), GTOVDimensions.MOON.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.CERES.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDE.location()}).heightRangeUniform(20, 50).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(NETHER_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Wulfenite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Molybdenite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Molybdenum).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Powellite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Molybdenum).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition VERMICULITE_VEIN = create(GTOvervolt.id("vermiculite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(80).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location()}).heightRangeUniform(80, 200).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.Chalcopyrite).size(4);
            }).secondary((b) -> {
                b.mat(PrimaryMaterials.Vermiculite).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.Cassiterite).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.Alunite);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.Vermiculite);
        });
    });
    public static final GTOreDefinition OILSANDS_VEIN = create(GTOvervolt.id("oilsands_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.3F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.T_CETI_E.location()}).heightRangeUniform(30, 80).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Oilsands).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Oilsands).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Oilsands).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Oilsands).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Oilsands);
        });
    });
    public static final GTOreDefinition MAGNESITE_VEIN = create(GTOvervolt.id("magnesite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(50, 64)).density(0.75F).weight(100).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.EUROPA.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.HORUS.location()}).heightRangeUniform(55, 65).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Magnesite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(PrimaryMaterials.BandedIron).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Sulfur).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Opal).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Magnesite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition OLIVINE_VEIN = create(GTOvervolt.id("olivine_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.END.location(), GTOVDimensions.CERES.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.ANUBIS.location(), GTOVDimensions.MEHEN_BELT.location()}).heightRangeUniform(-20, -45).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Bentonite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Magnesite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Olivine).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.Glauconite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Olivine).density(0.15F).placement(IndicatorPlacement.ABOVE).radius(3);
        });
    });
    public static final GTOreDefinition OSMIUM_VEIN = create(GTOvervolt.id("osmium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.2F).weight(5).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.ENCELADUS.location(), GTOVDimensions.MIRANDA.location(), GTOVDimensions.OBERON.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.MEHEN_BELT.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(5, 40).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Nickel).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Osmium).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Iridium).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Nickel).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Osmium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition TUNGSTEN_VEIN = create(GTOvervolt.id("tungsten_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.2F).weight(15).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.OBERON.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.TRITON.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(-10, -35).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Tungsten).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Silicon).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(PrimaryMaterials.DeepIron).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.ShadowIron).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Tungsten).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition COAL_VEIN = create(GTOvervolt.id("coal_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(38, 44)).density(0.25F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location()}).heightRangeUniform(10, 140).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Coal).size(2, 4);
                }).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Coal).size(2, 4);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.Lignite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Coal);
        });
    });
    public static final GTOreDefinition MANGANESE_VEIN = create(GTOvervolt.id("manganese_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(50, 64)).density(0.75F).weight(10).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.NETHER.location(), Level.END.location()}).heightRangeUniform(20, 30).dikeVeinGenerator((generator) -> {
            generator.withBlock(new DikeBlockDefinition(GTMaterials.Grossular, 3, 20, 30)).withBlock(new DikeBlockDefinition(GTMaterials.Pyrolusite, 2, 20, 26)).withBlock(new DikeBlockDefinition(GTMaterials.Tantalite, 1, 24, 30));
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Grossular).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition DESH_VEIN = create(GTOvervolt.id("desh_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.2F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MARS.location(), GTOVDimensions.MIRANDA.location(), GTOVDimensions.ANUBIS.location()}).heightRangeUniform(-10, -35).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(PrimaryMaterials.Desh).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(PrimaryMaterials.Desh).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Scheelite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Tungstate).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.Desh).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition CERTUS_QUARTZ_VEIN = create(GTOvervolt.id("certus_quartz_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.HORUS.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(40, 80).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.CertusQuartz).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.CertusQuartz).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.CertusQuartzCharged).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.QuartzSand).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.CertusQuartz).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition QUARTZITE = create(GTOvervolt.id("quartzite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(20).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.NETHER.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(80, 120).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(NETHER_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Quartzite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Barite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.CertusQuartz).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.CertusQuartz).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Quartzite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition SAMARIUM = create(GTOvervolt.id("samarium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(10).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.BARNARDC.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(-63, -50).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Samarium).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Neodymium).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.Tartarite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.Tartarite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Samarium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition PITCHBLENDE_VEIN = create(GTOvervolt.id("pitchblende_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 64)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MARS.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.IO.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.OBERON.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(30, 60).cuboidVeinGenerator((generator) -> {
            generator.top((b) -> {
                b.mat(GTMaterials.Pitchblende).size(2);
            }).middle((b) -> {
                b.mat(GTMaterials.Pitchblende).size(3);
            }).bottom((b) -> {
                b.mat(GTMaterials.Uraninite).size(2);
            }).spread((b) -> {
                b.mat(GTMaterials.Uraninite);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Pitchblende).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition QUARTZ_VEIN = create(GTOvervolt.id("quartz_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(20).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MOON.location(), GTOVDimensions.MARS.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.IO.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.HORUS.location()}).heightRangeUniform(40, 80).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Quartzite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Barite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.CertusQuartzCharged).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.CertusQuartz).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Quartzite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition REDSTONE_VEIN = create(GTOvervolt.id("redstone_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(50).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.NETHER.location(), GTOVDimensions.MARS.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.MIRANDA.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(-65, -10).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Redstone).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Ruby).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Cinnabar).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Redstone);
        });
    });
    public static final GTOreDefinition SAPPHIRE_VEIN = create(GTOvervolt.id("sapphire_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(50).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.HORUS.location()}).heightRangeUniform(-40, 0).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Almandine).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Pyrope).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Sapphire).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.GreenSapphire).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Sapphire).density(0.15F).placement(IndicatorPlacement.ABOVE).radius(3);
        });
    });
    public static final GTOreDefinition PYROLUSITE_VEIN = create(GTOvervolt.id("pyrolusite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.IO.location(), GTOVDimensions.MIRANDA.location()}).heightRangeUniform(20, 30).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Pyrolusite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Apatite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Tantalite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Pyrochlore).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Pyrolusite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition NAQUADRIA_VEIN = create(GTOvervolt.id("naquadria_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(48, 80)).density(0.25F).weight(40).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MAAHES.location()}).heightRangeUniform(10, 90).cuboidVeinGenerator((generator) -> {
            generator.top((b) -> {
                b.mat(GTMaterials.Naquadah).size(2);
            }).middle((b) -> {
                b.mat(GTMaterials.NaquadahEnriched).size(3);
            }).bottom((b) -> {
                b.mat(GTMaterials.Naquadria).size(2);
            }).spread((b) -> {
                b.mat(GTMaterials.Trinium);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Naquadria).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition MICA_VEIN = create(GTOvervolt.id("mica_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(10).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.ANUBIS.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(-40, -10).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Kyanite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Mica).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Cassiterite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Pollucite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Mica).radius(3);
        });
    });
    public static final GTOreDefinition CRYOLITE_VEIN = create(GTOvervolt.id("cryolite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.ANUBIS.location(), GTOVDimensions.MAAHES.location()}).heightRangeUniform(-20, -35).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Galena).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Silver).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Lead).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.Cryolite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.Cryolite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition INFUSED_GOLD_VEIN = create(GTOvervolt.id("infused_gold_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(38, 44)).density(0.15F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.IO.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(-10, 10).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Gold).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Gold).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.InfusedGold).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Platinum).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.InfusedGold);
        });
    });
    public static final GTOreDefinition MONAZITE_VEIN = create(GTOvervolt.id("monazite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MOON.location(), GTOVDimensions.DEIMOS.location(), GTOVDimensions.CALLISTO.location(), GTOVDimensions.IO.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.ENCELADUS.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.TRITON.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(20, 40).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(NETHER_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Bastnasite).size(2, 4);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Monazite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Neodymium).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Monazite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition DOLOMITE = create(GTOvervolt.id("dolomite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(50).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.ANUBIS.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(150, 200).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(PrimaryMaterials.Dolomite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(PrimaryMaterials.Wollastonite).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Trona).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Andradite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.Dolomite);
        });
    });
    public static final GTOreDefinition BLACK_PLUTONIUM_VEIN = create(GTOvervolt.id("black_plutonium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(40).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.HORUS.location()}).heightRangeUniform(-60, -40).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(PrimaryMaterials.BlackPlutonium).size(4);
            }).secondary((b) -> {
                b.mat(GTMaterials.GarnetRed).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.GarnetYellow).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.Borax);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.BlackPlutonium);
        });
    });
    public static final GTOreDefinition RARE_EARTH_VEIN = create(GTOvervolt.id("rare_earth_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(40).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.BARNARDE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(20, 40).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Cadmium).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Caesium).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Lanthanum).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Cerium).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Cadmium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition NICKEL_VEIN = create(GTOvervolt.id("nickel_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.END.location(), GTOVDimensions.DEIMOS.location(), GTOVDimensions.MARS.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.TRITON.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.MEHEN_BELT.location()}).heightRangeUniform(-10, 60).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Garnierite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Nickel).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Cobaltite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Pentlandite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Nickel);
        });
    });
    public static final GTOreDefinition ILMENITE_VEIN = create(GTOvervolt.id("ilmenite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(40, 52)).density(1.0F).weight(20).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MOON.location(), GTOVDimensions.ASTEROID_BELT.location(), GTOVDimensions.CALLISTO.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.MIRANDA.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.MEHEN_BELT.location()}).heightRangeUniform(-40, 10).veinedVeinGenerator((generator) -> {
            generator.oreBlock(new VeinBlockDefinition(GTMaterials.Ilmenite, 5)).oreBlock(new VeinBlockDefinition(GTMaterials.Chromite, 2)).oreBlock(new VeinBlockDefinition(GTMaterials.Uvarovite, 2)).oreBlock(new VeinBlockDefinition(GTMaterials.Perlite, 2)).veininessThreshold(0.01F).maxRichnessThreshold(0.175F).minRichness(0.7F).maxRichness(1.0F).edgeRoundoffBegin(3).maxEdgeRoundoff(0.10000000149011612D);
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Ilmenite);
        });
    });
    public static final GTOreDefinition PALLADIUM_VEIN = create(GTOvervolt.id("palladium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.2F).weight(10).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.CALLISTO.location(), GTOVDimensions.CERES.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.IO.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.OBERON.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.MEHEN_BELT.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(5, 40).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Platinum).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Chromium).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Palladium).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Palladium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition THORIUM_VEIN = create(GTOvervolt.id("thorium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.TRITON.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(-20, 5).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.Thorium).size(4);
            }).secondary((b) -> {
                b.mat(GTMaterials.Uranium238).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.Plutonium241).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.Uranium235);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Thorium);
        });
    });
    public static final GTOreDefinition ARSENIC_VEIN = create(GTOvervolt.id("arsenic_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MARS.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.VEGA_B.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(0, 50).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Arsenic).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Bismuth).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Antimony).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Arsenic);
        });
    });
    public static final GTOreDefinition COPPER_VEIN = create(GTOvervolt.id("copper_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(40, 52)).density(1.0F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.NETHER.location(), Level.END.location(), GTOVDimensions.MOON.location(), GTOVDimensions.CALLISTO.location(), GTOVDimensions.CERES.location(), GTOVDimensions.ENCELADUS.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.BARNARDF.location()}).heightRangeUniform(-40, 10).veinedVeinGenerator((generator) -> {
            generator.oreBlock(new VeinBlockDefinition(GTMaterials.Chalcopyrite, 5)).oreBlock(new VeinBlockDefinition(GTMaterials.Iron, 2)).oreBlock(new VeinBlockDefinition(GTMaterials.Pyrite, 2)).oreBlock(new VeinBlockDefinition(GTMaterials.Copper, 2)).veininessThreshold(0.01F).maxRichnessThreshold(0.175F).minRichness(0.7F).maxRichness(1.0F).edgeRoundoffBegin(3).maxEdgeRoundoff(0.10000000149011612D);
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Copper);
        });
    });
    public static final GTOreDefinition VANADIUM_VEIN = create(GTOvervolt.id("vanadium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.3F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.ENCELADUS.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.VEGA_B.location(), GTOVDimensions.MAAHES.location()}).heightRangeUniform(10, 50).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Vanadium).size(1, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Magnetite).size(1, 2);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Gold).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Chromium).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Vanadium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition BAUXITE_VEIN = create(GTOvervolt.id("bauxite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.3F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MOON.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.ASTEROID_BELT.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.PROTEUS.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(10, 80).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(END_RULES).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Bauxite).size(1, 4);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Ilmenite).size(1, 2);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Aluminium).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Bauxite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition SOAPSTONE_VEIN = create(GTOvervolt.id("soapstone_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.CERES.location(), GTOVDimensions.ANUBIS.location(), GTOVDimensions.MAAHES.location()}).heightRangeUniform(0, 50).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Soapstone).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Talc).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.GlauconiteSand).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Pentlandite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Talc);
        });
    });
    public static final GTOreDefinition NEUTRONIUM_VEIN = create(GTOvervolt.id("neutronium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(40).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.PROTEUS.location(), GTOVDimensions.TRITON.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.VEGA_B.location(), GTOVDimensions.MAAHES.location(), GTOVDimensions.MEHEN_BELT.location()}).heightRangeUniform(-60, -40).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.Neutronium).size(4);
            }).secondary((b) -> {
                b.mat(PrimaryMaterials.Adamantium).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.Naquadah).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.Titanium);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Neutronium);
        });
    });
    public static final GTOreDefinition GOLD_VEIN = create(GTOvervolt.id("gold_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(38, 44)).density(0.15F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.END.location(), GTOVDimensions.MARS.location(), GTOVDimensions.PHOBOS.location(), GTOVDimensions.ASTEROID_BELT.location(), GTOVDimensions.CALLISTO.location(), GTOVDimensions.TRITON.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.VEGA_B.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(10, 60).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Magnetite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.VanadiumMagnetite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Gold).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Magnetite);
        });
    });
    public static final GTOreDefinition KAOLINITE = create(GTOvervolt.id("kaolinite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(38, 44)).density(0.15F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(10, 60).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(PrimaryMaterials.Kaolinite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Zeolite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.FullersEarth).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.GlauconiteSand).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.Kaolinite);
        });
    });
    public static final GTOreDefinition NETHER_STAR_VEIN = create(GTOvervolt.id("nether_star_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.HAUMEA.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.VEGA_B.location(), GTOVDimensions.HORUS.location()}).heightRangeUniform(-50, -30).classicVeinGenerator((generator) -> {
            generator.primary((b) -> {
                b.mat(GTMaterials.GarnetSand).size(4);
            }).secondary((b) -> {
                b.mat(GTMaterials.NetherStar).size(3);
            }).between((b) -> {
                b.mat(GTMaterials.GarnetRed).size(3);
            }).sporadic((b) -> {
                b.mat(GTMaterials.GarnetYellow);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.NetherStar);
        });
    });
    public static final GTOreDefinition IRON_VEIN = create(GTOvervolt.id("iron_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(40, 52)).density(1.0F).weight(100).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.NETHER.location(), GTOVDimensions.MARS.location(), GTOVDimensions.CALLISTO.location(), GTOVDimensions.CERES.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.OBERON.location(), GTOVDimensions.PLUTO.location()}).heightRangeUniform(20, 50).veinedVeinGenerator((generator) -> {
            generator.oreBlock(new VeinBlockDefinition(GTMaterials.Hematite, 3)).oreBlock(new VeinBlockDefinition(GTMaterials.YellowLimonite, 2)).oreBlock(new VeinBlockDefinition(PrimaryMaterials.BandedIron, 2)).rareBlock(new VeinBlockDefinition(GTMaterials.Malachite, 1)).rareBlockChance(0.075F).veininessThreshold(0.01F).maxRichnessThreshold(0.175F).minRichness(0.7F).maxRichness(1.0F).edgeRoundoffBegin(3).maxEdgeRoundoff(0.10000000149011612D);
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Hematite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition BERYLLIUM_VEIN = create(GTOvervolt.id("beryllium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(50, 64)).density(0.75F).weight(20).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.END.location(), Level.NETHER.location(), GTOVDimensions.MARS.location(), GTOVDimensions.CERES.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.A_CENTAURI_BB.location()}).heightRangeUniform(5, 30).dikeVeinGenerator((generator) -> {
            generator.withBlock(new DikeBlockDefinition(GTMaterials.Beryllium, 3, 5, 30)).withBlock(new DikeBlockDefinition(GTMaterials.Emerald, 2, 5, 19)).withBlock(new DikeBlockDefinition(GTMaterials.Emerald, 2, 16, 30)).withBlock(new DikeBlockDefinition(GTMaterials.Thorium, 1, 16, 30));
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Beryllium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition ELECTROTINE_VEIN = create(GTOvervolt.id("electrotine_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(30).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.NETHER.location(), GTOVDimensions.CERES.location(), GTOVDimensions.A_CENTAURI_BB.location()}).heightRangeUniform(5, 45).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(NETHER_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Saltpeter).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Diatomite).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Electrotine).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Alunite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Electrotine).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition LIGNITE_COAL_VEIN = create(GTOvervolt.id("lignite_coal_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(38, 44)).density(0.25F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.BARNARDC.location()}).heightRangeUniform(10, 140).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(PrimaryMaterials.Lignite).size(2, 4);
                }).layer((l) -> {
                    l.weight(3).mat(PrimaryMaterials.Lignite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(PrimaryMaterials.Lignite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Coal).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(PrimaryMaterials.Lignite);
        });
    });
    public static final GTOreDefinition PLATINUM_VEIN = create(GTOvervolt.id("platinum_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.2F).weight(5).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.END.location(), GTOVDimensions.MAAHES.location(), GTOVDimensions.MEHEN_BELT.location()}).heightRangeUniform(5, 50).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(END_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Bornite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Cooperite).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Platinum).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Palladium).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Platinum).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition TETRAHEDRITE_VEIN = create(GTOvervolt.id("tetrahedrite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(40, 52)).density(1.0F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.END.location(), Level.NETHER.location(), GTOVDimensions.DEIMOS.location(), GTOVDimensions.MARS.location(), GTOVDimensions.ASTEROID_BELT.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.MIRANDA.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(80, 120).veinedVeinGenerator((generator) -> {
            generator.oreBlock(new VeinBlockDefinition(GTMaterials.Tetrahedrite, 4)).oreBlock(new VeinBlockDefinition(GTMaterials.Copper, 2)).rareBlock(new VeinBlockDefinition(GTMaterials.Stibnite, 1)).rareBlockChance(0.15F).veininessThreshold(0.01F).maxRichnessThreshold(0.175F).minRichness(0.7F).maxRichness(1.0F).edgeRoundoffBegin(3).maxEdgeRoundoff(0.10000000149011612D);
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Tetrahedrite).placement(IndicatorPlacement.BELOW);
        });
    });
    public static final GTOreDefinition GALENA_VEIN = create(GTOvervolt.id("galena_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(40).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.MOON.location(), GTOVDimensions.MARS.location(), GTOVDimensions.GANYMEDE.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.OBERON.location(), GTOVDimensions.TRITON.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(-15, 45).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Galena).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Silver).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Lead).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Galena);
        });
    });
    public static final GTOreDefinition NAQUADAH_VEIN = create(GTOvervolt.id("naquadah_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(48, 80)).density(0.25F).weight(20).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.END.location(), GTOVDimensions.ASTEROID_BELT.location(), GTOVDimensions.MERCURY.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.OBERON.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.HAUMEA.location(), GTOVDimensions.KUIPER_BELT.location(), GTOVDimensions.PLUTO.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.VEGA_B.location(), GTOVDimensions.MAAHES.location()}).heightRangeUniform(10, 90).cuboidVeinGenerator((generator) -> {
            generator.top((b) -> {
                b.mat(GTMaterials.Naquadah).size(2);
            }).middle((b) -> {
                b.mat(GTMaterials.Naquadah).size(3);
            }).bottom((b) -> {
                b.mat(GTMaterials.Naquadah).size(2);
            }).spread((b) -> {
                b.mat(GTMaterials.NaquadahEnriched);
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Naquadah).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition NIOBIUM_VEIN = create(GTOvervolt.id("niobium_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(25, 29)).density(0.25F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.TRITON.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.BARNARDF.location(), GTOVDimensions.VEGA_B.location()}).heightRangeUniform(-30, 10).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Niobium).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Yttrium).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Gallium).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Niobium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition APATITE_VEIN = create(GTOvervolt.id("apatite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.25F).weight(60).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.T_CETI_E.location()}).heightRangeUniform(10, 80).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Apatite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.TricalciumPhosphate).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Pyrochlore).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Apatite).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition RUTILE_VEIN = create(GTOvervolt.id("rutile_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.3F).weight(10).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.VENUS.location(), GTOVDimensions.TITAN.location(), GTOVDimensions.ANUBIS.location()}).heightRangeUniform(-10, 20).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Rutile).size(1, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Titanium).size(1, 2);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Bauxite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(PrimaryMaterials.MeteoricIron).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Rutile).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition MINERAL_SAND_VEIN = create(GTOvervolt.id("mineral_sand_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.EUROPA.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.ANUBIS.location(), GTOVDimensions.MAAHES.location()}).heightRangeUniform(15, 60).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.BasalticMineralSand).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.GraniticMineralSand).size(1, 1);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.FullersEarth).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Gypsum).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.BasalticMineralSand);
        });
    });
    public static final GTOreDefinition CHROME_VEIN = create(GTOvervolt.id("chrome_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.3F).weight(10).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{GTOVDimensions.EUROPA.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.MAAHES.location()}).heightRangeUniform(-10, 20).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Chromium).size(1, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Tungstate).size(1, 2);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Molybdenum).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Manganese).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Chromium).placement(IndicatorPlacement.ABOVE);
        });
    });
    public static final GTOreDefinition MAGNETITE_VEIN = create(GTOvervolt.id("magnetite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(38, 44)).density(0.15F).weight(120).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.DEIMOS.location(), GTOVDimensions.CERES.location(), GTOVDimensions.IO.location(), GTOVDimensions.MAKEMAKE.location(), GTOVDimensions.BARNARDE.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(10, 60).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.Magnetite).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.VanadiumMagnetite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Iron).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Magnetite);
        });
    });
    public static final GTOreDefinition TIN_VEIN = create(GTOvervolt.id("tin_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(38, 44)).density(0.15F).weight(80).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.EUROPA.location(), GTOVDimensions.A_CENTAURI_BB.location()}).heightRangeUniform(20, 60).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.CassiteriteSand).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.GarnetSand).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Asbestos).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Diatomite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Tin);
        });
    });
    public static final GTOreDefinition SALTS_VEIN = create(GTOvervolt.id("salts_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(40).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), GTOVDimensions.MARS.location(), GTOVDimensions.BARNARDC.location(), GTOVDimensions.T_CETI_E.location()}).heightRangeUniform(30, 70).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(OVERWORLD_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.RockSalt).size(2, 4);
                }).layer((l) -> {
                    l.weight(2).mat(GTMaterials.Salt).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Lepidolite).size(1, 1);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Spodumene).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Salt);
        });
    });
    public static final GTOreDefinition CASSITERITE_VEIN = create(GTOvervolt.id("cassiterite_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(40, 52)).density(1.0F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.OVERWORLD.location(), Level.END.location(), GTOVDimensions.MOON.location(), GTOVDimensions.IO.location(), GTOVDimensions.VENUS.location(), GTOVDimensions.MIRANDA.location(), GTOVDimensions.T_CETI_E.location(), GTOVDimensions.MEHEN_BELT.location(), GTOVDimensions.SETH.location()}).heightRangeUniform(60, 220).veinedVeinGenerator((generator) -> {
            generator.oreBlock(new VeinBlockDefinition(GTMaterials.Tin, 4)).rareBlock(new VeinBlockDefinition(GTMaterials.Cassiterite, 2)).rareBlockChance(0.33F).veininessThreshold(0.01F).maxRichnessThreshold(0.175F).minRichness(0.7F).maxRichness(1.0F).edgeRoundoffBegin(3).maxEdgeRoundoff(0.10000000149011612D);
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.Cassiterite);
        });
    });
    public static final GTOreDefinition NETHER_QUARTZ_VEIN = create(GTOvervolt.id("nether_quartz_vein"), (vein) -> {
        vein.clusterSize(UniformInt.of(32, 40)).density(0.2F).weight(70).layer(OVWorldGenLayers.ALL_DIM).dimensions(new ResourceLocation[]{Level.NETHER.location(), GTOVDimensions.A_CENTAURI_BB.location(), GTOVDimensions.NEPER.location()}).heightRangeUniform(40, 80).layeredVeinGenerator((generator) -> {
            generator.withLayerPattern(() -> {
                return GTLayerPattern.builder(NETHER_RULES).layer((l) -> {
                    l.weight(3).mat(GTMaterials.NetherQuartz).size(2, 4);
                }).layer((l) -> {
                    l.weight(1).mat(GTMaterials.Quartzite).size(1, 1);
                }).build();
            });
        }).surfaceIndicatorGenerator((indicator) -> {
            indicator.surfaceRock(GTMaterials.NetherQuartz).placement(IndicatorPlacement.ABOVE);
        });
    });

    public static void init() {
    }
}
