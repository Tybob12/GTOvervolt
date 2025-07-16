package com.tybob14.gtovervolt.common.data;


import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.block.ActiveBlock;
import com.gregtechceu.gtceu.api.block.ICoilType;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.models.GTModels;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.api.GTOVAPI;
import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import com.tybob14.gtovervolt.api.block.ISteamMachineCasingType;
import com.tybob14.gtovervolt.common.block.PipeCasing;
import com.tybob14.gtovervolt.common.block.SteamMachineCasing;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.client.model.generators.ModelFile;

import java.util.Map;
import java.util.function.Supplier;

import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

public class GTOVBlocks {


    public static final BlockEntry<SteamMachineCasing> CASING_BRONZE = createSteamMachineCasing(SteamMachineCasing.CasingType.BRONZE);
    public static final BlockEntry<SteamMachineCasing> CASING_STEEL = createSteamMachineCasing(SteamMachineCasing.CasingType.STEEL);


    public static final BlockEntry<PipeCasing> BRONZE_PIPE_CASING = createMachinePipeCasing(PipeCasing.PipeCasingType.BRONZE);
    public static final BlockEntry<PipeCasing> STEEL_PIPE_CASING = createMachinePipeCasing(PipeCasing.PipeCasingType.STEEL);
    public static final BlockEntry<PipeCasing> TITANIUM_PIPE_CASING = createMachinePipeCasing(PipeCasing.PipeCasingType.TITANIUM);
    public static final BlockEntry<PipeCasing> TUNGSTENSTEEL_PIPE_CASING = createMachinePipeCasing(PipeCasing.PipeCasingType.TUNGSTENSTEEL);


    public static void init(){

    }



    static {
        REGISTRATE.creativeModeTab(() -> GTOvervoltCreativeModeTabs.GTOVERVOLT);
    }

    public static NonNullBiConsumer<DataGenContext<Block, SteamMachineCasing>, RegistrateBlockstateProvider> createSteamCasingModel(String name) {
        return (ctx, prov) -> {
            prov.simpleBlock(ctx.getEntry(), prov.models().cubeBottomTop(name,
                    GTOvervolt.id("block/casings/steam/%s/side".formatted(name)),
                    GTOvervolt.id("block/casings/steam/%s/bottom".formatted(name)),
                    GTOvervolt.id("block/casings/steam/%s/top".formatted(name))));
        };
    }

    private static BlockEntry<SteamMachineCasing> createSteamMachineCasing(ISteamMachineCasingType casingType) {
        var steamCasing = REGISTRATE
                .block("%s_casing".formatted(casingType.getName()), p -> new SteamMachineCasing(p, casingType))
                .initialProperties(() -> Blocks.IRON_BLOCK)
                .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
                .item(BlockItem::new)
                .build()
                .register();
        GTOVAPI.STEAM_CASING.put(casingType, steamCasing);
        return steamCasing;
    }


    private static BlockEntry<PipeCasing> createMachinePipeCasing(IPipeCasingType casingType) {
        var pipeCasing = REGISTRATE
                .block("%s_pipe_casing".formatted(casingType.getName()), p -> new PipeCasing(p, casingType))
                .initialProperties(() -> Blocks.IRON_BLOCK)
                .properties(p -> p.isValidSpawn((state, level, pos, ent) -> false))
                .item(BlockItem::new)
                .build()
                .register();
        GTOVAPI.PIPE_CASING.put(casingType, pipeCasing);
        return pipeCasing;
    }

