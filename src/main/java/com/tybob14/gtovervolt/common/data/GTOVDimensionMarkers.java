package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.api.data.DimensionMarker;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.function.Supplier;


@SuppressWarnings("unused")
public class GTOVDimensionMarkers {

    public static final BlockEntry<Block> ANUBIS_MARKER = createMarker("anubis");
    public static final DimensionMarker ANUBIS = createAndRegister(GTOvervolt.id("anubis"), 9, () -> ANUBIS_MARKER, null);
    public static final BlockEntry<Block> ASTEROID_BELT_MARKER = createMarker("asteroid_belt");
    public static final DimensionMarker ASTEROID_BELT = createAndRegister(GTOvervolt.id("asteroid_belt"), 3, () -> ASTEROID_BELT_MARKER, null);
    public static final BlockEntry<Block> BARNARDC_MARKER = createMarker("barnardc");
    public static final DimensionMarker BARNARDC = createAndRegister(GTOvervolt.id("barnardc"), 8, () -> BARNARDC_MARKER, null);
    public static final BlockEntry<Block> BARNARDE_MARKER = createMarker("barnarde");
    public static final DimensionMarker BARNARDE = createAndRegister(GTOvervolt.id("barnarde"), 8, () -> BARNARDE_MARKER, null);
    public static final BlockEntry<Block> BARNARDF_MARKER = createMarker("barnardf");
    public static final DimensionMarker BARNARDF = createAndRegister(GTOvervolt.id("barnardf"), 8, () -> BARNARDF_MARKER, null);
    public static final BlockEntry<Block> CALLISTO_MARKER = createMarker("callisto");
    public static final DimensionMarker CALLISTO = createAndRegister(GTOvervolt.id("callisto"), 3, () -> CALLISTO_MARKER, null);
    public static final BlockEntry<Block> CERES_MARKER = createMarker("ceres");
    public static final DimensionMarker CERES = createAndRegister(GTOvervolt.id("ceres"), 3, () -> CERES_MARKER, null);
    public static final BlockEntry<Block> DEEP_DARK_MARKER = createMarker("deep_dark");
    public static final DimensionMarker DEEP_DARK = createAndRegister(GTOvervolt.id("deep_dark"), 10, () -> DEEP_DARK_MARKER, null);
    public static final BlockEntry<Block> DEIMOS_MARKER = createMarker("deimos");
    public static final DimensionMarker DEIMOS = createAndRegister(GTOvervolt.id("deimos"), 2, () -> DEIMOS_MARKER, null);
    public static final BlockEntry<Block> ENCELADUS_MARKER = createMarker("enceladus");
    public static final DimensionMarker ENCELADUS = createAndRegister(GTOvervolt.id("enceladus"), 5, () -> ENCELADUS_MARKER, null);
    public static final BlockEntry<Block> EUROPA_MARKER = createMarker("europa");
    public static final DimensionMarker EUROPA = createAndRegister(GTOvervolt.id("europa"), 3, () -> EUROPA_MARKER, null);
    public static final BlockEntry<Block> GANYMEDE_MARKER = createMarker("ganymede");
    public static final DimensionMarker GANYMEDE = createAndRegister(GTOvervolt.id("ganymede"), 3, () -> GANYMEDE_MARKER, null);
    public static final BlockEntry<Block> HAUMEA_MARKER = createMarker("haumea");
    public static final DimensionMarker HAUMEA = createAndRegister(GTOvervolt.id("haumea"), 7, () -> HAUMEA_MARKER, null);
    public static final BlockEntry<Block> HORUS_MARKER = createMarker("horus");
    public static final DimensionMarker HORUS = createAndRegister(GTOvervolt.id("horus"), 9, () -> HORUS_MARKER, null);
    public static final BlockEntry<Block> IO_MARKER = createMarker("io");
    public static final DimensionMarker IO = createAndRegister(GTOvervolt.id("io"), 4, () -> IO_MARKER, null);
    public static final BlockEntry<Block> KUIPER_BELT_MARKER = createMarker("kuiper_belt");
    public static final DimensionMarker KUIPER_BELT = createAndRegister(GTOvervolt.id("kuiper_belt"), 7, () -> KUIPER_BELT_MARKER, null);
    public static final BlockEntry<Block> MAAHES_MARKER = createMarker("maahes");
    public static final DimensionMarker MAAHES = createAndRegister(GTOvervolt.id("maahes"), 9, () -> MAAHES_MARKER, null);
    public static final BlockEntry<Block> MAKEMAKE_MARKER = createMarker("makemake");
    public static final DimensionMarker MAKEMAKE = createAndRegister(GTOvervolt.id("makemake"), 7, () -> MAKEMAKE_MARKER, null);
    public static final BlockEntry<Block> MARS_MARKER = createMarker("mars");
    public static final DimensionMarker MARS = createAndRegister(GTOvervolt.id("mars"), 2, () -> MARS_MARKER, null);
    public static final BlockEntry<Block> MEHEN_BELT_MARKER = createMarker("mehen_belt");
    public static final DimensionMarker MEHEN_BELT = createAndRegister(GTOvervolt.id("mehen_belt"), 9, () -> MEHEN_BELT_MARKER, null);
    public static final BlockEntry<Block> MERCURY_MARKER = createMarker("mercury");
    public static final DimensionMarker MERCURY = createAndRegister(GTOvervolt.id("mercury"), 4, () -> MERCURY_MARKER, null);
    public static final BlockEntry<Block> MIRANDA_MARKER = createMarker("miranda");
    public static final DimensionMarker MIRANDA = createAndRegister(GTOvervolt.id("miranda"), 5, () -> MIRANDA_MARKER, null);
    public static final BlockEntry<Block> MOON_MARKER = createMarker("moon");
    public static final DimensionMarker MOON = createAndRegister(GTOvervolt.id("moon"), 1, () -> MOON_MARKER, null);
    public static final BlockEntry<Block> NEPER_MARKER = createMarker("neper");
    public static final DimensionMarker NEPER = createAndRegister(GTOvervolt.id("neper"), 9, () -> NEPER_MARKER, null);
    public static final BlockEntry<Block> OBERON_MARKER = createMarker("oberon");
    public static final DimensionMarker OBERON = createAndRegister(GTOvervolt.id("oberon"), 5, () -> OBERON_MARKER, null);
    public static final BlockEntry<Block> PHOBOS_MARKER = createMarker("phobos");
    public static final DimensionMarker PHOBOS = createAndRegister(GTOvervolt.id("phobos"), 2, () -> PHOBOS_MARKER, null);
    public static final BlockEntry<Block> PLUTO_MARKER = createMarker("pluto");
    public static final DimensionMarker PLUTO = createAndRegister(GTOvervolt.id("pluto"), 7, () -> PLUTO_MARKER, null);
    public static final BlockEntry<Block> PROTEUS_MARKER = createMarker("proteus");
    public static final DimensionMarker PROTEUS = createAndRegister(GTOvervolt.id("proteus"), 6, () -> PROTEUS_MARKER, null);
    public static final BlockEntry<Block> ROSS128B_MARKER = createMarker("ross128b");
    public static final DimensionMarker ROSS128B = createAndRegister(GTOvervolt.id("ross128b"), 3, () -> ROSS128B_MARKER, null);
    public static final BlockEntry<Block> ROSS128BA_MARKER = createMarker("ross128ba");
    public static final DimensionMarker ROSS128BA = createAndRegister(GTOvervolt.id("ross128ba"), 5, () -> ROSS128BA_MARKER, null);
    public static final BlockEntry<Block> SETH_MARKER = createMarker("seth");
    public static final DimensionMarker SETH = createAndRegister(GTOvervolt.id("seth"), 9, () -> SETH_MARKER, null);
    public static final BlockEntry<Block> T_CETI_E_MARKER = createMarker("t_ceti_e");
    public static final DimensionMarker T_CETI_E = createAndRegister(GTOvervolt.id("t_ceti_e"), 8, () -> T_CETI_E_MARKER, null);
    public static final BlockEntry<Block> TITAN_MARKER = createMarker("titan");
    public static final DimensionMarker TITAN = createAndRegister(GTOvervolt.id("titan"), 5, () -> TITAN_MARKER, null);
    public static final BlockEntry<Block> TRITON_MARKER = createMarker("triton");
    public static final DimensionMarker TRITON = createAndRegister(GTOvervolt.id("triton"), 6, () -> TRITON_MARKER, null);
    public static final BlockEntry<Block> VEGA_B_MARKER = createMarker("vega_b");
    public static final DimensionMarker VEGA_B = createAndRegister(GTOvervolt.id("vega_b"), 8, () -> VEGA_B_MARKER, null);
    public static final BlockEntry<Block> VENUS_MARKER = createMarker("venus");
    public static final DimensionMarker VENUS = createAndRegister(GTOvervolt.id("venus"), 4, () -> VENUS_MARKER, null);
    public static final BlockEntry<Block> A_CENTAURI_BB_MARKER = createMarker("a_centauri_bb");
    public static final DimensionMarker A_CENTAURI_BB = createAndRegister(GTOvervolt.id("a_centauri_bb"), 8, () -> A_CENTAURI_BB_MARKER, null);

