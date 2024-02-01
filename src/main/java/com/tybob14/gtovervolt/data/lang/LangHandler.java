package com.tybob14.gtovervolt.data.lang;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.registry.MaterialRegistry;
import com.tterrag.registrate.providers.RegistrateLangProvider;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.utils.FormattingUtil.toEnglishName;

public class LangHandler extends com.gregtechceu.gtceu.data.lang.LangHandler {

    public static void init(RegistrateLangProvider provider) {
        generate(provider, GTOvervolt.MATERIAL_REGISTRY);

    }
    public static void generate(RegistrateLangProvider provider, MaterialRegistry registry) {
        for (Material material : registry.getAllMaterials()) {
            provider.add(material.getName(), toEnglishName(material.getName()));
        }
    }

}
