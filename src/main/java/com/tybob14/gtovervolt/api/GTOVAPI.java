package com.tybob14.gtovervolt.api;

import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import com.tybob14.gtovervolt.api.block.ISteamMachineCasingType;
import com.tybob14.gtovervolt.common.block.PipeCasing;
import com.tybob14.gtovervolt.common.block.SteamMachineCasing;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class GTOVAPI {


    public static final Map<ISteamMachineCasingType, Supplier<SteamMachineCasing>> STEAM_CASING = new HashMap<>();

    public static final Map<IPipeCasingType, Supplier<PipeCasing>> PIPE_CASING = new HashMap<>();
}
