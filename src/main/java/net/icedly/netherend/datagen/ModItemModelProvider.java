package net.icedly.netherend.datagen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

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
    }
}
