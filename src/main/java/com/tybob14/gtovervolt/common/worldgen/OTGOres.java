package com.tybob14.gtovervolt.common.worldgen;

import com.gregtechceu.gtceu.api.data.worldgen.*;
import com.gregtechceu.gtceu.api.data.worldgen.generator.indicators.SurfaceIndicatorGenerator;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.DikeVeinGenerator.*;
import com.gregtechceu.gtceu.api.data.worldgen.generator.veins.VeinedVeinGenerator.*;
import com.gregtechceu.gtceu.common.data.GTOres;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.data.tags.OVCustomTags;
import net.minecraft.tags.BiomeTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static net.minecraft.util.valueproviders.UniformInt.*;

@SuppressWarnings("unused")
public class OTGOres extends GTOres {

    public static IWorldGenLayer VEIN_IRON = new SimpleWorldGenLayer("multi_iron", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_IRON), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_URANIUM_238 = new SimpleWorldGenLayer("multi_uranium_238", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_URANIUM_238), Set.of(Level.OVERWORLD.location()));

    //End, Deimos, Mars, Asteroids, Callisto, Ganymede, Enceladus, Oberon, Triton, Haumea, Kuiper Belt, Makemake, Pluto, Vega B
    public static IWorldGenLayer VEIN_TUNGSTATE = new SimpleWorldGenLayer("multi_tungstate", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_TUNGSTATE), Set.of(Level.END.location()));

    //Callisto, Ceres, Ganymede, Io
    public static IWorldGenLayer VEIN_PLUTONIUM_239 = new SimpleWorldGenLayer("multi_plutonium_239", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_PLUTONIUM_239), Set.of(Level.OVERWORLD.location(), Level.END.location()));


    public static IWorldGenLayer VEIN_SULFUR = new SimpleWorldGenLayer("multi_sulfur", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_SULFUR), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_DIAMOND = new SimpleWorldGenLayer("multi_diamond", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_DIAMOND), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_INFINITY_CATALYST = new SimpleWorldGenLayer("multi_infinity_catalyst", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_INFINITY_CATALYST), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_LAPIS = new SimpleWorldGenLayer("multi_lapis", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_LAPIS), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_MOLYBDENUM = new SimpleWorldGenLayer("multi_molybdenum", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_MOLYBDENUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_VERMICULITE = new SimpleWorldGenLayer("multi_vermiculite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_VERMICULITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_OILSANDS = new SimpleWorldGenLayer("multi_oilsands", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_OILSANDS), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_AWAKENED_DRACONIUM = new SimpleWorldGenLayer("multi_awakened_draconium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_AWAKENED_DRACONIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_MAGNESITE = new SimpleWorldGenLayer("multi_magnesite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_MAGNESITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_OLIVINE = new SimpleWorldGenLayer("multi_olivine", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_OLIVINE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_OSMIUM = new SimpleWorldGenLayer("multi_osmium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_OSMIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_TUNGSTEN = new SimpleWorldGenLayer("multi_tungsten", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_TUNGSTEN), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_COAL = new SimpleWorldGenLayer("multi_coal", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_COAL), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_MANGANESE = new SimpleWorldGenLayer("multi_manganese", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_MANGANESE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_DESH = new SimpleWorldGenLayer("multi_desh", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_DESH), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_CERTUS_QUARTZ = new SimpleWorldGenLayer("multi_certus_quartz", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_CERTUS_QUARTZ), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_QUARTZITE = new SimpleWorldGenLayer("multi_quartzite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_QUARTZITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_SAMARIUM = new SimpleWorldGenLayer("multi_samarium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_SAMARIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_DILITHIUM = new SimpleWorldGenLayer("multi_dilithium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_DILITHIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_PITCHBLENDE = new SimpleWorldGenLayer("multi_pitchblende", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_PITCHBLENDE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_QUARTZ = new SimpleWorldGenLayer("multi_quartz", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_QUARTZ), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_DRACONIUM = new SimpleWorldGenLayer("multi_draconium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_DRACONIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_REDSTONE = new SimpleWorldGenLayer("multi_redstone", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_REDSTONE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_SAPPHIRE = new SimpleWorldGenLayer("multi_sapphire", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_SAPPHIRE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_PYROLUSITE = new SimpleWorldGenLayer("multi_pyrolusite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_PYROLUSITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_NAQUADRIA = new SimpleWorldGenLayer("multi_naquadria", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_NAQUADRIA), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_MICA = new SimpleWorldGenLayer("multi_mica", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_MICA), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_CRYOLITE = new SimpleWorldGenLayer("multi_cryolite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_CRYOLITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_INFUSED_GOLD = new SimpleWorldGenLayer("multi_infused_gold", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_INFUSED_GOLD), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_MONAZITE = new SimpleWorldGenLayer("multi_monazite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_MONAZITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_DOLOMITE = new SimpleWorldGenLayer("multi_dolomite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_DOLOMITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_BLACK_PLUTONIUM = new SimpleWorldGenLayer("multi_black_plutonium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_BLACK_PLUTONIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_RARE_EARTH = new SimpleWorldGenLayer("multi_rare_earth", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_RARE_EARTH), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_NICKEL = new SimpleWorldGenLayer("multi_nickel", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_NICKEL), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_ILMENITE = new SimpleWorldGenLayer("multi_iron", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_ILMENITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_COSMIC_NEUTRONIUM = new SimpleWorldGenLayer("multi_cosmic_neutronium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_COSMIC_NEUTRONIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_PALLADIUM = new SimpleWorldGenLayer("multi_palladium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_PALLADIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_CALLISTO_ICE = new SimpleWorldGenLayer("multi_callisto_ice", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_CALLISTO_ICE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_THORIUM = new SimpleWorldGenLayer("multi_thorium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_THORIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_ARSENIC = new SimpleWorldGenLayer("multi_arsenic", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_ARSENIC), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_COPPER = new SimpleWorldGenLayer("multi_copper", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_COPPER), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_VANADIUM = new SimpleWorldGenLayer("multi_vanadium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_VANADIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_BAUXITE = new SimpleWorldGenLayer("multi_bauxite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_BAUXITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_SOAPSTONE = new SimpleWorldGenLayer("multi_soapstone", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_SOAPSTONE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_NEUTRONIUM = new SimpleWorldGenLayer("multi_neutronium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_NEUTRONIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_MYTRYL = new SimpleWorldGenLayer("multi_mytryl", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_MYTRYL), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_GOLD = new SimpleWorldGenLayer("multi_gold", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_GOLD), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_KAOLINITE = new SimpleWorldGenLayer("multi_kaolinite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_KAOLINITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_NETHER_STAR = new SimpleWorldGenLayer("multi_nether_star", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_NETHER_STAR), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_BERYLLIUM = new SimpleWorldGenLayer("multi_beryllium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_BERYLLIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_RAW_TENGAM = new SimpleWorldGenLayer("multi_raw_tengam", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_RAW_TENGAM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_RED_GARNET = new SimpleWorldGenLayer("multi_red_garnet", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_RED_GARNET), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_ELECTROTINE = new SimpleWorldGenLayer("multi_electrotine", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_ELECTROTINE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_LIGNITE_COAL = new SimpleWorldGenLayer("multi_lignite_coal", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_LIGNITE_COAL), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_PLATINUM = new SimpleWorldGenLayer("multi_platinum", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_PLATINUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_TETRAHEDRITE = new SimpleWorldGenLayer("multi_tetrahedrite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_TETRAHEDRITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_GALENA = new SimpleWorldGenLayer("multi_galena", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_GALENA), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_NAQUADAH = new SimpleWorldGenLayer("multi_naquadah", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_NAQUADAH), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_ORIHARUKON = new SimpleWorldGenLayer("multi_oriharukon", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_ORIHARUKON), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_NIOBIUM = new SimpleWorldGenLayer("multi_niobium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_NIOBIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_APATITE = new SimpleWorldGenLayer("multi_apatite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_APATITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_RUTILE = new SimpleWorldGenLayer("multi_rutile", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_RUTILE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_BASALTIC_MINERAL_SAND = new SimpleWorldGenLayer("multi_basaltic_mineral_sand", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_BASALTIC_MINERAL_SAND), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_QUANTIUM = new SimpleWorldGenLayer("multi_quantium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_QUANTIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_CHROME = new SimpleWorldGenLayer("multi_chrome", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_CHROME), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_LEDOX = new SimpleWorldGenLayer("multi_ledox", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_LEDOX), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_MAGNETITE = new SimpleWorldGenLayer("multi_magnetite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_MAGNETITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_TIN = new SimpleWorldGenLayer("multi_tin", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_TIN), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_IRIDIUM = new SimpleWorldGenLayer("multi_iridium", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_IRIDIUM), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_SALT = new SimpleWorldGenLayer("multi_salt", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_SALT), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_CASSITERITE = new SimpleWorldGenLayer("multi_cassiterite", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_CASSITERITE), Set.of(Level.OVERWORLD.location(), Level.END.location()));
    public static IWorldGenLayer VEIN_NETHER_QUARTZ = new SimpleWorldGenLayer("multi_nether_quartz", () -> new TagMatchTest(OVCustomTags.ORE_VEIN_NETHER_QUARTZ), Set.of(Level.OVERWORLD.location(), Level.END.location()));

    //Infinity Catalyst, Vermiculite, Awakened Draconium, Magnesite, Olivine, Osmium, Tungsten, Desh, Quartzite, Samarium, Dilithium, Quartz, Draconium, Pyrolusite, Naquadria, Cryolite, Infused Gold, Dolomite. Black Plutonium, Rare Earth, Bauxite
    // Cosmic Neutronium, Palladium, Callisto Ice, Thorium, Arsenic, Vanadium, Neutronium, Mytryl, Kaolinite, Nether Star, Raw Tengam, Red Garnet, Lignite Coal, Oriharukon, Niobium, Rutile, Quantium, Chrome, Ledox, Tin, Iridium,


    public static final GTOreDefinition URANIUM_238 = create(GTOvervolt.id("uranium_238_vein"), vein -> vein
            .clusterSize(30).density(0.3f).weight(40)
            .layer(VEIN_URANIUM_238)
            .heightRangeUniform(20, 30)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(2).mat(Uraninite).size(1, 4))
                            .layer(l -> l.weight(1).mat(Uranium238).size(1, 2))
                            .build())
            )
    );


    public static final GTOreDefinition SCHEELITE_VEIN = create(GTOvervolt.id("scheelite_vein"), vein -> vein
            .clusterSize(of(50, 64)).density(0.7f).weight(20)
            .layer(VEIN_TUNGSTATE)
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
            .clusterSize(30).density(0.3f).weight(40)
            .layer(VEIN_PLUTONIUM_239)
            .heightRangeUniform(10, 80)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(2).mat(Uranium238).size(1, 4))
                            .layer(l -> l.weight(1).mat(Plutonium239).size(1, 2))
                            .layer(l -> l.weight(1).mat(Thorium).size(1, 1))
                            .build())
            )
    );

    public static final GTOreDefinition SULFUR_VEIN = create(GTOvervolt.id("sulfur_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(100)
            .layer(VEIN_SULFUR)
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
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
            .heightRangeUniform(-55, -30)
            .layer(VEIN_DIAMOND)
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
            .clusterSize(UniformInt.of(40, 52)).density(0.75f).weight(40)
            .layer(VEIN_LAPIS)
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
            .layer(VEIN_MOLYBDENUM)
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
            .clusterSize(UniformInt.of(25, 29)).density(0.3f).weight(40)
            .layer(VEIN_OILSANDS)
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
            .clusterSize(UniformInt.of(38, 44)).density(0.25f).weight(80)
            .layer(VEIN_COAL)
            .heightRangeUniform(10, 140)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(OVERWORLD_RULES)
                            .layer(l -> l.weight(3).mat(Coal).size(2, 4))
                            .layer(l -> l.weight(3).mat(Coal).size(2, 4))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Coal)));

    public static final GTOreDefinition MANGANESE_VEIN = create(GTOvervolt.id("manganese_vein"), vein -> vein
            .clusterSize(UniformInt.of(50, 64)).density(0.75f).weight(20)
            .layer(VEIN_MANGANESE)
            .heightRangeUniform(20, 30)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Grossular, 3, 20, 30))
                    .withBlock(new DikeBlockDefinition(Pyrolusite, 2, 20, 26))
                    .withBlock(new DikeBlockDefinition(Tantalite, 1, 24, 30)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Grossular)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition CERTUS_QUARTZ_VEIN = create(GTOvervolt.id("certus_quartz"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(40)
            .layer(VEIN_CERTUS_QUARTZ)
            .heightRangeUniform(80, 120)
            .layeredVeinGenerator(generator -> generator
                    .withLayerPattern(() -> GTLayerPattern.builder(NETHER_RULES)
                            .layer(l -> l.weight(3).mat(Quartzite).size(2, 4))
                            .layer(l -> l.weight(2).mat(CertusQuartz).size(1, 1))
                            .layer(l -> l.weight(1).mat(Barite).size(1, 1))
                            .build()))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(CertusQuartz)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.BELOW)));

    public static final GTOreDefinition PITCHBLENDE_VEIN = create(GTOvervolt.id("pitchblende_vein"), vein -> vein
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
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition REDSTONE_VEIN_OW = create(GTOvervolt.id("redstone_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(60)
            .layer(VEIN_REDSTONE)
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

    public static final GTOreDefinition SAPPHIRE_VEIN = create(GTOvervolt.id("sapphire_vein"), vein -> vein
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(60)
            .layer(VEIN_SAPPHIRE)
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
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(20)
            .layer(VEIN_MICA)
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
            .layer(VEIN_MONAZITE)
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
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
            .layer(VEIN_NICKEL)
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
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(80)
            .layer(VEIN_COPPER)
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
            .layer(VEIN_BAUXITE)
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
            .clusterSize(UniformInt.of(25, 29)).density(0.25f).weight(40)
            .layer(VEIN_SOAPSTONE)
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
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(80)
            .layer(VEIN_GOLD)
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
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(30)
            .layer(VEIN_IRON)
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
            .clusterSize(UniformInt.of(50, 64)).density(0.75f).weight(30)
            .layer(VEIN_BERYLLIUM)
            .heightRangeUniform(5, 30)
            .dikeVeinGenerator(generator -> generator
                    .withBlock(new DikeBlockDefinition(Beryllium, 3, 5, 30))
                    .withBlock(new DikeBlockDefinition(Emerald, 2, 5, 19))
                    .withBlock(new DikeBlockDefinition(Emerald, 2, 16, 30)))
            .surfaceIndicatorGenerator(indicator -> indicator
                    .surfaceRock(Beryllium)
                    .placement(SurfaceIndicatorGenerator.IndicatorPlacement.ABOVE)));

    public static final GTOreDefinition ELECTROTINE_VEIN = create(GTOvervolt.id("electrotine_vein"), vein -> vein
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
            .layer(VEIN_ELECTROTINE)
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
            .clusterSize(UniformInt.of(25, 29)).density(0.2f).weight(10)
            .layer(VEIN_PLATINUM)
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
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(70)
            .layer(VEIN_TETRAHEDRITE)
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
            .layer(VEIN_GALENA)
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
            .clusterSize(UniformInt.of(48, 80)).density(0.25f).weight(30)
            .layer(VEIN_NAQUADAH)
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
            .clusterSize(UniformInt.of(32, 40)).density(0.25f).weight(40)
            .layer(VEIN_APATITE)
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
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(80)
            .layer(VEIN_BASALTIC_MINERAL_SAND)
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
            .clusterSize(UniformInt.of(38, 44)).density(0.15f).weight(80)
            .layer(VEIN_MAGNETITE)
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
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(50)
            .layer(VEIN_SALT)
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
            .clusterSize(UniformInt.of(40, 52)).density(1.0f).weight(80)
            .layer(VEIN_CASSITERITE)
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
            .clusterSize(UniformInt.of(32, 40)).density(0.2f).weight(80)
            .layer(VEIN_NETHER_QUARTZ)
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
