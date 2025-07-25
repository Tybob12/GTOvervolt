package com.tybob14.gtovervolt.api.pattern;

import com.gregtechceu.gtceu.api.pattern.TraceabilityPredicate;
import com.gregtechceu.gtceu.api.pattern.error.PatternStringError;
import com.lowdragmc.lowdraglib.utils.BlockInfo;
import com.tybob14.gtovervolt.api.GTOVAPI;
import com.tybob14.gtovervolt.api.block.IPipeCasingType;
import com.tybob14.gtovervolt.api.block.ISteamMachineCasingType;
import com.tybob14.gtovervolt.common.block.PipeCasing;
import com.tybob14.gtovervolt.common.block.SteamMachineCasing;
import net.minecraft.network.chat.Component;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Supplier;

public class GTOVPredicates {

    public static TraceabilityPredicate steamMachineCasings() {
        return new TraceabilityPredicate(blockWorldState -> {
            var blockState = blockWorldState.getBlockState();
            for (Map.Entry<ISteamMachineCasingType, Supplier<SteamMachineCasing>> entry : GTOVAPI.STEAM_CASING.entrySet()) {
                if (blockState.is(entry.getValue().get())) {
                    var stats = entry.getKey();
                    Object currentCoil = blockWorldState.getMatchContext().getOrPut("SteamCasingType", stats);
                    if (!currentCoil.equals(stats)) {
                        blockWorldState.setError(new PatternStringError("gtceu.multiblock.pattern.error.steammachinecasing"));
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }, () -> GTOVAPI.STEAM_CASING.entrySet().stream()
                // sort to make autogenerated jei previews not pick random coils each game load
                .sorted(Comparator.comparingInt(value -> value.getKey().getTier()))
                .map(casing -> BlockInfo.fromBlockState(casing.getValue().get().defaultBlockState()))
                .toArray(BlockInfo[]::new))
                .addTooltips(Component.translatable("gtceu.multiblock.pattern.error.steammachinecasing"));
    }

    public static TraceabilityPredicate machinePipeCasings() {
        return new TraceabilityPredicate(blockWorldState -> {
            var blockState = blockWorldState.getBlockState();
            for (Map.Entry<IPipeCasingType, Supplier<PipeCasing>> entry : GTOVAPI.PIPE_CASING.entrySet()) {
                if (blockState.is(entry.getValue().get())) {
                    var stats = entry.getKey();
                    Object currentCoil = blockWorldState.getMatchContext().getOrPut("PipeCasingType", stats);
                    if (!currentCoil.equals(stats)) {
                        blockWorldState.setError(new PatternStringError("gtceu.multiblock.pattern.error.pipecasing"));
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }, () -> GTOVAPI.PIPE_CASING.entrySet().stream()
                // sort to make autogenerated jei previews not pick random coils each game load
                .sorted(Comparator.comparingInt(value -> value.getKey().getTier()))
                .map(casing -> BlockInfo.fromBlockState(casing.getValue().get().defaultBlockState()))
                .toArray(BlockInfo[]::new))
                .addTooltips(Component.translatable("gtceu.multiblock.pattern.error.pipecasing"));
    }
}
