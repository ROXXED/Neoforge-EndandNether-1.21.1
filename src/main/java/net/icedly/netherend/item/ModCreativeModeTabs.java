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
                    .icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK.get()))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_SULFUR);
                        pOutput.accept(ModItems.SULFUR_INGOT);
                        pOutput.accept(ModItems.RAW_RUBY);
                        pOutput.accept(ModItems.RUBY_INGOT);
                        pOutput.accept(ModBlocks.SULFUR_NETHER_ORE);
                        pOutput.accept(ModBlocks.RUBY_NETHER_ORE);
                        pOutput.accept(ModBlocks.RUBY_BLOCK);
                        pOutput.accept(ModBlocks.DEEP_NETHERRACK);
                        pOutput.accept(ModBlocks.HELLBARK_LEAVES);
                        pOutput.accept(ModBlocks.HELLBARK_LOG);
                        pOutput.accept(ModBlocks.HELLBARK_PLANKS);
                        pOutput.accept(ModBlocks.HELLBARK_SAPLING);
                        pOutput.accept(ModBlocks.STRIPPED_HELLBARK_LOG);

                    }).build());    public static final Supplier<CreativeModeTab> END_EXTENDED_TAB =
            CREATIVE_MOD_TABS.register("end_extended_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.endandnether.end_extended_tab"))
                    .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, "nether_extended_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BLACK_OPAL);
                        pOutput.accept(ModItems.BISMUTH);
                        pOutput.accept(ModItems.RAW_BISMUTH);
                        pOutput.accept(ModBlocks.BISMUTH_END_ORE);
                        pOutput.accept(ModItems.RAW_BLACK_OPAL);
                        pOutput.accept(ModBlocks.BLACK_OPAL_END_ORE);
                        pOutput.accept(ModBlocks.BISMUTH_BLOCK);
                        pOutput.accept(ModBlocks.RAW_BLACK_OPAL_BLOCK);
                        pOutput.accept(ModBlocks.BLACK_OPAL_BLOCK);
                        pOutput.accept(ModBlocks.ROTTED_END_STONE);
                        pOutput.accept(ModBlocks.END_SAND);
                        pOutput.accept(ModItems.SKULL_END_ARTIFACT);
                        pOutput.accept(ModItems.ENDER_SPIKE_STICK);
                        pOutput.accept(ModItems.ENDER_SPIKE_SPEAR);
                        pOutput.accept(ModItems.BLACK_OPAL_SWORD);
                        pOutput.accept(ModItems.BLACK_OPAL_AXE);
                        pOutput.accept(ModItems.BLACK_OPAL_HOE);
                        pOutput.accept(ModItems.BLACK_OPAL_PICKAXE);
                        pOutput.accept(ModItems.BLACK_OPAL_PAXEL);
                        pOutput.accept(ModItems.BLACK_OPAL_HAMMER);
                        pOutput.accept(ModItems.BLACK_OPAL_SHOVEL);
                        pOutput.accept(ModItems.BISMUTH_SWORD);
                        pOutput.accept(ModItems.BISMUTH_HOE);
                        pOutput.accept(ModItems.BISMUTH_AXE);
                        pOutput.accept(ModItems.BISMUTH_PICKAXE);
                        pOutput.accept(ModItems.BISMUTH_SHOVEL);
                        pOutput.accept(ModItems.BISMUTH_HAMMER);
                        pOutput.accept(ModItems.STARLIGHT_ASHES);
                        pOutput.accept(ModItems.RAW_PINK_GARNET);
                        pOutput.accept(ModItems.PINK_GARNET);
                        pOutput.accept(ModBlocks.PINK_GARNET_BLOCK);
                        pOutput.accept(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        pOutput.accept(ModBlocks.PINK_GARNET_END_ORE);
                        pOutput.accept(ModBlocks.END_STONE_BRICK_PILLAR);


                        pOutput.accept(ModItems.BLACK_OPAL_HELMET);
                        pOutput.accept(ModItems.BLACK_OPAL_CHESTPLATE);
                        pOutput.accept(ModItems.BLACK_OPAL_LEGGINGS);
                        pOutput.accept(ModItems.BLACK_OPAL_BOOTS);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
