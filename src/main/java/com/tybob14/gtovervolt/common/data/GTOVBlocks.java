package com.tybob14.gtovervolt.common.data;


import com.google.common.collect.ImmutableMap;
import com.gregtechceu.gtceu.api.addon.AddonFinder;
import com.gregtechceu.gtceu.api.addon.events.MaterialCasingCollectionEvent;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.common.block.CoilBlock;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tybob14.gtovervolt.GTOvervolt;
import com.tybob14.gtovervolt.common.data.materials.PrimaryMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.antlr.v4.runtime.atn.BlockEndState;

import static com.gregtechceu.gtceu.common.data.GTBlocks.createCasingBlock;
import static com.tybob14.gtovervolt.api.registries.GTOvervoltRegistries.REGISTRATE;
public class GTOVBlocks extends GTBlocks {

    static {REGISTRATE.creativeModeTab(() -> GTOvervoltCreativeModeTabs.GTOVERVOLT);}



}
