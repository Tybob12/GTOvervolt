package com.tybob14.gtovervolt.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.GTOvervoltCreativeModeTabs;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

@SuppressWarnings("unused")
public class ChemistryMaterials {

    public static void init(){

    }

    public static final Material NobleGases = new Material.Builder(GTOvervolt.id("noble_gases"))
            .color(0xA9D0F5)
            .iconSet(FLUID)
            .gas()
            .components(CarbonDioxide, 21, Helium, 9, Methane, 3,Deuterium, 1)
            .buildAndRegister();

    public static final Material ChromiumDioxide = new Material.Builder(GTOvervolt.id("chromium_dioxide"))
            .color(0xE6C8C8)
            .iconSet(DULL)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL,GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            .components(Chromium, 1, Oxygen, 2)
            .buildAndRegister();

    public static final Material BioMediumRaw = new Material.Builder(GTOvervolt.id("bio_medium_raw"))
            .color(0x61932E)
            .iconSet(FLUID)
            .fluid()
            .buildAndRegister();

    public static final Material BioMediumSterilized = new Material.Builder(GTOvervolt.id("bio_medium_sterilized"))
            .color(0xA2FD35)
            .iconSet(FLUID)
            .fluid()
            .buildAndRegister();

    public static final Material Polystyrene = new Material.Builder(GTOvervolt.id("polystyrene"))
            .color(0xBEB4AA)
            .iconSet(DULL)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL,GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            .components(Carbon, 8, Hydrogen, 8)
            .buildAndRegister();

    public static final Material PhosphorousPentoxide = new Material.Builder(GTOvervolt.id("phosphorous_pentoxide"))
            .color(0xDCDC00)
            .iconSet(DULL)
            .dust()
            .fluid()
            .components(Phosphorus, 4, Oxygen, 10)
            .buildAndRegister();

    /*public static final Material TengamPurified = new Material.Builder(GTOvervolt.id("tengam_purified"))
            .color(0xBADF70)
            .iconSet(METALLIC)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL,GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)

            .buildAndRegister();

    public static final Material TengamAttuned = new Material.Builder(GTOvervolt.id("tengam_attuned"))
            .color(0xD5FF80)
            .iconSet(METALLIC)
            .ingot()
            .fluid()
            .flags(IS_MAGNETIC, GENERATE_PLATE, GENERATE_DENSE, GENERATE_FOIL,GENERATE_FINE_WIRE, GENERATE_ROD, GENERATE_LONG_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            .buildAndRegister();

    public static final Material TengamRaw = new Material.Builder(GTOvervolt.id("tengam_raw"))
            .color(0xA0BF60)
            .iconSet(ROUGH)
            .ore()
            .dust()
            .buildAndRegister();
    */
    public static final Material SuperCoolant = new Material.Builder(GTOvervolt.id("super_coolant"))
            .color(0x025B6F)
            .iconSet(DULL)
            .fluid()
            .buildAndRegister();


    public static final Material AdvancedGlue = new Material.Builder(GTOvervolt.id("advanced_glue"))
            .color(0xFFFFB9)
            .iconSet(FLUID)
            .fluid()
            .components(Acetone, 1, PolyvinylAcetate, 2)
            .buildAndRegister();

    public static final Material WoodGas = new Material.Builder(GTOvervolt.id("wood_gas"))
            .color(0xDECD87)
            .iconSet(FLUID)
            .fluid()
            .components(Methane, 13, CarbonMonoxide, 24, Hydrogen, 12, CarbonDioxide, 39, Ethane, 12)
            .buildAndRegister();

    public static final Material PotassiumNitrade = new Material.Builder(GTOvervolt.id("potassium_nitrade"))
            .color(0x81228D)
            .iconSet(DULL)
            .dust()
            .components(Potassium, 1 , NitrogenDioxide, 1)
            .buildAndRegister();
    public static final Material MTBEMixture = new Material.Builder(GTOvervolt.id("mtbe_mixture"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .fluid()
            .components(Carbon, 5, Hydrogen, 12, Oxygen, 1)
            .buildAndRegister();

    public static final Material AntiKnock = new Material.Builder(GTOvervolt.id("anti_knock"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .fluid()
            .components(Carbon, 6, Hydrogen, 14, Oxygen, 1)
            .buildAndRegister();

    public static final Material SiliconSG = new Material.Builder(GTOvervolt.id("silicon_solar_grade"))
            .color(0x505064)
            .iconSet(METALLIC)
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            //.components(Silicon, 1)
            .buildAndRegister();

    /*public static final Material CalciumDisilicide = new Material.Builder(GTOvervolt.id("calcium_disilicide"))
            .color(0xB4B4B4)
            .iconSet(METALLIC)
            .ore()
            .dust()
            .components(Calcium, 1, Silicon, 2)
            .buildAndRegister();

    public static final Material SiliconTetrafluoride = new Material.Builder(GTOvervolt.id("silicon_tetrafluoride"))
            .color(0xC8C8C8)
            .iconSet(FLUID)
            .fluid()
            .components(Silicon, 1, Fluorine, 4)
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

    public static final Material AluminiumFluoride = new Material.Builder(GTOvervolt.id("aluminium_fluoride"))
            .color(0xFFFFFF)
            .iconSet(METALLIC)
            .dust()
            .ore()
            .buildAndRegister();

    public static final Material EpoxidFiberReinforced = new Material.Builder(GTOvervolt.id("epoxy_fiber_reinforced"))
            .color(0xA07010)
            .iconSet(DULL)
            .polymer()
            .ingot()
            .fluid()
            .flags(GENERATE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_ROUND, GENERATE_BOLT_SCREW, GENERATE_RING, GENERATE_FOIL, GENERATE_LONG_ROD, GENERATE_SPRING, GENERATE_SPRING_SMALL)
            .components(Carbon, 21, Hydrogen, 24, Oxygen, 4)
            .buildAndRegister();

    public static final Material SodiumCarbonate = new Material.Builder(GTOvervolt.id("sodium_carbonate"))
            .color(0xFFFFEB)
            .iconSet(QUARTZ)
            .dust()
            .components(Sodium, 2, Carbon, 1, Oxygen, 3)
            .buildAndRegister();

    public static final Material SodiumAluminate = new Material.Builder(GTOvervolt.id("sodium_aluminate"))
            .color(0xFFEBFF)
            .iconSet(QUARTZ)
            .dust()
            .components(Sodium, 1, Aluminium, 1, Oxygen, 2)
            .buildAndRegister();

    public static final Material AluminiumHydroxide = new Material.Builder(GTOvervolt.id("aluminium_hydroxide"))
            .color(0xEBEBFF)
            .iconSet(QUARTZ)
            .dust()
            .components(Aluminium, 1, Hydrogen, 1, Oxygen, 3)
            .buildAndRegister();*/


}
