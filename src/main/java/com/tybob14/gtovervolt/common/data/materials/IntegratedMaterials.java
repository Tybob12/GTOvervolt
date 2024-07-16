package com.tybob14.gtovervolt.common.data.materials;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.enderio.base.common.init.EIOBlocks;
import com.enderio.base.common.init.EIOItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.Element;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.CertusQuartz;

public class IntegratedMaterials {

    public static void init(){
        dust.setIgnored(Skystone);
        dust.setIgnored(Fluix);
        gem.setIgnored(Fluix);
        block.setIgnored(Fluix);
        gem.setIgnored(CertusQuartz);
        dust.setIgnored(CertusQuartz);

        ingot.setIgnored(CopperAlloy);
        block.setIgnored(CopperAlloy);
        nugget.setIgnored(CopperAlloy);
        ingot.setIgnored(EnergeticAlloy);
        block.setIgnored(EnergeticAlloy);
        nugget.setIgnored(EnergeticAlloy);
        ingot.setIgnored(VibrantAlloy);
        block.setIgnored(VibrantAlloy);
        nugget.setIgnored(VibrantAlloy);
        ingot.setIgnored(RedstoneAlloy);
        block.setIgnored(RedstoneAlloy);
        nugget.setIgnored(RedstoneAlloy);
        ingot.setIgnored(ConductiveAlloy);
        block.setIgnored(ConductiveAlloy);
        nugget.setIgnored(ConductiveAlloy);
        ingot.setIgnored(PulsatingAlloy);
        block.setIgnored(PulsatingAlloy);
        nugget.setIgnored(PulsatingAlloy);
        ingot.setIgnored(DarKSteel);
        block.setIgnored(DarKSteel);
        nugget.setIgnored(DarKSteel);
        ingot.setIgnored(Soularium);
        block.setIgnored(Soularium);
        nugget.setIgnored(Soularium);
        ingot.setIgnored(EndSteel);
        block.setIgnored(EndSteel);
        nugget.setIgnored(EndSteel);
    }

