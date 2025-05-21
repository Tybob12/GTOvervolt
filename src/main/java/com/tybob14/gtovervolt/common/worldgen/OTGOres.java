package com.tybob14.gtovervolt.common.worldgen;

import com.gregtechceu.gtceu.api.data.worldgen.GTLayerPattern;
import com.gregtechceu.gtceu.api.data.worldgen.GTOreDefinition;
import com.gregtechceu.gtceu.api.data.worldgen.generator.indicators.SurfaceIndicatorGenerator;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.DikeVeinGenerator.DikeBlockDefinition;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.VeinedVeinGenerator.VeinBlockDefinition;
import com.gregtechceu.gtceu.common.data.GTOres;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.data.tags.OVWorldGenLayers;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.Level;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.tybob14.gtovervolt.common.data.materials.PrimaryMaterials.*;
import static com.tybob14.gtovervolt.common.worldgen.GTOVDimensions.*;
import static net.minecraft.util.valueproviders.UniformInt.of;

@SuppressWarnings("unused")
public class OTGOres extends GTOres {

    public static final GTOreDefinition URANIUM_238_VEIN = create(GTOvervolt.id("uranium_238_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(DEIMOS.location(), PHOBOS.location(), CERES.location(), GANYMEDE.location(), ENCELADUS.location(), PROTEUS.location(), HAUMEA.location(), KUIPER_BELT.location(), MAKEMAKE.location(), BARNARDE.location(), MEHEN_BELT.location())
            .heightRangeUniform(20, 30)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Uraninite).size(4))
                    .secondary(b -> b.mat(Uraninite).size(3))
                    .between(b -> b.mat(Uranium238).size(3))
                    .sporadic(b -> b.mat(Uranium238)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Uraninite)));


    public static final GTOreDefinition SCHEELITE_VEIN = create(GTOvervolt.id("scheelite_vein"), vein -> vein
            .clusterSize(of(50, 64)).density(0.7f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location(), DEIMOS.location(), MARS.location(), ASTEROID_BELT.location(), CALLISTO.location(), GANYMEDE.location(), ENCELADUS.location(), OBERON.location(), TRITON.location(), HAUMEA.location(), KUIPER_BELT.location(), MAKEMAKE.location(), PLUTO.location(), VEGA_B.location())
            .heightRangeUniform(20, 60)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Scheelite, 3, 20, 60))
                    .withBlock(new DikeBlockDefinition(Tungstate, 2, 35, 55))
                    .withBlock(new DikeBlockDefinition(Lithium, 1, 20, 40)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Scheelite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE))
    );

    public static final GTOreDefinition PLUTONIUM_239_VEIN = create(GTOvervolt.id("plutonium_239_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(5)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(CALLISTO.location(), CERES.location(), GANYMEDE.location(), IO.location())
            .heightRangeUniform(5, 40)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Uranium238).size(4))
                    .secondary(b -> b.mat(Plutonium239).size(3))
                    .between(b -> b.mat(Thorium).size(3))
                    .sporadic(b -> b.mat(Thorium)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Plutonium239)));


    public static final GTOreDefinition SULFUR_VEIN = create(GTOvervolt.id("sulfur_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(90)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.NETHER.location(), DEIMOS.location(), MARS.location(), PHOBOS.location(), IO.location(), VENUS.location(), A_CENTAURI_BB.location(), ANUBIS.location())
            .heightRangeUniform(5, 20)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Sulfur).size(2, 4))
                            .layer(l -> l.weight(2).mat(Pyrite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Sphalerite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Sulfur)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition DIAMOND_VEIN = create(GTOvervolt.id("diamond_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .heightRangeUniform(-55, -30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), PHOBOS.location(), GANYMEDE.location(), MERCURY.location(), MIRANDA.location(), TITAN.location(), PROTEUS.location(), KUIPER_BELT.location(), PLUTO.location(), BARNARDF.location())
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Graphite).size(4))
                    .secondary(b -> b.mat(Graphite).size(3))
                    .between(b -> b.mat(Diamond).size(3))
                    .sporadic(b -> b.mat(Coal)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Diamond)
                    .density(0.1f)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .radius(2)));

    public static final GTOreDefinition INFINITY_CATALYST_VEIN = create(GTOvervolt.id("infinity_catalyst_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(15)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(ANUBIS.location())
            .heightRangeUniform(-60, -40)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Neutronium).size(4))
                    .secondary(b -> b.mat(Adamantium).size(3))
                    .between(b -> b.mat(InfinityCatalyst).size(3))
                    .sporadic(b -> b.mat(Bedrockium)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(InfinityCatalyst)));

    public static final GTOreDefinition LAPIS_VEIN = create(GTOvervolt.id("lapis_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(0.75f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.END.location(), DEIMOS.location(), CERES.location(), ENCELADUS.location(), VEGA_B.location(), MEHEN_BELT.location())
            .heightRangeUniform(-60, 10)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Lazurite, 3, -60, 10))
                    .withBlock(new DikeBlockDefinition(Sodalite, 2, -50, 0))
                    .withBlock(new DikeBlockDefinition(Lapis, 2, -50, 0))
                    .withBlock(new DikeBlockDefinition(Calcite, 1, -40, 10)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Lapis)
                    .density(0.15f)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .radius(3)));

    public static final GTOreDefinition MOLYBDENUM_VEIN = create(GTOvervolt.id("molybdenum_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(5)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location(), Level.NETHER.location(), MOON.location(), PHOBOS.location(), CERES.location(), MERCURY.location(), TITAN.location(), PROTEUS.location(), PLUTO.location(), BARNARDE.location())
            .heightRangeUniform(20, 50)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Wulfenite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Molybdenite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Molybdenum).size(1, 1))
                            .layer(l -> l.weight(1).mat(Powellite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Molybdenum)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition VERMICULITE_VEIN = create(GTOvervolt.id("vermiculite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(80)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
            .heightRangeUniform(80, 200)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Chalcopyrite).size(4))
                    .secondary(b -> b.mat(Vermiculite).size(3))
                    .between(b -> b.mat(Cassiterite).size(3))
                    .sporadic(b -> b.mat(Alunite)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Vermiculite)));

    public static final GTOreDefinition OILSANDS_VEIN = create(GTOvervolt.id("oilsands_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.3f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), BARNARDC.location(), T_CETI_E.location())
            .heightRangeUniform(30, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Oilsands).size(2, 4))
                            .layer(l -> l.weight(2).mat(Oilsands).size(1, 1))
                            .layer(l -> l.weight(1).mat(Oilsands).size(1, 1))
                            .layer(l -> l.weight(1).mat(Oilsands).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Oilsands)));

    /*public static final GTOreDefinition AWAKENED_DRACONIUM_VEIN = create(GTOvervolt.id("awakened_draconium_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .heightRangeUniform(-55, -30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MEHEN_BELT.location())
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Draconium).size(4))
                    .secondary(b -> b.mat(Draconium).size(3))
                    .between(b -> b.mat(Awakened_Draconium).size(3))
                    .sporadic(b -> b.mat(NetherStar)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Awakened_Draconium)
                    .density(0.1f)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .radius(2)));*/

    public static final GTOreDefinition MAGNESITE_VEIN = create(GTOvervolt.id("magnesite_vein"), vein -> vein
            .clusterSize(UniformInt.of(50, 64)).density(0.75f).weight(100)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(EUROPA.location(), T_CETI_E.location(), HORUS.location())
            .heightRangeUniform(55, 65)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Magnesite).size(2, 4))
                            .layer(l -> l.weight(2).mat(BandedIron).size(1, 1))
                            .layer(l -> l.weight(1).mat(Sulfur).size(1, 1))
                            .layer(l -> l.weight(1).mat(Opal).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Magnesite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition OLIVINE_VEIN = create(GTOvervolt.id("olivine_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.END.location(), CERES.location(), HAUMEA.location(), MAKEMAKE.location(), BARNARDE.location(), ANUBIS.location(), MEHEN_BELT.location())
            .heightRangeUniform(-20, -45)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Bentonite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Magnesite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Olivine).size(1, 1))
                            .layer(l -> l.weight(1).mat(Glauconite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Olivine)
                    .density(0.15f)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .radius(3)));

    public static final GTOreDefinition OSMIUM_VEIN = create(GTOvervolt.id("osmium_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(5)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(ENCELADUS.location(), MIRANDA.location(), OBERON.location(), TITAN.location(), PROTEUS.location(), KUIPER_BELT.location(), PLUTO.location(), BARNARDC.location(), MEHEN_BELT.location(), SETH.location())
            .heightRangeUniform(5, 40)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Nickel).size(2, 4))
                            .layer(l -> l.weight(2).mat(Osmium).size(1, 1))
                            .layer(l -> l.weight(2).mat(Iridium).size(1, 1))
                            .layer(l -> l.weight(1).mat(Nickel).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Osmium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition TUNGSTEN_VEIN = create(GTOvervolt.id("tungsten_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(15)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(OBERON.location(), PROTEUS.location(), TRITON.location(), PLUTO.location(), BARNARDC.location(), BARNARDE.location(), BARNARDF.location(), NEPER.location())
            .heightRangeUniform(-10, -35)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Tungsten).size(2, 4))
                            .layer(l -> l.weight(2).mat(Silicon).size(1, 1))
                            .layer(l -> l.weight(2).mat(DeepIron).size(1, 1))
                            .layer(l -> l.weight(1).mat(ShadowIron).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Tungsten)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition COAL_VEIN = create(GTOvervolt.id("coal_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.25f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
            .heightRangeUniform(10, 140)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Coal).size(2, 4))
                            .layer(l -> l.weight(3).mat(Coal).size(2, 4))
                            .layer(l -> l.weight(1).mat(Lignite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Coal)));

    public static final GTOreDefinition MANGANESE_VEIN = create(GTOvervolt.id("manganese_vein"), vein -> vein
            .clusterSize(UniformInt.of(50, 64)).density(0.75f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.NETHER.location(), Level.END.location())
            .heightRangeUniform(20, 30)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Grossular, 3, 20, 30))
                    .withBlock(new DikeBlockDefinition(Pyrolusite, 2, 20, 26))
                    .withBlock(new DikeBlockDefinition(Tantalite, 1, 24, 30)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Grossular)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition DESH_VEIN = create(GTOvervolt.id("desh_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MARS.location(), MIRANDA.location(), ANUBIS.location())
            .heightRangeUniform(-10, -35)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Desh).size(2, 4))
                            .layer(l -> l.weight(2).mat(Desh).size(1, 1))
                            .layer(l -> l.weight(2).mat(Scheelite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Tungstate).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Desh)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));


    public static final GTOreDefinition CERTUS_QUARTZ_VEIN = create(GTOvervolt.id("certus_quartz_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(HORUS.location(), NEPER.location())
            .heightRangeUniform(40, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(CertusQuartz).size(2, 4))
                            .layer(l -> l.weight(2).mat(CertusQuartz).size(1, 1))
                            .layer(l -> l.weight(1).mat(CertusQuartzCharged).size(1, 1))
                            .layer(l -> l.weight(1).mat(QuartzSand).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(CertusQuartz)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition QUARTZITE = create(GTOvervolt.id("quartzite_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.NETHER.location(), NEPER.location())
            .heightRangeUniform(80, 120)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Quartzite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Barite).size(1, 1))
                            .layer(l -> l.weight(1).mat(CertusQuartz).size(1, 1))
                            .layer(l -> l.weight(1).mat(CertusQuartz).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Quartzite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition SAMARIUM = create(GTOvervolt.id("samarium_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(BARNARDC.location(), A_CENTAURI_BB.location(), SETH.location())
            .heightRangeUniform(-63, -50)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Samarium).size(2, 4))
                            .layer(l -> l.weight(2).mat(Neodymium).size(1, 1))
                            .layer(l -> l.weight(1).mat(Tartarite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Tartarite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Samarium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    /*public static final GTOreDefinition DILITHIUM_VEIN = create(GTOvervolt.id("dilithium_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(NEPER.location())
            .heightRangeUniform(30, 100)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Dilithium).size(2, 4))
                            .layer(l -> l.weight(2).mat(Dilithium).size(1, 1))
                            .layer(l -> l.weight(1).mat(MysteriousCrystal).size(1, 1))
                            .layer(l -> l.weight(1).mat(Vinteum).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Dilithium)
                    .density(0.15f)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .radius(3)));*/


    public static final GTOreDefinition PITCHBLENDE_VEIN = create(GTOvervolt.id("pitchblende_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 64)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MARS.location(), PHOBOS.location(), IO.location(), VENUS.location(), OBERON.location(), HAUMEA.location(), KUIPER_BELT.location(), MAKEMAKE.location(), BARNARDF.location(), A_CENTAURI_BB.location(), VEGA_B.location())
            .heightRangeUniform(30, 60)
            .cuboidVeinGenerator(generator -> generator
                    .top(b -> b.mat(Pitchblende).size(2))
                    .middle(b -> b.mat(Pitchblende).size(3))
                    .bottom(b -> b.mat(Uraninite).size(2))
                    .spread(b -> b.mat(Uraninite)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Pitchblende)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition QUARTZ_VEIN = create(GTOvervolt.id("quartz_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MOON.location(), MARS.location(), PHOBOS.location(), IO.location(), VENUS.location(), PROTEUS.location(), A_CENTAURI_BB.location(), T_CETI_E.location(), HORUS.location())
            .heightRangeUniform(40, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Quartzite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Barite).size(1, 1))
                            .layer(l -> l.weight(1).mat(CertusQuartzCharged).size(1, 1))
                            .layer(l -> l.weight(1).mat(CertusQuartz).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Quartzite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    /*public static final GTOreDefinition DRACONIUM_VEIN = create(GTOvervolt.id("draconium_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
            .heightRangeUniform(-30, 0)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(DEIMOS.location(), PHOBOS.location(), MERCURY.location(), MIRANDA.location(), HORUS.location(), SETH.location())
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Draconium).size(4))
                    .secondary(b -> b.mat(Electrotine).size(3))
                    .between(b -> b.mat(Jade).size(3))
                    .sporadic(b -> b.mat(Vinteum)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Draconium)
                    .density(0.1f)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .radius(2)));*/

    public static final GTOreDefinition REDSTONE_VEIN = create(GTOvervolt.id("redstone_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(50)
            .layer(OVWorldGenLayers.ALL_DIM)
        .dimensions(Level.OVERWORLD.location(), Level.NETHER.location(), MARS.location(), GANYMEDE.location(), MERCURY.location(), VENUS.location(), MIRANDA.location(), BARNARDF.location(), A_CENTAURI_BB.location(), VEGA_B.location())
            .heightRangeUniform(-65, -10)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Redstone).size(2, 4))
                            .layer(l -> l.weight(2).mat(Ruby).size(1, 1))
                            .layer(l -> l.weight(1).mat(Cinnabar).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Redstone)));


    public static final GTOreDefinition SAPPHIRE_VEIN = create(GTOvervolt.id("sapphire_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(50)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), HORUS.location())
            .heightRangeUniform(-40, 0)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Almandine).size(2, 4))
                            .layer(l -> l.weight(2).mat(Pyrope).size(1, 1))
                            .layer(l -> l.weight(1).mat(Sapphire).size(1, 1))
                            .layer(l -> l.weight(1).mat(GreenSapphire).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Sapphire)
                    .density(0.15f)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)
                    .radius(3)));

    public static final GTOreDefinition PYROLUSITE_VEIN = create(GTOvervolt.id("pyrolusite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(IO.location(), MIRANDA.location())
            .heightRangeUniform(20, 30)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Pyrolusite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Apatite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Tantalite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Pyrochlore).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Pyrolusite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition NAQUADRIA_VEIN = create(GTOvervolt.id("naquadria_vein"), vein -> vein
            .clusterSize(UniformInt.of(48, 80)).density(0.25f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MAAHES.location())
            .heightRangeUniform(10, 90)
            .cuboidVeinGenerator(generator -> generator
                    .top(b -> b.mat(Naquadah).size(2))
                    .middle(b -> b.mat(NaquadahEnriched).size(3))
                    .bottom(b -> b.mat(Naquadria).size(2))
                    .spread(b -> b.mat(Trinium)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Naquadria)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition MICA_VEIN = create(GTOvervolt.id("mica_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), BARNARDC.location(), ANUBIS.location(), NEPER.location())
            .heightRangeUniform(-40, -10)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Kyanite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Mica).size(1, 1))
                            .layer(l -> l.weight(2).mat(Cassiterite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Pollucite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Mica)
                    .radius(3)));

    public static final GTOreDefinition CRYOLITE_VEIN = create(GTOvervolt.id("cryolite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), ANUBIS.location(), MAAHES.location())
            .heightRangeUniform(-20, -35)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Galena).size(2, 4))
                            .layer(l -> l.weight(2).mat(Silver).size(1, 1))
                            .layer(l -> l.weight(1).mat(Lead).size(1, 1))
                            .layer(l -> l.weight(1).mat(Cryolite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Cryolite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition INFUSED_GOLD_VEIN = create(GTOvervolt.id("infused_gold_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(IO.location(), TITAN.location(), PROTEUS.location(), HAUMEA.location(), BARNARDE.location(), VEGA_B.location())
            .heightRangeUniform(-10, 10)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Gold).size(2, 4))
                            .layer(l -> l.weight(2).mat(Gold).size(1, 1))
                            .layer(l -> l.weight(1).mat(InfusedGold).size(1, 1))
                            .layer(l -> l.weight(1).mat(Platinum).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(InfusedGold)));

    public static final GTOreDefinition MONAZITE_VEIN = create(GTOvervolt.id("monazite_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MOON.location(), DEIMOS.location(), CALLISTO.location(), IO.location(), VENUS.location(), ENCELADUS.location(), TITAN.location(), TRITON.location(), HAUMEA.location(), MAKEMAKE.location(), BARNARDF.location(), SETH.location())
            .heightRangeUniform(20, 40)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Bastnasite).size(2, 4))
                            .layer(l -> l.weight(1).mat(Monazite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Neodymium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Monazite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition DOLOMITE = create(GTOvervolt.id("dolomite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(50)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), ANUBIS.location(), NEPER.location())
            .heightRangeUniform(150, 200)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Dolomite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Wollastonite).size(1, 1))
                            .layer(l -> l.weight(2).mat(Trona).size(1, 1))
                            .layer(l -> l.weight(1).mat(Andradite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Dolomite)));

    public static final GTOreDefinition BLACK_PLUTONIUM_VEIN = create(GTOvervolt.id("black_plutonium_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MAKEMAKE.location(), PLUTO.location(), BARNARDC.location(), A_CENTAURI_BB.location(), T_CETI_E.location(), HORUS.location())
            .heightRangeUniform(-60, -40)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(BlackPlutonium).size(4))
                    .secondary(b -> b.mat(GarnetRed).size(3))
                    .between(b -> b.mat(GarnetYellow).size(3))
                    .sporadic(b -> b.mat(Borax)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(BlackPlutonium)));

    public static final GTOreDefinition RARE_EARTH_VEIN = create(GTOvervolt.id("rare_earth_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(BARNARDE.location(), BARNARDF.location(), A_CENTAURI_BB.location(), VEGA_B.location())
            .heightRangeUniform(20, 40)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Cadmium).size(2, 4))
                            .layer(l -> l.weight(2).mat(Caesium).size(1, 1))
                            .layer(l -> l.weight(1).mat(Lanthanum).size(1, 1))
                            .layer(l -> l.weight(1).mat(Cerium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Cadmium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition NICKEL_VEIN = create(GTOvervolt.id("nickel_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.END.location(), DEIMOS.location(), MARS.location(), PHOBOS.location(), VENUS.location(), TITAN.location(), TRITON.location(), KUIPER_BELT.location(), MEHEN_BELT.location())
            .heightRangeUniform(-10, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Garnierite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Nickel).size(1, 1))
                            .layer(l -> l.weight(2).mat(Cobaltite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Pentlandite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Nickel)));

    public static final GTOreDefinition ILMENITE_VEIN = create(GTOvervolt.id("ilmenite_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MOON.location(), ASTEROID_BELT.location(), CALLISTO.location(), GANYMEDE.location(), MERCURY.location(), MIRANDA.location(), TITAN.location(), PROTEUS.location(), PLUTO.location(), T_CETI_E.location(), MEHEN_BELT.location())
            .heightRangeUniform(-40, 10)
            .veinedVeinGenerator(generator -> generator
                    .oreBlock(new VeinBlockDefinition(Ilmenite, 5))
                    .oreBlock(new VeinBlockDefinition(Chromite, 2))
                    .oreBlock(new VeinBlockDefinition(Uvarovite, 2))
                    .oreBlock(new VeinBlockDefinition(Perlite, 2))
                    .veininessThreshold(0.01f)
                    .maxRichnessThreshold(0.175f)
                    .minRichness(0.7f)
                    .maxRichness(1.0f)
                    .edgeRoundoffBegin(3)
                    .maxEdgeRoundoff(0.1f))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Ilmenite)));

    /*public static final GTOreDefinition COSMIC_NEUTRONIUM_VEIN = create(GTOvervolt.id("cosmic_neutronium_vein"), vein -> vein
            .clusterSize(UniformInt.of(48, 80)).density(0.25f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(HORUS.location())
            .heightRangeUniform(-45, -30)
            .cuboidVeinGenerator(generator -> generator
                    .top(b -> b.mat(Neutronium).size(2))
                    .middle(b -> b.mat(CosmicNeutronuium).size(3))
                    .bottom(b -> b.mat(BlackPlutonium).size(2))
                    .spread(b -> b.mat(Bedrockium)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(CosmicNeutronium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    public static final GTOreDefinition PALLADIUM_VEIN = create(GTOvervolt.id("palladium_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(CALLISTO.location(), CERES.location(), GANYMEDE.location(), IO.location(), MERCURY.location(), OBERON.location(), KUIPER_BELT.location(), PLUTO.location(), MEHEN_BELT.location(), SETH.location())
            .heightRangeUniform(5, 40)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Platinum).size(2, 4))
                            .layer(l -> l.weight(2).mat(Chromium).size(1, 1))
                            .layer(l -> l.weight(1).mat(Palladium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Palladium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    /*public static final GTOreDefinition CALLISTO_ICE_VEIN = create(GTOvervolt.id("callisto_ice_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(CALLISTO.location(), ANUBIS.location(), MAAHES.location())
            .heightRangeUniform(-10, -35)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(CallistoIce).size(2, 4))
                            .layer(l -> l.weight(2).mat(Topaz).size(1, 1))
                            .layer(l -> l.weight(2).mat(BlueTopaz).size(1, 1))
                            .layer(l -> l.weight(1).mat(Alduorite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(CallistoIce)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    public static final GTOreDefinition THORIUM_VEIN = create(GTOvervolt.id("thorium_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(TRITON.location(), HAUMEA.location(), PLUTO.location(), BARNARDE.location(), BARNARDF.location(), VEGA_B.location())
            .heightRangeUniform(-20, 5)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Thorium).size(4))
                    .secondary(b -> b.mat(Uranium238).size(3))
                    .between(b -> b.mat(Plutonium241).size(3))
                    .sporadic(b -> b.mat(Uranium235)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Thorium)));

    public static final GTOreDefinition ARSENIC_VEIN = create(GTOvervolt.id("arsenic_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MARS.location(), PHOBOS.location(), MERCURY.location(), TITAN.location(), BARNARDC.location(), VEGA_B.location(), NEPER.location())
            .heightRangeUniform(0, 50)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Arsenic).size(2, 4))
                            .layer(l -> l.weight(2).mat(Bismuth).size(1, 1))
                            .layer(l -> l.weight(2).mat(Antimony).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Arsenic)));

    public static final GTOreDefinition COPPER_VEIN = create(GTOvervolt.id("copper_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.NETHER.location(), Level.END.location(), MOON.location(), CALLISTO.location(), CERES.location(), ENCELADUS.location(), PROTEUS.location(), BARNARDE.location(), BARNARDF.location())
            .heightRangeUniform(-40, 10)
            .veinedVeinGenerator(generator -> generator
                    .oreBlock(new VeinBlockDefinition(Chalcopyrite, 5))
                    .oreBlock(new VeinBlockDefinition(Iron, 2))
                    .oreBlock(new VeinBlockDefinition(Pyrite, 2))
                    .oreBlock(new VeinBlockDefinition(Copper, 2))
                    .veininessThreshold(0.01f)
                    .maxRichnessThreshold(0.175f)
                    .minRichness(0.7f)
                    .maxRichness(1.0f)
                    .edgeRoundoffBegin(3)
                    .maxEdgeRoundoff(0.1f))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Copper)));

    public static final GTOreDefinition VANADIUM_VEIN = create(GTOvervolt.id("vanadium_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.3f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(ENCELADUS.location(), PROTEUS.location(), MAKEMAKE.location(), BARNARDF.location(), VEGA_B.location(), MAAHES.location())
            .heightRangeUniform(10, 50)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Vanadium).size(1, 4))
                            .layer(l -> l.weight(2).mat(Magnetite).size(1, 2))
                            .layer(l -> l.weight(1).mat(Gold).size(1, 1))
                            .layer(l -> l.weight(1).mat(Chromium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Vanadium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition BAUXITE_VEIN = create(GTOvervolt.id("bauxite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.3f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MOON.location(), PHOBOS.location(), ASTEROID_BELT.location(), GANYMEDE.location(), MERCURY.location(), TITAN.location(), PROTEUS.location(), HAUMEA.location(), KUIPER_BELT.location(), MAKEMAKE.location(), PLUTO.location(), T_CETI_E.location(), SETH.location())
            .heightRangeUniform(10, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(END_RULES)
                            .layer(l -> l.weight(2).mat(Bauxite).size(1, 4))
                            .layer(l -> l.weight(1).mat(Ilmenite).size(1, 2))
                            .layer(l -> l.weight(1).mat(Aluminium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Bauxite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition SOAPSTONE_VEIN = create(GTOvervolt.id("soapstone_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), CERES.location(), ANUBIS.location(), MAAHES.location())
            .heightRangeUniform(0, 50)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Soapstone).size(2, 4))
                            .layer(l -> l.weight(2).mat(Talc).size(1, 1))
                            .layer(l -> l.weight(2).mat(GlauconiteSand).size(1, 1))
                            .layer(l -> l.weight(1).mat(Pentlandite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Talc)));

    public static final GTOreDefinition NEUTRONIUM_VEIN = create(GTOvervolt.id("neutronium_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(PROTEUS.location(), TRITON.location(), HAUMEA.location(), KUIPER_BELT.location(), MAKEMAKE.location(), PLUTO.location(), BARNARDE.location(), BARNARDF.location(), VEGA_B.location(), MAAHES.location(), MEHEN_BELT.location())
            .heightRangeUniform(-60, -40)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(Neutronium).size(4))
                    .secondary(b -> b.mat(Adamantium).size(3))
                    .between(b -> b.mat(Naquadah).size(3))
                    .sporadic(b -> b.mat(Titanium)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Neutronium)));

    /*public static final GTOreDefinition MYTRYL_VEIN = create(GTOvervolt.id("mytryl_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(IO.location(), ANUBIS.location(), HORUS.location())
            .heightRangeUniform(-10, -35)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Mytryl).size(2, 4))
                            .layer(l -> l.weight(2).mat(Jasper).size(1, 1))
                            .layer(l -> l.weight(2).mat(Ceruclase).size(1, 1))
                            .layer(l -> l.weight(1).mat(Vulcanite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Mytryl)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    public static final GTOreDefinition GOLD_VEIN = create(GTOvervolt.id("gold_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.END.location(), MARS.location(), PHOBOS.location(), ASTEROID_BELT.location(), CALLISTO.location(), TRITON.location(), PLUTO.location(), BARNARDF.location(), T_CETI_E.location(), VEGA_B.location(), SETH.location())
            .heightRangeUniform(10, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Magnetite).size(2, 4))
                            .layer(l -> l.weight(2).mat(VanadiumMagnetite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Gold).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Magnetite)));

    public static final GTOreDefinition KAOLINITE = create(GTOvervolt.id("kaolinite_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), T_CETI_E.location(), NEPER.location())
            .heightRangeUniform(10, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Kaolinite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Zeolite).size(1, 1))
                            .layer(l -> l.weight(1).mat(FullersEarth).size(1, 1))
                            .layer(l -> l.weight(1).mat(GlauconiteSand).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Kaolinite)));

    public static final GTOreDefinition NETHER_STAR_VEIN = create(GTOvervolt.id("nether_star_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(HAUMEA.location(), BARNARDE.location(), T_CETI_E.location(), VEGA_B.location(), HORUS.location())
            .heightRangeUniform(-50, -30)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(GarnetSand).size(4))
                    .secondary(b -> b.mat(NetherStar).size(3))
                    .between(b -> b.mat(GarnetRed).size(3))
                    .sporadic(b -> b.mat(GarnetYellow)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(NetherStar)));

    public static final GTOreDefinition IRON_VEIN = create(GTOvervolt.id("iron_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(100)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.NETHER.location(), MARS.location(), CALLISTO.location(), CERES.location(), GANYMEDE.location(), MERCURY.location(), OBERON.location(), PLUTO.location())
            .heightRangeUniform(20, 50)
            .veinedVeinGenerator(generator -> generator
                    .oreBlock(new VeinBlockDefinition(Hematite, 3))
                    .oreBlock(new VeinBlockDefinition(YellowLimonite, 2))
                    .oreBlock(new VeinBlockDefinition(BandedIron, 2))
                    .rareBlock(new VeinBlockDefinition(Malachite, 1))
                    .rareBlockChance(0.075f)
                    .veininessThreshold(0.01f)
                    .maxRichnessThreshold(0.175f)
                    .minRichness(0.7f)
                    .maxRichness(1.0f)
                    .edgeRoundoffBegin(3)
                    .maxEdgeRoundoff(0.1f))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Hematite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition BERYLLIUM_VEIN = create(GTOvervolt.id("beryllium_vein"), vein -> vein
            .clusterSize(UniformInt.of(50, 64)).density(0.75f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location(), Level.NETHER.location(), MARS.location(), CERES.location(), VENUS.location(), TITAN.location(), HAUMEA.location(), MAKEMAKE.location(), PLUTO.location(), BARNARDF.location(), A_CENTAURI_BB.location())
            .heightRangeUniform(5, 30)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Beryllium, 3, 5, 30))
                    .withBlock(new DikeBlockDefinition(Emerald, 2, 5, 19))
                    .withBlock(new DikeBlockDefinition(Emerald, 2, 16, 30))
                    .withBlock(new DikeBlockDefinition(Thorium, 1, 16, 30)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Beryllium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    /*public static final GTOreDefinition RAW_TENGAM_VEIN = create(GTOvervolt.id("raw_tengam_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(80)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(SETH.location())
            .heightRangeUniform(30, 180)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(RawTengam).size(2, 4))
                            .layer(l -> l.weight(2).mat(RawTengam).size(1, 1))
                            .layer(l -> l.weight(2).mat(Electrotine).size(1, 1))
                            .layer(l -> l.weight(1).mat(Samarium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(RawTengam)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    /*public static final GTOreDefinition RED_GARNET_VEIN = create(GTOvervolt.id("red_garnet_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MAKEMAKE.location(), BARNARDF.location(), VEGA_B.location(), HORUS.location())
            .heightRangeUniform(-10, 20)
            .classicVeinGenerator(generator -> generator
                    .primary(b -> b.mat(GarnetRed).size(4))
                    .secondary(b -> b.mat(GarnetYellow).size(3))
                    .between(b -> b.mat(Chrysotile).size(3))
                    .sporadic(b -> b.mat(Realgar)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(GarnetRed)));*/


    public static final GTOreDefinition ELECTROTINE_VEIN = create(GTOvervolt.id("electrotine_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.NETHER.location(), CERES.location(), A_CENTAURI_BB.location())
            .heightRangeUniform(5, 45)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Saltpeter).size(2, 4))
                            .layer(l -> l.weight(2).mat(Diatomite).size(1, 1))
                            .layer(l -> l.weight(2).mat(Electrotine).size(1, 1))
                            .layer(l -> l.weight(1).mat(Alunite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Electrotine)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition LIGNITE_COAL_VEIN = create(GTOvervolt.id("lignite_coal_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.25f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), BARNARDC.location())
            .heightRangeUniform(10, 140)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Lignite).size(2, 4))
                            .layer(l -> l.weight(3).mat(Lignite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Lignite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Coal).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Lignite)));

    public static final GTOreDefinition PLATINUM_VEIN = create(GTOvervolt.id("platinum_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(5)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location(), MAAHES.location(), MEHEN_BELT.location())
            .heightRangeUniform(5, 50)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(END_RULES)
                            .layer(l -> l.weight(3).mat(Bornite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Cooperite).size(1, 1))
                            .layer(l -> l.weight(2).mat(Platinum).size(1, 1))
                            .layer(l -> l.weight(1).mat(Palladium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Platinum)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition TETRAHEDRITE_VEIN = create(GTOvervolt.id("tetrahedrite_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location(), Level.NETHER.location(), DEIMOS.location(), MARS.location(), ASTEROID_BELT.location(), GANYMEDE.location(), VENUS.location(), MIRANDA.location(), KUIPER_BELT.location(), A_CENTAURI_BB.location(), VEGA_B.location())
            .heightRangeUniform(80, 120)
            .veinedVeinGenerator(generator -> generator
                    .oreBlock(new VeinBlockDefinition(Tetrahedrite, 4))
                    .oreBlock(new VeinBlockDefinition(Copper, 2))
                    .rareBlock(new VeinBlockDefinition(Stibnite, 1))
                    .rareBlockChance(0.15f)
                    .veininessThreshold(0.01f)
                    .maxRichnessThreshold(0.175f)
                    .minRichness(0.7f)
                    .maxRichness(1.0f)
                    .edgeRoundoffBegin(3)
                    .maxEdgeRoundoff(0.1f))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Tetrahedrite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.BELOW)));

    public static final GTOreDefinition GALENA_VEIN = create(GTOvervolt.id("galena_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(MOON.location(), MARS.location(), GANYMEDE.location(), VENUS.location(), OBERON.location(), TRITON.location(), VEGA_B.location())
            .heightRangeUniform(-15, 45)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Galena).size(2, 4))
                            .layer(l -> l.weight(2).mat(Silver).size(1, 1))
                            .layer(l -> l.weight(1).mat(Lead).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Galena)));

    public static final GTOreDefinition NAQUADAH_VEIN = create(GTOvervolt.id("naquadah_vein"), vein -> vein
            .clusterSize(UniformInt.of(48, 80)).density(0.25f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location(), ASTEROID_BELT.location(), MERCURY.location(), VENUS.location(), OBERON.location(), TITAN.location(), HAUMEA.location(), KUIPER_BELT.location(), PLUTO.location(), BARNARDE.location(), BARNARDF.location(), VEGA_B.location(), MAAHES.location())
            .heightRangeUniform(10, 90)
            .cuboidVeinGenerator(generator -> generator
                    .top(b -> b.mat(Naquadah).size(2))
                    .middle(b -> b.mat(Naquadah).size(3))
                    .bottom(b -> b.mat(Naquadah).size(2))
                    .spread(b -> b.mat(NaquadahEnriched)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Naquadah)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    /*public static final GTOreDefinition ORIHARUKON_VEIN = create(GTOvervolt.id("oriharukon_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(DEIMOS.location(), PHOBOS.location(), HORUS.location())
            .heightRangeUniform(-30, 30)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Oriharukon).size(2, 4))
                            .layer(l -> l.weight(2).mat(Tanzanite).size(1, 1))
                            .layer(l -> l.weight(2).mat(Vyroxeres).size(1, 1))
                            .layer(l -> l.weight(1).mat(Mirabilite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Oriharukon)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    public static final GTOreDefinition NIOBIUM_VEIN = create(GTOvervolt.id("niobium_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(TRITON.location(), MAKEMAKE.location(), BARNARDF.location(), VEGA_B.location())
            .heightRangeUniform(-30, 10)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Niobium).size(2, 4))
                            .layer(l -> l.weight(2).mat(Yttrium).size(1, 1))
                            .layer(l -> l.weight(1).mat(Gallium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Niobium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition APATITE_VEIN = create(GTOvervolt.id("apatite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(60)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), T_CETI_E.location())
            .heightRangeUniform(10, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Apatite).size(2, 4))
                            .layer(l -> l.weight(2).mat(TricalciumPhosphate).size(1, 1))
                            .layer(l -> l.weight(1).mat(Pyrochlore).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Apatite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition RUTILE_VEIN = create(GTOvervolt.id("rutile_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.3f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(VENUS.location(), TITAN.location(), ANUBIS.location())
            .heightRangeUniform(-10, 20)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Rutile).size(1, 4))
                            .layer(l -> l.weight(2).mat(Titanium).size(1, 2))
                            .layer(l -> l.weight(1).mat(Bauxite).size(1, 1))
                            .layer(l -> l.weight(1).mat(MeteoricIron).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Rutile)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition MINERAL_SAND_VEIN = create(GTOvervolt.id("mineral_sand_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), EUROPA.location(), BARNARDC.location(), ANUBIS.location(), MAAHES.location())
            .heightRangeUniform(15, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(BasalticMineralSand).size(2, 4))
                            .layer(l -> l.weight(2).mat(GraniticMineralSand).size(1, 1))
                            .layer(l -> l.weight(2).mat(FullersEarth).size(1, 1))
                            .layer(l -> l.weight(1).mat(Gypsum).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(BasalticMineralSand)));

    /*public static final GTOreDefinition QUANTIUM_VEIN = create(GTOvervolt.id("quantium_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(VENUS.location(), HORUS.location(), MAAHES.location())
            .heightRangeUniform(-30, 10)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Quantium).size(2, 4))
                            .layer(l -> l.weight(2).mat(Amethyst).size(1, 1))
                            .layer(l -> l.weight(2).mat(Rutile).size(1, 1))
                            .layer(l -> l.weight(1).mat(Ardite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Quantium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    public static final GTOreDefinition CHROME_VEIN = create(GTOvervolt.id("chrome_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.3f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(EUROPA.location(), T_CETI_E.location(), MAAHES.location())
            .heightRangeUniform(-10, 20)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Chromium).size(1, 4))
                            .layer(l -> l.weight(2).mat(Tungstate).size(1, 2))
                            .layer(l -> l.weight(1).mat(Molybdenum).size(1, 1))
                            .layer(l -> l.weight(1).mat(Manganese).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Chromium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    /*public static final GTOreDefinition LEDOX_VEIN = create(GTOvervolt.id("ledox_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(EUROPA.location(), ENCELADUS.location(), HORUS.location())
            .heightRangeUniform(55, 75)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Ledox).size(2, 4))
                            .layer(l -> l.weight(2).mat(Opal).size(1, 1))
                            .layer(l -> l.weight(2).mat(Orichalcum).size(1, 1))
                            .layer(l -> l.weight(1).mat(Rubracium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Ledox)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    public static final GTOreDefinition MAGNETITE_VEIN = create(GTOvervolt.id("magnetite_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(120)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), DEIMOS.location(), CERES.location(), IO.location(), MAKEMAKE.location(), BARNARDE.location(), T_CETI_E.location(), SETH.location())
            .heightRangeUniform(10, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Magnetite).size(2, 4))
                            .layer(l -> l.weight(2).mat(VanadiumMagnetite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Iron).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Magnetite)));

    public static final GTOreDefinition TIN_VEIN = create(GTOvervolt.id("tin_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(80)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), EUROPA.location(), A_CENTAURI_BB.location())
            .heightRangeUniform(20, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(CassiteriteSand).size(2, 4))
                            .layer(l -> l.weight(2).mat(GarnetSand).size(1, 1))
                            .layer(l -> l.weight(1).mat(Asbestos).size(1, 1))
                            .layer(l -> l.weight(1).mat(Diatomite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Tin)));

    /*public static final GTOreDefinition IRIDIUM_VEIN = create(GTOvervolt.id("iridium_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(5)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(IO.location(), MERCURY.location(), VENUS.location(), ENCELADUS.location(), MIRANDA.location(), TITAN.location(), TRITON.location(), KUIPER_BELT.location(), MEHEN_BELT.location(), SETH.location())
            .heightRangeUniform(5, 40)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Bornite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Cooperite).size(1, 1))
                            .layer(l -> l.weight(2).mat(Mithril).size(1, 1))
                            .layer(l -> l.weight(1).mat(Palladium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Cooperite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/

    public static final GTOreDefinition SALTS_VEIN = create(GTOvervolt.id("salts_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), MARS.location(), BARNARDC.location(), T_CETI_E.location())
            .heightRangeUniform(30, 70)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(RockSalt).size(2, 4))
                            .layer(l -> l.weight(2).mat(Salt).size(1, 1))
                            .layer(l -> l.weight(1).mat(Lepidolite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Spodumene).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Salt)));

    public static final GTOreDefinition CASSITERITE_VEIN = create(GTOvervolt.id("cassiterite_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.END.location(), MOON.location(), IO.location(), VENUS.location(), MIRANDA.location(), T_CETI_E.location(), MEHEN_BELT.location(), SETH.location())
            .heightRangeUniform(60, 220)
            .veinedVeinGenerator(generator -> generator
                    .oreBlock(new VeinBlockDefinition(Tin, 4))
                    .rareBlock(new VeinBlockDefinition(Cassiterite, 2))
                    .rareBlockChance(0.33f)
                    .veininessThreshold(0.01f)
                    .maxRichnessThreshold(0.175f)
                    .minRichness(0.7f)
                    .maxRichness(1.0f)
                    .edgeRoundoffBegin(3)
                    .maxEdgeRoundoff(0.1f))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Cassiterite)));

    public static final GTOreDefinition NETHER_QUARTZ_VEIN = create(GTOvervolt.id("nether_quartz_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.NETHER.location(), A_CENTAURI_BB.location(), NEPER.location())
            .heightRangeUniform(40, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(NetherQuartz).size(2, 4))
                            .layer(l -> l.weight(1).mat(Quartzite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(NetherQuartz)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static void init() {

    }
}