package com.tybob14.gtovervolt.common.data.materials;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.data.chemical.Element;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.tybob14.gtovervolt.GTOvervolt;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.*;
import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialIconSet.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.CertusQuartz;

public class IntegratedMaterials {

    public static final Material Skystone = new Material.Builder(GTOvervolt.id("skystone"))
            .color(0x303031)
            .secondaryColor(0x3a4447)
            .iconSet(METALLIC)
            .dust()
            .flags(GENERATE_LENS)
            .element(new Element(14, 16, -1, null, "Sky Stone", "Sk", false))
            .buildAndRegister();
    public static final Material Fluix = new Material.Builder(GTOvervolt.id("fluix"))
            .color(0x9A63C5)
            .secondaryColor(0x604FAA)
            .iconSet(METALLIC)
            .gem()
            .flags(NO_WORKING)
            .components(GTMaterials.Redstone, 1, CertusQuartz, 2)
            .buildAndRegister();

    public static void init() {
        dust.setIgnored(Skystone);
        dust.setIgnored(Fluix);
        gem.setIgnored(Fluix);
        block.setIgnored(Fluix);
        gem.setIgnored(CertusQuartz);
        dust.setIgnored(CertusQuartz);
    }

    public static void modifyAE2Materials() {
        dust.setIgnored(Skystone, AEItems.SKY_DUST);
        dust.setIgnored(Fluix, AEItems.FLUIX_DUST);
        gem.setIgnored(Fluix, AEItems.FLUIX_CRYSTAL);
        block.setIgnored(Fluix, AEBlocks.FLUIX_BLOCK);
        gem.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_CRYSTAL);
        dust.setIgnored(CertusQuartz, AEItems.CERTUS_QUARTZ_DUST);
    }
}
