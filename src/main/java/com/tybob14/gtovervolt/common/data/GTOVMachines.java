package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeModifiers;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.tybob14.gtovervolt.common.machine.multiblock.electric.CircuitAssemblyLineMachine;
import com.tybob14.gtovervolt.common.machine.multiblock.electric.PCBFactoryMachine;

import static com.gregtechceu.gtceu.api.pattern.Predicates.blocks;
import static com.gregtechceu.gtceu.api.pattern.Predicates.controller;
import static com.gregtechceu.gtceu.api.pattern.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.ITEM_IMPORT_BUS;
import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

public class GTOVMachines {

    public static final MultiblockMachineDefinition CIRCUIT_ASSEMBLY_LINE = REGISTRATE
            .multiblock("circuit_assembly_line", CircuitAssemblyLineMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .langValue("Circuit Assembly Line")
            .recipeTypes(GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES, GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES)
            .alwaysTryModifyRecipe(true)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT, GTRecipeModifiers.SUBTICK_PARALLEL,
                    GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.PERFECT_OVERCLOCK))
            .appearanceBlock(CASING_STEEL_SOLID)
            .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("FIF", "RAR", "SEG")
                    .aisle("FIF", "RAR", "GEG").setRepeatable(3, 5)
                    .aisle("FOF", "RAR", "GEG")
                    .where('S', controller(blocks(definition.getBlock())))
                    .where('F', blocks(CASING_STEEL_SOLID.get())
                            .or(!ConfigHolder.INSTANCE.machines.orderedAssemblyLineFluids ?
                                    Predicates.abilities(PartAbility.IMPORT_FLUIDS) :
                                    Predicates.abilities(PartAbility.IMPORT_FLUIDS_1X).setMaxGlobalLimited(1))
                            .or(Predicates.abilities(PartAbility.MAINTENANCE).setMaxGlobalLimited(1)))
                    .where('O', Predicates.abilities(PartAbility.EXPORT_ITEMS))
                    .where('I', blocks(ITEM_IMPORT_BUS[0].getBlock()))
                    .where('G', blocks(CASING_GRATE.get()))
                    .where('E', blocks(CASING_GRATE.get()).or(Predicates.abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(1)))
                    .where('A', blocks(CASING_ASSEMBLY_LINE.get()))
                    .where('R', blocks(CASING_LAMINATED_GLASS.get()))
                    .build())
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .register();
    public static final MultiblockMachineDefinition PCB_FACTORY = REGISTRATE
            .multiblock("pcb_factory", PCBFactoryMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .langValue("PCB Factory")
            .recipeTypes(GTOVRecipeTypes.PCB_FACTORY_RECIPES)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT)
            .appearanceBlock(CASING_STEEL_SOLID)
            .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("FCCSCCF", "FGGGGGF", "FGGGGGF", "FGGGGGF", "FFFFFFF", "#######")
                    .aisle("CPPPPPC", "C#####C", "C#####C", "C#####C", "CGGGGGC", "F#####F")
                    .aisle("CPPPPPC", "R#TTT#R", "R#####R", "C#####C", "CGGGGGC", "F#####F")
                    .aisle("CPPPPPC", "R#TTT#R", "R#####R", "C#####C", "CCCCCCC", "FFFFFFF")
                    .aisle("CPPPPPC", "R#TTT#R", "R#####R", "C#####C", "CCCCCCC", "F#####F")
                    .aisle("CPPPPPC", "C#####C", "C#####C", "C#####C", "CCCCCCC", "F#####F")
                    .aisle("FCCCCCF", "FCCCCCF", "FCCCCCF", "FCCCCCF", "F#####F", "#######")
                    .where('S', controller(blocks(definition.getBlock())))
                    .where('R', blocks(CASING_GRATE.get()))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('F', Predicates.frames(GTMaterials.BlackSteel))
                    .where('T', Predicates.frames(GTMaterials.IncoloyMA956))
                    .where('C', blocks(CASING_HSSE_STURDY.get())
                            .or(Predicates.abilities(PartAbility.MAINTENANCE).setMinGlobalLimited(1).setMaxGlobalLimited(1))
                            .or(Predicates.abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(1))
                            .or(Predicates.abilities(PartAbility.IMPORT_ITEMS).setMinGlobalLimited(1))
                            .or(Predicates.abilities(PartAbility.EXPORT_ITEMS).setMinGlobalLimited(1).setMaxGlobalLimited(1))
                            .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS).setMinGlobalLimited(1)))
                    .where('P', blocks(PLASTCRETE.get()))
                    .where('#', Predicates.any())
                    .build())
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_sturdy_hsse"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .register();

    public static void init() {

    }


}
