package com.tybob14.gtovervolt.data;

import com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries;
import com.tybob14.gtovervolt.data.lang.LangHandler;
import com.tterrag.registrate.providers.ProviderType;

public class GTOvervoltDatagen {
    public static void init() {
        GTOvervoltRegistries.REGISTRATE.addDataGenerator(ProviderType.LANG, LangHandler::init);

    }
}
