package net.icedly.netherend.datagen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.icedly.netherend.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EndandNether.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_BLOCK.get())
                .add(ModBlocks.ROTTED_END_STONE.get())
                .add(ModBlocks.DEEP_NETHERRACK.get())
                .add(ModBlocks.SULFUR_NETHER_ORE.get())
                .add(ModBlocks.RUBY_NETHER_ORE.get())
                .add(ModBlocks.ROUGH_STONE_BRICKS.get())
                .add(ModBlocks.ROUGH_STONE.get())
                .add(ModBlocks.RAW_BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.BLACK_OPAL_END_ORE.get())
                .add(ModBlocks.BISMUTH_END_ORE.get())
                .add(ModBlocks.PINK_GARNET_END_ORE.get())
                .add(ModBlocks.END_STONE_BRICK_PILLAR.get())
                .add(ModBlocks.AMBER_BLOCK.get())
                .add(ModBlocks.AMBER_NETHER_ORE.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SULFUR_NETHER_ORE.get())
                .add(ModBlocks.RUBY_NETHER_ORE.get())
                .add(ModBlocks.DEEP_NETHERRACK.get())
                .add(ModBlocks.AMBER_BLOCK.get())
                .add(ModBlocks.AMBER_NETHER_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.BISMUTH_BLOCK.get())
                .add(ModBlocks.RAW_BLACK_OPAL_BLOCK.get())
                .add(ModBlocks.BLACK_OPAL_END_ORE.get())
                .add(ModBlocks.BISMUTH_END_ORE.get())
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_END_ORE.get());

        this.tag(BlockTags.LOGS)
                .add(ModBlocks.HELLBARK_LOG.get())
                .add(ModBlocks.HELLBARK_WOOD.get())
                .add(ModBlocks.STRIPPED_HELLBARK_LOG.get())
                .add(ModBlocks.STRIPPED_HELLBARK_WOOD.get());

        this.tag(ModTags.Blocks.PAXEL_MINEABLE)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL);
    }
}
