package net.icedly.netherend.datagen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EndandNether.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.BISMUTH_BLOCK);
        blockWithItem(ModBlocks.PINK_GARNET_BLOCK);
        blockWithItem(ModBlocks.RAW_PINK_GARNET_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.ROTTED_END_STONE);
        blockWithItem(ModBlocks.END_SAND);
        blockWithItem(ModBlocks.RAW_BLACK_OPAL_BLOCK);
        blockWithItem(ModBlocks.DEEP_NETHERRACK);
        blockWithItem(ModBlocks.ROUGH_STONE);
        blockWithItem(ModBlocks.ROUGH_STONE_BRICKS);
        blockWithItem(ModBlocks.BLACK_OPAL_END_ORE);
        blockWithItem(ModBlocks.BISMUTH_END_ORE);
        blockWithItem(ModBlocks.SULFUR_NETHER_ORE);
        blockWithItem(ModBlocks.RUBY_NETHER_ORE);
        blockWithItem(ModBlocks.PINK_GARNET_END_ORE);
        blockWithItem(ModBlocks.END_STONE_BRICK_PILLAR);

        simpleBlock(ModBlocks.JAZIA.get(),
                models().cross(blockTexture(ModBlocks.JAZIA.get()).getPath(), blockTexture(ModBlocks.JAZIA.get())).renderType("cutout"));
        simpleBlock(ModBlocks.POTTED_JAZIA.get(), models().singleTexture("potted_jazia", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.JAZIA.get())).renderType("cutout"));



        logBlock(((RotatedPillarBlock) ModBlocks.HELLBARK_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.HELLBARK_WOOD.get()), blockTexture(ModBlocks.HELLBARK_LOG.get()), blockTexture(ModBlocks.HELLBARK_LOG.get()));

        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HELLBARK_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_HELLBARK_WOOD.get()), blockTexture(ModBlocks.STRIPPED_HELLBARK_LOG.get()), blockTexture(ModBlocks.STRIPPED_HELLBARK_LOG.get()));

        blockItem(ModBlocks.HELLBARK_LOG);
        blockItem(ModBlocks.HELLBARK_WOOD);
        blockItem(ModBlocks.STRIPPED_HELLBARK_LOG);
        blockItem(ModBlocks.STRIPPED_HELLBARK_WOOD);


        blockWithItem(ModBlocks.HELLBARK_PLANKS);

        leavesBlock(ModBlocks.HELLBARK_LEAVES);

        saplingBlock(ModBlocks.HELLBARK_SAPLING);


    }

    private void leavesBlock(DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(deferredBlock.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(deferredBlock.get())).renderType("cutout"));
    }

    private void saplingBlock(DeferredBlock<Block> deferredBlock) {
        simpleBlock(deferredBlock.get(), models().cross(BuiltInRegistries.BLOCK.getKey(deferredBlock.get()).getPath(), blockTexture(deferredBlock.get())).renderType("cutout"));

}
    private void blockWithItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), cubeAll(deferredBlock.get()));        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<Block> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("endandnether:block/" + deferredBlock.getId().getPath()));
    }


}