    public static final BlockEntry<Block> ANUBIS_DUST = REGISTRATE
            .block("anubis_dust", Block::new)
            .lang("Anubis Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/anubis/anubisdust")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ANUBIS_GRAVEL = REGISTRATE
            .block("anubis_gravel", Block::new)
            .lang("Anubis Gravel")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/anubis/anubisgravel")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> ANUBIS_OBSIDIAN = REGISTRATE
            .block("anubis_obsidian", Block::new)
            .lang("Anubis Obsidian")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/anubis/anubisobsidian")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> ASTEROID_ROCK = REGISTRATE
            .block("asteroi_drock", Block::new)
            .lang("Asteroid Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/asteroid/asteroidrock")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> BARNARDC_CORE = REGISTRATE
            .block("barnardc_core", Block::new)
            .lang("BarnardC Core Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/barnardc/barnardccore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> BARNARDC_GRASS = REGISTRATE
            .block("barnardc_grass", Block::new)
            .lang("BarnardC Grass")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/barnardc/barnardcgrass")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> BARNARDC_STONE = REGISTRATE
            .block("barnardc_stone", Block::new)
            .lang("Barnardc Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/barnardc/barnardcstone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> BARNARDE_REGOLITH = REGISTRATE
            .block("barnarde_regolith", Block::new)
            .lang("Barnarde Regolith")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/barnarde/barnarderegolith")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> BARNARDE_STONE = REGISTRATE
            .block("barnarde_stone", Block::new)
            .lang("Barnarde Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/barnarde/barnardestone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> BARNARDF_REGOLITH = REGISTRATE
            .block("barnardf_regolith", Block::new)
            .lang("Barnardf Regolith")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/barnardf/barnardfregolith")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> BARNARDF_STONE = REGISTRATE
            .block("barnardf_stone", Block::new)
            .lang("Barnardf Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/barnardf/barnardfstone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CALLISTO_ICE = REGISTRATE
            .block("callisto_ice", Block::new)
            .lang("Callisto Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/callisto/callistoice")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CALLISTO_ICE_ROCK = REGISTRATE
            .block("callisto_ice_rock", Block::new)
            .lang("Callisto Ice Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/callisto/callistoicerock")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CALLISTO_ROCK = REGISTRATE
            .block("callisto_rock", Block::new)
            .lang("Callisto Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/callisto/callistorock")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CENTAURI_CORE = REGISTRATE
            .block("centauri_core", Block::new)
            .lang("Centauri Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/centauri/centauricore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CENTAURI_STONE = REGISTRATE
            .block("centauri_stone", Block::new)
            .lang("Centauri Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/centauri/centauristone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CENTAURI_VOLCANIC_ROCK = REGISTRATE
            .block("centauri_volcanic_rock", Block::new)
            .lang("Centauri Volcanic Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/centauri/centaurivolcanicrock")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CERES_CORE = REGISTRATE
            .block("ceres_core", Block::new)
            .lang("Ceres Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ceres/cerescore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CERES_ICE = REGISTRATE
            .block("ceres_ice", Block::new)
            .lang("Ceres Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ceres/ceresice")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CERES_STONE = REGISTRATE
            .block("ceres_stone", Block::new)
            .lang("Ceres Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ceres/ceresstone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> TCETIE_CORE = REGISTRATE
            .block("tcetie_core", Block::new)
            .lang("TCetiE Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/tcetie/tcetiecore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> TCETIE_DRIT = REGISTRATE
            .block("tcetie_drit", Block::new)
            .lang("TCetiE Drit")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/tcetie/tcetiedirt")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> TCETIE_STONE = REGISTRATE
            .block("tcetie_stone", Block::new)
            .lang("TCetiE Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/tcetie/tcetiestone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> DEIMOS_CORE = REGISTRATE
            .block("deimos_core", Block::new)
            .lang("Deimos Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/deimos/deimoscore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> DEIMOS_DUST = REGISTRATE
            .block("deimos_dust", Block::new)
            .lang("Deimos Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/deimos/deimosdust")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> DEIMOS_STONE = REGISTRATE
            .block("deimos_stone", Block::new)
            .lang("Deimos Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/deimos/deimosstone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> ENCELADUS_ICE = REGISTRATE
            .block("enceladus_ice", Block::new)
            .lang("Enceladus Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/enceladus/enceladusice")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> ENCELADUS_SNOW = REGISTRATE
            .block("enceladus_snow", Block::new)
            .lang("Enceladus Snow")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/enceladus/enceladussnow")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> ENCELADUS_STONE = REGISTRATE
            .block("enceladus_stone", Block::new)
            .lang("Enceladus Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/enceladus/enceladusstone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> EUROPA_CORE = REGISTRATE
            .block("europa_core", Block::new)
            .lang("Europa Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/europa/europacore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> EUROPA_ICE = REGISTRATE
            .block("europa_ice", Block::new)
            .lang("Europa Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/europa/europaice")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> EUROPA_ROCK = REGISTRATE
            .block("europa_rock", Block::new)
            .lang("Europa Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/europa/europarock")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> GANYMEDE_CORE = REGISTRATE
            .block("ganymede_core", Block::new)
            .lang("Ganymede Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ganymede/ganymedecore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> GANYMEDE_FROSTED = REGISTRATE
            .block("ganymede_frosted", Block::new)
            .lang("Ganymede Frosted")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ganymede/ganymedefrosted")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> GANYMEDE_STONE = REGISTRATE
            .block("ganymede_stone", Block::new)
            .lang("Ganymede Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ganymede/ganymedestone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> HAUMEA_CORE = REGISTRATE
            .block("haumea_core", Block::new)
            .lang("Haumea Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/haumea/haumeacore")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> HAUMEA_REGOLITH = REGISTRATE
            .block("haumea_regolith", Block::new)
            .lang("Haumea Regolith")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/haumea/haumearegolith")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> HAUMEA_STONE = REGISTRATE
            .block("haumea_stone", Block::new)
            .lang("Haumea Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/haumea/haumeastone")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HORUS_SAND = REGISTRATE
            .block("horus_sand", Block::new)
            .lang("Horus Sand")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/horus/horussand")))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

public static final BlockEntry<Block> HORUS_SANDSTONE = REGISTRATE
        .block("horus_sandstone", Block::new)
        .lang("Horus Sandstone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/horus/horussandstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> HORUS_STONE = REGISTRATE
        .block("horus_stone", Block::new)
        .lang("Horus Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/horus/horusstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> IO_ASH = REGISTRATE
        .block("io_ash", Block::new)
        .lang("Io Ash")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/io/ioash")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> IO_CORE = REGISTRATE
        .block("io_core", Block::new)
        .lang("Io Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/io/iocore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> IO_VOLCANIC_ROCK = REGISTRATE
        .block("io_volcanic_rock", Block::new)
        .lang("Io_volcanic_rock")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/io/iovolcanicrock")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> KUIPER_ICE_DUST = REGISTRATE
        .block("kuiper_ice_dust", Block::new)
        .lang("Kuiper Ice Dust")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/kuiperbelt/kuipericedust")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> KUIPER_ROCK = REGISTRATE
        .block("kuiper_rock", Block::new)
        .lang("Kuiper Rock")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/kuiperbelt/kuiperock")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MAAHES_CORE = REGISTRATE
        .block("maahes_core", Block::new)
        .lang("Maahes Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/maahes/maahescore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MAAHES_GLASS = REGISTRATE
        .block("maahes_glass", Block::new)
        .lang("Maahes Glass")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/maahes/maahesglass")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MAAHES_STONE = REGISTRATE
        .block("maahes_stone", Block::new)
        .lang("Maahes Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/maahes/maahesstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MAKEMAKE_CLAY = REGISTRATE
        .block("makemake_clay", Block::new)
        .lang("MakeMake Clay")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/makemake/makeclay")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MAKEMAKE_CORE = REGISTRATE
        .block("makemake_core", Block::new)
        .lang("MakeMake Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/makemake/makecore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MAKEMAKESTONE = REGISTRATE
        .block("makemake_stone", Block::new)
        .lang("MakeMake Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/makemake/makestone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MARS_CORE = REGISTRATE
        .block("mars_core", Block::new)
        .lang("Mars Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mars/marscore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MARS_DUST = REGISTRATE
        .block("mars_dust", Block::new)
        .lang("Mars Dust")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mars/marsdust")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MARS_STONE = REGISTRATE
        .block("mars_stone", Block::new)
        .lang("Mars Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mars/marsstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MEHEN_GRAVEL = REGISTRATE
        .block("mehen_gravel", Block::new)
        .lang("Mehen Gravel")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mehenbelt/mehengravel")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MEHEN_STONE = REGISTRATE
        .block("mehen_stone", Block::new)
        .lang("Mehen Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mehenbelt/mehenstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MERCURY_CORE = REGISTRATE
        .block("mercury_core", Block::new)
        .lang("Mercury Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mercury/mercurycore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MERCURY_DUST = REGISTRATE
        .block("mercury_dust", Block::new)
        .lang("Mercury Dust")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mercury/mercurydust")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MERCURY_STONE = REGISTRATE
        .block("mercury_stone", Block::new)
        .lang("Mercury Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/mercury/mercurystone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MIRANDA_CORE_ICE = REGISTRATE
        .block("miranda_core_ice", Block::new)
        .lang("Miranda Core Ice")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/miranda/mirandacoreice")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MIRANDA_DUST = REGISTRATE
        .block("miranda_dust", Block::new)
        .lang("Miranda Dust")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/miranda/mirandadust")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MIRANDA_SNOW = REGISTRATE
        .block("miranda_snow", Block::new)
        .lang("Miranda Snow")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/miranda/mirandasnow")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MOON_REGOLITH = REGISTRATE
        .block("moon_regolith", Block::new)
        .lang("Moon regolith")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/moon/moon_regolith")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MOON_SILICATE = REGISTRATE
        .block("moon_silicate", Block::new)
        .lang("Moon silicate")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/moon/moon_silicate")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> MOON_STONE = REGISTRATE
        .block("moon_stone", Block::new)
        .lang("Moon stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/moon/moon_stone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> NEPER_CORE = REGISTRATE
        .block("neper_core", Block::new)
        .lang("Neper Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/neper/nepercore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> NEPER_GRASS = REGISTRATE
        .block("neper_grass", Block::new)
        .lang("Neper Grass")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/neper/nepergrass")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> NEPER_ROCK = REGISTRATE
        .block("neper_rock", Block::new)
        .lang("Neper Rock")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/neper/neperrock")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> OBERON_CORE = REGISTRATE
        .block("oberon_core", Block::new)
        .lang("Oberon Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/oberon/oberoncore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> OBERON_REGOLITH = REGISTRATE
        .block("oberon_regolith", Block::new)
        .lang("Oberon Regolith")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/oberon/oberonregolith")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> OBERON_STONE = REGISTRATE
        .block("oberon_stone", Block::new)
        .lang("Oberon Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/oberon/oberonstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PHOBOS_CORE = REGISTRATE
        .block("phobos_core", Block::new)
        .lang("Phobos Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/phobos/phoboscore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PHOBOS_REGOLITH = REGISTRATE
        .block("phobos_regolith", Block::new)
        .lang("Phobos Regolith")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/phobos/phobosregolith")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PHOBOS_STONE = REGISTRATE
        .block("phobos_stone", Block::new)
        .lang("Phobos Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/phobos/phobosstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PLUTO_CORE = REGISTRATE
        .block("pluto_core", Block::new)
        .lang("Pluto Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/pluto/plutocore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PLUTO_FROST = REGISTRATE
        .block("pluto_frost", Block::new)
        .lang("Pluto Frost")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/pluto/plutofrost")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PLUTO_ICE = REGISTRATE
        .block("pluto_ice", Block::new)
        .lang("Pluto Ice")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/pluto/plutoice")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PROTEUS_ROCK = REGISTRATE
        .block("proteus_rock", Block::new)
        .lang("Proteus Rock")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/proteus/proteusrock")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PROTEUS_SNOW = REGISTRATE
        .block("proteus_snow", Block::new)
        .lang("Proteus Snow")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/proteus/proteussnow")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> PROTEUS_STONE = REGISTRATE
        .block("proteus_stone", Block::new)
        .lang("Proteus Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/proteus/proteusstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> ROSS128_CORE = REGISTRATE
        .block("ross128_core", Block::new)
        .lang("Ross128 Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ross128/rosscore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> ROSS128_REGOLITH = REGISTRATE
        .block("ross128_regolith", Block::new)
        .lang("Ross128 Regolith")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ross128/rossregolith")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> ROSS128_STONE = REGISTRATE
        .block("ross128_stone", Block::new)
        .lang("Ross128 Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ross128/rossstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> ROSS128B_CORE = REGISTRATE
        .block("ross128b_core", Block::new)
        .lang("Ross128B Core")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ross128b/rossbcore")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> ROSS128B_REGOLITH = REGISTRATE
        .block("ross128b_bregolith", Block::new)
        .lang("Ross128B Regolith")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ross128b/rossbregolith")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> ROSS128B_STONE = REGISTRATE
        .block("ross128b_stone", Block::new)
        .lang("Ross128B Stone")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/ross128b/rossbstone")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> SETH_ICE = REGISTRATE
        .block("seth_ice", Block::new)
        .lang("Seth Ice")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/seth/sethice")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> SETH_OBSIDIAN = REGISTRATE
        .block("seth_obsidian", Block::new)
        .lang("Seth Obsidian")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/seth/sethobsidian")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> SETH_SNOW = REGISTRATE
        .block("seth_snow", Block::new)
        .lang("Seth Snow")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/seth/sethsnow")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> TITAN_CLAY = REGISTRATE
        .block("titan_clay", Block::new)
        .lang("Titan Clay")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/titan/titanclay")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> TITAN_DUST = REGISTRATE
        .block("titan_dust", Block::new)
        .lang("Titan Dust")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/titan/titandust")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> TITAN_ICE = REGISTRATE
        .block("titan_ice", Block::new)
        .lang("Titan Ice")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/titan/titanice")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> TRITON_ICE = REGISTRATE
        .block("triton_ice", Block::new)
        .lang("Triton Ice")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/triton/tritonice")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> TRITON_ROCK = REGISTRATE
        .block("triton_rock", Block::new)
        .lang("Triton Rock")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/triton/tritonrock")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> TRITON_SAND = REGISTRATE
        .block("triton_sand", Block::new)
        .lang("Triton Sand")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/triton/tritonsand")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> VEGAB_COMPACTED_SOIL = REGISTRATE
        .block("vegab_compacted_soil", Block::new)
        .lang("VegaB Compacted Soil")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/vegab/vega_compactedsoil")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> VEGAB_CRUST = REGISTRATE
        .block("vegab_crust", Block::new)
        .lang("VegaB Crust")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/vegab/vega_crust")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> VEGAB_ROCK = REGISTRATE
        .block("vegab_rock", Block::new)
        .lang("VegaB Rock")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/vegab/vega_rock")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> VENUS_ASH = REGISTRATE
        .block("venus_ash", Block::new)
        .lang("Venus Ash")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/venus/venus_ash")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> VENUS_METAL = REGISTRATE
        .block("venus_metal", Block::new)
        .lang("Venus Metal")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/venus/venus_metal")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();
public static final BlockEntry<Block> VENUS_ROCK = REGISTRATE
        .block("venus_rock", Block::new)
        .lang("Venus Rock")
        .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
        .blockstate(GTModels.randomRotatedModel(GTOvervolt.id("block/planet_blocks/venus/venus_rock")))
        .tag(BlockTags.MINEABLE_WITH_PICKAXE)
        .simpleItem()
        .register();

    static {
        REGISTRATE.creativeModeTab(() -> GTOvervoltCreativeModeTabs.GTOVERVOLT);
    }


    /*
    public static final BlockEntry<Block> ANUBIS_DUST = REGISTRATE
            .block("anubis_dust", Block::new)
            .lang("Anubis Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ANUBIS_GRAVEL = REGISTRATE
            .block("anubis_gravel", Block::new)
            .lang("Anubis Gravel")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ANUBIS_CORE_OBSIDIAN = REGISTRATE
            .block("anubis_core_obsidian", Block::new)
            .lang("Anubis Core Obsidian")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ASTEROID_DUST = REGISTRATE
            .block("asteroid_dust", Block::new)
            .lang("Asteroid Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ASTEROID_STONE = REGISTRATE
            .block("asteroid_stone", Block::new)
            .lang("Asteroid Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ASTEROID_CORE_IRON = REGISTRATE
            .block("asteroid_core_iron", Block::new)
            .lang("Asteroid Core Iron")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDC_CRUST = REGISTRATE
            .block("barnardc_crust", Block::new)
            .lang("barnardc Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDC_ROCK = REGISTRATE
            .block("barnardc_rock", Block::new)
            .lang("barnardc Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDC_CORE_METAL = REGISTRATE
            .block("barnardc_core_metal", Block::new)
            .lang("barnardc Core Metal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDE_DIRT = REGISTRATE
            .block("barnarde_dirt", Block::new)
            .lang("Barnarde Dirt")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDE_COMPACTED_DUST = REGISTRATE
            .block("barnarde_compacted_dust", Block::new)
            .lang("Barnarde Compacted Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDE_CORE_SANDSTONE = REGISTRATE
            .block("barnarde_core_sandstone", Block::new)
            .lang("Barnarde Core Sandstone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDF_SOIL = REGISTRATE
            .block("barnardf_soil", Block::new)
            .lang("Barnardf Soil")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDF_CLAY = REGISTRATE
            .block("barnardf_clay", Block::new)
            .lang("Barnardf Clay")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDF_CORE_STONE = REGISTRATE
            .block("barnardf_core_stone", Block::new)
            .lang("Barnardf Core Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CALLISTO_SNOW = REGISTRATE
            .block("callisto_snow", Block::new)
            .lang("Callisto Snow")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CALLISTO_ICE_ROCK = REGISTRATE
            .block("callisto_ice_rock", Block::new)
            .lang("Callisto Ice Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CALLISTO_CORE_ROCK = REGISTRATE
            .block("callisto_core_rock", Block::new)
            .lang("Callisto Core Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CERES_CLAY = REGISTRATE
            .block("ceres_clay", Block::new)
            .lang("Ceres Clay")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CERES_COMPACTED_DUST = REGISTRATE
            .block("ceres_compacted_dust", Block::new)
            .lang("Ceres Compacted Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CERES_CORE_ICE = REGISTRATE
            .block("ceres_core_ice", Block::new)
            .lang("Ceres Core Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DARK_SURFACE = REGISTRATE
            .block("dark_surface", Block::new)
            .lang("Dark Surface")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DARK_COMPACTED_SHALE = REGISTRATE
            .block("dark_compacted_shale", Block::new)
            .lang("Dark Compacted Shale")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DARK_CORE_VOID = REGISTRATE
            .block("dark_core_void", Block::new)
            .lang("Dark Core Void")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEIMOS_DUST = REGISTRATE
            .block("deimos_dust", Block::new)
            .lang("Deimos Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEIMOS_STONE = REGISTRATE
            .block("deimos_stone", Block::new)
            .lang("Deimos Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEIMOS_CORE_SILICA = REGISTRATE
            .block("deimos_core_silica", Block::new)
            .lang("Deimos Core Silica")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ENCELADUS_ICE = REGISTRATE
            .block("enceladus_ice", Block::new)
            .lang("Enceladus Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ENCELADUS_CRUST = REGISTRATE
            .block("enceladus_crust", Block::new)
            .lang("Enceladus Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ENCELADUS_CORE_OCEAN = REGISTRATE
            .block("enceladus_core_ocean", Block::new)
            .lang("Enceladus Core Ocean")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> EUROPA_ICE = REGISTRATE
            .block("europa_ice", Block::new)
            .lang("Europa Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> EUROPA_ROCK = REGISTRATE
            .block("europa_rock", Block::new)
            .lang("Europa Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> EUROPA_CORE_OCEANIC = REGISTRATE
            .block("europa_core_oceanic", Block::new)
            .lang("Europa Core Oceanic")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> GANYMEDE_FROST = REGISTRATE
            .block("ganymede_frost", Block::new)
            .lang("Ganymede Frost")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> GANYMEDE_CRUST = REGISTRATE
            .block("ganymede_crust", Block::new)
            .lang("Ganymede Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> GANYMEDE_CORE_METAL = REGISTRATE
            .block("ganymede_core_metal", Block::new)
            .lang("Ganymede Core Metal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HAUMEA_CRYSTAL = REGISTRATE
            .block("haumea_crystal", Block::new)
            .lang("Haumea Crystal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HAUMEA_ICE = REGISTRATE
            .block("haumea_ice", Block::new)
            .lang("Haumea Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HAUMEA_CORE_ROCK = REGISTRATE
            .block("haumea_core_rock", Block::new)
            .lang("Haumea Core Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HORUS_GLASS = REGISTRATE
            .block("horus_glass", Block::new)
            .lang("Horus Glass")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HORUS_SANDSTONE = REGISTRATE
            .block("horus_sandstone", Block::new)
            .lang("Horus Sandstone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> HORUS_CORE_LAPIS = REGISTRATE
            .block("horus_core_lapis", Block::new)
            .lang("Horus Core Lapis")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> IO_ASH = REGISTRATE
            .block("io_ash", Block::new)
            .lang("Io Ash")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> IO_VOLCANIC_ROCK = REGISTRATE
            .block("io_volcanic_rock", Block::new)
            .lang("Io Volcanic Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> IO_CORE_MAGMA = REGISTRATE
            .block("io_core_magma", Block::new)
            .lang("Io Core Magma")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> KUIPER_ICE_DUST = REGISTRATE
            .block("kuiper_ice_dust", Block::new)
            .lang("Kuiper Ice Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> KUIPER_FROZEN_ROCK = REGISTRATE
            .block("kuiper_frozen_rock", Block::new)
            .lang("Kuiper Frozen Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> KUIPER_CORE_METAL = REGISTRATE
            .block("kuiper_core_metal", Block::new)
            .lang("Kuiper Core Metal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MAAHES_SAND = REGISTRATE
            .block("maahes_sand", Block::new)
            .lang("Maahes Sand")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MAAHES_ROCK = REGISTRATE
            .block("maahes_rock", Block::new)
            .lang("Maahes Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MAAHES_CORE_CRYSTAL = REGISTRATE
            .block("maahes_core_crystal", Block::new)
            .lang("Maahes Core Crystal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MAKEMAKE_SNOW = REGISTRATE
            .block("makemake_snow", Block::new)
            .lang("Makemake Snow")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MAKEMAKE_CLAY = REGISTRATE
            .block("makemake_clay", Block::new)
            .lang("Makemake Clay")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MAKEMAKE_CORE_ROCK = REGISTRATE
            .block("makemake_core_rock", Block::new)
            .lang("Makemake Core Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MARS_DUST = REGISTRATE
            .block("mars_dust", Block::new)
            .lang("Mars Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MARS_COMPACTED_SOIL = REGISTRATE
            .block("mars_compacted_soil", Block::new)
            .lang("Mars Compacted Soil")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MARS_CORE_IRON = REGISTRATE
            .block("mars_core_iron", Block::new)
            .lang("Mars Core Iron")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MANE_GRAVEL = REGISTRATE
            .block("mane_gravel", Block::new)
            .lang("Mane Gravel")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MANE_DUST = REGISTRATE
            .block("mane_dust", Block::new)
            .lang("Mane Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MANE_CORE_SILICA = REGISTRATE
            .block("mane_core_silica", Block::new)
            .lang("Mane Core Silica")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MERCURY_DUST = REGISTRATE
            .block("mercury_dust", Block::new)
            .lang("Mercury Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MERCURY_STONE = REGISTRATE
            .block("mercury_stone", Block::new)
            .lang("Mercury Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MERCURY_CORE_IRON = REGISTRATE
            .block("mercury_core_iron", Block::new)
            .lang("Mercury Core Iron")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MIRANDA_SNOW = REGISTRATE
            .block("miranda_snow", Block::new)
            .lang("Miranda Snow")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MIRANDA_DUST = REGISTRATE
            .block("miranda_dust", Block::new)
            .lang("Miranda Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MIRANDA_CORE_ICE = REGISTRATE
            .block("miranda_core_ice", Block::new)
            .lang("Miranda Core Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MOON_REGOLITH = REGISTRATE
            .block("moon_regolith", Block::new)
            .lang("Moon Regolith")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MOON_BASALT = REGISTRATE
            .block("moon_basalt", Block::new)
            .lang("Moon Basalt")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> MOON_CORE_NICKEL = REGISTRATE
            .block("moon_core_nickel", Block::new)
            .lang("Moon Core Nickel")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> NEPER_DUST = REGISTRATE
            .block("neper_dust", Block::new)
            .lang("Neper Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> NEPER_ROCK = REGISTRATE
            .block("neper_rock", Block::new)
            .lang("Neper Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> NEPER_CORE_CRYSTAL = REGISTRATE
            .block("neper_core_crystal", Block::new)
            .lang("Neper Core Crystal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> OBERON_CRUST = REGISTRATE
            .block("oberon_crust", Block::new)
            .lang("Oberon Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> OBERON_DUST = REGISTRATE
            .block("oberon_dust", Block::new)
            .lang("Oberon Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> OBERON_CORE_ROCK = REGISTRATE
            .block("oberon_core_rock", Block::new)
            .lang("Oberon Core Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PHOBOS_DUST = REGISTRATE
            .block("phobos_dust", Block::new)
            .lang("Phobos Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PHOBOS_ROCK = REGISTRATE
            .block("phobos_rock", Block::new)
            .lang("Phobos Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PHOBOS_CORE_METAL = REGISTRATE
            .block("phobos_core_metal", Block::new)
            .lang("Phobos Core Metal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLUTO_FROST = REGISTRATE
            .block("pluto_frost", Block::new)
            .lang("Pluto Frost")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLUTO_STONE = REGISTRATE
            .block("pluto_stone", Block::new)
            .lang("Pluto Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLUTO_CORE_ICE = REGISTRATE
            .block("pluto_core_ice", Block::new)
            .lang("Pluto Core Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PROTEUS_SNOW = REGISTRATE
            .block("proteus_snow", Block::new)
            .lang("Proteus Snow")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PROTEUS_STONE = REGISTRATE
            .block("proteus_stone", Block::new)
            .lang("Proteus Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PROTEUS_CORE_ROCK = REGISTRATE
            .block("proteus_core_rock", Block::new)
            .lang("Proteus Core Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ROSS_SURFACE = REGISTRATE
            .block("ross_surface", Block::new)
            .lang("Ross Surface")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ROSS_DUST = REGISTRATE
            .block("ross_dust", Block::new)
            .lang("Ross Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ROSS_CORE_IRON = REGISTRATE
            .block("ross_core_iron", Block::new)
            .lang("Ross Core Iron")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ROSSB_SURFACE = REGISTRATE
            .block("rossb_surface", Block::new)
            .lang("Rossb Surface")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ROSSB_CRUST = REGISTRATE
            .block("rossb_crust", Block::new)
            .lang("Rossb Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ROSSB_CORE_STONE = REGISTRATE
            .block("rossb_core_stone", Block::new)
            .lang("Rossb Core Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SETH_ASH = REGISTRATE
            .block("seth_ash", Block::new)
            .lang("Seth Ash")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SETH_OBSIDIAN = REGISTRATE
            .block("seth_obsidian", Block::new)
            .lang("Seth Obsidian")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> SETH_CORE_SHADOW = REGISTRATE
            .block("seth_core_shadow", Block::new)
            .lang("Seth Core Shadow")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CETI_SURFACE = REGISTRATE
            .block("ceti_surface", Block::new)
            .lang("Ceti Surface")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CETI_SUB_CRUST = REGISTRATE
            .block("ceti_sub_crust", Block::new)
            .lang("Ceti Sub Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CETI_CORE_METAL = REGISTRATE
            .block("ceti_core_metal", Block::new)
            .lang("Ceti Core Metal")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TITAN_DUST = REGISTRATE
            .block("titan_dust", Block::new)
            .lang("Titan Dust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TITAN_CLAY = REGISTRATE
            .block("titan_clay", Block::new)
            .lang("Titan Clay")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TITAN_CORE_ICE = REGISTRATE
            .block("titan_core_ice", Block::new)
            .lang("Titan Core Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TRITON_FROZEN_SAND = REGISTRATE
            .block("triton_frozen_sand", Block::new)
            .lang("Triton Frozen Sand")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TRITON_HARD_ICE = REGISTRATE
            .block("triton_hard_ice", Block::new)
            .lang("Triton Hard Ice")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TRITON_CORE_ROCK = REGISTRATE
            .block("triton_core_rock", Block::new)
            .lang("Triton Core Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> VEGA_CRUST = REGISTRATE
            .block("vega_crust", Block::new)
            .lang("Vega Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> VEGA_COMPACTED_SOIL = REGISTRATE
            .block("vega_compacted_soil", Block::new)
            .lang("Vega Compacted Soil")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> VEGA_CORE_LAVA = REGISTRATE
            .block("vega_core_lava", Block::new)
            .lang("Vega Core Lava")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> VENUS_ASH = REGISTRATE
            .block("venus_ash", Block::new)
            .lang("Venus Ash")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> VENUS_ROCK = REGISTRATE
            .block("venus_rock", Block::new)
            .lang("Venus Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> VENUS_METAL_CORE = REGISTRATE
            .block("venus_metal_core", Block::new)
            .lang("Venus Metal Core")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

     */

}
