package com.tybob14.gtovervolt.data;

import com.tterrag.registrate.providers.ProviderType;
import com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries;
import com.tybob14.gtovervolt.data.lang.LangHandler;
import com.tybob14.gtovervolt.data.tags.OVBlockTagLoader;
import com.tybob14.gtovervolt.data.tags.OVItemTagLoader;

public class GTOvervoltDatagen {
    public static void init() {
        GTOvervoltRegistries.REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, OVBlockTagLoader::init);
        GTOvervoltRegistries.REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, OVItemTagLoader::init);
        GTOvervoltRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);

    }

    //Dimension List

    /*
        a_centuari_bb, anubis, asteroid_belt, barnardc, barnarde, barnardf, callisto, ceres, deep_dark, deimos, enceladus, europa, ganymede, haumea, horus, io, kuiper_belt, maahes, makemake, mars, mehem_belt, mercury, miranda, moon, neper, oberon, phobos, pluto, proteus, ross128b, ross128ba, seth, t_ceti_e, titan, triton, vega_b, venus


     */
}
