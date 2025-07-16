package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.MultiblockShapeInfo;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.common.block.BoilerFireboxType;
import com.gregtechceu.gtceu.common.data.GCYMBlocks;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.machine.multiblock.electric.AssemblyLineMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.part.FluidHatchPartMachine;
import com.gregtechceu.gtceu.common.machine.multiblock.steam.SteamParallelMultiblockMachine;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.tybob14.gtovervolt.api.GTOVAPI;
import com.tybob14.gtovervolt.api.machine.multiblock.GTOVPartAbility;
import com.tybob14.gtovervolt.api.machine.multiblock.part.SteamFluidPartMachine;
import com.tybob14.gtovervolt.common.machine.multiblock.electric.IndustrialPrecisionLathe;
import lombok.extern.slf4j.Slf4j;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.api.pattern.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT;
import static com.gregtechceu.gtceu.common.data.GTRecipeModifiers.OC_NON_PERFECT;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.gregtechceu.gtceu.common.data.machines.GTMachineUtils.registerLargeBoiler;
import static com.tybob14.gtovervolt.api.pattern.GTOVPredicates.machinePipeCasings;
import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;
import static com.tybob14.gtovervolt.common.data.GTOVBlocks.*;
import static com.tybob14.gtovervolt.common.data.GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES;
import static net.minecraft.world.level.block.Blocks.*;

@Slf4j
public class GTOVMachines {

    public static final MultiblockMachineDefinition LARGE_BOILER_BRONZE = registerLargeBoiler("bronze",
            CASING_BRONZE_BRICKS, BRONZE_PIPE_CASING, FIREBOX_BRONZE,
            GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"), BoilerFireboxType.BRONZE_FIREBOX,
            ConfigHolder.INSTANCE.machines.largeBoilers.bronzeBoilerMaxTemperature,
            ConfigHolder.INSTANCE.machines.largeBoilers.bronzeBoilerHeatSpeed);
    public static final MultiblockMachineDefinition LARGE_BOILER_STEEL = registerLargeBoiler("steel",
            CASING_STEEL_SOLID, STEEL_PIPE_CASING, FIREBOX_STEEL,
            GTCEu.id("block/casings/solid/machine_casing_solid_steel"), BoilerFireboxType.STEEL_FIREBOX,
            ConfigHolder.INSTANCE.machines.largeBoilers.steelBoilerMaxTemperature,
            ConfigHolder.INSTANCE.machines.largeBoilers.steelBoilerHeatSpeed);
    public static final MultiblockMachineDefinition LARGE_BOILER_TITANIUM = registerLargeBoiler("titanium",
            CASING_TITANIUM_STABLE, TITANIUM_PIPE_CASING, FIREBOX_TITANIUM,
            GTCEu.id("block/casings/solid/machine_casing_stable_titanium"), BoilerFireboxType.TITANIUM_FIREBOX,
            ConfigHolder.INSTANCE.machines.largeBoilers.titaniumBoilerMaxTemperature,
            ConfigHolder.INSTANCE.machines.largeBoilers.titaniumBoilerHeatSpeed);
    public static final MultiblockMachineDefinition LARGE_BOILER_TUNGSTENSTEEL = registerLargeBoiler("tungstensteel",
            CASING_TUNGSTENSTEEL_ROBUST, TUNGSTENSTEEL_PIPE_CASING, FIREBOX_TUNGSTENSTEEL,
            GTCEu.id("block/casings/solid/machine_casing_robust_tungstensteel"),
            BoilerFireboxType.TUNGSTENSTEEL_FIREBOX,
            ConfigHolder.INSTANCE.machines.largeBoilers.tungstensteelBoilerMaxTemperature,
            ConfigHolder.INSTANCE.machines.largeBoilers.tungstensteelBoilerHeatSpeed);

    public static final MachineDefinition STEAM_IMPORT_HATCH = REGISTRATE
            .machine("steam_input_hatch", holder -> new SteamFluidPartMachine(holder, 0, IO.IN, FluidHatchPartMachine.INITIAL_TANK_CAPACITY_1X * 2, 1, GTOVPartAbility.STEAM_IMPORT_FLUIDS))
            .rotationState(RotationState.ALL)
            .abilities(GTOVPartAbility.STEAM_IMPORT_FLUIDS)
            .colorOverlaySteamHullModel(GTCEu.id("block/overlay/machine/overlay_pipe_in_emissive"), null, GTCEu.id("block/overlay/machine/overlay_fluid_hatch"))
            .langValue("Steam Input Hatch")
            .tooltips(Component.translatable("gtceu.machine.fluid_hatch.import.tooltip"),
                    Component.translatable("gtceu.machine.steam_bus.tooltip"))
            .allowCoverOnFront(true)
            .register();

