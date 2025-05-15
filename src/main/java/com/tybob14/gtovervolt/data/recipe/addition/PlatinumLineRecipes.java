package com.tybob14.gtovervolt.data.recipe.addition;

import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.materials.ChemistryMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class PlatinumLineRecipes {
    public static void init(Consumer<FinishedRecipe> provider) {
        platinumLineProcesses(provider);
    }

    public static void platinumLineProcesses(Consumer<FinishedRecipe> provider) {

        // Platinum Metallic Powder processing
        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id(("dissolve_platinum_metallic_powder")))
                .inputItems(dust, ChemistryMaterials.PlatinumMetallicPowder)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(1000))
                .outputItems(dustTiny, ChemistryMaterials.PlatinumResidue)
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("dissolve_platinum_metallic_powder_9x"))
                .inputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 9)
                .circuitMeta(9)
                .inputFluids(AquaRegia.getFluid(9000))
                .outputItems(dust, ChemistryMaterials.PlatinumResidue)
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(9000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("dissolve_bornite_for_platline"))
                .inputItems(crushedPurified, Bornite, 9)
                .inputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, ChemistryMaterials.PlatinumResidue)
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("dissolve_chalcopyrite_for_platline"))
                .inputItems(crushedPurified, Chalcopyrite, 9)
                .inputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, ChemistryMaterials.PlatinumResidue)
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("dissolve_cooperite_for_platline"))
                .inputItems(crushedPurified, Cooperite, 9)
                .inputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, ChemistryMaterials.PlatinumResidue)
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("dissolve_tetrahedrite_for_platline"))
                .inputItems(crushedPurified, Tetrahedrite, 9)
                .inputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, ChemistryMaterials.PlatinumResidue)
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("dissolve_pentlandite_for_platline"))
                .inputItems(crushedPurified, Pentlandite, 9)
                .inputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 9)
                .inputFluids(AquaRegia.getFluid(10000))
                .outputItems(dust, ChemistryMaterials.PlatinumResidue)
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(10000))
                .duration(2250).EUt(VA[LV]).save(provider);

        // Platinum Concentrate Processing

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("tiny_platinum_dusts"))
                .inputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(2000))
                .inputItems(dustSmall, AmmoniumChloride, 2)
                .circuitMeta(1)
                .outputItems(dustTiny, ChemistryMaterials.PlatinumSalt, 16)
                .outputItems(dustTiny, ChemistryMaterials.ReprecipitatedPlatinum, 4)
                .outputFluids(ChemistryMaterials.PalladiumEnrichedAmmonia.getFluid(400))
                .outputFluids(NitrogenDioxide.getFluid(1000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
                .duration(1200).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("large_platinum_dusts"))
                .inputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(18000))
                .inputItems(dust, AmmoniumChloride, 2)
                .circuitMeta(1)
                .outputItems(dust, ChemistryMaterials.PlatinumSalt, 16)
                .outputItems(dust, ChemistryMaterials.ReprecipitatedPlatinum, 4)
                .outputFluids(ChemistryMaterials.PalladiumEnrichedAmmonia.getFluid(3600))
                .outputFluids(NitrogenDioxide.getFluid(9000))
                .outputFluids(DilutedHydrochloricAcid.getFluid(9000))
                .duration(1400).EUt(VA[HV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("palladium_metallic_powder_conversion"))
                .inputItems(dust, ChemistryMaterials.PalladiumMetallicPowder)
                .circuitMeta(1)
                .inputFluids(Ammonia.getFluid(1000))
                .outputFluids(ChemistryMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        // Platinum Dust <------ First Platline Output

        CHEMICAL_RECIPES.recipeBuilder("raw_platinum_separation")
                .inputItems(dust, ChemistryMaterials.ReprecipitatedPlatinum, 4)
                .inputItems(dust, Calcium, 1)
                .outputItems(dust, Platinum, 2)
                .outputItems(dust, CalciumChloride, 3)
                .duration(30).EUt(VA[LV]).save(provider);

        // Palladium Metallic Powder Processing

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("low_yeild_palladium_salt"))
                .inputFluids(ChemistryMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .circuitMeta(2)
                .outputItems(dust, ChemistryMaterials.PalladiumSalt, 1)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("tiny_palladium_dusts"))
                .inputItems(dust, ChemistryMaterials.PalladiumMetallicPowder, 1)
                .inputFluids(ChemistryMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
                .circuitMeta(1)
                .outputItems(dustTiny, ChemistryMaterials.PalladiumSalt, 16)
                .outputItems(dustTiny, ChemistryMaterials.ReprecipitatedPalladium, 4)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("large_palladium_dusts"))
                .inputItems(dust, ChemistryMaterials.PalladiumMetallicPowder, 9)
                .inputFluids(ChemistryMaterials.PalladiumEnrichedAmmonia.getFluid(9000))
                .circuitMeta(9)
                .outputItems(dust, ChemistryMaterials.PalladiumSalt, 16)
                .outputItems(dust, ChemistryMaterials.ReprecipitatedPalladium, 4)
                .duration(2250).EUt(VA[LV]).save(provider);

        // Palladium Dust <----------- Second Platline Output

        CHEMICAL_RECIPES.recipeBuilder("raw_palladium_separation")
                .inputItems(dust, ChemistryMaterials.ReprecipitatedPalladium, 4)
                .inputFluids(ChemistryMaterials.FormicAcid.getFluid(4000))
                .outputItems(dust, Palladium, 2)
                .outputFluids(Ammonia.getFluid(4000))
                .outputFluids(Ethylene.getFluid(1000))
                .duration(250).EUt(VA[LV]).save(provider);

        // Rhodium Processing Chain (FUN)

        BLAST_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_sulfate"))
                .inputItems(dust, ChemistryMaterials.PlatinumResidue, 1)
                .inputItems(dustSmall, ChemistryMaterials.PotassiumDisulfate, 2)
                .circuitMeta(2)
                .outputFluids(RhodiumSulfate.getFluid(360))
                .outputItems(dust, ChemistryMaterials.LeachResidue, 1)
                .blastFurnaceTemp(775)
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_sulfate_to_solution"))
                .circuitMeta(1)
                .inputFluids(Water.getFluid(10000))
                .inputFluids(RhodiumSulfate.getFluid(11000))
                .outputItems(dustTiny, ChemistryMaterials.LeachResidue, 10)
                .outputFluids(Potassium.getFluid(2000))
                .outputFluids(ChemistryMaterials.RhodiumSulfateSolution.getFluid(11000))
                .duration(300).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("bulk_rhodium_sulfate_to_solution"))
                .circuitMeta(3)
                .inputFluids(Water.getFluid(36000))
                .inputFluids(RhodiumSulfate.getFluid(39000))
                .outputItems(dust, ChemistryMaterials.LeachResidue, 4)
                .outputFluids(Potassium.getFluid(7200))
                .outputFluids(ChemistryMaterials.RhodiumSulfateSolution.getFluid(39000))
                .duration(1200).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("crude_rhodium_metallic_powder"))
                .inputItems(dust, Zinc, 1)
                .inputFluids(ChemistryMaterials.RhodiumSulfateSolution.getFluid(1000))
                .outputItems(dust, ChemistryMaterials.ZincSulfate, 6)
                .outputItems(dust, ChemistryMaterials.CrudeRhodiumMetal, 1)
                .duration(300).EUt(VA[LV]).save(provider);

        ELECTROLYZER_RECIPES.recipeBuilder("rhodium_sulfate_separation").save(provider);

        BLAST_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_salt_ebf"))
                .inputItems(dust, ChemistryMaterials.CrudeRhodiumMetal, 1)
                .inputItems(dust, Salt, 1)
                .inputFluids(Chlorine.getFluid(1000))
                .outputItems(dust, ChemistryMaterials.RhodiumSalt, 3)
                .blastFurnaceTemp(600)
                .duration(200).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_salt_solution"))
                .inputItems(dust, ChemistryMaterials.RhodiumSalt, 1)
                .inputFluids(Water.getFluid(200))
                .outputFluids(ChemistryMaterials.RhodiumSulfateSolution.getFluid(200))
                .duration(30).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_nitrate"))
                .inputItems(dust, ChemistryMaterials.SodiumNitrate, 5)
                .inputFluids(ChemistryMaterials.RhodiumSaltSolution.getFluid(1000))
                .circuitMeta(1)
                .outputItems(dust, ChemistryMaterials.RhodiumNitrate, 1)
                .outputItems(dust, Salt, 2)
                .duration(300).EUt(VA[LV]).save(provider);

        SIFTER_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_filter_cake"))
                .inputItems(dust, ChemistryMaterials.RhodiumNitrate, 1)
                .chancedOutput(dust, ChemistryMaterials.RhodiumFilterCake, 1, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RhodiumFilterCake, 1, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RhodiumFilterCake, 1, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RhodiumFilterCake, 1, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RhodiumFilterCake, 1, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RhodiumFilterCake, 1, 2000, 0)
                .duration(300).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("sodium_nitrate"))
                .inputItems(dust, Sodium, 1)
                .inputFluids(NitricAcid.getFluid(1000))
                .outputItems(dust, ChemistryMaterials.SodiumNitrate, 5)
                .outputFluids(Hydrogen.getFluid(1000))
                .duration(8).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_salt_solution"))
                .inputItems(dust, ChemistryMaterials.RhodiumSalt, 1)
                .inputFluids(Water.getFluid(1000))
                .outputFluids(ChemistryMaterials.RhodiumSaltSolution.getFluid(1000))
                .duration(30).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("potassium_disulfate"))
                .inputItems(dust, Potassium, 2)
                .inputItems(dust, Sulfur, 2)
                .inputFluids(Oxygen.getFluid(7000))
                .outputItems(dust, ChemistryMaterials.PotassiumDisulfate, 11)
                .duration(42).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("ammonium_chloride"))
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .inputFluids(Ammonia.getFluid(1000))
                .outputItems(dust, AmmoniumChloride, 1)
                .duration(400).EUt(VA[MV]).save(provider);

        MIXER_RECIPES.recipeBuilder(GTOvervolt.id("rhodium_filter_cake_solution"))
                .inputItems(dust, ChemistryMaterials.RhodiumFilterCake, 1)
                .inputFluids(Water.getFluid(1000))
                .outputFluids(ChemistryMaterials.RhodiumFilterCakeSolution.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("reprecipitated_rhodium"))
                .inputFluids(ChemistryMaterials.RhodiumFilterCakeSolution.getFluid(1000))
                .circuitMeta(2)
                .outputItems(dust, ChemistryMaterials.ReprecipitatedRhodium, 1)
                .duration(300).EUt(VA[LV]).save(provider);

        // Zinc Sulfate reprocessing

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("zinc_sulfate"))
                .inputItems(dust, ChemistryMaterials.ZincSulfate, 6)
                .inputFluids(Hydrogen.getFluid(2000))
                .outputItems(dust, Zinc, 1)
                .outputFluids(SulfuricAcid.getFluid(1000))
                .duration(30).EUt(VA[ULV]).save(provider);

        // Rhodium Dust Output <------------ Third Platline Dust also holy shit

        CHEMICAL_RECIPES.recipeBuilder("rhodium_dust")
                .inputItems(dust, ChemistryMaterials.ReprecipitatedRhodium, 1)
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .outputItems(dust, Rhodium, 1)
                .outputFluids(Chlorine.getFluid(1000))
                .outputFluids(Ammonia.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        // Ruthenium time :skull:
        BLAST_RECIPES.recipeBuilder("rarest_metal_residue")
                .inputItems(dust, ChemistryMaterials.LeachResidue, 10)
                .inputItems(dust, Saltpeter, 10)
                .inputFluids(SaltWater.getFluid(1000))
                .outputItems(dust, ChemistryMaterials.SodiumRuthenate, 3)
                .outputItems(dust, ChemistryMaterials.RarestMetalResidue, 6)
                .outputFluids(Steam.getFluid(1000))
                .blastFurnaceTemp(775)
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("ruthenium_tetroxide")
                .inputItems(dust, ChemistryMaterials.SodiumRuthenate, 6)
                .inputFluids(Chlorine.getFluid(3000))
                .outputFluids(ChemistryMaterials.RutheniumTetroxideSolution.getFluid(9000))
                .duration(300).EUt(VA[LV]).save(provider);

        FLUID_HEATER_RECIPES.recipeBuilder(GTOvervolt.id("hot_ruthenium_tetroxide"))
                .inputFluids(ChemistryMaterials.RutheniumTetroxideSolution.getFluid(50))
                .outputFluids(ChemistryMaterials.HotRutheniumTetroxideSolution.getFluid(50))
                .duration(18).EUt(VA[HV]).save(provider);

        DISTILLATION_RECIPES.recipeBuilder(GTOvervolt.id("hot_ruthenium_tetroxide_distill"))
                .inputFluids(ChemistryMaterials.HotRutheniumTetroxideSolution.getFluid(9000))
                .outputItems(dustSmall, RutheniumTetroxide, 30)
                .outputFluids(Water.getFluid(5800))
                .duration(1500).EUt(VA[HV]).save(provider);

        // Ruthenium Completion <----------  Fourth Platinum Line output (im still sane)

        CHEMICAL_RECIPES.recipeBuilder("ruthenium_tetroxide_separation")
                .inputItems(dust, RutheniumTetroxide, 1)
                .inputFluids(HydrochloricAcid.getFluid(6000))
                .outputItems(dust, Ruthenium, 1)
                .outputFluids(Water.getFluid(2000))
                .outputFluids(Chlorine.getFluid(6000))
                .duration(33).EUt(VA[LV]).save(provider);

        // Osmium Processing Time!

        // diasble vanilla osmium line
        DISTILLERY_RECIPES.recipeBuilder("acidic_osmium_solution_separation_to_hydrochloric_acid").save(provider);
        DISTILLERY_RECIPES.recipeBuilder("acidic_osmium_solution_separation_to_water").save(provider);

        BLAST_RECIPES.recipeBuilder(GTOvervolt.id("rarest_metal_residue_ebf"))
                .inputItems(dust, ChemistryMaterials.RarestMetalResidue, 2)
                .circuitMeta(2)
                .inputFluids(HydrochloricAcid.getFluid(500))
                .outputItems(dust, IridiumMetalResidue, 1)
                .outputFluids(AcidicOsmiumSolution.getFluid(1000))
                .blastFurnaceTemp(775)
                .duration(100).EUt(VA[MV]).save(provider);

        DISTILLATION_RECIPES.recipeBuilder("acidic_osmium_solution_separation")
                .inputFluids(AcidicOsmiumSolution.getFluid(1000))
                .outputFluids(ChemistryMaterials.OsmiumSolution.getFluid(100))
                .outputFluids(DilutedHydrochloricAcid.getFluid(180))
                .duration(150).EUt(VA[IV]).save(provider);

        // Osmium Completion <---- Fifth platline output

        CHEMICAL_RECIPES.recipeBuilder("osmium_tetroxide_separation")
                .inputFluids(HydrochloricAcid.getFluid(6000))
                .inputFluids(ChemistryMaterials.OsmiumSolution.getFluid(1000))
                .outputItems(dust, Osmium, 1)
                .outputFluids(Water.getFluid(2000))
                .outputFluids(Chlorine.getFluid(7000))
                .duration(300).EUt(VA[LV]).save(provider);

        // Iridium Processing!

        BLAST_RECIPES.recipeBuilder(GTOvervolt.id("iridium_metal_residue_process"))
                .inputItems(dust, IridiumMetalResidue, 1)
                .circuitMeta(1)
                .outputItems(dust, ChemistryMaterials.SludgeDustResidue, 1)
                .outputItems(dust, ChemistryMaterials.IridiumDioxide, 1)
                .blastFurnaceTemp(775)
                .duration(200).EUt(VA[MV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("iridium_dioxide_dissolving"))
                .inputItems(dust, ChemistryMaterials.IridiumDioxide, 1)
                .inputFluids(HydrochloricAcid.getFluid(1000))
                .outputFluids(ChemistryMaterials.AcidicIridiumSolution.getFluid(1000))
                .duration(300).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("iridium_chloride"))
                .inputItems(dust, AmmoniumChloride, 11)
                .inputFluids(ChemistryMaterials.AcidicIridiumSolution.getFluid(1000))
                .outputItems(dust, IridiumChloride, 1)
                .outputFluids(Ammonia.getFluid(3000))
                .duration(300).EUt(VA[LV]).save(provider);

        BLAST_RECIPES.recipeBuilder(GTOvervolt.id("refined_platlinum_salt_to_metallic"))
                .inputItems(dust, ChemistryMaterials.RefinedPlatlinumSalt, 1)
                .circuitMeta(1)
                .outputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 1)
                .outputFluids(Chlorine.getFluid(87))
                .blastFurnaceTemp(900)
                .duration(200).EUt(VA[MV]).save(provider);

        // Iridium Completion <-------- Holy shit Platline Finally completed

        CHEMICAL_RECIPES.recipeBuilder("iridium_chloride_separation")
                .inputItems(dust, IridiumChloride, 1)
                .inputItems(dust, Calcium, 1)
                .outputItems(dust, ChemistryMaterials.MetallicSludgeResidue, 1)
                .outputItems(dust, Iridium, 1)
                .outputItems(dust, CalciumChloride, 4)
                .duration(300).EUt(VA[EV]).save(provider);

        // Remaining Sifting Recipes
        SIFTER_RECIPES.recipeBuilder(GTOvervolt.id("refined_platinum_salt"))
                .inputItems(dust, ChemistryMaterials.PlatinumSalt, 1)
                .chancedOutput(dust, ChemistryMaterials.RefinedPlatlinumSalt, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RefinedPlatlinumSalt, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RefinedPlatlinumSalt, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RefinedPlatlinumSalt, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RefinedPlatlinumSalt, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.RefinedPlatlinumSalt, 2000, 0)
                .duration(600).EUt(VA[LV]).save(provider);

        SIFTER_RECIPES.recipeBuilder(GTOvervolt.id("salt_to_metallic_powder_palladium"))
                .inputItems(dust, ChemistryMaterials.PalladiumSalt, 1)
                .chancedOutput(dust, ChemistryMaterials.PalladiumMetallicPowder, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.PalladiumMetallicPowder, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.PalladiumMetallicPowder, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.PalladiumMetallicPowder, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.PalladiumMetallicPowder, 1500, 0)
                .chancedOutput(dust, ChemistryMaterials.PalladiumMetallicPowder, 2000, 0)
                .duration(600).EUt(VA[LV]).save(provider);

        // The Extra Stuff Overwriting Progression ETC

        ELECTROLYZER_RECIPES.recipeBuilder("raw_platinum_separation")
                .inputItems(dust, PlatinumRaw, 3)
                .outputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 1)
                .outputFluids(Chlorine.getFluid(800))
                .duration(2400).EUt(VA[MV]).save(provider);

        ELECTROLYZER_RECIPES.recipeBuilder("decomposition_electrolyzing_cooperite")
                .inputItems(dust, Cooperite, 6)
                .outputItems(dust, ChemistryMaterials.PlatinumMetallicPowder, 3)
                .outputItems(dust, Nickel, 1)
                .outputItems(dust, Sulfur, 1)
                .outputItems(dust, ChemistryMaterials.PalladiumSalt, 1)
                .duration(1200).EUt(VA[MV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_tetrahedrite")
                .inputItems(crushedPurified, Tetrahedrite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_bornite")
                .inputItems(crushedPurified, Bornite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcopyrite")
                .inputItems(crushedPurified, Chalcopyrite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_pentlandite")
                .inputItems(crushedPurified, Pentlandite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_cooperite")
                .inputItems(crushedPurified, Cooperite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(300))
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcocite")
                .inputItems(crushedPurified, Chalcocite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_tetrahedrite")
                .inputItems(crushedPurified, Tetrahedrite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_bornite")
                .inputItems(crushedPurified, Bornite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcopyrite")
                .inputItems(crushedPurified, Chalcopyrite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_pentlandite")
                .inputItems(crushedPurified, Pentlandite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_cooperite")
                .inputItems(crushedPurified, Cooperite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(300))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcocite")
                .inputItems(crushedPurified, Chalcocite, 1)
                .circuitMeta(1)
                .inputFluids(AquaRegia.getFluid(150))
                .outputFluids(ChemistryMaterials.PlatinumConcentrate.getFluid(150))
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("inert_metal_mixture_separation")
                .inputItems(dust, InertMetalMixture, 1)
                .outputItems(dust, ChemistryMaterials.SodiumRuthenate, 1)
                .duration(250).EUt(VA[LV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("inert_metal_mixture_separation")
                .inputItems(dust, InertMetalMixture, 1)
                .outputItems(dust, ChemistryMaterials.SodiumRuthenate, 1)
                .duration(250).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder("rarest_metal_mixture_separation")
                .inputItems(dust, RarestMetalMixture, 1)
                .outputItems(dust, ChemistryMaterials.IridiumDioxide, 1)
                .duration(250).EUt(VA[UV]).save(provider);

        LARGE_CHEMICAL_RECIPES.recipeBuilder("rarest_metal_mixture_separation")
                .inputItems(dust, RarestMetalMixture, 1)
                .outputItems(dust, ChemistryMaterials.IridiumDioxide, 1)
                .duration(250).EUt(VA[UV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder("iridium_metal_residue_separation")
                .inputItems(dust, IridiumMetalResidue, 1)
                .outputItems(dust, PlatinumSludgeResidue, 1)
                .duration(250).EUt(VA[LV]).save(provider);

        // Formic Acid
        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("sodium_formate"))
                .inputItems(dust, SodiumHydroxide, 3)
                .inputFluids(CarbonMonoxide.getFluid(1000))
                .outputFluids(ChemistryMaterials.SodiumFormate.getFluid(1000))
                .duration(15).EUt(VA[LV]).save(provider);

        CHEMICAL_RECIPES.recipeBuilder(GTOvervolt.id("formic_acid"))
                .inputFluids(ChemistryMaterials.SodiumFormate.getFluid(2000))
                .inputFluids(SulfuricAcid.getFluid(1000))
                .circuitMeta(1)
                .outputFluids(ChemistryMaterials.FormicAcid.getFluid(2000))
                .outputItems(dust, ChemistryMaterials.SodiumSulfate, 7)
                .duration(15).EUt(VA[LV]).save(provider);

        CHEMICAL_BATH_RECIPES.recipeBuilder("bathe_cooperite_crushed_ore_to_purified_ore")
                .inputItems(crushed, Cooperite, 1)
                .inputFluids(Mercury.getFluid(100))
                .outputItems(crushedPurified, Cooperite, 1)
                .chancedOutput(dust, ChemistryMaterials.PalladiumMetallicPowder, 1, 7000, 580)
                .chancedOutput(dust, Stone, 1, 4000, 650)
                .duration(200).EUt(VA[LV]).save(provider);

        THERMAL_CENTRIFUGE_RECIPES.recipeBuilder("centrifuge_nickel_purified_ore_to_refined_ore")
                .inputItems(crushedPurified, Nickel, 1)
                .outputItems(crushedRefined, Nickel, 1)
                .chancedOutput(dust, ChemistryMaterials.PlatinumMetallicPowder, 2, 1111, 250)
                .duration(400).EUt(VA[LV]).save(provider);

        MACERATOR_RECIPES.recipeBuilder("macerate_nickel_refined_ore_to_dust")
                .inputItems(crushedRefined, Nickel, 1)
                .outputItems(dust, Nickel, 1)
                .chancedOutput(dust, ChemistryMaterials.PlatinumMetallicPowder, 2, 1000, 250)
                .duration(400).EUt(VA[LV]).save(provider);

        CENTRIFUGE_RECIPES.recipeBuilder("macerate_nickel_refined_ore_to_dust")
                .inputItems(dustPure, Nickel, 1)
                .outputItems(dust, Nickel, 1)
                .chancedOutput(dust, ChemistryMaterials.PlatinumMetallicPowder, 2, 1111, 250)
                .duration(100).EUt(VA[LV]).save(provider);

    }
}
