package com.tybob14.gtovervolt.common.data;

import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.ModelProvider;

public class GTOVModels {

    public static void randomRotatedModel(DataGenContext<Block, ? extends Block> ctx, RegistrateBlockstateProvider prov) {
        Block block = ctx.getEntry();
        ModelFile cubeAll = prov.cubeAll(block);
        ModelFile cubeMirroredAll = prov.models().singleTexture(ctx.getName() + "_mirrored", prov.mcLoc(ModelProvider.BLOCK_FOLDER + "/cube_mirrored_all"), "all", prov.blockTexture(block));
        ConfiguredModel[] models = ConfiguredModel.builder()
                .modelFile(cubeAll)
                .rotationY(0)
                .nextModel()
                .modelFile(cubeAll)
                .rotationY(180)
                .nextModel()
                .modelFile(cubeMirroredAll)
                .rotationY(0)
                .nextModel()
                .modelFile(cubeMirroredAll)
                .rotationY(180)
                .build();
        prov.simpleBlock(block, models);
    }

}
