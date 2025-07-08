package net.icedly.netherend.block;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.custom.ModRotatedPillarBlock;
import net.icedly.netherend.block.custom.ModSaplingBlock;
import net.icedly.netherend.item.ModItems;
import net.icedly.netherend.worldgen.tree.ModTreeGrowers;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EndandNether.MOD_ID);

    public static final DeferredBlock<Block> BLACK_OPAL_BLOCK = registerBlock("black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> ROTTED_END_STONE = registerBlock("rotted_end_stone",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f)));
    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RAW_BLACK_OPAL_BLOCK = registerBlock("raw_black_opal_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_OPAL_END_ORE = registerBlock("black_opal_end_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BISMUTH_END_ORE = registerBlock("bismuth_end_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SULFUR_NETHER_ORE = registerBlock("sulfur_nether_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> RUBY_NETHER_ORE = registerBlock("ruby_nether_ore",
            () -> new DropExperienceBlock(UniformInt.of(2, 5),
                    BlockBehaviour.Properties.of().strength(4f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> HELLBARK_LOG = registerBlock("hellbark_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_STEM)));
    public static final DeferredBlock<Block> HELLBARK_WOOD = registerBlock("hellbark_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_STEM)));
    public static final DeferredBlock<Block> STRIPPED_HELLBARK_LOG = registerBlock("stripped_hellbark_log",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CRIMSON_STEM)));
    public static final DeferredBlock<Block> STRIPPED_HELLBARK_WOOD = registerBlock("stripped_hellbark_wood",
            () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CRIMSON_STEM)));

    public static final DeferredBlock<Block> HELLBARK_PLANKS = registerBlock("hellbark_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS)));

    public static final DeferredBlock<Block> HELLBARK_LEAVES = registerBlock("hellbark_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK)));

    public static final DeferredBlock<Block> HELLBARK_SAPLING = registerBlock("hellbark_sapling",
            () -> new ModSaplingBlock(ModTreeGrowers.HELLBARK, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING), Blocks.NETHERRACK));



    private static <T extends Block>DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;

    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
