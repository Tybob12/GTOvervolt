package com.tybob14.gtovervolt.data.recipe.removal;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GTRecipeRemoval {

    public static void init(Consumer<ResourceLocation> registry) {
        removeCircuitRecipes(registry);
    }


    private static void removeCircuitRecipes(Consumer<ResourceLocation> registry) {
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/microprocessor_lv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/microprocessor_lv_soc"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/microprocessor_lv_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/microprocessor_lv_soc_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/processor_mv_soc"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/processor_mv_soc_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/processor_assembly_hv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/processor_assembly_hv_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/nano_processor_hv_soc"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/nano_processor_hv_soc_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/nano_processor_assembly_ev"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/nano_processor_assembly_ev_asmd"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/nano_processor_assembly_ev_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/nano_processor_assembly_ev_asmd_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_processor_ev"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_processor_ev_asmd"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_processor_ev_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_processor_ev_asmd_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_processor_ev_soc"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_processor_ev_soc_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_assembly_iv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_assembly_iv_asmd"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_assembly_iv_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_assembly_iv_asmd_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_computer_luv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_computer_luv_asmd"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_computer_luv_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/quantum_computer_luv_asmd_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_processor_iv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_processor_iv_soc"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_processor_iv_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_processor_iv_soc_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_assembly_luv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_assembly_luv_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_computer_zpm"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/crystal_computer_zpm_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:assembly_line/crystal_mainframe_uv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/neuro_processor"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/wetware_processor_luv"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/wetware_processor_luv_soc"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/wetware_processor_luv_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/wetware_processor_luv_soc_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/wetware_processor_assembly_zpm"));
        registry.accept(new ResourceLocation("gtceu:circuit_assembler/wetware_processor_assembly_zpm_soldering_alloy"));
        registry.accept(new ResourceLocation("gtceu:assembly_line/wetware_super_computer_uv"));
        registry.accept(new ResourceLocation("gtceu:assembly_line/wetware_mainframe_uhv"));
        registry.accept(new ResourceLocation("gtceu:research_station/1_x_gtceu_crystal_processor_computer"));
        registry.accept(new ResourceLocation("gtceu:research_station/1_x_gtceu_wetware_processor_assembly"));
        registry.accept(new ResourceLocation("gtceu:research_station/1_x_gtceu_wetware_processor_computer"));
        registry.accept(new ResourceLocation("gtceu:chemical_reactor/fiber_board"));
        registry.accept(new ResourceLocation("gtceu:chemical_reactor/extreme_circuit_board_iron3"));
        registry.accept(new ResourceLocation("gtceu:chemical_reactor/extreme_circuit_board_persulfate"));
        registry.accept(new ResourceLocation("gtceu:large_chemical_reactor/fiber_board"));
        registry.accept(new ResourceLocation("gtceu:large_chemical_reactor/extreme_circuit_board_iron3"));
        registry.accept(new ResourceLocation("gtceu:large_chemical_reactor/extreme_circuit_board_persulfate"));
    }

}
