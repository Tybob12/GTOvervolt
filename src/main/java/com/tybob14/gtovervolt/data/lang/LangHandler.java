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
    }
}
