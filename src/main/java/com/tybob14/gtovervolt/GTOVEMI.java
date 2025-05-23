package com.tybob14.gtovervolt;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.lowdragmc.lowdraglib.Platform;
import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.stack.EmiStack;

@EmiEntrypoint
public class GTOVEMI implements EmiPlugin {
    @Override
    public void register(EmiRegistry registry) {

        registry.removeEmiStacks(EmiStack.of(GTBlocks.CASING_BRONZE_PIPE));

        if (Platform.isModLoaded("ae2")) {
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CHARGER));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CHIPPED_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CRANK));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.CREATIVE_ENERGY_CELL));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.DAMAGED_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.FLAWED_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.FLAWLESS_BUDDING_QUARTZ));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.GROWTH_ACCELERATOR));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.INSCRIBER));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.LARGE_QUARTZ_BUD));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.MEDIUM_QUARTZ_BUD));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.MYSTERIOUS_CUBE));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.NOT_SO_MYSTERIOUS_CUBE));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_BLOCK));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_CLUSTER));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_SLAB));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_STAIRS));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.QUARTZ_WALL));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SKY_STONE_CHEST));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SKY_STONE_TANK));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SMALL_QUARTZ_BUD));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.SMOOTH_SKY_STONE_CHEST));
            registry.removeEmiStacks(EmiStack.of(AEBlocks.VIBRATION_CHAMBER));
            registry.removeEmiStacks(EmiStack.of(AEItems.CALCULATION_PROCESSOR_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_AXE));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_HOE));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_KNIFE));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_PICK));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_SHOVEL));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_SWORD));
            registry.removeEmiStacks(EmiStack.of(AEItems.CERTUS_QUARTZ_WRENCH));
            registry.removeEmiStacks(EmiStack.of(AEItems.CHARGED_STAFF));
            registry.removeEmiStacks(EmiStack.of(AEItems.ENDER_DUST));
            registry.removeEmiStacks(EmiStack.of(AEItems.ENGINEERING_PROCESSOR_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.ENTROPY_MANIPULATOR));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUID_CELL_CREATIVE));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_AXE));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_HOE));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_PICK));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_SHOVEL));
            registry.removeEmiStacks(EmiStack.of(AEItems.FLUIX_SWORD));
            registry.removeEmiStacks(EmiStack.of(AEItems.ITEM_CELL_CREATIVE));
            registry.removeEmiStacks(EmiStack.of(AEItems.LOGIC_PROCESSOR_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.METEORITE_COMPASS));
            registry.removeEmiStacks(EmiStack.of(AEItems.NAME_PRESS));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_AXE));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_HOE));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_KNIFE));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_PICK));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_SHOVEL));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_SWORD));
            registry.removeEmiStacks(EmiStack.of(AEItems.NETHER_QUARTZ_WRENCH));
            registry.removeEmiStacks(EmiStack.of(AEItems.SILICON));
            registry.removeEmiStacks(EmiStack.of(AEItems.SILICON_PRESS));

            if (Platform.isDevEnv()) {
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_CARD));
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_ERASER));
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_METEORITE_PLACER));
                registry.removeEmiStacks(EmiStack.of(AEItems.DEBUG_REPLICATOR_CARD));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_ITEM_GEN));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_CHUNK_LOADER));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_CUBE_GEN));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_ENERGY_GEN));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DEBUG_PHANTOM_NODE));
                registry.removeEmiStacks(EmiStack.of(AEBlocks.DENSE_ENERGY_CELL));
            }

        }


    }
}
