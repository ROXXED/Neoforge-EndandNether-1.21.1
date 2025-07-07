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
        dropSelf(ModBlocks.RAW_BLACK_OPAL_BLOCK.get());

        this.add(ModBlocks.BLACK_OPAL_END_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACK_OPAL_END_ORE.get(), ModItems.RAW_BLACK_OPAL.get()));
        this.add(ModBlocks.SULFUR_NETHER_ORE.get(),
                block -> createOreDrop(ModBlocks.SULFUR_NETHER_ORE.get(), ModItems.RAW_SULFUR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
