package com.tybob14.gtovervolt.data.recipe.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.common.data.GCyMRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.GTOVMachines;
import com.tybob14.gtovervolt.common.data.GTOVRecipeTypes;
import com.tybob14.gtovervolt.common.data.materials.ChemistryMaterials;
import com.tybob14.gtovervolt.common.data.materials.PrimaryMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.CIRCUIT_ASSEMBLER;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.tybob14.gtovervolt.common.data.materials.IntegratedMaterials.EnergeticAlloy;

public class GTOVCircuitRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {

        /*
            Plastic - Copper and Annealed Copper                            Plastic - Copper and Copper
            Expoy - Electrum and Gold                                       Advanced - Electrum and Gold
            Fiber Reinforced - Annealed Copper                              More andvanced: Fiber Reinforced - Aluminium and Energetic
            Multi Layered - Platinum and Palladium                          Elite: Multi layered - Platinum and Palladium
            Wetware - Niobium Titanium                                      Wetware -Niobium Titanium
         */

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("polyethylene_to_plastic_boards")).EUt(22).duration(665)
                .inputItems(new UnificationEntry(plate, Polyethylene))
                .inputItems(new UnificationEntry(foil, Copper), 16)
                .inputItems(new UnificationEntry(foil, AnnealedCopper), 16)
                .inputFluids(Iron3Chloride.getFluid(250))
                .inputFluids(SulfuricAcid.getFluid(500))
                .circuitMeta(1)
                .outputItems(PLASTIC_CIRCUIT_BOARD, 8)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("pcv_to_plastic_boards")).EUt(90).duration(550)
                .inputItems(new UnificationEntry(plate, PolyvinylChloride))
                .inputItems(new UnificationEntry(foil, Copper), 22)
                .inputItems(new UnificationEntry(foil, AnnealedCopper), 22)
                .inputFluids(Iron3Chloride.getFluid(353))
                .inputFluids(SulfuricAcid.getFluid(707))
                .circuitMeta(1)
                .outputItems(PLASTIC_CIRCUIT_BOARD, 12)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("ptfe_to_plastic_boards")).EUt(360).duration(450)
                .inputItems(new UnificationEntry(plate, Polytetrafluoroethylene))
                .inputItems(new UnificationEntry(foil, Copper), 27)
                .inputItems(new UnificationEntry(foil, AnnealedCopper), 27)
                .inputFluids(Iron3Chloride.getFluid(433))
                .inputFluids(SulfuricAcid.getFluid(866))
                .circuitMeta(1)
                .outputItems(PLASTIC_CIRCUIT_BOARD, 16)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("epoxy_to_plastic_boards")).EUt(1440).duration(360)
                .inputItems(new UnificationEntry(plate, Epoxy))
                .inputItems(new UnificationEntry(foil, Copper), 32)
                .inputItems(new UnificationEntry(foil, AnnealedCopper), 32)
                .inputFluids(Iron3Chloride.getFluid(500))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .circuitMeta(1)
                .outputItems(PLASTIC_CIRCUIT_BOARD, 23)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("fiber_epoxy_to_plastic_boards")).EUt(5760).duration(300)
                .inputItems(new UnificationEntry(plate, ReinforcedEpoxyResin))
                .inputItems(new UnificationEntry(foil, Copper), 35)
                .inputItems(new UnificationEntry(foil, AnnealedCopper), 35)
                .inputFluids(Iron3Chloride.getFluid(559))
                .inputFluids(SulfuricAcid.getFluid(1118))
                .circuitMeta(1)
                .outputItems(PLASTIC_CIRCUIT_BOARD, 32)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("pbi_to_plastic_boards")).EUt(23040).duration(240)
                .inputItems(new UnificationEntry(plate, Polybenzimidazole))
                .inputItems(new UnificationEntry(foil, Copper), 39)
                .inputItems(new UnificationEntry(foil, AnnealedCopper), 39)
                .inputFluids(Iron3Chloride.getFluid(612))
                .inputFluids(SulfuricAcid.getFluid(1224))
                .circuitMeta(1)
                .outputItems(PLASTIC_CIRCUIT_BOARD, 46)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("pcv_to_epoxy_boards")).EUt(90).duration(550)
                .inputItems(new UnificationEntry(plate, PolyvinylChloride))
                .inputItems(new UnificationEntry(foil, Gold), 16)
                .inputItems(new UnificationEntry(foil, Electrum), 16)
                .inputFluids(Iron3Chloride.getFluid(500))
                .inputFluids(SulfuricAcid.getFluid(500))
                .circuitMeta(1)
                .outputItems(ADVANCED_CIRCUIT_BOARD, 8)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("ptfe_to_epoxy_boards")).EUt(360).duration(450)
                .inputItems(new UnificationEntry(plate, Polytetrafluoroethylene))
                .inputItems(new UnificationEntry(foil, Gold), 22)
                .inputItems(new UnificationEntry(foil, Electrum), 22)
                .inputFluids(Iron3Chloride.getFluid(707))
                .inputFluids(SulfuricAcid.getFluid(707))
                .circuitMeta(1)
                .outputItems(ADVANCED_CIRCUIT_BOARD, 12)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("epoxy_to_epoxy_boards")).EUt(1440).duration(360)
                .inputItems(new UnificationEntry(plate, Epoxy))
                .inputItems(new UnificationEntry(foil, Gold), 27)
                .inputItems(new UnificationEntry(foil, Electrum), 27)
                .inputFluids(Iron3Chloride.getFluid(866))
                .inputFluids(SulfuricAcid.getFluid(866))
                .circuitMeta(1)
                .outputItems(ADVANCED_CIRCUIT_BOARD, 16)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("fiber_epoxy_to_epoxy_boards")).EUt(5760).duration(300)
                .inputItems(new UnificationEntry(plate, ReinforcedEpoxyResin))
                .inputItems(new UnificationEntry(foil, Gold), 32)
                .inputItems(new UnificationEntry(foil, Electrum), 32)
                .inputFluids(Iron3Chloride.getFluid(1000))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .circuitMeta(1)
                .outputItems(ADVANCED_CIRCUIT_BOARD, 23)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("pbi_to_epoxy_boards")).EUt(23040).duration(240)
                .inputItems(new UnificationEntry(plate, Polybenzimidazole))
                .inputItems(new UnificationEntry(foil, Gold), 35)
                .inputItems(new UnificationEntry(foil, Electrum), 35)
                .inputFluids(Iron3Chloride.getFluid(1118))
                .inputFluids(SulfuricAcid.getFluid(1118))
                .circuitMeta(1)
                .outputItems(ADVANCED_CIRCUIT_BOARD, 32)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("ptfe_to_fiber_epoxy_boards")).EUt(360).duration(450)
                .inputItems(new UnificationEntry(plate, Polytetrafluoroethylene))
                .inputItems(new UnificationEntry(foil, Aluminium), 16)
                .inputItems(new UnificationEntry(foil, EnergeticAlloy), 16)
                .inputFluids(Iron3Chloride.getFluid(1000))
                .inputFluids(SulfuricAcid.getFluid(500))
                .circuitMeta(1)
                .outputItems(EXTREME_CIRCUIT_BOARD, 8)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("epoxy_to_fiber_epoxy_boards")).EUt(1440).duration(360)
                .inputItems(new UnificationEntry(plate, Epoxy))
                .inputItems(new UnificationEntry(foil, Aluminium), 22)
                .inputItems(new UnificationEntry(foil, EnergeticAlloy), 22)
                .inputFluids(Iron3Chloride.getFluid(1414))
                .inputFluids(SulfuricAcid.getFluid(707))
                .circuitMeta(1)
                .outputItems(EXTREME_CIRCUIT_BOARD, 12)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("fiber_epoxy_to_fiber_epoxy_boards")).EUt(5760).duration(300)
                .inputItems(new UnificationEntry(plate, ReinforcedEpoxyResin))
                .inputItems(new UnificationEntry(foil, Aluminium), 27)
                .inputItems(new UnificationEntry(foil, EnergeticAlloy), 27)
                .inputFluids(Iron3Chloride.getFluid(1732))
                .inputFluids(SulfuricAcid.getFluid(866))
                .circuitMeta(1)
                .outputItems(EXTREME_CIRCUIT_BOARD, 16)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("pbi_to_fiber_epoxy_boards")).EUt(23040).duration(240)
                .inputItems(new UnificationEntry(plate, Polybenzimidazole))
                .inputItems(new UnificationEntry(foil, Aluminium), 32)
                .inputItems(new UnificationEntry(foil, EnergeticAlloy), 32)
                .inputFluids(Iron3Chloride.getFluid(2000))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .circuitMeta(1)
                .outputItems(EXTREME_CIRCUIT_BOARD, 23)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("epoxy_to_fiber_multi_epoxy_boards")).EUt(1440).duration(360)
                .inputItems(new UnificationEntry(plate, Epoxy))
                .inputItems(new UnificationEntry(foil, Palladium), 16)
                .inputItems(new UnificationEntry(foil, Platinum), 16)
                .inputFluids(Iron3Chloride.getFluid(2000))
                .inputFluids(SulfuricAcid.getFluid(500))
                .circuitMeta(1)
                .outputItems(ELITE_CIRCUIT_BOARD, 8)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("fiber_epoxy_to_multi_fiber_epoxy_boards")).EUt(5760).duration(300)
                .inputItems(new UnificationEntry(plate, ReinforcedEpoxyResin))
                .inputItems(new UnificationEntry(foil, Palladium), 22)
                .inputItems(new UnificationEntry(foil, Platinum), 22)
                .inputFluids(Iron3Chloride.getFluid(2828))
                .inputFluids(SulfuricAcid.getFluid(707))
                .circuitMeta(1)
                .outputItems(ELITE_CIRCUIT_BOARD, 12)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("pbi_to_mutli_fiber_epoxy_boards")).EUt(23040).duration(240)
                .inputItems(new UnificationEntry(plate, Polybenzimidazole))
                .inputItems(new UnificationEntry(foil, Palladium), 27)
                .inputItems(new UnificationEntry(foil, Platinum), 27)
                .inputFluids(Iron3Chloride.getFluid(3464))
                .inputFluids(SulfuricAcid.getFluid(866))
                .circuitMeta(1)
                .outputItems(ELITE_CIRCUIT_BOARD, 16)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("fiber_epoxy_to_wetware_boards")).EUt(5760).duration(300)
                .inputItems(new UnificationEntry(plate, ReinforcedEpoxyResin))
                .inputItems(new UnificationEntry(foil, Holmium), 16)
                .inputItems(new UnificationEntry(foil, NiobiumTitanium), 16)
                .inputFluids(Iron3Chloride.getFluid(5000))
                .inputFluids(SulfuricAcid.getFluid(500))
                .inputFluids(SterileGrowthMedium.getFluid(2000))
                .circuitMeta(1)
                .outputItems(WETWARE_CIRCUIT_BOARD, 8)
                .save(provider);

        GTOVRecipeTypes.PCB_FACTORY_RECIPES.recipeBuilder(GTOvervolt.id("pbi_to_wetware_boards")).EUt(23040).duration(240)
                .inputItems(new UnificationEntry(plate, Polybenzimidazole))
                .inputItems(new UnificationEntry(foil, Palladium), 22)
                .inputItems(new UnificationEntry(foil, Platinum), 22)
                .inputFluids(Iron3Chloride.getFluid(7071))
                .inputFluids(SulfuricAcid.getFluid(707))
                .inputFluids(SterileGrowthMedium.getFluid(2828))
                .circuitMeta(1)
                .outputItems(WETWARE_CIRCUIT_BOARD, 12)
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("fiber_board")).EUt(30).duration(1200)
                .inputItems(new UnificationEntry(plate, ReinforcedEpoxyResin))
                .inputItems(new UnificationEntry(foil, Aluminium), 8)
                .inputFluids(SulfuricAcid.getFluid(125))
                .outputItems(FIBER_BOARD)
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("fiber_circuit_board_iron3")).EUt(30).duration(1200)
                .inputItems(FIBER_BOARD)
                .inputItems(new UnificationEntry(foil, EnergeticAlloy), 12)
                .inputFluids(Iron3Chloride.getFluid(1000))
                .outputItems(EXTREME_CIRCUIT_BOARD)
                .save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("fiber_circuit_board_persulfate")).EUt(30).duration(1200)
                .inputItems(FIBER_BOARD)
                .inputItems(new UnificationEntry(foil, EnergeticAlloy), 12)
                .inputFluids(SodiumPersulfate.getFluid(2000))
                .outputItems(EXTREME_CIRCUIT_BOARD)
                .save(provider);

        ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("circuit_assembly_line")).EUt(300000).duration(2000)
                .inputItems(CIRCUIT_ASSEMBLER[LuV])
                .inputItems(ROBOT_ARM_LuV, 4)
                .inputItems(ELECTRIC_MOTOR_LuV, 4)
                .inputItems(FIELD_GENERATOR_LuV)
                .inputItems(EMITTER_LuV)
                .inputItems(SENSOR_LuV)
                .inputItems(plate, RhodiumPlatedPalladium, 8)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(1440))
                .outputItems(GTOVMachines.CIRCUIT_ASSEMBLY_LINE.asStack())
                .scannerResearch(b -> b
                        .researchStack(CIRCUIT_ASSEMBLER[LuV].asStack())
                        .EUt(30)
                        .duration(1200))
                .save(provider);

        ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("pcb_factory")).EUt(300000).duration(2000)
                .inputItems(frameGt, Neutronium, 32)
                .inputItems(CIRCUIT_ASSEMBLER[ZPM], 4)
                .inputItems(CustomTags.LuV_CIRCUITS, 16)
                .inputItems(ROBOT_ARM_ZPM)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(5184))
                .inputFluids(Naquadah.getFluid(2592))
                .outputItems(GTOVMachines.PCB_FACTORY.asStack())
                .scannerResearch(b -> b
                        .researchStack(WETWARE_BOARD.asStack())
                        .EUt(30)
                        .duration(1200))
                .save(provider);

        GCyMRecipeTypes.ALLOY_BLAST_RECIPES.recipeBuilder(GTOvervolt.id("microprocessor_lv")).EUt(7680).duration(800)
                .inputItems(dust, Bismuth, 47)
                .inputItems(dust, Lead, 25)
                .inputItems(dust, Tin, 13)
                .inputItems(dust, Cadmium, 10)
                .inputItems(dust, Indium, 5)
                .outputFluids(PrimaryMaterials.Indalloy140.getFluid(14400))
                .blastFurnaceTemp(2700)
                .circuitMeta(5)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("microprocessor_lv")).EUt(60).duration(200)
                .inputItems(PLASTIC_CIRCUIT_BOARD)
                .inputItems(CENTRAL_PROCESSING_UNIT)
                .inputItems(CustomTags.RESISTORS, 2)
                .inputItems(CustomTags.CAPACITORS, 2)
                .inputItems(CustomTags.TRANSISTORS, 2)
                .inputItems(wireFine, Copper, 2)
                .outputItems(MICROPROCESSOR_LV, 2)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("microprocessor_lv_soc")).EUt(600).duration(50)
                .inputItems(PLASTIC_CIRCUIT_BOARD)
                .inputItems(SYSTEM_ON_CHIP)
                .inputItems(wireFine, Copper, 2)
                .inputItems(bolt, Tin, 2)
                .outputItems(MICROPROCESSOR_LV, 2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("microprocessor_lv_soc_line")).EUt(600).duration(50)
                .inputItems(PLASTIC_CIRCUIT_BOARD, 16)
                .inputItems(SYSTEM_ON_CHIP, 16)
                .inputItems(wireGtDouble, Copper, 2)
                .inputItems(bolt, Tin, 32)
                .outputItems(MICROPROCESSOR_LV, 32)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("processor_mv_soc")).EUt(2400).duration(50)
                .inputItems(PLASTIC_CIRCUIT_BOARD)
                .inputItems(SYSTEM_ON_CHIP)
                .inputItems(wireFine, RedAlloy, 4)
                .inputItems(bolt, AnnealedCopper, 4)
                .outputItems(PROCESSOR_MV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("processor_mv_soc_line")).EUt(600).duration(50)
                .inputItems(PLASTIC_CIRCUIT_BOARD, 16)
                .inputItems(SYSTEM_ON_CHIP, 16)
                .inputItems(wireGtDouble, RedAlloy, 4)
                .inputItems(bolt, AnnealedCopper, 64)
                .outputItems(PROCESSOR_MV, 16)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("processor_assembly_hv")).EUt(VA[MV]).duration(400)
                .inputItems(PLASTIC_CIRCUIT_BOARD)
                .inputItems(PROCESSOR_MV, 2)
                .inputItems(CustomTags.INDUCTORS, 4)
                .inputItems(CustomTags.CAPACITORS, 8)
                .inputItems(RANDOM_ACCESS_MEMORY, 4)
                .inputItems(wireFine, RedAlloy, 8)
                .outputItems(PROCESSOR_ASSEMBLY_HV, 1)
                .solderMultiplier(2)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("nano_processor_hv_soc")).EUt(9600).duration(50)
                .inputItems(ADVANCED_CIRCUIT_BOARD, 6)
                .inputItems(ADVANCED_SYSTEM_ON_CHIP, 6)
                .inputItems(wireFine, Electrum, 48)
                .inputItems(bolt, Platinum, 48)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .outputItems(NANO_PROCESSOR_HV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("nano_processor_hv_soc_line")).EUt(600).duration(50)
                .inputItems(ADVANCED_CIRCUIT_BOARD, 16)
                .inputItems(ADVANCED_SYSTEM_ON_CHIP, 16)
                .inputItems(wireGtDouble, Electrum, 8)
                .inputItems(bolt, Platinum, 64)
                .outputItems(NANO_PROCESSOR_HV, 16)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("nano_processor_assembly_ev")).EUt(600).duration(400)
                .inputItems(ADVANCED_CIRCUIT_BOARD)
                .inputItems(NANO_PROCESSOR_HV, 2)
                .inputItems(SMD_INDUCTOR, 8)
                .inputItems(SMD_CAPACITOR, 8)
                .inputItems(RANDOM_ACCESS_MEMORY, 8)
                .inputItems(wireFine, Electrum, 16)
                .outputItems(NANO_PROCESSOR_ASSEMBLY_EV, 1)
                .solderMultiplier(2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("nano_processor_assembly_ev_asmd")).EUt(600).duration(200)
                .inputItems(ADVANCED_CIRCUIT_BOARD)
                .inputItems(NANO_PROCESSOR_HV, 2)
                .inputItems(ADVANCED_SMD_INDUCTOR, 2)
                .inputItems(ADVANCED_SMD_CAPACITOR, 2)
                .inputItems(RANDOM_ACCESS_MEMORY, 8)
                .inputItems(wireFine, Electrum, 16)
                .outputItems(NANO_PROCESSOR_ASSEMBLY_EV, 1)
                .solderMultiplier(2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_processor_ev")).EUt(2400).duration(200)
                .inputItems(EXTREME_CIRCUIT_BOARD)
                .inputItems(QUBIT_CENTRAL_PROCESSING_UNIT)
                .inputItems(NANO_CENTRAL_PROCESSING_UNIT)
                .inputItems(SMD_CAPACITOR, 12)
                .inputItems(SMD_TRANSISTOR, 12)
                .inputItems(wireFine, Platinum, 16)
                .outputItems(QUANTUM_PROCESSOR_EV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_processor_ev_asmd")).EUt(2400).duration(100)
                .inputItems(EXTREME_CIRCUIT_BOARD)
                .inputItems(QUBIT_CENTRAL_PROCESSING_UNIT)
                .inputItems(NANO_CENTRAL_PROCESSING_UNIT)
                .inputItems(ADVANCED_SMD_CAPACITOR, 3)
                .inputItems(ADVANCED_SMD_TRANSISTOR, 3)
                .inputItems(wireFine, Platinum, 16)
                .outputItems(QUANTUM_PROCESSOR_EV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_processor_ev_soc")).EUt(38400).duration(50)
                .inputItems(EXTREME_CIRCUIT_BOARD, 6)
                .inputItems(ADVANCED_SYSTEM_ON_CHIP, 6)
                .inputItems(wireFine, Platinum, 64)
                .inputItems(bolt, NiobiumTitanium, 48)
                .outputItems(QUANTUM_PROCESSOR_EV, 1)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("quantum_processor_ev_soc_line")).EUt(600).duration(50)
                .inputItems(EXTREME_CIRCUIT_BOARD, 16)
                .inputItems(ADVANCED_SYSTEM_ON_CHIP, 16)
                .inputItems(wireGtQuadruple, Platinum, 16)
                .inputItems(bolt, NiobiumTitanium, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(72))
                .outputItems(QUANTUM_PROCESSOR_EV, 16)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_assembly_iv")).EUt(2400).duration(400)
                .inputItems(EXTREME_CIRCUIT_BOARD)
                .inputItems(QUANTUM_PROCESSOR_EV, 2)
                .inputItems(SMD_INDUCTOR, 8)
                .inputItems(SMD_CAPACITOR, 16)
                .inputItems(RANDOM_ACCESS_MEMORY, 4)
                .inputItems(wireFine, Platinum, 16)
                .outputItems(QUANTUM_ASSEMBLY_IV, 1)
                .solderMultiplier(2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_assembly_iv_asmd")).EUt(2400).duration(200)
                .inputItems(EXTREME_CIRCUIT_BOARD)
                .inputItems(QUANTUM_PROCESSOR_EV, 2)
                .inputItems(ADVANCED_SMD_INDUCTOR, 2)
                .inputItems(ADVANCED_SMD_CAPACITOR, 4)
                .inputItems(RANDOM_ACCESS_MEMORY, 4)
                .inputItems(wireFine, Platinum, 16)
                .outputItems(QUANTUM_ASSEMBLY_IV, 1)
                .solderMultiplier(2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_computer_luv")).EUt(2400).duration(400)
                .inputItems(EXTREME_CIRCUIT_BOARD)
                .inputItems(QUANTUM_ASSEMBLY_IV, 2)
                .inputItems(SMD_DIODE, 8)
                .inputItems(NOR_MEMORY_CHIP, 4)
                .inputItems(RANDOM_ACCESS_MEMORY, 16)
                .inputItems(wireFine, Platinum, 48)
                .outputItems(QUANTUM_COMPUTER_LUV)
                .solderMultiplier(2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_computer_luv_asmd")).EUt(2400).duration(200)
                .inputItems(EXTREME_CIRCUIT_BOARD)
                .inputItems(QUANTUM_ASSEMBLY_IV, 2)
                .inputItems(ADVANCED_SMD_DIODE, 2)
                .inputItems(NOR_MEMORY_CHIP, 4)
                .inputItems(RANDOM_ACCESS_MEMORY, 16)
                .inputItems(wireFine, Platinum, 48)
                .outputItems(QUANTUM_COMPUTER_LUV)
                .solderMultiplier(2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("crystal_processor_iv")).EUt(9600).duration(200)
                .inputItems(ELITE_CIRCUIT_BOARD, 6)
                .inputItems(CRYSTAL_CENTRAL_PROCESSING_UNIT, 6)
                .inputItems(NANO_CENTRAL_PROCESSING_UNIT, 12)
                .inputItems(ADVANCED_SMD_CAPACITOR, 36)
                .inputItems(ADVANCED_SMD_TRANSISTOR, 36)
                .inputItems(wireFine, NiobiumTitanium, 48)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .outputItems(CRYSTAL_PROCESSOR_IV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("crystal_processor_iv_soc")).EUt(86000).duration(100)
                .inputItems(ELITE_CIRCUIT_BOARD, 6)
                .inputItems(CRYSTAL_SYSTEM_ON_CHIP, 6)
                .inputItems(wireFine, NiobiumTitanium, 48)
                .inputItems(bolt, YttriumBariumCuprate, 48)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .outputItems(CRYSTAL_PROCESSOR_IV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("crystal_processor_iv_soc_line")).EUt(600).duration(50)
                .inputItems(ELITE_CIRCUIT_BOARD, 16)
                .inputItems(CRYSTAL_SYSTEM_ON_CHIP, 16)
                .inputItems(wireGtQuadruple, NiobiumTitanium, 8)
                .inputItems(bolt, YttriumBariumCuprate, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(72))
                .outputItems(CRYSTAL_PROCESSOR_IV, 16)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("crystal_assembly_luv")).EUt(9600).duration(400)
                .inputItems(ELITE_CIRCUIT_BOARD, 6)
                .inputItems(CRYSTAL_PROCESSOR_IV, 2)
                .inputItems(ADVANCED_SMD_INDUCTOR, 36)
                .inputItems(ADVANCED_SMD_CAPACITOR, 48)
                .inputItems(RANDOM_ACCESS_MEMORY, 64)
                .inputItems(wireFine, NiobiumTitanium, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(576))
                .outputItems(CRYSTAL_ASSEMBLY_LUV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("crystal_computer_zpm")).EUt(9600).duration(400)
                .inputItems(ELITE_CIRCUIT_BOARD, 6)
                .inputItems(CRYSTAL_ASSEMBLY_LUV, 2)
                .inputItems(RANDOM_ACCESS_MEMORY, 24)
                .inputItems(NOR_MEMORY_CHIP, 64)
                .inputItems(NAND_MEMORY_CHIP, 64)
                .inputItems(wireFine, NiobiumTitanium, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(576))
                .outputItems(CRYSTAL_COMPUTER_ZPM)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("crystal_mainframe_uv")).EUt(VA[LuV]).duration(800)
                .inputItems(frameGt, Aluminium, 12)
                .inputItems(CRYSTAL_COMPUTER_ZPM, 2)
                .inputItems(ADVANCED_SMD_INDUCTOR, 48)
                .inputItems(ADVANCED_SMD_CAPACITOR, 64)
                .inputItems(RANDOM_ACCESS_MEMORY, 64)
                .inputItems(wireGtSingle, IndiumTinBariumTitaniumCuprate, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(1152))
                .outputItems(CRYSTAL_MAINFRAME_UV)
                .save(provider);

        ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("neuro_processor")).EUt(80000).duration(600)
                .inputItems(WETWARE_CIRCUIT_BOARD)
                .inputItems(STEM_CELLS, 16)
                .inputItems(GLASS_TUBE, 16)
                .inputItems(pipeSmallFluid, Polybenzimidazole, 8)
                .inputItems(plate, NaquadahEnriched, 4)
                .inputItems(foil, SiliconeRubber, 64)
                .inputItems(bolt, TungstenSteel, 32)
                .inputFluids(SterileGrowthMedium.getFluid(250))
                .inputFluids(UUMatter.getFluid(250))
                .inputFluids(ChemistryMaterials.SuperCoolant.getFluid(1000))
                .outputItems(NEURO_PROCESSOR)
                .stationResearch(b -> b
                        .researchStack(STEM_CELLS.asStack())
                        .CWUt(16))
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("wetware_processor_luv")).EUt(38400).duration(200)
                .inputItems(NEURO_PROCESSOR, 6)
                .inputItems(CRYSTAL_CENTRAL_PROCESSING_UNIT, 6)
                .inputItems(NANO_CENTRAL_PROCESSING_UNIT, 6)
                .inputItems(ADVANCED_SMD_CAPACITOR, 48)
                .inputItems(ADVANCED_SMD_TRANSISTOR, 48)
                .inputItems(wireFine, YttriumBariumCuprate, 48)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .outputItems(WETWARE_PROCESSOR_LUV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("wetware_processor_luv_soc")).EUt(150000).duration(100)
                .inputItems(WETWARE_CIRCUIT_BOARD, 6)
                .inputItems(HIGHLY_ADVANCED_SOC, 6)
                .inputItems(wireFine, YttriumBariumCuprate, 48)
                .inputItems(bolt, Naquadah, 8) //Cosmic Neutronium
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(576))
                .outputItems(WETWARE_PROCESSOR_LUV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        GTOVRecipeTypes.CIRCUIT_ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("wetware_processor_luv_soc_line")).EUt(600).duration(50)
                .inputItems(WETWARE_CIRCUIT_BOARD, 16)
                .inputItems(HIGHLY_ADVANCED_SOC, 16)
                .inputItems(wireGtQuadruple, YttriumBariumCuprate, 8)
                .inputItems(bolt, Naquadah, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(144))
                .outputItems(WETWARE_PROCESSOR_LUV, 16)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("wetware_processor_assembly_zpm")).EUt(38400).duration(400)
                .inputItems(WETWARE_CIRCUIT_BOARD, 8)
                .inputItems(WETWARE_PROCESSOR_LUV, 2)
                .inputItems(ADVANCED_SMD_INDUCTOR, 48)
                .inputItems(ADVANCED_SMD_CAPACITOR, 64)
                .inputItems(RANDOM_ACCESS_MEMORY, 64)
                .inputItems(wireFine, YttriumBariumCuprate, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(576))
                .outputItems(WETWARE_PROCESSOR_ASSEMBLY_ZPM, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("wetware_super_computer_uv")).EUt(38400).duration(400)
                .inputItems(WETWARE_CIRCUIT_BOARD, 12)
                .inputItems(WETWARE_PROCESSOR_ASSEMBLY_ZPM, 2)
                .inputItems(ADVANCED_SMD_DIODE, 48)
                .inputItems(NOR_MEMORY_CHIP, 64)
                .inputItems(RANDOM_ACCESS_MEMORY, 64)
                .inputItems(wireFine, YttriumBariumCuprate, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(576))
                .outputItems(WETWARE_SUPER_COMPUTER_UV)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("wetware_mainframe_uhv_ext")).EUt(300000).duration(2000)
                .inputItems(frameGt, Tritanium, 2)
                .inputItems(WETWARE_SUPER_COMPUTER_UV, 2)
                .inputItems(ADVANCED_SMD_DIODE, 16)
                .inputItems(ADVANCED_SMD_CAPACITOR, 16)
                .inputItems(ADVANCED_SMD_TRANSISTOR, 16)
                .inputItems(ADVANCED_SMD_RESISTOR, 16)
                .inputItems(ADVANCED_SMD_INDUCTOR, 16)
                .inputItems(RANDOM_ACCESS_MEMORY, 32)
                .inputItems(wireGtDouble, UraniumRhodiumDinaquadide, 16)
                .inputItems(foil, Polybenzimidazole, 64)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(2880))
                .inputFluids(ChemistryMaterials.SuperCoolant.getFluid(10000))
                .inputFluids(Radon.getFluid(2500))
                .outputItems(WETWARE_MAINFRAME_UHV)
                .stationResearch(b -> b
                        .researchStack(WETWARE_SUPER_COMPUTER_UV.asStack())
                        .CWUt(96))
                .save(provider);
    }
}
