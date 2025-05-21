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
import static net.minecraft.util.valueproviders.UniformInt.of;

@SuppressWarnings("unused")
public class OTGOres extends GTOres {

    //Overworld
    /*
        Vermiculite, Kaolinite, Lignite Coal, Tin

     */

    //Infinity Catalyst, Awakened Draconium, Magnesite, Olivine, Osmium, Tungsten, Desh, Quartzite, Samarium, Dilithium, Quartz, Draconium, Pyrolusite, Naquadria, Cryolite, Infused Gold, Dolomite. Black Plutonium, Rare Earth, Bauxite
    // Cosmic Neutronium, Palladium, Callisto Ice, Thorium, Arsenic, Vanadium, Neutronium, Mytryl, Nether Star, Raw Tengam, Red Garnet,  Oriharukon, Niobium, Rutile, Quantium, Chrome, Ledox, Tin, Iridium,


    public static final GTOreDefinition SCHEELITE_VEIN = create(GTOvervolt.id("scheelite_vein"), vein -> vein
            .clusterSize(of(50, 64)).density(0.7f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location())
            .heightRangeUniform(20, 60)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Scheelite, 3, 20, 60))
                    .withBlock(new DikeBlockDefinition(Tungstate, 2, 35, 55))
                    .withBlock(new DikeBlockDefinition(Lithium, 1, 20, 40)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Scheelite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE))
    );

    public static final GTOreDefinition REDSTONE_VEIN = create(GTOvervolt.id("redstone_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(50)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.NETHER.location())
            .heightRangeUniform(-65, -10)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Redstone).size(2, 4))
                            .layer(l -> l.weight(2).mat(Ruby).size(1, 1))
                            .layer(l -> l.weight(1).mat(Cinnabar).size(1, 1))
                            .build())
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Redstone).size(2, 4))
                            .layer(l -> l.weight(2).mat(Ruby).size(1, 1))
                            .layer(l -> l.weight(1).mat(Cinnabar).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Redstone)));


    public static final GTOreDefinition SULFUR_VEIN = create(GTOvervolt.id("sulfur_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(90)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.NETHER.location())
            .heightRangeUniform(10, 30)
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
            .dimensions(Level.OVERWORLD.location())
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

    public static final GTOreDefinition LAPIS_VEIN = create(GTOvervolt.id("lapis_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(0.75f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
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
            .dimensions(Level.END.location(), Level.NETHER.location())
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

    public static final GTOreDefinition OILSANDS_VEIN = create(GTOvervolt.id("oilsands_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.3f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
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

    public static final GTOreDefinition COAL_VEIN = create(GTOvervolt.id("coal_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.25f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
            .heightRangeUniform(10, 140)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Coal).size(2, 4))
                            .layer(l -> l.weight(3).mat(Coal).size(2, 4))
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

    /*public static final GTOreDefinition CERTUS_QUARTZ_VEIN = create(GTOvervolt.id("certus_quartz"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .heightRangeUniform(80, 120)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Quartzite).size(2, 4))
                            .layer(l -> l.weight(2).mat(CertusQuartz).size(1, 1))
                            .layer(l -> l.weight(1).mat(Barite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(CertusQuartz)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.BELOW)));*/

    /*public static final GTOreDefinition PITCHBLENDE_VEIN = create(GTOvervolt.id("pitchblende_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 64)).density(0.25f).weight(30)
            .layer(VEIN_PITCHBLENDE)
            .heightRangeUniform(30, 60)
            .cuboidVeinGenerator(generator -> generator
                    .top(b -> b.mat(Pitchblende).size(2))
                    .middle(b -> b.mat(Pitchblende).size(3))
                    .bottom(b -> b.mat(Pitchblende).size(2))
                    .spread(b -> b.mat(Uraninite)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Pitchblende)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));*/


    public static final GTOreDefinition SAPPHIRE_VEIN = create(GTOvervolt.id("sapphire_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(50)
            .layer(OVWorldGenLayers.ALL_DIM)
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

    public static final GTOreDefinition MICA_VEIN = create(GTOvervolt.id("mica_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(10)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
            .heightRangeUniform(-40, -10)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Kyanite).size(2, 4))
                            .layer(l -> l.weight(2).mat(Mica).size(1, 1))
                            .layer(l -> l.weight(2).mat(Bauxite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Pollucite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Mica)
                    .radius(3)));

    public static final GTOreDefinition MONAZITE_VEIN = create(GTOvervolt.id("monazite_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .heightRangeUniform(20, 40)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Bastnasite).size(2, 4))
                            .layer(l -> l.weight(1).mat(Monazite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Neodymium).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Bastnasite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition NICKEL_VEIN = create(GTOvervolt.id("nickel_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location())
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

    public static final GTOreDefinition COPPER_VEIN = create(GTOvervolt.id("copper_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.NETHER.location(), Level.END.location())
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

    public static final GTOreDefinition BAUXITE_VEIN = create(GTOvervolt.id("bauxite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.3f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
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
            .dimensions(Level.OVERWORLD.location())
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

    public static final GTOreDefinition GOLD_VEIN = create(GTOvervolt.id("gold_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.END.location())
            .heightRangeUniform(10, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Magnetite).size(2, 4))
                            .layer(l -> l.weight(2).mat(VanadiumMagnetite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Gold).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Magnetite)));

    public static final GTOreDefinition IRON_VEIN = create(GTOvervolt.id("iron_vein"), vein -> vein
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location(), Level.NETHER.location())
            .heightRangeUniform(20, 40)
            .veinedVeinGenerator(generator -> generator
                    .oreBlock(new VeinBlockDefinition(Goethite, 3))
                    .oreBlock(new VeinBlockDefinition(YellowLimonite, 2))
                    .oreBlock(new VeinBlockDefinition(Hematite, 2))
                    .rareBlock(new VeinBlockDefinition(Gold, 1))
                    .rareBlockChance(0.075f)
                    .veininessThreshold(0.01f)
                    .maxRichnessThreshold(0.175f)
                    .minRichness(0.7f)
                    .maxRichness(1.0f)
                    .edgeRoundoffBegin(3)
                    .maxEdgeRoundoff(0.1f))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Goethite)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition BERYLLIUM_VEIN = create(GTOvervolt.id("beryllium_vein"), vein -> vein
            .clusterSize(UniformInt.of(50, 64)).density(0.75f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location(), Level.NETHER.location())
            .heightRangeUniform(5, 30)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Beryllium, 3, 5, 30))
                    .withBlock(new DikeBlockDefinition(Emerald, 2, 5, 19))
                    .withBlock(new DikeBlockDefinition(Emerald, 2, 16, 30)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Beryllium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition ELECTROTINE_VEIN = create(GTOvervolt.id("electrotine_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.NETHER.location())
            .heightRangeUniform(5, 45)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Saltpeter).size(2, 4))
                            .layer(l -> l.weight(2).mat(Diatomite).size(1, 1))
                            .layer(l -> l.weight(2).mat(Electrotine).size(1, 1))
                            .layer(l -> l.weight(1).mat(Alunite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Saltpeter)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition PLATINUM_VEIN = create(GTOvervolt.id("platinum_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(5)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location())
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
            .dimensions(Level.END.location(), Level.NETHER.location())
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

    /*public static final GTOreDefinition GALENA_VEIN = create(GTOvervolt.id("galena_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
            .layer(VEIN_GALENA)
            .heightRangeUniform(-15, 45)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Galena).size(2, 4))
                            .layer(l -> l.weight(2).mat(Silver).size(1, 1))
                            .layer(l -> l.weight(1).mat(Lead).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Galena)));*/

    public static final GTOreDefinition NAQUADAH_VEIN = create(GTOvervolt.id("naquadah_vein"), vein -> vein
            .clusterSize(UniformInt.of(48, 80)).density(0.25f).weight(20)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.END.location())
            .heightRangeUniform(10, 90)
            .cuboidVeinGenerator(generator -> generator
                    .top(b -> b.mat(Naquadah).size(2))
                    .middle(b -> b.mat(Naquadah).size(3))
                    .bottom(b -> b.mat(Naquadah).size(2))
                    .spread(b -> b.mat(Plutonium239)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Naquadah)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition APATITE_VEIN = create(GTOvervolt.id("apatite_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(30)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
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

    public static final GTOreDefinition MINERAL_SAND_VEIN = create(GTOvervolt.id("mineral_sand_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
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

    public static final GTOreDefinition MAGNETITE_VEIN = create(GTOvervolt.id("magnetite_vein"), vein -> vein
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(70)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
            .heightRangeUniform(10, 60)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Magnetite).size(2, 4))
                            .layer(l -> l.weight(2).mat(VanadiumMagnetite).size(1, 1))
                            .layer(l -> l.weight(1).mat(Gold).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Magnetite)));

    public static final GTOreDefinition SALTS_VEIN = create(GTOvervolt.id("salts_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(40)
            .layer(OVWorldGenLayers.ALL_DIM)
            .dimensions(Level.OVERWORLD.location())
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
            .dimensions(Level.OVERWORLD.location(), Level.END.location())
            .heightRangeUniform(10, 80)
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
            .dimensions(Level.NETHER.location())
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
