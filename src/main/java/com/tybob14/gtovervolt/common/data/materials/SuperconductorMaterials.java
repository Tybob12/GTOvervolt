package com.tybob14.gtovervolt.common.data.materials;

import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.tybob14.gtovervolt.GTOvervolt;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
@SuppressWarnings("unused")
public class SuperconductorMaterials {
    public static void init(){

    }
    public static final Material SuperconductorMV = new Material.Builder(GTOvervolt.id("superconductor_mv"))
            .color(0x555555)
            .iconSet(SHINY)
            .cableProperties(128,4,0, true )
            .buildAndRegister();

    public static final Material SuperconductorHV = new Material.Builder(GTOvervolt.id("superconductor_hv"))
            .color(0x331900)
            .iconSet(SHINY)
            .cableProperties(512,6,0, true )
            .buildAndRegister();

    public static final Material SuperconductorEV = new Material.Builder(GTOvervolt.id("superconductor_ev"))
            .color(0x008700)
            .iconSet(SHINY)
            .cableProperties(2048,8,0, true )
            .buildAndRegister();

    public static final Material SuperconductorIV = new Material.Builder(GTOvervolt.id("superconductor_iv"))
            .color(0x330033)
            .iconSet(SHINY)
            .cableProperties(8192,12,0, true )
            .buildAndRegister();

    public static final Material SuperconductorLuV = new Material.Builder(GTOvervolt.id("superconductor_luv"))
            .color(0x994C00)
            .iconSet(SHINY)
            .cableProperties(32768,16,0, true )
            .buildAndRegister();

    public static final Material SuperconductorZPM = new Material.Builder(GTOvervolt.id("superconductor_zpm"))
            .color(0x0A0A0A)
            .iconSet(SHINY)
            .cableProperties(131072,24,0, true )
            .buildAndRegister();

    public static final Material SuperconductorUV = new Material.Builder(GTOvervolt.id("superconductor_uv"))
            .color(0xE0D207)
            .iconSet(SHINY)
            .cableProperties(524288,32,0, true )
            .buildAndRegister();

    public static final Material SuperconductorUHV = new Material.Builder(GTOvervolt.id("superconductor_uhv"))
            .color(0x2681BD)
            .iconSet(SHINY)
            .cableProperties(2097152,48,0, true )
            .buildAndRegister();

    public static final Material SuperconductorUEV = new Material.Builder(GTOvervolt.id("superconductor_uev"))
            .color(0xAE0808)
            .iconSet(SHINY)
            .cableProperties(8388608,64,0, true )
            .buildAndRegister();

    public static final Material SuperconductorUIV = new Material.Builder(GTOvervolt.id("superconductor_uiv"))
            .color(0xE558B1)
            .iconSet(SHINY)
            .cableProperties(33554432,64,0, true )
            .buildAndRegister();

    public static final Material SuperconductorUXV = new Material.Builder(GTOvervolt.id("superconductor_uxv"))
            .color(0xB526CD)
            .iconSet(SHINY)
            .cableProperties(134217728,64,0, true )
            .buildAndRegister();

    public static final Material SuperconductorBaseMV = new Material.Builder(GTOvervolt.id("superconductor_base_mv"))
            .color(0x555555)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(128,2,2, true)
            .components(Cadmium, 5, Magnesium, 1, Oxygen, 6)
            .buildAndRegister();

    public static final Material SuperconductorBaseHV = new Material.Builder(GTOvervolt.id("superconductor_base_hv"))
            .color(0x331900)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(512,3,8, true)
            .components(Titanium, 1, Barium, 9, Copper, 10, Oxygen, 20)
            .buildAndRegister();

    public static final Material SuperconductorBaseEV = new Material.Builder(GTOvervolt.id("superconductor_base_ev"))
            .color(0x008700)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(2048,4,16, true)
            .components(Uranium238, 1, Platinum, 3)
            .buildAndRegister();

    public static final Material SuperconductorBaseIV = new Material.Builder(GTOvervolt.id("superconductor_base_iv"))
            .color(0x330033)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(8192,6,64, true)
            .components(Vanadium, 1, Indium, 3)
            .buildAndRegister();

    public static final Material SuperconductorBaseLuV = new Material.Builder(GTOvervolt.id("superconductor_base_luv"))
            .color(0x994C00)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(32768,8,256, true)
            .components(Indium, 4, Tin, 2, Barium, 2, Titanium, 1, Copper, 7, Oxygen, 14)
            .buildAndRegister();

    public static final Material SuperconductorBaseZPM = new Material.Builder(GTOvervolt.id("superconductor_base_zpm"))
            .color(0x0A0A0A)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(131072,12,1024, true)
            .components(Naquadah, 4, Indium, 2, Palladium, 6, Osmium, 1)
            .buildAndRegister();

    public static final Material SuperconductorBaseUV = new Material.Builder(GTOvervolt.id("superconductor_base_uv"))
            .color(0xE0D207)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(524288,16,4096, true)
            .components(Naquadria, 4, Osmiridium, 3, Europium, 1, Samarium, 1)
            .buildAndRegister();

    public static final Material SuperconductorBaseUHV = new Material.Builder(GTOvervolt.id("superconductor_base_uhv"))
            .color(0x2681BD)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(2097152,24,16384, true)
            //.components()
            .buildAndRegister();

    public static final Material SuperconductorBaseUEV = new Material.Builder(GTOvervolt.id("superconductor_base_uev"))
            .color(0xAE0808)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(8388608,32,65536, true)
            //.components()
            .buildAndRegister();

    public static final Material SuperconductorBaseUIV = new Material.Builder(GTOvervolt.id("superconductor_base_uiv"))
            .color(0xE558B1)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(33554432,32,262144, true)
            //.components()
            .buildAndRegister();

    public static final Material SuperconductorBaseUXV = new Material.Builder(GTOvervolt.id("superconductor_base_uxv"))
            .color(0xB526CD)
            .iconSet(SHINY)
            .dust()
            .ingot()
            .fluid()
            .cableProperties(134217728,32,1048576, true)
            //.components()
            .buildAndRegister();


}
