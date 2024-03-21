package com.tybob14.gtovervolt.common.data.materials;

public class IntegratedMaterials {

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


    //EnderIO
    public static Materials RedstoneAlloy           = new Materials( 381, TextureSet.SET_METALLIC          ,   3.0F,    128,  2, 1|2          |64|128      , 181,  51,  51,   0,   "RedstoneAlloy"           ,   "Redstone Alloy"                ,    0,       0,        671, 1000,  true, false,   1,   1,   1, Dyes.dyeRed         , 1, Arrays.asList(new MaterialStack(Redstone, 1), new MaterialStack(Silicon, 1), new MaterialStack(Coal, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials Soularium               = new Materials( 379, TextureSet.SET_METALLIC          ,   8.0F,    256,  2, 1|2          |64|128      ,  65,  46,  29,   0,   "Soularium"               ,   "Soularium"                     ,    0,       0,        800, 1000,  true, false,   3,   1,   1, Dyes.dyeBrown       , 1, Arrays.asList(new MaterialStack(SoulSand, 1), new MaterialStack(Gold, 1), new MaterialStack(Ash, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials ConductiveIron          = new Materials( 369, TextureSet.SET_METALLIC          ,   6.0F,    256,  3, 1|2          |64|128      , 217, 178, 171,   0,   "ConductiveIron"          ,   "Conductive Iron"               ,    0,       0,         -1, 1200,  true, false,   4,   1,   1, Dyes.dyeRed         , 1, Arrays.asList(new MaterialStack(RedstoneAlloy, 1), new MaterialStack(Iron, 1), new MaterialStack(Silver, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials ElectricalSteel         = new Materials( 365, TextureSet.SET_METALLIC          ,   6.0F,    512,  2, 1|2          |64|128      , 185, 185, 185,   0,   "ElectricalSteel"         ,   "Electrical Steel"              ,    0,       0,       1811, 1000,  true, false,   4,   1,   1, Dyes.dyeGray        , 1, Arrays.asList(new MaterialStack(Steel, 1), new MaterialStack(Coal, 1), new MaterialStack(Silicon, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials EnergeticAlloy          = new Materials( 366, TextureSet.SET_METALLIC          ,  12.0F,   1024,  3, 1|2          |64|128      , 255, 170,  81,   0,   "EnergeticAlloy"          ,   "Energetic Alloy"               ,    0,       0,         -1, 2200,  true, false,   3,   1,   1, Dyes.dyeOrange      , 1, Arrays.asList(new MaterialStack(ConductiveIron, 1), new MaterialStack(Gold, 1), new MaterialStack(BlackSteel, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials VibrantAlloy            = new Materials( 367, TextureSet.SET_METALLIC          ,  18.0F,   4048,  4, 1|2          |64|128      , 157, 188,  53,   0,   "VibrantAlloy"            ,   "Vibrant Alloy"                 ,    0,       0,       3300, 3300,  true, false,   4,   1,   1, Dyes.dyeLime        , 1, Arrays.asList(new MaterialStack(EnergeticAlloy, 1), new MaterialStack(EnderEye, 1), new MaterialStack(Chrome, 1))).disableAutoGeneratedBlastFurnaceRecipes().disableAutoGeneratedVacuumFreezerRecipe();
    public static Materials PulsatingIron           = new Materials( 378, TextureSet.SET_METALLIC          ,   6.0F,    256,  3, 1|2          |64|128      , 128, 246, 155,   0,   "PulsatingIron"           ,   "Pulsating Iron"                ,    0,       0,         -1, 1800,  true, false,   4,   1,   1, Dyes.dyeLime        , 1, Arrays.asList(new MaterialStack(Iron, 1), new MaterialStack(EnderPearl, 1), new MaterialStack(RedstoneAlloy, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials DarkSteel               = new Materials( 364, TextureSet.SET_METALLIC          ,   8.0F,    512,  3, 1|2          |64|128      ,  80,  70,  80,   0,   "DarkSteel"               ,   "Dark Steel"                    ,    0,       0,         -1, 1800,  true, false,   3,   1,   1, Dyes.dyePurple      , 1, Arrays.asList(new MaterialStack(ElectricalSteel, 1), new MaterialStack(Coal, 1), new MaterialStack(Obsidian, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials EndSteel                = new Materials( 401, TextureSet.SET_METALLIC          ,  12.0F,   2000,  4, 1|2          |64|128      , 223, 217, 165,   0,   "EndSteel"                ,   "End Steel"                     ,    0,       0,        940, 3600,  true, false,   3,   1,   1, Dyes.dyeYellow      , 1, Arrays.asList(new MaterialStack(DarkSteel, 1), new MaterialStack(Tungsten, 1), new MaterialStack(Endstone, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials CrystallineAlloy        = new Materials( 403, TextureSet.SET_METALLIC          ,  18.0F,    768,  4, 1|2          |64|128      , 114, 197, 197,   0,   "CrystallineAlloy"        ,   "Crystalline Alloy"             ,    0,       0,       4500, 4500,  true, false,   4,   1,   1, Dyes.dyeCyan        , 1, Arrays.asList(new MaterialStack(Gold, 1), new MaterialStack(Diamond, 1), new MaterialStack(PulsatingIron, 1))).disableAutoGeneratedBlastFurnaceRecipes().disableAutoGeneratedVacuumFreezerRecipe();
    public static Materials MelodicAlloy            = new Materials( 404, TextureSet.SET_METALLIC          ,  24.0F,   1024,  5, 1|2          |64|128      , 136,  98, 136,   0,   "MelodicAlloy"            ,   "Melodic Alloy"                 ,    0,       0,       5400, 5400,  true, false,   4,   1,   1, Dyes.dyeMagenta     , 1, Arrays.asList(new MaterialStack(EndSteel, 1), new MaterialStack(EnderEye, 1), new MaterialStack(Oriharukon, 1))).disableAutoGeneratedBlastFurnaceRecipes().disableAutoGeneratedVacuumFreezerRecipe();
    public static Materials StellarAlloy            = new Materials( 405, TextureSet.SET_METALLIC          ,  96.0F,  10240,  7, 1|2          |64|128      , 217, 220, 203,   0,   "StellarAlloy"            ,   "Stellar Alloy"                 ,    0,       0,       7200, 7200,  true, false,   4,   1,   1, Dyes.dyeWhite       , 1, Arrays.asList(new MaterialStack(NetherStar, 1), new MaterialStack(MelodicAlloy, 1), new MaterialStack(Naquadah, 1))).disableAutoGeneratedBlastFurnaceRecipes().disableAutoGeneratedVacuumFreezerRecipe();
    public static Materials CrystallinePinkSlime    = new Materials( 406, TextureSet.SET_METALLIC          ,   6.0F,    128,  3, 1|2          |64|128      , 231, 158, 219,   0,   "CrystallinePinkSlime"    ,   "Crystalline Pink Slime"        ,    0,       0,       5000, 5000,  true, false,   4,   1,   1, Dyes.dyePink        , 1, Arrays.asList(new MaterialStack(CrystallineAlloy, 1), new MaterialStack(Diamond, 1))).disableAutoGeneratedBlastFurnaceRecipes().disableAutoGeneratedVacuumFreezerRecipe();
    public static Materials EnergeticSilver         = new Materials( 407, TextureSet.SET_METALLIC          ,   8.0F,    512,  3, 1|2          |64|128      , 149, 183, 205,   0,   "EnergeticSilver"         ,   "Energetic Silver"              ,    0,       0,         -1, 2200,  true, false,   4,   1,   1, Dyes.dyeLightBlue   , 1, Arrays.asList(new MaterialStack(Silver, 1), new MaterialStack(ConductiveIron, 1), new MaterialStack(BlackSteel, 1))).disableAutoGeneratedBlastFurnaceRecipes();
    public static Materials VividAlloy              = new Materials( 408, TextureSet.SET_METALLIC          ,  12.0F,    768,  4, 1|2          |64|128      ,  70, 188, 219,   0,   "VividAlloy"              ,   "Vivid Alloy"                   ,    0,       0,       3300, 3300,  true, false,   4,   1,   1, Dyes.dyeBlue        , 1, Arrays.asList(new MaterialStack(EnergeticSilver, 1), new MaterialStack(EnderEye, 1), new MaterialStack(Chrome, 1))).disableAutoGeneratedBlastFurnaceRecipes().disableAutoGeneratedVacuumFreezerRecipe();

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