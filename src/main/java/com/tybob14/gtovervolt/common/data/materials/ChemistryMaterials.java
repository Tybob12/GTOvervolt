package com.tybob14.gtovervolt.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

@SuppressWarnings("unused")
public class ChemistryMaterials {

    public static final Material NobleGases = new Material.Builder(GTOvervolt.id("noble_gases"))
            .color(0xA9D0F5)
            .iconSet(FLUID)
            .gas()
            .components(CarbonDioxide, 21, Helium, 9, Methane, 3, Deuterium, 1)
            .buildAndRegister();
    public static final Material ChromiumDioxide = new Material.Builder(GTOvervolt.id("chromium_dioxide"))
            .color(0xE6C8C8)
            .iconSet(DULL)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            .components(Chromium, 1, Oxygen, 2)
            .buildAndRegister();
    public static final Material BioMediumRaw = new Material.Builder(GTOvervolt.id("raw_bio_medium"))
            .color(0x61932E)
            .iconSet(FLUID)
            .fluid()
            .buildAndRegister();
    public static final Material BioMediumSterilized = new Material.Builder(GTOvervolt.id("sterilized_bio_catalyst"))
            .color(0xA2FD35)
            .iconSet(FLUID)
            .fluid()
            .buildAndRegister();
    public static final Material Polystyrene = new Material.Builder(GTOvervolt.id("polystyrene"))
            .color(0xBEB4AA)
            .iconSet(DULL)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            .components(Carbon, 8, Hydrogen, 8)
            .buildAndRegister();
    public static final Material PhosphorousPentoxide = new Material.Builder(GTOvervolt.id("phosphorous_pentoxide"))
            .color(0xDCDC00)
            .iconSet(DULL)
            .dust()
            .fluid()
            .components(Phosphorus, 4, Oxygen, 10)
            .buildAndRegister();
    /*public static final Material TengamPurified = new Material.Builder(GTOvervolt.id("purified_tengam"))
            .color(0xBADF70)
            .iconSet(METALLIC)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL,GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)

            .buildAndRegister();

    public static final Material TengamAttuned = new Material.Builder(GTOvervolt.id("attuned_tengam"))
            .color(0xD5FF80)
            .iconSet(METALLIC)
            .ingot()
            .fluid()
            .flags(IS_MAGNETIC, GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL,GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            .buildAndRegister();

    public static final Material TengamRaw = new Material.Builder(GTOvervolt.id("raw_tengam))
            .color(0xA0BF60)
            .iconSet(ROUGH)
            .ore()
            .dust()
            .buildAndRegister();
    */
    public static final Material Coolant = new Material.Builder(GTOvervolt.id("coolant"))
            .color(0x025B6F)
            .iconSet(DULL)
            .fluid()
            .buildAndRegister();
    public static final Material SuperCoolant = new Material.Builder(GTOvervolt.id("super_coolant"))
            .color(0x025B6F)
            .iconSet(SHINY)
            .fluid()
            .buildAndRegister();
    public static final Material AdvancedGlue = new Material.Builder(GTOvervolt.id("advanced_glue"))
            .color(0xFFFFB9)
            .iconSet(FLUID)
            .fluid()
            .components(Acetone, 1, PolyvinylAcetate, 2)
            .buildAndRegister();
    public static final Material SiliconSG = new Material.Builder(GTOvervolt.id("silicon_solar_grade"))
            .color(0x505064)
            .iconSet(METALLIC)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            //.components(Silicon, 1)
            .buildAndRegister();
    public static final Material SiliconTetrachloride = new Material.Builder(GTOvervolt.id("silicon_tetrachloride"))
            .color(0xDCDCDC)
            .iconSet(FLUID)
            .fluid()
            .components(Silicon, 1, Chlorine, 4)
            .buildAndRegister();
    public static final Material Trichlorosilane = new Material.Builder(GTOvervolt.id("trichlorosilane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .fluid()
            .components(Hydrogen, 1, Silicon, 1, Chlorine, 3)
            .buildAndRegister();
    public static final Material Hexachlorodisilane = new Material.Builder(GTOvervolt.id("hexachlorodisilane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .fluid()
            .components(Silicon, 2, Chlorine, 6)
            .buildAndRegister();
    public static final Material Dichlorosilane = new Material.Builder(GTOvervolt.id("dichlorosilane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .fluid()
            .components(Hydrogen, 2, Silicon, 1, Chlorine, 2)
            .buildAndRegister();
    public static final Material Silane = new Material.Builder(GTOvervolt.id("silane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .fluid()
            .components(Hydrogen, 4, Silicon, 1)
            .buildAndRegister();
    public static final Material SodiumCarbonate = new Material.Builder(GTOvervolt.id("sodium_carbonate"))
            .color(0xFFFFEB)
            .iconSet(QUARTZ)
            .dust()
            .components(Sodium, 2, Carbon, 1, Oxygen, 3)
            .buildAndRegister();

    public static void init() {

    }
}