    static {
        GTOvervoltRegistries.REGISTRATE.creativeModeTab(() -> null);
    }

    public static DimensionMarker createAndRegister(ResourceLocation dim, int tier, Supplier<ItemLike> supplier,
                                                    @Nullable String overrideName) {
        DimensionMarker marker = new DimensionMarker(tier, supplier, overrideName);
        marker.register(dim);
        return marker;
    }

    private static BlockEntry<Block> createMarker(String name) {

        return GTOvervoltRegistries.REGISTRATE.block("%s_marker".formatted(name), Block::new)
                .lang(FormattingUtil.toEnglishName(name))
                .blockstate((ctx, prov) -> prov.simpleBlock(ctx.get(), prov.models().cube(ctx.getName(),
                                prov.modLoc("block/dim_markers/%s/down".formatted(name)),
                                prov.modLoc("block/dim_markers/%s/up".formatted(name)),
                                prov.modLoc("block/dim_markers/%s/north".formatted(name)),
                                prov.modLoc("block/dim_markers/%s/south".formatted(name)),
                                prov.modLoc("block/dim_markers/%s/east".formatted(name)),
                                prov.modLoc("block/dim_markers/%s/west".formatted(name)))
                        .texture("particle", "#north")
                        .guiLight(BlockModel.GuiLight.FRONT)))
                .simpleItem()
                .register();
    }

    public static void init() {
    }


}
