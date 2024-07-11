package com.tybob14.gtovervolt.data.recipe.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.config.ConfigHolder;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.materials.ChemistryMaterials;
import com.tybob14.gtovervolt.common.data.materials.PrimaryMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;


import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;


public class GTOVCircuitRecipes {

    public static void init(Consumer<FinishedRecipe> provider) {


        // Microprocessor LV
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("microprocessor_lv")).EUt(60).duration(200)
                .inputItems(PLASTIC_CIRCUIT_BOARD)
                .inputItems(CENTRAL_PROCESSING_UNIT)
                .inputItems(CustomTags.RESISTORS, 2)
                .inputItems(CustomTags.CAPACITORS, 2)
                .inputItems(CustomTags.TRANSISTORS, 2)
                .inputItems(wireFine, Copper, 2)
                .outputItems(MICROPROCESSOR_LV,  2)
                .save(provider);

        // Microprocessor LV SoC
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("microprocessor_lv_soc")).EUt(600).duration(50)
                .inputItems(PLASTIC_CIRCUIT_BOARD)
                .inputItems(SYSTEM_ON_CHIP)
                .inputItems(wireFine, Copper, 2)
                .inputItems(bolt, Tin, 2)
                .outputItems(MICROPROCESSOR_LV, 2)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        // MV SoC
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("processor_mv_soc")).EUt(2400).duration(50)
                .inputItems(PLASTIC_CIRCUIT_BOARD)
                .inputItems(SYSTEM_ON_CHIP)
                .inputItems(wireFine, RedAlloy, 4)
                .inputItems(bolt, AnnealedCopper, 4)
                .outputItems(PROCESSOR_MV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        // HV
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

        // T4: Nano ====================================================================================================

        // HV SoC
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("nano_processor_hv_soc")).EUt(9600).duration(50)
                .inputItems(ADVANCED_CIRCUIT_BOARD, 6)
                .inputItems(ADVANCED_SYSTEM_ON_CHIP,6)
                .inputItems(wireFine, Electrum, 48)
                .inputItems(bolt, Platinum, 48)
                .outputItems(NANO_PROCESSOR_HV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        // EV
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

        // T5: Quantum =================================================================================================

        // EV
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

        // EV SoC
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("quantum_processor_ev_soc")).EUt(38400).duration(50)
                .inputItems(EXTREME_CIRCUIT_BOARD, 6)
                .inputItems(ADVANCED_SYSTEM_ON_CHIP, 6)
                .inputItems(wireFine, Platinum, 64)
                .inputItems(bolt, NiobiumTitanium, 48)
                .outputItems(QUANTUM_PROCESSOR_EV, 1)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        // IV
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

        // LuV
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
        // T6: Crystal =================================================================================================

        // IV
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

        // IV SoC
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("crystal_processor_iv_soc")).EUt(86000).duration(100)
                .inputItems(ELITE_CIRCUIT_BOARD, 6)
                .inputItems(CRYSTAL_SYSTEM_ON_CHIP, 6)
                .inputItems(wireFine, NiobiumTitanium, 48)
                .inputItems(bolt, YttriumBariumCuprate, 48)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .outputItems(CRYSTAL_PROCESSOR_IV, 1 )
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        // LuV
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

        // ZPM
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

        // UV
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("crystal_mainframe_uv")).EUt(VA[LuV]).duration(800)
                .inputItems(frameGt, Aluminium, 12)
                .inputItems(CRYSTAL_COMPUTER_ZPM, 2)
                .inputItems(ADVANCED_SMD_INDUCTOR, 48)
                .inputItems(ADVANCED_SMD_CAPACITOR, 64)
                .inputItems(RANDOM_ACCESS_MEMORY, 64)
                .inputItems(wireGtSingle, NiobiumTitanium, 64)
                .inputFluids(SolderingAlloy.getFluid(L * 8))
                .outputItems(CRYSTAL_MAINFRAME_UV)
                .save(provider);

        // T7: Wetware =================================================================================================

        // Neuro Processing Unit
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

        // LuV
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("wetware_processor_luv")).EUt(38400).duration(200)
                .inputItems(NEURO_PROCESSOR, 6)
                .inputItems(CRYSTAL_CENTRAL_PROCESSING_UNIT, 6)
                .inputItems(NANO_CENTRAL_PROCESSING_UNIT,6)
                .inputItems(ADVANCED_SMD_CAPACITOR, 48)
                .inputItems(ADVANCED_SMD_TRANSISTOR, 48)
                .inputItems(wireFine, YttriumBariumCuprate, 48)
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(288))
                .outputItems(WETWARE_PROCESSOR_LUV, 1)
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        // SoC LuV
        CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(GTOvervolt.id("wetware_processor_luv_soc")).EUt(150000).duration(100)
                .inputItems(WETWARE_CIRCUIT_BOARD, 6)
                .inputItems(HIGHLY_ADVANCED_SOC, 6)
                .inputItems(wireFine, YttriumBariumCuprate, 48)
                .inputItems(bolt, Naquadah, 8) //Cosmic Neutronium
                .inputFluids(PrimaryMaterials.Indalloy140.getFluid(576))
                .outputItems(WETWARE_PROCESSOR_LUV, 1 )
                .cleanroom(CleanroomType.CLEANROOM)
                .save(provider);

        // ZPM
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

        // UV
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

        // UHV
        ASSEMBLY_LINE_RECIPES.recipeBuilder(GTOvervolt.id("wetware_mainframe_uhv_ext")).EUt(300000).duration(2000)
                .inputItems(frameGt, Tritanium, 2)
                .inputItems(WETWARE_SUPER_COMPUTER_UV, 2)
                .inputItems(ADVANCED_SMD_DIODE, 16)
                .inputItems(ADVANCED_SMD_CAPACITOR, 16)
                .inputItems(ADVANCED_SMD_TRANSISTOR, 16)
                .inputItems(ADVANCED_SMD_RESISTOR, 16)
                .inputItems(ADVANCED_SMD_INDUCTOR, 16)
                .inputItems(RANDOM_ACCESS_MEMORY, 32)
                .inputItems(wireGtDouble, EnrichedNaquadahTriniumEuropiumDuranide, 16)
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
