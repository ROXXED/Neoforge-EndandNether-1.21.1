package net.icedly.netherend.datagen;

import net.icedly.netherend.block.ModBlocks;
import net.icedly.netherend.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider provider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
    }



    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLACK_OPAL_BLOCK.get());
        dropSelf(ModBlocks.BISMUTH_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.ROTTED_END_STONE.get());
        dropSelf(ModBlocks.END_SAND.get());
        dropSelf(ModBlocks.END_DIRT.get());
        dropSelf(ModBlocks.RAW_BLACK_OPAL_BLOCK.get());
        dropSelf(ModBlocks.PINK_GARNET_BLOCK.get());
        dropSelf(ModBlocks.RAW_PINK_GARNET_BLOCK.get());
        dropSelf(ModBlocks.END_STONE_BRICK_PILLAR.get());
        dropSelf(ModBlocks.DEEP_NETHERRACK.get());
        dropSelf(ModBlocks.ROUGH_STONE.get());
        dropSelf(ModBlocks.ROUGH_STONE_BRICKS.get());
        dropSelf(ModBlocks.AMBER_BLOCK.get());
        this.dropSelf(ModBlocks.HELLBARK_LOG.get());
        this.dropSelf(ModBlocks.HELLBARK_WOOD.get());
        this.dropSelf(ModBlocks.HELLBARK_PLANKS.get());
        this.dropSelf(ModBlocks.HELLBARK_SAPLING.get());
        this.dropSelf(ModBlocks.STRIPPED_HELLBARK_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_HELLBARK_WOOD.get());

        this.dropSelf(ModBlocks.JAZIA.get());
        this.add(ModBlocks.POTTED_JAZIA.get(), createPotFlowerItemTable(ModBlocks.JAZIA));

        this.add(ModBlocks.HELLBARK_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.HELLBARK_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.BLACK_OPAL_END_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACK_OPAL_END_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        this.add(ModBlocks.BISMUTH_END_ORE.get(),
                block -> createOreDrop(ModBlocks.BISMUTH_END_ORE.get(), ModItems.RAW_BISMUTH.get()));
        this.add(ModBlocks.SULFUR_NETHER_ORE.get(),
                block -> createOreDrop(ModBlocks.SULFUR_NETHER_ORE.get(), ModItems.RAW_SULFUR.get()));
        this.add(ModBlocks.RUBY_NETHER_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_NETHER_ORE.get(), ModItems.RAW_RUBY.get()));
        this.add(ModBlocks.PINK_GARNET_END_ORE.get(),
                block -> createOreDrop(ModBlocks.PINK_GARNET_END_ORE.get(), ModItems.RAW_PINK_GARNET.get()));
        this.add(ModBlocks.AMBER_NETHER_ORE.get(),
                block -> createOreDrop(ModBlocks.AMBER_NETHER_ORE.get(), ModItems.RAW_AMBER.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
