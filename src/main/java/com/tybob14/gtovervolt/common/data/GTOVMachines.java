package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.MultiblockShapeInfo;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.api.recipe.OverclockingLogic;
import com.gregtechceu.gtceu.api.recipe.modifier.RecipeModifier;
import com.gregtechceu.gtceu.common.data.*;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.tybob14.gtovervolt.common.machine.multiblock.electric.CircuitAssemblyLineMachine;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;

import java.util.*;

import static com.gregtechceu.gtceu.api.pattern.Predicates.*;
import static com.gregtechceu.gtceu.api.pattern.util.RelativeDirection.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

public class GTOVMachines {

    public static final MultiblockMachineDefinition CIRCUIT_ASSEMBLY_LINE = REGISTRATE
            .multiblock("circuit_assembly_line", CircuitAssemblyLineMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .langValue("Circuit Assembly Line")
            .recipeTypes(GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES, GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES)
            .alwaysTryModifyRecipe(true)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT,
                    GTRecipeModifiers.ELECTRIC_OVERCLOCK.apply(OverclockingLogic.PERFECT_OVERCLOCK))
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
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .register();
    public static final MultiblockMachineDefinition PCB_FACTORY = REGISTRATE
            .multiblock("pcb_factory", WorkableElectricMultiblockMachine::new)
            .rotationState(RotationState.NON_Y_AXIS)
            .langValue("PCB Factory")
            .recipeTypes(GTOVRecipeTypes.PCB_FACTORY_RECIPES)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT)
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
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_sturdy_hsse"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .register();

    public static final MultiblockMachineDefinition LARGE_EXTRACTOR = REGISTRATE
            .multiblock("large_extractor", CoilWorkableElectricMultiblockMachine::new)
            .langValue("Large Extractor")
            .recipeTypes(EXTRACTOR_RECIPES)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT, GTOVRecipeModifiers::coilSpeedDiscount)
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
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_robust_tungstensteel"),
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
            .multiblock("industrial_precision_lathe", WorkableElectricMultiblockMachine::new)
            .tooltips(Component.translatable("gtovervolt.machine.pipe_speed_bonus"),
                    Component.translatable("gtovervolt.machine.eu_reduction_80"))
            .langValue("Industrial Precision Lathe")
            .recipeType(LATHE_RECIPES)
            .rotationState(RotationState.NON_Y_AXIS)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT, GTOVRecipeModifiers::LATHE_OC)
            .appearanceBlock(CASING_STEEL_SOLID)
            .pattern((definition) -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("CCCSCCC", "#######", "#######", "#######", "#######")
                    .aisle("CCCCCCC", "CGGGGXC", "CGGGGXC", "CGGGGXC", "#######")
                    .aisle("CCCCCCC", "CGGGGXC", "CPPPPXC", "CGGGGXC", "CCCCCCC")
                    .aisle("CCCCCCC", "CGGGGXC", "CGGGGXC", "CGGGGXC", "#######")
                    .aisle("CCCCCCC", "#######", "#######", "#######", "#######")
                    .where('S', controller(blocks(definition.get())))
                    .where('C', blocks(CASING_STEEL_SOLID.get())
                            .or(abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMinGlobalLimited(2))
                            .or(abilities(PartAbility.IMPORT_ITEMS).setMinGlobalLimited(1))
                            .or(abilities(PartAbility.EXPORT_ITEMS).setExactLimit(1))
                            .or(abilities(PartAbility.MUFFLER).setExactLimit(1)))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('X', blocks(CASING_GRATE.get()))
                    .where('P', Predicates.blocks( CASING_BRONZE_PIPE.get(), CASING_STEEL_PIPE.get(), CASING_TITANIUM_PIPE.get(),CASING_TUNGSTENSTEEL_PIPE.get()))
                    .where('#', any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("CCCSMCC", "#######", "#######", "#######", "#######")
                        .aisle("CCCCCCC", "CGGGGXC", "CGGGGXC", "CGGGGXC", "#######")
                        .aisle("CCCCCCC", "CGGGGXC", "CPPPPXC", "CGGGGXC", "CCCCCCC")
                        .aisle("CCCCCCC", "CGGGGXC", "CGGGGXC", "CGGGGXC", "#######")
                        .aisle("CCCACLO", "#######", "#######", "#######", "#######")
                        .where('S', definition, Direction.NORTH)
                        .where('C', CASING_STEEL_SOLID.getDefaultState())
                        .where('G', CASING_LAMINATED_GLASS.getDefaultState())
                        .where('X', CASING_GRATE.getDefaultState())
                        .where('E', ENERGY_INPUT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('L', ITEM_IMPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('O', ITEM_EXPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('A', MUFFLER_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('M', MAINTENANCE_HATCH, Direction.NORTH);
                shapeInfo.add(builder.where('P', CASING_BRONZE_PIPE.get()).build());
                shapeInfo.add(builder.where('P', CASING_STEEL_PIPE.get()).build());
                shapeInfo.add(builder.where('P', CASING_TITANIUM_PIPE.get()).build());
                shapeInfo.add(builder.where('P', CASING_TUNGSTENSTEEL_PIPE.get()).build());
                return shapeInfo;
            })
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_solid_steel"),
                    GTCEu.id("block/multiblock/assembly_line"))
            .additionalDisplay((controller, components) -> {
                if (controller instanceof WorkableElectricMultiblockMachine machine && controller.isFormed()) {
                    components.add(Component.translatable("machine.eu_reduction_80",
                            Component
                                    .translatable(
                                            FormattingUtil
                                                    .formatNumbers(machine.getTier() * 10) +
                                                    "%")
                                    .setStyle(Style.EMPTY.withColor(ChatFormatting.GREEN))));
                }
            })
            .register();


    public static final MultiblockMachineDefinition LARGE_ELECTRIC_COMPRESSOR = REGISTRATE
            .multiblock("large_electric_compressor", WorkableElectricMultiblockMachine::new)
            .tooltips(Component.translatable("gtovervolt.machine.eu_reduction_90"))
            .langValue("Large Electric Compressor")
            .recipeType(COMPRESSOR_RECIPES)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT, GTOVRecipeModifiers::ELECTRIC_COMPRESSOR_OC)
            .appearanceBlock(GCYMBlocks.CASING_STRESS_PROOF)
            .pattern((definition) -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("##CCC##", "##CCC##", "##RRR##", "##RRR##", "##RRR##", "##CCC##", "##CCC##", "#######")
                    .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                    .aisle("CCCCCCC", "R#####R", "R#####R", "R#####R", "R#####R", "R#####R", "CCCCCCC", "#RRRRR#")
                    .aisle("SCCCCCC", "R#####R", "G#####G", "G#####G", "G#####G", "R#####R", "CCCCCCC", "#RRRRR#")
                    .aisle("CCCCCCC", "R#####R", "R#####R", "R#####R", "R#####R", "R#####R", "CCCCCCC", "#RRRRR#")
                    .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                    .aisle("##CCC##", "##CCC##", "##RRR##", "##RRR##", "##RRR##", "##CCC##", "##CCC##", "#######")
                    .where('S', controller(blocks(definition.get())))
                    .where('C', blocks(GCYMBlocks.CASING_STRESS_PROOF.get())
                            .or(abilities(PartAbility.MAINTENANCE).setExactLimit(1))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMaxGlobalLimited(2))
                            .or(abilities(PartAbility.IMPORT_ITEMS).setMinGlobalLimited(1))
                            .or(abilities(PartAbility.EXPORT_ITEMS).setMinGlobalLimited(1)))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('R', blocks(CASING_GRATE.get()))
                    .where('#', any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("##CCC##", "##CCC##", "##RRR##", "##RRR##", "##RRR##", "##CCC##", "##CCC##", "#######")
                        .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                        .aisle("CCCCCCC", "R#####R", "R#####R", "R#####R", "R#####R", "R#####R", "CCCCCCC", "#RRRRR#")
                        .aisle("SCCCCCC", "R#####R", "G#####G", "G#####G", "G#####G", "R#####R", "CCCCCCC", "#RRRRR#")
                        .aisle("CCCCCCC", "R#####R", "R#####R", "R#####R", "R#####R", "R#####R", "CCCCCCC", "#RRRRR#")
                        .aisle("#CCCCC#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#C###C#", "#CCCCC#", "##RRR##")
                        .aisle("##CCC##", "##CCC##", "##RRR##", "##RRR##", "##RRR##", "##CCC##", "##CCC##", "#######")
                        .where('S', definition, Direction.NORTH)
                        .where('C', CASING_BRONZE_BRICKS.getDefaultState())
                        .where('G', CASING_LAMINATED_GLASS.getDefaultState())
                        .where('R', CASING_GRATE.getDefaultState())
                        .where('E', ENERGY_INPUT_HATCH[GTValues.LV], Direction.SOUTH)
                        .where('L', ITEM_IMPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('O', ITEM_EXPORT_BUS[GTValues.LV], Direction.SOUTH)
                        .where('M', MAINTENANCE_HATCH, Direction.NORTH).build();
                return shapeInfo;
            })
            .workableCasingRenderer(GTCEu.id("block/casings/gcym/stress_proof_casing"),
                    GTCEu.id("block/multiblock/gcym/large_material_press"))
            .register();


    public static final MultiblockMachineDefinition INDUSTRIAL_AUTOCLAVE = REGISTRATE
            .multiblock("industrial_autoclave", CoilWorkableElectricMultiblockMachine::new)
            .langValue("Industrial Autoclave")
            .recipeTypes(AUTOCLAVE_RECIPES)
            .recipeModifiers(GTRecipeModifiers.DEFAULT_ENVIRONMENT_REQUIREMENT, GTOVRecipeModifiers::coilSpeedDiscount)
            .appearanceBlock(CASING_STAINLESS_CLEAN)
            .rotationState(RotationState.NON_Y_AXIS)
            .tooltips(Component.translatable("gtovervolt.machine.coil_speed_bonus"),
                    Component.translatable("gtovervolt.machine.eu_reduction_80"))
            .pattern(definition -> FactoryBlockPattern.start(BACK, UP, RIGHT)
                    .aisle("C#######C","C#######C","CCCCCCCCC","CCCCCCCCC","CCCCCCCCC","C#######C","#########")
                    .aisle("#########","CCCCCCCCC","G#######G","G#######G","G#######G","CCCCCCCCC","C#######C")
                    .aisle("CCCCCCCCC","G#######G","G#######G","G#######G","G#######G","G#######G","CCCCCCCCC")
                    .aisle("SCCCCCCCC","G#######G","G#######G","G#######G","G#######G","G#######G","CTTTTTTTC")
                    .aisle("CCCCCCCCC","G#######G","G#######G","G#######G","G#######G","G#######G","CCCCCCCCC")
                    .aisle("#########","CCCCCCCCC","G#######G","G#######G","G#######G","CCCCCCCCC","C#######C")
                    .aisle("C#######C","C#######C","CCCCCCCCC","CCCCCCCCC","CCCCCCCCC","C#######C","#########")
                    .where('S', controller(blocks(definition.get())))
                    .where('C', blocks(CASING_STAINLESS_CLEAN.get())
                            .or(Predicates.abilities(PartAbility.MAINTENANCE))
                            .or(abilities(PartAbility.INPUT_ENERGY).setMinGlobalLimited(1).setMinGlobalLimited(2))
                            .or(Predicates.abilities(PartAbility.IMPORT_ITEMS))
                            .or(Predicates.abilities(PartAbility.IMPORT_FLUIDS))
                            .or(Predicates.abilities(PartAbility.EXPORT_ITEMS))
                            .or(Predicates.abilities(PartAbility.EXPORT_FLUIDS)))
                    .where('G', blocks(CASING_LAMINATED_GLASS.get()))
                    .where('T', heatingCoils())
                    .where('#', Predicates.any())
                    .build())
            .shapeInfos(definition -> {
                List<MultiblockShapeInfo> shapeInfo = new ArrayList<>();
                var builder = MultiblockShapeInfo.builder()
                        .aisle("C#######C","C#######C","CCCCCCCCC","CCCCCCCCC","CCCCCCCCC","C#######C","#########")
                        .aisle("#########","CCCCCCCCC","G#######G","G#######G","G#######G","CCCCCCCCC","C#######C")
                        .aisle("CCCCCCCDL","G#######G","G#######G","G#######G","G#######G","G#######G","CCCCCCCCC")
                        .aisle("SCCCCCCCE","G#######G","G#######G","G#######G","G#######G","G#######G","CTTTTTTTC")
                        .aisle("MCCCCCCQO","G#######G","G#######G","G#######G","G#######G","G#######G","CCCCCCCCC")
                        .aisle("#########","CCCCCCCCC","G#######G","G#######G","G#######G","CCCCCCCCC","C#######C")
                        .aisle("C#######C","C#######C","CCCCCCCCC","CCCCCCCCC","CCCCCCCCC","C#######C","#########")
                        .where('S', definition, Direction.EAST)
                        .where('C', CASING_STAINLESS_CLEAN.getDefaultState())
                        .where('G', CASING_LAMINATED_GLASS.getDefaultState())
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
            .workableCasingRenderer(GTCEu.id("block/casings/solid/machine_casing_clean_stainless_steel"),
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

    public static void init() {

    }


}
