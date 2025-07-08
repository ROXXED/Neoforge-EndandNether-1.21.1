package net.icedly.netherend.datagen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.icedly.netherend.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EndandNether.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.BLACK_OPAL.get());
        basicItem(ModItems.RAW_BLACK_OPAL.get());
        basicItem(ModItems.RAW_SULFUR.get());
        basicItem(ModItems.SULFUR_INGOT.get());
        basicItem(ModItems.RAW_RUBY.get());
        basicItem(ModItems.RUBY_INGOT.get());
        basicItem(ModItems.RAW_BISMUTH.get());
        basicItem(ModItems.BISMUTH.get());


        saplingItem(ModBlocks.HELLBARK_SAPLING);
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID,"block/" + item.getId().getPath()));
    }
}
