package com.tybob14.gtovervolt.common.data;


import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

public class GTOVBlocks {


    public static final BlockEntry<Block> CENTAURI_STONE = REGISTRATE
            .block("centauribb_stone", Block::new)
            .lang("CentauriBb Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();
    public static final BlockEntry<Block> CENTAURI_CORE_STONE = REGISTRATE
            .block("centauribb_core_stone", Block::new)
            .lang("CentauriBb Core Stone")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    static {
        REGISTRATE.creativeModeTab(() -> GTOvervoltCreativeModeTabs.GTOVERVOLT);
    }

    public static void init() {

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

    public static final BlockEntry<Block> BARNARDEC_CRUST = REGISTRATE
            .block("barnardec_crust", Block::new)
            .lang("Barnardec Crust")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDEC_ROCK = REGISTRATE
            .block("barnardec_rock", Block::new)
            .lang("Barnardec Rock")
            .properties(properties -> properties.mapColor(MapColor.COLOR_GRAY))
            .blockstate(GTOVModels::randomRotatedModel)
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> BARNARDEC_CORE_METAL = REGISTRATE
            .block("barnardec_core_metal", Block::new)
            .lang("Barnardec Core Metal")
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
