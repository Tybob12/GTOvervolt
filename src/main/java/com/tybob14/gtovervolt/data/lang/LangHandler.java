package com.tybob14.gtovervolt.data.lang;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {

    public static void init(RegistrateLangProvider provider) {
        for (Material material : GTOvervolt.MATERIAL_REGISTRY.getAllMaterials()) {
            provider.add(material.getName(), toEnglishName(material.getName()));
        }

        String[] Veins = {"kaolinite_vein", "cryolite_vein", "black_plutonium_vein", "vermiculite_vein", "dolomite_vein", "infinity_catalyst_vein", "osmium_vein", "desh_vein", "uranium_238_vein", "scheelite_vein", "plutonium_239_vein", "sulfur_vein", "quartzite_vein", "nether_star_vein", "diamond_vein", "lapis_vein", "molybdenum_vein", "oilsands_vein", "coal_vein", "manganese_vein", "certus_quartz_vein", "pitchblende_vein", "quartz_vein", "redstone_vein", "sapphire_vein", "pyrolusite_vein", "naquadria_vein", "mica_vein", "infused_gold_vein", "monazite_vein", "rare_earth_vein", "nickel_vein", "ilmenite_vein", "palladium_vein", "thorium_vein", "arsenic_vein", "copper_vein", "vanadium_vein", "bauxite_vein", "soapstone_vein", "neutronium_vein", "gold_vein", "samarium_vein", "chrome_vein", "magnesite_vein", "tungsten_vein", "platinum_vein", "tetrahedrite_vein", "galena_vein", "naquadah_vein", "niobium_vein", "apatite_vein", "rutile_vein", "mineral_sand_vein", "magnetite_vein", "tin_vein", "iron_vein", "beryllium_vein", "electrotine_vein", "lignite_coal_vein", "salts_vein", "cassiterite_vein", "nether_quartz_vein"};
        for (int i = 0; i <= Veins.length - 1; i++) {
            provider.add("gtceu.jei.ore_vein." + Veins[i], toEnglishName(Veins[i]));
        }
        MachineLang.init(provider);
    }


}
