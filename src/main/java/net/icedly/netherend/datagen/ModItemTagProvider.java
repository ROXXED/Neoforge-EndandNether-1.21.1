package net.icedly.netherend.datagen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.icedly.netherend.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.nbt.Tag;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EndandNether.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {


        tag(ItemTags.LOGS)
                .add(ModBlocks.HELLBARK_LOG.get().asItem())
                .add(ModBlocks.HELLBARK_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_HELLBARK_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_HELLBARK_WOOD.get().asItem());

        tag(ItemTags.PLANKS)
                .add(ModBlocks.HELLBARK_PLANKS.get().asItem());


        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLACK_OPAL_HELMET.get())
                .add(ModItems.BLACK_OPAL_CHESTPLATE.get())
                .add(ModItems.BLACK_OPAL_LEGGINGS.get())
                .add(ModItems.BLACK_OPAL_BOOTS.get());
    }
}
