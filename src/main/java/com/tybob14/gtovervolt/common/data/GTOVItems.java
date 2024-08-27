package com.tybob14.gtovervolt.common.data;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;

@SuppressWarnings({"unused"})
public class GTOVItems {


    // T8: Bio
    public static ItemEntry<Item> BIO_PROCESSOR_ZPM = REGISTRATE.item("bio_processor", Item::new)
            .lang("Bio Processor")
            .tag(CustomTags.ZPM_CIRCUITS)
            .register();
    public static ItemEntry<Item> BIOWARE_PROCESSOR_ASSEMBLY_UV = REGISTRATE
            .item("bioware_processor_assembly", Item::new)
            .lang("Bioware Processor Assembly")
            .tag(CustomTags.UV_CIRCUITS)
            .register();
    public static ItemEntry<Item> BIOWARE_SUPER_COMPUTER_UHV = REGISTRATE.
            item("bioware_processor_computer", Item::new)
            .lang("Bioware Processor Supercomputer")
            .tag(CustomTags.UHV_CIRCUITS)
            .register();
    public static ItemEntry<Item> BIOWARE_MAINFRAME_UEV = REGISTRATE
            .item("bioware_processor_mainframe", Item::new)
            .lang("Bioware Processor Mainframe")
            .register();
    // T9: Optical
    public static ItemEntry<Item> OPTICAL_PROCESSOR_UV = REGISTRATE
            .item("optical_processor", Item::new)
            .lang("Optical Processor")
            .tag(CustomTags.UV_CIRCUITS)
            .register();
    public static ItemEntry<Item> OPTICAL_PROCESSOR_ASSEMBLY_UHV = REGISTRATE
            .item("optical_processor_assembly", Item::new)
            .lang("Optical Processor Assembly")
            .tag(CustomTags.UHV_CIRCUITS)
            .register();
    public static ItemEntry<Item> OPTICAL_SUPER_COMPUTER_UEV = REGISTRATE.
            item("optical_processor_computer", Item::new)
            .lang("Optical Processor Supercomputer")
            .tag(CustomTags.UEV_CIRCUITS)
            .register();
    public static ItemEntry<Item> OPTICAL_MAINFRAME_UIV = REGISTRATE
            .item("optical_processor_mainframe", Item::new)
            .lang("Optical Processor Mainframe").tag(CustomTags.UIV_CIRCUITS)
            .register();

    static {
        REGISTRATE.creativeModeTab(() -> GTOvervoltCreativeModeTabs.GTOVERVOLT);
    }

    public static void init() {

    }
}
