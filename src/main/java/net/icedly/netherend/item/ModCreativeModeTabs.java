package net.icedly.netherend.item;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EndandNether.MOD_ID);


    public static final Supplier<CreativeModeTab> NETHER_EXTENDED_TAB =
            CREATIVE_MOD_TABS.register("nether_extended_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.endandnether.nether_extended_tab"))
                    .icon(() -> new ItemStack(ModItems.RAW_SULFUR.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_SULFUR);
                        pOutput.accept(ModItems.SULFUR_INGOT);
                        pOutput.accept(ModItems.RAW_RUBY);
                        pOutput.accept(ModItems.RUBY_INGOT);
                        pOutput.accept(ModBlocks.SULFUR_NETHER_ORE);
                        pOutput.accept(ModBlocks.RUBY_NETHER_ORE);
                        pOutput.accept(ModBlocks.RUBY_BLOCK);
                        pOutput.accept(ModBlocks.HELLBARK_LEAVES);
                        pOutput.accept(ModBlocks.HELLBARK_LOG);
                        pOutput.accept(ModBlocks.HELLBARK_PLANKS);
                        pOutput.accept(ModBlocks.HELLBARK_SAPLING);
                        pOutput.accept(ModBlocks.STRIPPED_HELLBARK_LOG);

                    }).build());    public static final Supplier<CreativeModeTab> END_EXTENDED_TAB =
            CREATIVE_MOD_TABS.register("end_extended_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.endandnether.end_extended_tab"))
                    .icon(() -> new ItemStack(ModItems.RAW_BLACK_OPAL.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, "nether_extended_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLACK_OPAL);
                        pOutput.accept(ModItems.BISMUTH);
                        pOutput.accept(ModItems.RAW_BISMUTH);
                        pOutput.accept(ModBlocks.BISMUTH_END_ORE);
                        pOutput.accept(ModItems.RAW_BLACK_OPAL);
                        pOutput.accept(ModBlocks.BLACK_OPAL_END_ORE);
                        pOutput.accept(ModBlocks.RAW_BLACK_OPAL_BLOCK);
                        pOutput.accept(ModBlocks.BLACK_OPAL_BLOCK);
                        pOutput.accept(ModBlocks.ROTTED_END_STONE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