    public static void modifyAE2Materials() {
        dust.setIgnored(Skystone, AEItems.SKY_DUST);
        dust.setIgnored(Fluix, AEItems.FLUIX_DUST);
        gem.setIgnored(Fluix, AEItems.FLUIX_CRYSTAL);
        block.setIgnored(Fluix, AEBlocks.FLUIX_BLOCK);
        gem.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_CRYSTAL);
        dust.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_DUST);
    }

    public static void modifyEnderIOMaterials() {
        ingot.setIgnored(CopperAlloy, EIOItems.COPPER_ALLOY_INGOT.asItem());
        ingot.setIgnored(CopperAlloy, EIOItems.COPPER_ALLOY_INGOT.asItem());
        block.setIgnored(CopperAlloy, EIOBlocks.COPPER_ALLOY_BLOCK.asItem());
        nugget.setIgnored(CopperAlloy, EIOItems.COPPER_ALLOY_NUGGET.asItem());
        ingot.setIgnored(EnergeticAlloy, EIOItems.ENERGETIC_ALLOY_INGOT.asItem());
        block.setIgnored(EnergeticAlloy, EIOBlocks.ENERGETIC_ALLOY_BLOCK.asItem());
        nugget.setIgnored(EnergeticAlloy, EIOItems.ENERGETIC_ALLOY_NUGGET.asItem());
        ingot.setIgnored(VibrantAlloy, EIOItems.VIBRANT_ALLOY_INGOT.asItem());
        block.setIgnored(VibrantAlloy, EIOBlocks.VIBRANT_ALLOY_BLOCK.asItem());
        nugget.setIgnored(VibrantAlloy, EIOItems.VIBRANT_ALLOY_NUGGET.asItem());
        ingot.setIgnored(RedstoneAlloy, EIOItems.REDSTONE_ALLOY_INGOT.asItem());
        block.setIgnored(RedstoneAlloy, EIOBlocks.REDSTONE_ALLOY_BLOCK.asItem());
        nugget.setIgnored(RedstoneAlloy, EIOItems.REDSTONE_ALLOY_NUGGET.asItem());
        ingot.setIgnored(ConductiveAlloy, EIOItems.CONDUCTIVE_ALLOY_INGOT.asItem());
        block.setIgnored(ConductiveAlloy, EIOBlocks.CONDUCTIVE_ALLOY_BLOCK.asItem());
        nugget.setIgnored(ConductiveAlloy, EIOItems.CONDUCTIVE_ALLOY_NUGGET.asItem());
        ingot.setIgnored(PulsatingAlloy, EIOItems.PULSATING_ALLOY_INGOT.asItem());
        block.setIgnored(PulsatingAlloy, EIOBlocks.PULSATING_ALLOY_BLOCK.asItem());
        nugget.setIgnored(PulsatingAlloy, EIOItems.PULSATING_ALLOY_NUGGET.asItem());
        ingot.setIgnored(DarKSteel, EIOItems.DARK_STEEL_INGOT.asItem());
        block.setIgnored(DarKSteel, EIOBlocks.DARK_STEEL_BLOCK.asItem());
        nugget.setIgnored(DarKSteel, EIOItems.DARK_STEEL_NUGGET.asItem());
        ingot.setIgnored(Soularium, EIOItems.SOULARIUM_INGOT.asItem());
        block.setIgnored(Soularium, EIOBlocks.SOULARIUM_BLOCK.asItem());
        nugget.setIgnored(Soularium, EIOItems.SOULARIUM_NUGGET.asItem());
        ingot.setIgnored(EndSteel, EIOItems.END_STEEL_INGOT.asItem());
        block.setIgnored(EndSteel, EIOBlocks.END_STEEL_BLOCK.asItem());
        nugget.setIgnored(EndSteel, EIOItems.END_STEEL_NUGGET.asItem());
    }

    /*
    //Extra Utilties
    public static Materials Unstable                = new Materials( 396, TextureSet.SET_SHINY             ,   1.0F,      0,  4, 1                         , 220, 220, 220, 127,   "Unstable"                ,   "Unstable"                      ,    0,       0,         -1,    0, false,  true,   1,   1,   1, Dyes.dyeWhite       , Collections.singletonList(new TC_AspectStack(TC_Aspects.PERDITIO, 4)));
    public static Materials Unstableingot           = new Materials(  -1, TextureSet.SET_NONE              ,   1.0F,      0,  4, 0                         , 255, 255, 255, 127,   "Unstableingot"           ,   "Unstable"                      ,    0,       0,         -1,    0, false,  true,   1,   1,   1, Dyes.dyeWhite       , Collections.singletonList(new TC_AspectStack(TC_Aspects.PERDITIO, 4)));

    //IC2
    public static Materials Sunnarium               = new Materials( 318, TextureSet.SET_SHINY             ,   1.0F,      0,  1, 1|2          |64|128      , 255, 255,   0,   0,   "Sunnarium"               ,   "Sunnarium"                     ,    0,       0,       4200, 4200,  true, false,   1,   1,   1, Dyes.dyeYellow      ).disableAutoGeneratedBlastFurnaceRecipes();

    //Thermal
    public static Materials Niter                   = new Materials( 531, TextureSet.SET_FLINT             ,   1.0F,      0,  1, 1  |4|8                   , 255, 200, 200,   0,   "Niter"                   ,   "Niter"                         ,    0,       0,         -1,    0, false, false,   1,   1,   1, Dyes.dyePink        , 2, Collections.singletonList(new MaterialStack(Saltpeter, 1)));
    public static Materials Pyrotheum               = new Materials( 843, TextureSet.SET_FIERY             ,   1.0F,      0,  1, 1                         , 255, 128,   0,   0,   "Pyrotheum"               ,   "Pyrotheum"                     ,    2,      62,         -1,    0, false, false,   2,   3,   1, Dyes.dyeYellow      , 2, Arrays.asList(new MaterialStack(Coal, 1), new MaterialStack(Redstone, 1), new MaterialStack(Blaze, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.PRAECANTATIO, 2), new TC_AspectStack(TC_Aspects.IGNIS, 1)));
    public static Materials Cryotheum               = new Materials( 898, TextureSet.SET_SHINY             ,   1.0F,      0,  1, 1                         ,   0, 148, 203,   0,   "Cryotheum"               ,   "Cryotheum"                     ,    2,      62,         -1,    0, false, false,   2,   3,   1, Dyes.dyeLightBlue   , 2, Arrays.asList(new MaterialStack(Saltpeter, 1), new MaterialStack(Redstone, 1), new MaterialStack(Snow, 1), new MaterialStack(Blizz, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.PRAECANTATIO, 2), new TC_AspectStack(TC_Aspects.ELECTRUM, 1),  new TC_AspectStack(TC_Aspects.GELUM, 1)));
    public static Materials Enderium                = new Materials( 321, TextureSet.SET_DULL              ,   8.0F,   1500,  3, 1|2          |64|128      ,  89, 145, 135,   0,   "Enderium"                ,   "Enderium"                      ,    0,       0,       4500, 4500,  true, false,   1,   1,   1, Dyes.dyeGreen       , 1, Arrays.asList(new MaterialStack(EnderiumBase, 2), new MaterialStack(Thaumium, 1), new MaterialStack(EnderPearl, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.METALLUM, 2), new TC_AspectStack(TC_Aspects.ALIENIS, 1))).disableAutoGeneratedBlastFurnaceRecipes().disableAutoGeneratedVacuumFreezerRecipe();

    //Tinkers
    public static Materials Alumite                 = new Materials( 400, TextureSet.SET_METALLIC          ,   5.0F,    768,  2, 1|2          |64|128      , 255, 105, 180,   0,   "Alumite"                 ,   "Alumite"                       ,    0,       0,         -1,    0, false, false,   1,   1,   1, Dyes.dyePink        , 2, Arrays.asList(new MaterialStack(Aluminium, 5), new MaterialStack(Steel, 2), new MaterialStack(Obsidian, 2)), Collections.singletonList(new TC_AspectStack(TC_Aspects.STRONTIO, 2)));
    public static Materials Manyullyn               = new Materials( 386, TextureSet.SET_SHINY             ,  25.0F,   2048,  5, 1|2  |8      |64|128      , 154,  76, 185,   0,   "Manyullyn"               ,   "Manyullyn"                     ,    0,       0,       3600, 3600,  true, false,   1,   1,   1, Dyes.dyePurple      , 2, Arrays.asList(new MaterialStack(Cobalt, 1), new MaterialStack(Ardite, 1)), Collections.singletonList(new TC_AspectStack(TC_Aspects.STRONTIO, 2))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials Steeleaf                = new Materials( 339, TextureSet.SET_LEAF              ,   8.0F,    768,  3, 1|2          |64|128      ,  50, 127,  50,   0,   "Steeleaf"                ,   "Steeleaf"                      ,    5,      24,         -1,    0, false, false,   4,   1,   1, Dyes.dyeGreen       , 2, Arrays.asList(new MaterialStack(Steel, 1), new MaterialStack(Magic, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.HERBA, 2), new TC_AspectStack(TC_Aspects.METALLUM, 2), new TC_AspectStack(TC_Aspects.PRAECANTATIO, 1)));
    public static Materials Knightmetal             = new Materials( 362, TextureSet.SET_METALLIC          ,   8.0F,   1024,  3, 1|2          |64|128      , 210, 240, 200,   0,   "Knightmetal"             ,   "Knightmetal"                   ,    5,      24,         -1,    0, false, false,   4,   1,   1, Dyes.dyeLime        , 2, Arrays.asList(new MaterialStack(Steel, 2), new MaterialStack(Magic, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.LUCRUM, 1), new TC_AspectStack(TC_Aspects.METALLUM, 2)));

    //Thaumcraft
    public static Materials Thaumium                = new Materials( 330, TextureSet.SET_METALLIC          ,  12.0F,    256,  3, 1|2          |64|128      , 150, 100, 200,   0,   "Thaumium"                ,   "Thaumium"                      ,    0,       0,         -1,    0, false, false,   5,   2,   1, Dyes.dyePurple      , 0, Arrays.asList(new MaterialStack(Iron, 1), new MaterialStack(Magic, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.METALLUM, 2), new TC_AspectStack(TC_Aspects.PRAECANTATIO, 1)));
    public static Materials Vinteum                 = new Materials( 529, TextureSet.SET_METALLIC          ,  10.0F,    128,  3, 1|2|4|8      |64|128      , 100, 200, 255,   0,   "Vinteum"                 ,   "Vinteum"                       ,    5,      32,         -1,    0, false, false,   4,   1,   1, Dyes.dyeLightBlue   , 2, Collections.singletonList(new MaterialStack(Thaumium, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.VITREUS, 2), new TC_AspectStack(TC_Aspects.PRAECANTATIO, 1)));
    public static Materials Shadow                  = new Materials( 368, TextureSet.SET_METALLIC          ,  32.0F,   8192,  4, 1|2  |8      |64|128      ,  16,   3,  66,   0,   "Shadow"                  ,   "Shadow Metal"                  ,    0,       0,       1800, 1800,  true, false,   3,   4,   3, Dyes.dyeBlue        );


   //High Pressure, Enderium, Mysterious Crystal, Awakened Draconium, Infinity, SpaceTime, Transcendent Metal, Hypogen, Lumium, Signalum
 */

    public static final Material Skystone = new Material.Builder(GTOvervolt.id("skystone"))
            .color(0x303031)
            .secondaryColor(0x3a4447)
            .iconSet(METALLIC)
            .dust()
            .flags(GENERATE_LENS)
            .element(new Element(14, 16, -1, null, "Sky Stone", "Sk", false))
            .buildAndRegister();

    public static final Material Fluix = new Material.Builder(GTOvervolt.id("fluix"))
            .color(0x9A63C5)
            .secondaryColor(0x604FAA)
            .iconSet(METALLIC)
            .gem()
            .flags(NO_WORKING)
            .components(GTMaterials.Redstone, 1, CertusQuartz, 2)
            .buildAndRegister();

    public static final Material CopperAlloy = new Material.Builder(GTOvervolt.id("copper_alloy"))
            .color(0xB97D06).secondaryColor(0x7B5504)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Copper, 1, GTMaterials.Silicon, 1)
            .buildAndRegister();

    public static final Material EnergeticAlloy = new Material.Builder(GTOvervolt.id("energetic_alloy"))
            .color(0xE9A300).secondaryColor(0xEFBE4E)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[MV], 4, 0)
            .flags(GENERATE_FOIL)
            .components(GTMaterials.Redstone, 1, GTMaterials.Gold, 1, GTMaterials.Glowstone, 1)
            .buildAndRegister();

    public static final Material VibrantAlloy = new Material.Builder(GTOvervolt.id("vibrant_alloy"))
            .color(0xE9FF76).secondaryColor(0x9AA644)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[EV], 4, 0)
            .blastTemp(2200, BlastProperty.GasTier.LOW, GTValues.VA[HV], 2000)
            .components(EnergeticAlloy, 1, GTMaterials.EnderPearl, 1)
            .buildAndRegister();

    public static final Material RedstoneAlloy = new Material.Builder(GTOvervolt.id("redstone_alloy"))
            .color(0xF95D5D).secondaryColor(0x631919)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Redstone, 1, GTMaterials.Silicon, 1)
            .buildAndRegister();

    public static final Material ConductiveAlloy = new Material.Builder(GTOvervolt.id("conductive_alloy"))
            .color(0xC79390).secondaryColor(0xA98579)
            .iconSet(SHINY)
            .ingot()
            .components(CopperAlloy, 1, GTMaterials.Iron, 1, GTMaterials.Redstone, 1)
            .buildAndRegister();

    public static final Material PulsatingAlloy = new Material.Builder(GTOvervolt.id("pulsating_alloy"))
            .color(0x9CEFAE).secondaryColor(0x407F4F)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Iron, 1, GTMaterials.EnderPearl, 1)
            .buildAndRegister();

    public static final Material DarKSteel = new Material.Builder(GTOvervolt.id("dark_steel"))
            .color(0x777676).secondaryColor(0x2A2B2A)
            .iconSet(SHINY)
            .ingot()
            .blastTemp(3600, BlastProperty.GasTier.MID, GTValues.VA[EV], 3600)
            .components(GTMaterials.Iron, 1, GTMaterials.Obsidian, 1, GTMaterials.Coal, 1)
            .buildAndRegister();

    public static final Material Soularium = new Material.Builder(GTOvervolt.id("soularium"))
            .color(0x624D22).secondaryColor(0x39260F)
            .iconSet(SHINY)
            .ingot()
            .components(GTMaterials.Gold, 1, GTMaterials.Netherrack, 1)
            .buildAndRegister();

    public static final Material EndSteel = new Material.Builder(GTOvervolt.id("end_steel"))
            .color(0xC0B868).secondaryColor(0x9C9758)
            .iconSet(SHINY)
            .ingot()
            .blastTemp(4500, BlastProperty.GasTier.MID, GTValues.VA[EV], 5000)
            .components(GTMaterials.Endstone, 1, GTMaterials.Obsidian, 1, DarKSteel, 1)
            .buildAndRegister();

    public static final Material StellarAlloy = new Material.Builder(GTOvervolt.id("stellar_alloy"))
            .color(0xBAD4FF)
            .iconSet(SHINY)
            .ingot()
            .cableProperties(GTValues.V[ZPM], 4, 0)
            .blastTemp(4500, BlastProperty.GasTier.MID, GTValues.VA[EV], 5000)
            .components(GTMaterials.Endstone, 1, GTMaterials.Obsidian, 1, DarKSteel, 1)
            .buildAndRegister();

