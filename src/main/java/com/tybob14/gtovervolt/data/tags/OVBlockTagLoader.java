package com.tybob14.gtovervolt.data.tags;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.tterrag.registrate.providers.RegistrateTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class OVBlockTagLoader {

    public static final TagKey<Block> ALL_ORE_REPLACEABLE = TagUtil.createBlockTag("all_ore_replaceables");


    public static void init(RegistrateTagsProvider.IntrinsicImpl<Block> provider) {
        provider.addTag(ALL_ORE_REPLACEABLE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE, Blocks.NETHERRACK);
    }

}
