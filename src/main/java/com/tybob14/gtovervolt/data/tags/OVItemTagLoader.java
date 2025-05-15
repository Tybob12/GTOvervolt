package com.tybob14.gtovervolt.data.tags;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.providers.RegistrateTagsProvider;
import com.tybob14.gtovervolt.common.data.GTOVItems;
import net.minecraft.world.item.Item;

public class OVItemTagLoader {

    public static void init(RegistrateTagsProvider.IntrinsicImpl<Item> provider) {
        provider.addTag(CustomTags.ZPM_CIRCUITS).add(GTOVItems.BIO_PROCESSOR_ZPM.asItem());
        provider.addTag(CustomTags.UV_CIRCUITS).add(GTOVItems.BIOWARE_PROCESSOR_ASSEMBLY_UV.asItem(), GTOVItems.OPTICAL_PROCESSOR_UV.asItem());
        provider.addTag(CustomTags.UHV_CIRCUITS).add(GTOVItems.BIOWARE_SUPER_COMPUTER_UHV.asItem(), GTOVItems.OPTICAL_PROCESSOR_ASSEMBLY_UHV.asItem());
        provider.addTag(CustomTags.UEV_CIRCUITS).add(GTOVItems.BIOWARE_MAINFRAME_UEV.asItem(), GTOVItems.OPTICAL_SUPER_COMPUTER_UEV.asItem());
        provider.addTag(CustomTags.UIV_CIRCUITS).add(GTOVItems.OPTICAL_MAINFRAME_UIV.asItem());
    }
}
