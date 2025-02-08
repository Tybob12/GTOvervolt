package com.tybob14.gtovervolt.data.lang;

import com.tterrag.registrate.providers.RegistrateLangProvider;

public class MachineLang {

    protected static void init(RegistrateLangProvider provider) {
        provider.add("gtovervolt.circuit_assembly_line", "Circuit Assembly Line");
        provider.add("gtovervolt.pcb_factory", "PCB Factory");

        provider.add("gtovervolt.multiblock.speed_bonus", "Speed Bonus: %s");
        provider.add("gtovervolt.machine.coil_speed_bonus", "Every coil tier above cupronickel gives a +10% speed bonus");
        provider.add("gtovervolt.machine.pipe_speed_bonus", "Every pipe casing tier gives a +10% speed bonus");
        provider.add("gtovervolt.machine.eu_reduction_90", "Only uses 90% of the EU/t normally required");
        provider.add("gtovervolt.machine.eu_reduction_80", "Only uses 80% of the EU/t normally required");
    }
}
