package net.icedly.netherend.util;

import net.icedly.netherend.EndandNether;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_BLACK_OPAL_TOOL = createTag("incorrect_for_black_opal_tool");
        public static final TagKey<Block> NEEDS_BLACK_OPAL_TOOL = createTag("needs_black_opal_tool");

        public static final TagKey<Block> INCORRECT_FOR_BISMUTH_TOOL = createTag("incorrect_for_bismuth_tool");
        public static final TagKey<Block> NEEDS_BISMUTH_TOOL = createTag("needs_bismuth_tool");

        public static final TagKey<Block> PAXEL_MINEABLE = createTag("mineable/paxel");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, name));
        }
    }
}
