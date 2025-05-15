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
}
