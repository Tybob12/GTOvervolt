package com.tybob14.gtovervolt.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.BlastProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;

public class ChemistryMaterials {

    public static void init(){

    }

    public static void modifyMaterials(){

    }

    public static final Material NobleGases = new Material.Builder(GTOvervolt.id("noblegases"))
            .color(0xA9D0F5)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material ChromiumDioxide = new Material.Builder(GTOvervolt.id("chromiumdioxide"))
            .color(0xE6C8C8)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material NitroCarbon = new Material.Builder(GTOvervolt.id("nitrocarbon"))
            .color(0x004B64)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material Plastic = new Material.Builder(GTOvervolt.id("plastic"))
            .color(0xC8C8C8)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material NaquadahFuel = new Material.Builder(GTOvervolt.id("naquadahfuel"))
            .color(0x3E3E3E)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material EnrichedNaquadria = new Material.Builder(GTOvervolt.id("enrichednaquadria"))
            .color(0x343434)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material BioMediumRaw = new Material.Builder(GTOvervolt.id("biomediumraw"))
            .color(0x61932E)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material BioMediumSterilized = new Material.Builder(GTOvervolt.id("biomediumsterilized"))
            .color(0xA2FD35)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material Polystyrene = new Material.Builder(GTOvervolt.id("polystyrene"))
            .color(0xBEB4AA)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material PhosphorousPentoxide = new Material.Builder(GTOvervolt.id("phosphorouspentoxide"))
            .color(0xDCDC00)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material TengamPurified = new Material.Builder(GTOvervolt.id("tengampurified"))
            .color(0xBADF70)
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material TengamAttuned = new Material.Builder(GTOvervolt.id("tengamattuned"))
            .color(0xD5FF80)
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material TengamRaw = new Material.Builder(GTOvervolt.id("tengamraw"))
            .color(0xA0BF60)
            .iconSet(ROUGH)
            .buildAndRegister();

    public static final Material SuperCoolant = new Material.Builder(GTOvervolt.id("supercoolant"))
            .color(0x025B6F)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material AdvancedGlue = new Material.Builder(GTOvervolt.id("advancedglue"))
            .color(0xFFFFB9)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material BioFuel = new Material.Builder(GTOvervolt.id("biofuel"))
            .color(0xFF8000)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material WoodGas = new Material.Builder(GTOvervolt.id("woodgas"))
            .color(0xDECD87)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material PotassiumNitrade = new Material.Builder(GTOvervolt.id("potassiumnitrade"))
            .color(0x81228D)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material Potassiumdichromate = new Material.Builder(GTOvervolt.id("potassiumdichromate"))
            .color(0xFF087F)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material Diphenylisophthalate = new Material.Builder(GTOvervolt.id("diphenylisophthalate"))
            .color(0x246E57)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material MTBEMixture = new Material.Builder(GTOvervolt.id("mtbemixture"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material AntiKnock = new Material.Builder(GTOvervolt.id("antiknock"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material SiliconSG = new Material.Builder(GTOvervolt.id("siliconsg"))
            .color(0x505064)
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material CalciumDisilicide = new Material.Builder(GTOvervolt.id("calciumdisilicide"))
            .color(0xB4B4B4)
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material SiliconTetrafluoride = new Material.Builder(GTOvervolt.id("silicontetrafluoride"))
            .color(0xC8C8C8)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material SiliconTetrachloride = new Material.Builder(GTOvervolt.id("silicontetrachloride"))
            .color(0xDCDCDC)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material Trichlorosilane = new Material.Builder(GTOvervolt.id("trichlorosilane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material Hexachlorodisilane = new Material.Builder(GTOvervolt.id("hexachlorodisilane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material Dichlorosilane = new Material.Builder(GTOvervolt.id("dichlorosilane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material Silane = new Material.Builder(GTOvervolt.id("silane"))
            .color(0xFFFFFF)
            .iconSet(FLUID)
            .buildAndRegister();

    public static final Material Calciumhydride = new Material.Builder(GTOvervolt.id("calciumhydride"))
            .color(0xDCDCDC)
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material AluminiumFluoride = new Material.Builder(GTOvervolt.id("aluminiumfluoride"))
            .color(0xFFFFFF)
            .iconSet(METALLIC)
            .buildAndRegister();

    public static final Material EpoxidFiberReinforced = new Material.Builder(GTOvervolt.id("epoxyfiberreinforced"))
            .color(0xA07010)
            .iconSet(DULL)
            .buildAndRegister();

    public static final Material SodiumCarbonate = new Material.Builder(GTOvervolt.id("sodiumcarbonate"))
            .color(0xFFFFEB)
            .iconSet(QUARTZ)
            .buildAndRegister();

    public static final Material SodiumAluminate = new Material.Builder(GTOvervolt.id("sodiumaluminate"))
            .color(0xFFEBFF)
            .iconSet(QUARTZ)
            .buildAndRegister();

    public static final Material Aluminiumhydroxide = new Material.Builder(GTOvervolt.id("aluminiumoxide"))
            .color(0xEBEBFF)
            .iconSet(QUARTZ)
            .buildAndRegister();
}