    public static final MachineDefinition STEAM_EXPORT_HATCH = REGISTRATE
            .machine("steam_output_hatch", holder -> new SteamFluidPartMachine(holder, 0, IO.OUT, FluidHatchPartMachine.INITIAL_TANK_CAPACITY_1X * 2, 1, GTOVPartAbility.STEAM_IMPORT_FLUIDS))
            .rotationState(RotationState.ALL)
            .abilities(GTOVPartAbility.STEAM_EXPORT_FLUIDS)
            .colorOverlaySteamHullModel(GTCEu.id("block/overlay/machine/overlay_pipe_out_emissive"), null, GTCEu.id("block/overlay/machine/overlay_fluid_hatch"))
            .langValue("Steam Output Hatch")
            .tooltips(Component.translatable("gtceu.machine.fluid_hatch.export.tooltip"),
                    Component.translatable("gtceu.machine.steam_bus.tooltip"))
            .allowCoverOnFront(true)
            .register();



    /*public static final MultiblockMachineDefinition CIRCUIT_ASSEMBLY_LINE = REGISTRATE
            .multiblock("circuit_assembly_line", AssemblyLineMachine::new)
            .rotationState(RotationState.ALL)
            .langValue("Circuit Assembly Line")
            .recipeTypes(GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES, GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES)
            .recipeModifiers(DEFAULT_ENVIRONMENT_REQUIREMENT, GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.PERFECT_OVERCLOCK))
            .appearanceBlock(CASING_STEEL_SOLID)
            .pattern(definition -> FactoryBlockPattern.start()
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
                    .where('E', blocks(CASING_GRATE.get()).or(Predicates.abilities(PartAbility.INPUT_ENERGY).setExactLimit(1)))
                    .where('A', blocks(CASING_ASSEMBLY_LINE.get()))
                    .where('R', blocks(CASING_LAMINATED_GLASS.get()))
                    .build())
            .partSorter(AssemblyLineMachine::partSorter)
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .register();*/