/*
    //Twlight Forest
    public static Materials LiveRoot                = new Materials( 832, TextureSet.SET_WOOD              ,   1.0F,      0,  1, 1                         , 220, 200,   0,   0,   "LiveRoot"                ,   "Liveroot"                      ,    5,      16,         -1,    0, false, false,   2,   4,   3, Dyes.dyeBrown       , 2, Arrays.asList(new MaterialStack(Wood, 3), new MaterialStack(Magic, 1)), Arrays.asList(new TC_AspectStack(TC_Aspects.ARBOR, 2), new TC_AspectStack(TC_Aspects.VICTUS, 2), new TC_AspectStack(TC_Aspects.PRAECANTATIO, 1)));
    public static Materials IronWood                = new Materials( 338, TextureSet.SET_WOOD              ,   6.0F,    384,  2, 1|2          |64|128      , 150, 140, 110,   0,   "IronWood"                ,   "Ironwood"                      ,    5,       8,         -1,    0, false, false,   2,  19,  18, Dyes.dyeBrown       , 2, Arrays.asList(new MaterialStack(Iron, 9), new MaterialStack(LiveRoot, 9), new MaterialStack(Gold, 1)));

    //Steves Carts
    public static Materials Galgadorian             = new Materials( 384, TextureSet.SET_METALLIC          ,  16.0F,   3600,  3, 1|2          |64|128      , 154, 105, 119,   0,   "Galgadorian"             ,   "Galgadorian"                   ,    0,       0,       3000, 3000,  true, false,   1,   1,   1, Dyes.dyePink        ).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials EnhancedGalgadorian     = new Materials( 385, TextureSet.SET_METALLIC          ,  32.0F,   7200,  5, 1|2|          64|128      , 152, 93, 133,    0,   "EnhancedGalgadorian"     ,   "Enhanced Galgadorian"          ,    0,       0,       4500, 4500,  true, false,   1,   1,   1, Dyes.dyePink        ).disableAutoGeneratedBlastFurnaceRecipes();

    //Bloodmagic
    public static Materials BloodInfusedIron        = new Materials( 977, TextureSet.SET_METALLIC          ,  10.0F,    384,  2, 1|2          |64|128      ,  69,   9,  10,   0,   "BloodInfusedIron"        ,   "Blood Infused Iron"            ,    0,       0,       2400,    0, false, false,   3,   1,   1, Dyes.dyeRed         , Arrays.asList(new TC_AspectStack(TC_Aspects.METALLUM, 3),  new TC_AspectStack(TC_Aspects.PRAECANTATIO, 1)));

     */
}
