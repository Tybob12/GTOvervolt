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

        String[] Veins = {"uranium_238_vein", "scheelite_vein", "plutonium_239_vein", "sulfur_vein", "diamond_vein", "lapis_vein", "molybdenum_vein", "oilsands_vein", "coal_vein", "manganese_vein", "certus_quartz", "pitchblende_vein", "redstone_vein", "sapphire_vein", "mica_vein", "monazite_vein", "nickel_vein", "copper_vein", "bauxite_vein", "soapstone_vein", "gold_vein", "iron_vein", "beryllium_vein", "electrotine_vein", "platinum_vein", "tetrahedrite_vein", "galena_vein", "naquadah_vein", "apatite_vein", "mineral_sand_vein", "magnetite_vein", "salts_vein", "cassiterite_vein", "nether_quartz_vein"};
        for (int i = 0; i <= Veins.length - 1; i++) {
            provider.add("gtceu.jei.ore_vein." + Veins[i], toEnglishName(Veins[i]));
        }
        MachineLang.init(provider);
    }


}