    public static final MultiblockMachineDefinition CIRCUIT_ASSEMBLY_LINE = REGISTRATE
            .multiblock("circuit_assembly_line", AssemblyLineMachine::new)
            .rotationState(RotationState.ALL)
            .recipeTypes(GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES, CIRCUIT_ASSEMBLY_LINE_RECIPES)
            .alwaysTryModifyRecipe(true)
            .recipeModifiers(DEFAULT_ENVIRONMENT_REQUIREMENT, OC_NON_PERFECT)
            .appearanceBlock(CASING_STEEL_SOLID)
            .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("FIF", "RTR", "SAG")
                    .aisle("FIF", "RTR", "GGG").setRepeatable(3, 5)
                    .aisle("FOF", "RTR", "GAG")
                    .where('S', Predicates.controller(blocks(definition.getBlock())))
                    .where('F', blocks(CASING_STEEL_SOLID.get())
                            .or(!ConfigHolder.INSTANCE.machines.orderedAssemblyLineFluids ?
                                    Predicates.abilities(PartAbility.IMPORT_FLUIDS_1X,
                                            PartAbility.IMPORT_FLUIDS_4X, PartAbility.IMPORT_FLUIDS_9X) :
                                    Predicates.abilities(PartAbility.IMPORT_FLUIDS_1X).setMaxGlobalLimited(4)))
                    .where('O',
                            Predicates.abilities(PartAbility.EXPORT_ITEMS)
                                    .addTooltips(Component.translatable("gtceu.multiblock.pattern.location_end")))
                    .where('Y',
                            blocks(CASING_STEEL_SOLID.get()))
                    .where('I', blocks(ITEM_IMPORT_BUS[0].getBlock()))
                    .where('G', blocks(CASING_GRATE.get()))
                    .where('A', blocks(CASING_GRATE.get()).or(Predicates.abilities(PartAbility.INPUT_ENERGY)
                            .setExactLimit(1)))
                    .where('R', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('T', blocks(CASING_ASSEMBLY_LINE.get()))
                    .build())
            .partSorter(AssemblyLineMachine::partSorter)
            .workableCasingModel(GTCEu.id("gtceu:block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("gtceu:block/multiblock/assembly_line"))
            .register();


    public static final MultiblockMachineDefinition PCB_FACTORY = REGISTRATE
            .multiblock("pcb_factory", WorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .langValue("PCB Factory")
            .recipeTypes(GTOVRecipeTypes.PCB_FACTORY_RECIPES)
            .recipeModifiers(DEFAULT_ENVIRONMENT_REQUIREMENT)
            .appearanceBlock(CASING_STEEL_SOLID)
            .pattern(definition -> FactoryBlockPattern.start()
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
                            .or(Predicates.abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMinGlobalLimited(2))
                            .or(Predicates.abilities(PartAbility.IMPORT_ITEMS).setMinGlobalLimited(1))
                            .or(Predicates.abilities(PartAbility.EXPORT_ITEMS).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS).setMinGlobalLimited(1)))
                    .where('P', blocks(PLASTCRETE.get()))
                    .where('#', Predicates.any())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_sturdy_hsse"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .register();

    public static final MultiblockMachineDefinition LARGE_EXTRACTOR = REGISTRATE
            .multiblock("large_extractor", CoilWorkableElectricMultiblockMachine::new)
            .langValue("Large Extractor")
            .recipeTypes(EXTRACTOR_RECIPES)
            .recipeModifiers(DEFAULT_ENVIRONMENT_REQUIREMENT, GTOVRecipeModifiers::coilSpeedDiscount)
            .appearanceBlock(CASING_TUNGSTENSTEEL_ROBUST)
            .rotationState(RotationState.NON_Y_AXIS)
            .tooltips(Component.translatable("gtovervolt.machine.coil_speed_bonus"),
                    Component.translatable("gtovervolt.machine.eu_reduction_80"))
            .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("CCCCC", "FGGGF", "FGGGF", "FGGGF", "XXXXX", "#####", "#####", "#####", "#####")
                    .aisle("CCCCC", "GTTTG", "GTTTG", "GTTTG", "XXXXX", "#F#F#", "#F#F#", "#F#F#", "#XXX#")
                    .aisle("SCCCC", "GT#TG", "GT#TG", "GT#TG", "XXXXX", "#####", "#####", "#####", "#XXX#")
                    .aisle("CCCCC", "GTTTG", "GTTTG", "GTTTG", "XXXXX", "#F#F#", "#F#F#", "#F#F#", "#XXX#")
                    .aisle("CCCCC", "FGGGF", "FGGGF", "FGGGF", "XXXXX", "#####", "#####", "#####", "#####")
                    .where('S', controller(blocks(definition.get())))
                    .where('X', blocks(CASING_TUNGSTENSTEEL_ROBUST.get()))
                    .where('C', blocks(CASING_TUNGSTENSTEEL_ROBUST.get())
                            .or(Predicates.abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2))
                            .or(Predicates.abilities(PartAbility.IMPORT_ITEMS))
                            .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS))
                            .or(Predicates.abilities(PartAbility.EXPORT_ITEMS).setMinGlobalLimited(1))
                            .or(Predicates.abilities(PartAbility.EXPORT_FLUIDS).setMinGlobalLimited(1)))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('T', heatingCoils())
                    .where('F', Predicates.frames(GTMaterials.BlackSteel))
                    .where('#', Predicates.any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("CCCMC", "FGGGF", "FGGGF", "FGGGF", "CCCCC", "#####", "#####", "#####", "#####")
                        .aisle("CCCCC", "GTTTG", "GTTTG", "GTTTG", "CCCCC", "#F#F#", "#F#F#", "#F#F#", "#CCC#")
                        .aisle("SCCCC", "GT#TG", "GT#TG", "GT#TG", "CCCCC", "#####", "#####", "#####", "#CCC#")
                        .aisle("CCCCC", "GTTTG", "GTTTG", "GTTTG", "CCCCC", "#F#F#", "#F#F#", "#F#F#", "#CCC#")
                        .aisle("QDELO", "FGGGF", "FGGGF", "FGGGF", "CCCCC", "#####", "#####", "#####", "#####")
                        .where('S', definition, Direction.NORTH)
                        .where('C', CASING_TUNGSTENSTEEL_ROBUST.getDefaultState())
                        .where('G', CASING_LAMINATED_GLASS.getDefaultState())
                        .where('F', ChemicalHelper.getBlock(TagPrefix.frameGt, GTMaterials.BlackSteel))
                        .where('E', ENERGY_INPUT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('L', ITEM_IMPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('O', ITEM_EXPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('Q', FLUID_IMPORT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('D', FLUID_EXPORT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('M', MAINTENANCE_HATCH, Direction.NORTH);
                GTCEuAPI.HEATING_COILS.entrySet().stream()
                        .sorted(Comparator.comparingInt(entry -> entry.getKey().getTier()))
                        .forEach(
                                coil -> shapeInfo.add(builder.shallowCopy().where('T', coil.getValue().get()).build()));
                return shapeInfo;
            })
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_robust_tungstensteel"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .additionalDisplay((controller, components) -> {
                if (controller instanceof CoilWorkableElectricMultiblockMachine coilMachine && controller.isFormed()) {
                    components.add(Component.translatable("gtovervolt.multiblock.speed_bonus",
                            Component
                                    .translatable(
                                            FormattingUtil
                                                    .formatNumbers(coilMachine.getCoilTier() * 10) +
                                                    "%")
                                    .setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN))));
                }
            })
            .register();

    public static final MultiblockMachineDefinition INDUSTRIAL_PRECISION_LATHE = REGISTRATE
            .multiblock("industrial_precision_lathe", IndustrialPrecisionLathe::new)
            .tooltips(Component.translatable("gtovervolt.machine.pipe_speed_bonus"),
                    Component.translatable("gtovervolt.machine.eu_reduction_80"))
            .langValue("Industrial Precision Lathe")
            .recipeType(LATHE_RECIPES)
            .rotationState(RotationState.NON_Y_AXIS)
            .recipeModifiers(DEFAULT_ENVIRONMENT_REQUIREMENT)
            .appearanceBlock(CASING_STEEL_SOLID)
            .pattern((definition) -> FactoryBlockPattern.start()
                    .aisle("CCCCCCC", "#######", "#######", "#######", "#######")
                    .aisle("CCCCCCC", "CGGGGXC", "CGGGGXC", "CGGGGXC", "#######")
                    .aisle("CCCCCCC", "CGGGGXC", "CPPPPXC", "CGGGGXC", "CCCCCCC")
                    .aisle("CCCCCCC", "CGGGGXC", "CGGGGXC", "CGGGGXC", "#######")
                    .aisle("CCCSCCC", "#######", "#######", "#######", "#######")
                    .where('S', controller(blocks(definition.get())))
                    .where('C', blocks(CASING_STEEL_SOLID.get()).setMinGlobalLimited(10)
                            .or(abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2))
                            .or(abilities(PartAbility.IMPORT_ITEMS).setMinGlobalLimited(1))
                            .or(abilities(PartAbility.EXPORT_ITEMS).setExactLimit(1))
                            .or(abilities(PartAbility.MUFFLER).setExactLimit(1)))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('X', blocks(CASING_GRATE.get()))
                    .where('P', machinePipeCasings())
                    .where('#', any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("CCCSMCC", "#######", "#######", "#######", "#######")
                        .aisle("CCCCCCC", "CXGGGGC", "CXGGGGC", "CXGGGGC", "#######")
                        .aisle("CCCCCCC", "CXGGGGC", "CXPPPPC", "CXGGGGC", "CCCCCCC")
                        .aisle("CCCCCCC", "CXGGGGC", "CXGGGGC", "CXGGGGC", "#######")
                        .aisle("ECCACLO", "#######", "#######", "#######", "#######")
                        .where('S', definition, Direction.NORTH)
                        .where('C', CASING_STEEL_SOLID.getDefaultState())
                        .where('G', CASING_LAMINATED_GLASS.getDefaultState())
                        .where('X', CASING_GRATE.getDefaultState())
                        .where('E', ENERGY_INPUT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('L', ITEM_IMPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('O', ITEM_EXPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('A', MUFFLER_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('M', MAINTENANCE_HATCH, Direction.NORTH);
                GTOVAPI.PIPE_CASING.entrySet().stream()
                        .sorted(Comparator.comparingInt(entry -> entry.getKey().getTier()))
                        .forEach(
                                pipecasings -> shapeInfo.add(builder.shallowCopy().where('P', pipecasings.getValue().get()).build()));
                return shapeInfo;
            })
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .additionalDisplay((controller, components) -> {
                if (controller instanceof WorkableElectricMultiblockMachine machine && controller.isFormed()) {
                    components.add(Component.translatable(FormattingUtil.formatNumbers(machine.getTier() + 1) +
                                    "%")
                            .setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN)));
                }
            })
            .register();


    public static final MultiblockMachineDefinition LARGE_ELECTRIC_COMPRESSOR = REGISTRATE
            .multiblock("large_electric_compressor", WorkableElectricMultiblockMachine::new)
            .tooltips(Component.translatable("gtovervolt.machine.eu_reduction_90"))
            .langValue("Large Electric Compressor")
            .recipeType(COMPRESSOR_RECIPES)
            .recipeModifiers(DEFAULT_ENVIRONMENT_REQUIREMENT, GTOVRecipeModifiers::ELECTRIC_COMPRESSOR_OC)
            .appearanceBlock(GCYMBlocks.CASING_STRESS_PROOF)
            .pattern((definition) -> FactoryBlockPattern.start()
                    .aisle("##CCC##", "##RRR##", "##RGR##", "##RGR##", "##RGR##", "##RRR##", "##CCC##", "#######")
                    .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                    .aisle("CCCCCCC", "C#####C", "R#####R", "R#####R", "R#####R", "C#####C", "CCCCCCC", "#RRRRR#")
                    .aisle("CCCCCCC", "C#####C", "R#####R", "R#####R", "R#####R", "C#####C", "CCCCCCC", "#RRRRR#")
                    .aisle("CCCCCCC", "C#####C", "R#####R", "R#####R", "R#####R", "C#####C", "CCCCCCC", "#RRRRR#")
                    .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                    .aisle("##CSC##", "##RRR##", "##RGR##", "##RGR##", "##RGR##", "##RRR##", "##CCC##", "#######")
                    .where('S', controller(blocks(definition.get())))
                    .where('C', blocks(GCYMBlocks.CASING_STRESS_PROOF.get())
                            .or(abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2)))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('R', blocks(CASING_GRATE.get()))
                    .where('H', blocks(CASING_GRATE.get())
                            .or(abilities(PartAbility.IMPORT_ITEMS).setMinGlobalLimited(1))
                            .or(abilities(PartAbility.EXPORT_ITEMS).setMinGlobalLimited(1)))
                    .where('#', any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("##CCC##", "##RRR##", "##RGR##", "##RGR##", "##RGR##", "##RRR##", "##CCC##", "#######")
                        .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                        .aisle("CCCCCCC", "C#####C", "H#####H", "H#####H", "H#####H", "C#####C", "CCCCCCC", "#RRRRR#")
                        .aisle("CCCCCCC", "C#####C", "H#####H", "H#####H", "H#####H", "C#####C", "CCCCCCC", "#RRRRR#")
                        .aisle("CCCCCCC", "C#####C", "H#####H", "H#####H", "H#####H", "C#####C", "CCCCCCC", "#RRRRR#")
                        .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                        .aisle("##CSC##", "##RRR##", "##RGR##", "##RGR##", "##RGR##", "##RRR##", "##CCC##", "#######")
                        .where('S', definition, Direction.NORTH)
                        .where('C', CASING_BRONZE_BRICKS.getDefaultState())
                        .where('G', CASING_LAMINATED_GLASS.getDefaultState())
                        .where('R', CASING_GRATE.getDefaultState())
                        .where('H', CASING_GRATE.getDefaultState())
                        .where('E', ENERGY_INPUT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('L', ITEM_IMPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('O', ITEM_EXPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('M', MAINTENANCE_HATCH, Direction.NORTH).build();
                return shapeInfo;
            })
            .workableCasingModel(GTCEu.id("block/casings/gcym/stress_proof_casing"),
                    GTCEu.id("block/multiblock/gcym/large_material_press"))
            .register();


    /*public static final MultiblockMachineDefinition INDUSTRIAL_AUTOCLAVE = REGISTRATE
            .multiblock("industrial_autoclave", IndustrialAutoclave::new)
            .langValue("Industrial Autoclave")
            .recipeTypes(AUTOCLAVE_RECIPES)
            .recipeModifiers(DEFAULT_ENVIRONMENT_REQUIREMENT)
            .appearanceBlock(CASING_STAINLESS_CLEAN)
            .rotationState(RotationState.NON_Y_AXIS)
            .tooltips(Component.translatable("gtovervolt.machine.eu_reduction_80"),
                    Component.translatable("gtovervolt.machine.autocave_overclock_tooltip"),
                    Component.translatable("gtovervolt.machine.autoclave_parallel_tooltip"))

            .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("C#######C", "C#######C", "CCCCCCCCC", "CCCCCCCCC", "CCCCCCCCC", "C#######C", "#########")
                    .aisle("#########", "CCCCCCCCC", "G#######G", "GFFFFFFFG", "G#######G", "CCCCCCCCC", "C#######C")
                    .aisle("CCCCCCCCC", "G#######G", "GFFFFFFFG", "GPPPPPPPG", "GFFFFFFFG", "G#######G", "CCCCCCCCC")
                    .aisle("SCCCCCCCC", "G#######G", "G#######G", "GFFFFFFFG", "G#######G", "G#######G", "CTTTTTTTC")
                    .aisle("CCCCCCCCC", "G#######G", "GFFFFFFFG", "GPPPPPPPG", "GFFFFFFFG", "G#######G", "CCCCCCCCC")
                    .aisle("#########", "CCCCCCCCC", "G#######G", "GFFFFFFFG", "G#######G", "CCCCCCCCC", "C#######C")
                    .aisle("C#######C", "C#######C", "CCCCCCCCC", "CCCCCCCCC", "CCCCCCCCC", "C#######C", "#########")
                    .where('S', controller(blocks(definition.get())))
                    .where('C', blocks(CASING_STAINLESS_CLEAN.get()).setMinGlobalLimited(30)
                            .or(Predicates.abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2))
                            .or(Predicates.abilities(PartAbility.IMPORT_ITEMS))
                            .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS))
                            .or(Predicates.abilities(PartAbility.EXPORT_ITEMS))
                            .or(Predicates.abilities(PartAbility.EXPORT_FLUIDS)))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('F', Predicates.frames(GTMaterials.Polytetrafluoroethylene))
                    .where('P', machinePipeCasings())
                    .where('T', heatingCoils())
                    .where('#', Predicates.any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("C#######C", "C#######C", "CCCCCCCCC", "CCCCCCCCC", "CCCCCCCCC", "C#######C", "#########")
                        .aisle("#########", "CCCCCCCCC", "G#######G", "GFFFFFFFG", "G#######G", "CCCCCCCCC", "C#######C")
                        .aisle("CCCCCCCCC", "G#######G", "GFFFFFFFG", "GPPPPPPPG", "GFFFFFFFG", "G#######G", "CCCCCCCCC")
                        .aisle("SCCCCCCCC", "G#######G", "G#######G", "GFFFFFFFG", "G#######G", "G#######G", "CTTTTTTTC")
                        .aisle("MCCCCCCCC", "G#######G", "GFFFFFFFG", "GPPPPPPPG", "GFFFFFFFG", "G#######G", "CCCCCCCCC")
                        .aisle("#########", "CCCCCCCCC", "G#######G", "GFFFFFFFG", "G#######G", "CCCCCCCCC", "C#######C")
                        .aisle("C#######C", "C#######C", "CCCCCCCCC", "CCCCCCCCC", "CCCCCCCCC", "C#######C", "#########")
                        .where('S', definition, Direction.EAST)
                        .where('C', CASING_STAINLESS_CLEAN.getDefaultState())
                        .where('G', CASING_LAMINATED_GLASS.getDefaultState())
                        .where('E', ENERGY_INPUT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('L', ITEM_IMPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('O', ITEM_EXPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('Q', FLUID_IMPORT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('D', FLUID_EXPORT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('F', ChemicalHelper.getBlock(TagPrefix.frameGt, GTMaterials.Polytetrafluoroethylene))
                        .where('P', BRONZE_PIPE_CASING)
                        .where('M', MAINTENANCE_HATCH, Direction.NORTH);
                GTCEuAPI.HEATING_COILS.entrySet().stream()
                        .sorted(Comparator.comparingInt(entry -> entry.getKey().getTier()))
                        .forEach(
                                coil -> {
                                    int tier = coil.getKey().getTier();

                                    BlockState pipeCasing;
                                    switch (tier) {
                                        case 0 -> pipeCasing = BRONZE_PIPE_CASING.getDefaultState();
                                        case 1 -> pipeCasing = STEEL_PIPE_CASING.getDefaultState();
                                        case 2 -> pipeCasing = TITANIUM_PIPE_CASING.getDefaultState();
                                        default -> pipeCasing = TUNGSTENSTEEL_PIPE_CASING.getDefaultState();
                                    }

                                    shapeInfo.add(builder.shallowCopy()
                                            .where('T', coil.getValue().get())
                                            .where('P', pipeCasing)
                                            .build());
                                });
                return shapeInfo;
            })
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_clean_stainless_steel"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .additionalDisplay((controller, components) -> {
                if (controller instanceof CoilWorkableElectricMultiblockMachine coilMachine && controller.isFormed()) {
                    components.add(Component.translatable("gtovervolt.multiblock.speed_bonus",
                            Component
                                    .translatable(
                                            FormattingUtil
                                                    //.formatNumbers(Math.round((100 * (1/(Math.pow(0.75, coilMachine.getCoilTier())))) - 100)) + "%")
                                                        .formatNumbers(100*(1.0 + 0.25 * coilMachine.getCoilTier()) - 100) + "%")
                                    .setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN))));
                    components.add(Component.translatable("gtovervolt.machine.autoclave_parallel",
                            Component
                                    .translatable(
                                            FormattingUtil
                                                    .formatNumbers((coilMachine.getTier()+1) * 12))
                                    .setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN))));
                }
            })
            .register();*/



    /*public static final MultiblockMachineDefinition STEAM_PRESSER = REGISTRATE
            .multiblock("steam_presser", TieredSteamParallelMultiblockMachine::new)
            .langValue("Steam Presser")
            .recipeType(FORGE_HAMMER_RECIPES)
            .rotationState(RotationState.NON_Y_AXIS)
            .recipeModifier(GTOVRecipeModifiers::highPressureSteam, true)
            .appearanceBlock(CASING_BRONZE_BRICKS)
            .pattern((definition) -> FactoryBlockPattern.start()
                    .aisle("#CCC#", "#####", "#####", "#####", "#####", "#####", "#####")
                    .aisle("CCCCC", "#CCC#", "#####", "#####", "#####", "##C##", "#####")
                    .aisle("CCCCC", "CC#CC", "C###C", "C#I#C", "C#I#C", "CCPCC", "##P##")
                    .aisle("CCCCC", "#CSC#", "#####", "#####", "#####", "##C##", "#####")
                    .aisle("#CCC#", "#####", "#####", "#####", "#####", "#####", "#####")
                    .where('S', controller(blocks(definition.get())))
                    .where('I', blocks(IRON_BLOCK))
                    .where('C', steamMachineCasings().setMinGlobalLimited(10)
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1)))
                    .where('P', machinePipeCasings())
                    .where('#', Predicates.any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("#CCC#", "#####", "#####", "#####", "#####", "#####", "#####")
                        .aisle("CCCCC", "#CSC#", "#####", "#####", "#####", "##C##", "#####")
                        .aisle("CCCCC", "CC#CC", "C###C", "C#I#C", "C#I#C", "CCPCC", "##P##")
                        .aisle("CCCCC", "#CCC#", "#####", "#####", "#####", "##C##", "#####")
                        .aisle("#MHO#", "#####", "#####", "#####", "#####", "#####", "#####")
                        .where('S', definition, Direction.NORTH)
                        .where('M', STEAM_IMPORT_BUS, Direction.SOUTH)
                        .where('O', STEAM_EXPORT_BUS, Direction.SOUTH)
                        .where('H', STEAM_HATCH, Direction.NORTH);

                GTOVAPI.STEAM_CASING.entrySet().stream()
                        .sorted(Comparator.comparingInt(entry -> entry.getKey().getTier()))
                        .forEach(
                                casing -> {
                                    int tier = casing.getKey().getTier();

                                    BlockState pipeCasing;
                                    if (tier == 1){ pipeCasing = STEEL_PIPE_CASING.getDefaultState();
                                    }else{
                                        pipeCasing = BRONZE_PIPE_CASING.getDefaultState();
                                    }
                                    shapeInfo.add(builder.shallowCopy()
                                            .where('C', casing.getValue().get())
                                            .where('P', pipeCasing)
                                            .build());
                                });
                return shapeInfo;
            })

            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .additionalDisplay((controller, components) -> {
                if (controller instanceof WorkableElectricMultiblockMachine machine && controller.isFormed()) {
                    components.add(Component.translatable("Tier:" + FormattingUtil.formatNumbers(machine.getTier() + 1))
                            .setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN)));
                }
            })
            .register();*/


    public static final MachineDefinition STEAM_CENTRIFUGE = REGISTRATE.multiblock("steam_separator", SteamParallelMultiblockMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .appearanceBlock(CASING_BRONZE_BRICKS)
            .recipeType(CENTRIFUGE_RECIPES)
            .recipeModifier(SteamParallelMultiblockMachine::recipeModifier, true)
            .pattern(definition -> FactoryBlockPattern.start()
                    .aisle("#FFF#", "#FFF#", "##F##", "#####", "#FFF#")
                    .aisle("FFFFF", "FFGFF", "#FPF#", "#FGF#", "FFFFF")
                    .aisle("FFFFF", "FGFGF", "FPFPF", "#GFG#", "FFFFF")
                    .aisle("FFFFF", "FFGFF", "#FPF#", "#FGF#", "FFFFF")
                    .aisle("#FFF#", "#FSF#", "##F##", "#####", "#FFF#")
                    .where('S', Predicates.controller(blocks(definition.getBlock())))
                    .where('#', Predicates.any())
                    .where('G', blocks(CASING_BRONZE_GEARBOX.get()))
                    .where('P', blocks(BRONZE_PIPE_CASING.get()))
                    .where('F', blocks(CASING_BRONZE_BRICKS.get()).setMinGlobalLimited(6)
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setPreviewCount(1)))
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/machines/centrifuge"))
            .register();

    public static final MachineDefinition STEAM_ALLOY_SMELTER = REGISTRATE.multiblock("steam_fuser", SteamParallelMultiblockMachine::new)
            .appearanceBlock(CASING_BRONZE_BRICKS)
            .recipeType(ALLOY_SMELTER_RECIPES)
            .recipeModifier(SteamParallelMultiblockMachine::recipeModifier, true)
            .pattern(definition -> FactoryBlockPattern.start()
                    .aisle("FFF", "FFF", "FFF")
                    .aisle("FFF", "GRG", "FFF")
                    .aisle("FFF", "GRG", "FFF")
                    .aisle("FFF", "FSF", "FFF")
                    .where('S', Predicates.controller(blocks(definition.getBlock())))
                    .where('G', blocks(Blocks.TINTED_GLASS))
                    .where('R', blocks(CASING_BRONZE_GEARBOX.get()))
                    .where('F', blocks(CASING_BRONZE_BRICKS.get()).setMinGlobalLimited(6)
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setPreviewCount(1)))
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/machines/alloy_smelter"))
            .register();

    public static final MultiblockMachineDefinition STEAM_PRESSER = REGISTRATE.multiblock("steam_presser", SteamParallelMultiblockMachine::new)
            .appearanceBlock(CASING_BRONZE_BRICKS)
            .recipeType(FORGE_HAMMER_RECIPES)
            .recipeModifier(SteamParallelMultiblockMachine::recipeModifier, true)
            .rotationState(RotationState.NON_Y_AXIS)
            .pattern((definition) -> FactoryBlockPattern.start()
                    .aisle("#CCC#", "#####", "#####", "#####", "#####", "#####", "#####")
                    .aisle("CCCCC", "#CCC#", "#####", "#####", "#####", "##C##", "#####")
                    .aisle("CCCCC", "CC#CC", "C###C", "C#I#C", "C#I#C", "CCPCC", "##P##")
                    .aisle("CCCCC", "#CSC#", "#####", "#####", "#####", "##C##", "#####")
                    .aisle("#CCC#", "#####", "#####", "#####", "#####", "#####", "#####")
                    .where('S', controller(blocks(definition.get())))
                    .where('I', blocks(IRON_BLOCK))
                    .where('C', blocks(CASING_BRONZE_BRICKS.get()).setMinGlobalLimited(6)
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setPreviewCount(1)))
                    .where('P', blocks(BRONZE_PIPE_CASING.get()))
                    .where('#', Predicates.any())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/machines/forge_hammer"))
            .register();


    public static final MachineDefinition STEAM_COMPRESSOR = REGISTRATE.multiblock("steam_squasher", SteamParallelMultiblockMachine::new)
            .appearanceBlock(CASING_BRONZE_BRICKS)
            .recipeType(COMPRESSOR_RECIPES)
            .recipeModifier(SteamParallelMultiblockMachine::recipeModifier, true)
            .pattern(definition -> FactoryBlockPattern.start()
                    .aisle("FFF", "FFF", "FFF")
                    .aisle("FFF", "FRF", "FFF")
                    .aisle("FFF", "FRF", "FFF")
                    .aisle("FFF", "FSF", "FFF")
                    .where('S', Predicates.controller(blocks(definition.getBlock())))
                    .where('R', blocks(CASING_BRONZE_GEARBOX.get()))
                    .where('F', blocks(CASING_BRONZE_BRICKS.get()).setMinGlobalLimited(6)
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setPreviewCount(1)))
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/machines/compressor"))
            .register();

    public static final MachineDefinition STEAM_MIXER = REGISTRATE.multiblock("steam_blender", SteamParallelMultiblockMachine::new)
            .appearanceBlock(CASING_BRONZE_BRICKS)
            .recipeType(MIXER_RECIPES)
            .recipeModifier(SteamParallelMultiblockMachine::recipeModifier, true)
            .pattern(definition -> FactoryBlockPattern.start()
                    .aisle("#FFFFF#", "#FFFFF#", "#FFFFF#", "###F###", "###F###", "#######")
                    .aisle("FFFFFFF", "FI###IF", "F#####F", "#######", "###F###", "###F###")
                    .aisle("FFFFFFF", "F#I#I#F", "F#####F", "#######", "#######", "###F###")
                    .aisle("FFFFFFF", "F##G##F", "F##P##F", "F##P##F", "FF#G#FF", "#FFFFF#")
                    .aisle("FFFFFFF", "F#I#I#F", "F#####F", "#######", "#######", "###F###")
                    .aisle("FFFFFFF", "FI###IF", "F#####F", "#######", "###F###", "###F###")
                    .aisle("#FFFFF#", "#FFSFF#", "#FFFFF#", "###F###", "###F###", "#######")
                    .where('S', Predicates.controller(blocks(definition.getBlock())))
                    .where('G', blocks(CASING_BRONZE_GEARBOX.get()))
                    .where('I', blocks(IRON_BLOCK))
                    .where('P', blocks(BRONZE_PIPE_CASING.get()))
                    .where('F', blocks(CASING_BRONZE_BRICKS.get()).setMinGlobalLimited(6)
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(GTOVPartAbility.STEAM_IMPORT_FLUIDS).setPreviewCount(1))
                            .or(Predicates.abilities(GTOVPartAbility.STEAM_EXPORT_FLUIDS).setPreviewCount(1)))
                    .where('#', Predicates.any())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/machines/mixer"))
            .register();

    public static final MachineDefinition STEAM_WASHER = REGISTRATE.multiblock("steam_washer", SteamParallelMultiblockMachine::new)
            .appearanceBlock(CASING_BRONZE_BRICKS)
            .recipeType(ORE_WASHER_RECIPES)
            .recipeModifier(SteamParallelMultiblockMachine::recipeModifier, true)
            .pattern(definition -> FactoryBlockPattern.start()
                    .aisle("####FFFFF", "####FGGGF", "####FGGGF", "#####FFF#", "#########", "#########")
                    .aisle("FFF#FRRRF", "FFF#GWWWG", "FFF#G###G", "####F###F", "#########", "#########")
                    .aisle("FFF#FRFRF", "FFF#GWPWG", "FFF#G#P#G", "#P##F#P#F", "#P####P##", "#PPPPPP##")
                    .aisle("FFF#FRRRF", "FSF#GWWWG", "FFF#G###G", "####F###F", "#########", "#########")
                    .aisle("####FFFFF", "####FGGGF", "####FGGGF", "#####FFF#", "#########", "#########")
                    .where('S', Predicates.controller(blocks(definition.getBlock())))
                    .where('R', blocks(CASING_BRONZE_GEARBOX.get()))
                    .where('G', blocks(GLASS))
                    .where('W', blocks(WATER))
                    .where('P', blocks(BRONZE_PIPE_CASING.get()))
                    .where('F', blocks(CASING_BRONZE_BRICKS.get()).setMinGlobalLimited(6)
                            .or(Predicates.abilities(PartAbility.STEAM).setExactLimit(1))
                            .or(Predicates.abilities(PartAbility.STEAM_IMPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(PartAbility.STEAM_EXPORT_ITEMS).setPreviewCount(1))
                            .or(Predicates.abilities(GTOVPartAbility.STEAM_IMPORT_FLUIDS).setPreviewCount(1))
                            .or(Predicates.abilities(GTOVPartAbility.STEAM_EXPORT_FLUIDS).setPreviewCount(1)))
                    .where('#', Predicates.any())
                    .build())
            .workableCasingModel(GTCEu.id("block/casings/solid/machine_casing_bronze_plated_bricks"),
                    GTCEu.id("block/machines/mixer"))
            .register();


    public static void init() {
    }


}
