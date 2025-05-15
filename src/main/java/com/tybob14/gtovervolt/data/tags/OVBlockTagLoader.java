package com.tybob14.gtovervolt.data.tags;

import com.tterrag.registrate.providers.RegistrateTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import static com.tybob14.gtovervolt.data.tags.OVCustomTags.*;

public class OVBlockTagLoader {

    /*Overworld
    Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE

    End
    Blocks.END_STONE

    Nether
    Blocks.NETHERACK
    */

    public static void init(RegistrateTagsProvider.IntrinsicImpl<Block> provider) {
        provider.addTag(ORE_VEIN_IRON).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_URANIUM_238).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_TUNGSTATE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_PLUTONIUM_239).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_SULFUR).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_DIAMOND).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_INFINITY_CATALYST).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_LAPIS).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_MOLYBDENUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_VERMICULITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_OILSANDS).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_AWAKENED_DRACONIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_MAGNESITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_OLIVINE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_OSMIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_TUNGSTEN).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_COAL).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_MANGANESE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_DESH).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_CERTUS_QUARTZ).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_QUARTZITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_SAMARIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_DILITHIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_PITCHBLENDE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_QUARTZ).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_DRACONIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_REDSTONE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_SAPPHIRE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_PYROLUSITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_NAQUADRIA).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_MICA).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_CRYOLITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_INFUSED_GOLD).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_MONAZITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_DOLOMITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_BLACK_PLUTONIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_RARE_EARTH).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_NICKEL).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_ILMENITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_COSMIC_NEUTRONIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_PALLADIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_CALLISTO_ICE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_THORIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_ARSENIC).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_COPPER).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_VANADIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_BAUXITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_SOAPSTONE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_NEUTRONIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_MYTRYL).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_GOLD).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_KAOLINITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_NETHER_STAR).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_BERYLLIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_RAW_TENGAM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_RED_GARNET).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_ELECTROTINE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_LIGNITE_COAL).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_PLATINUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_TETRAHEDRITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_GALENA).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_NAQUADAH).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_ORIHARUKON).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_NIOBIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_APATITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_RUTILE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_BASALTIC_MINERAL_SAND).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_QUANTIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_CHROME).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_LEDOX).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_MAGNETITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_TIN).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_IRIDIUM).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_SALT).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_CASSITERITE).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);
        provider.addTag(ORE_VEIN_NETHER_QUARTZ).add(Blocks.END_STONE, Blocks.STONE, Blocks.DIORITE, Blocks.ANDESITE, Blocks.GRANITE, Blocks.DEEPSLATE);


    }

}