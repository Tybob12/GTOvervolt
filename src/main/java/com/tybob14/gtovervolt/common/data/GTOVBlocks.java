package com.tybob14.gtovervolt.common.data;


import com.gregtechceu.gtceu.common.data.GTBlocks;

import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

public class GTOVBlocks extends GTBlocks {

    static {
        REGISTRATE.creativeModeTab(() -> GTOvervoltCreativeModeTabs.GTOVERVOLT);
    }


}
