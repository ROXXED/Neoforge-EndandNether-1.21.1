package net.icedly.netherend.worldgen.biome;

import net.icedly.netherend.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

import static net.icedly.netherend.block.ModBlocks.DEEP_NETHERRACK;
import static net.icedly.netherend.block.ModBlocks.ROTTED_END_STONE;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource RED_TERRACOTTA = makeStateRule(Blocks.RED_TERRACOTTA);
    private static final SurfaceRules.RuleSource BLUE_TERRACOTTA = makeStateRule(Blocks.BLUE_TERRACOTTA);
    private static final SurfaceRules.RuleSource GREEN_TERRACOTTA = makeStateRule(Blocks.GREEN_TERRACOTTA);

    private static final SurfaceRules.RuleSource OBSIDIAN = makeStateRule(Blocks.OBSIDIAN);
    private static final SurfaceRules.RuleSource ROTTED_END_STONE = makeStateRule(ModBlocks.ROTTED_END_STONE.get());
    private static final SurfaceRules.RuleSource END_SAND = makeStateRule(ModBlocks.END_SAND.get());
    private static final SurfaceRules.RuleSource END_DIRT = makeStateRule(ModBlocks.END_DIRT.get());
    private static final SurfaceRules.RuleSource END_STONE = makeStateRule(Blocks.END_STONE);

    private static final SurfaceRules.RuleSource GLOWSTONE = makeStateRule(Blocks.GLOWSTONE);
    private static final SurfaceRules.RuleSource NETHERRACK = makeStateRule(Blocks.NETHERRACK);
    private static final SurfaceRules.RuleSource DEEP_NETHERRACK = makeStateRule(ModBlocks.DEEP_NETHERRACK.get());
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);
    private static final SurfaceRules.RuleSource CRIMSON_NYLIUM = makeStateRule(Blocks.CRIMSON_NYLIUM);


    public static SurfaceRules.RuleSource makeEerieValleyRules() {
        return SurfaceRules.sequence();

    }

    public static SurfaceRules.RuleSource makeGlowstonePlainsRules() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK),
                SurfaceRules.ifTrue(SurfaceRules.not(SurfaceRules.verticalGradient("bedrock_roof", VerticalAnchor.belowTop(5), VerticalAnchor.top())), BEDROCK),

                // Then apply biome-specific rules
                SurfaceRules.ifTrue(
                        SurfaceRules.isBiome(ModBiomes.HELLBARK_FOREST),
                        SurfaceRules.sequence(
                                // Obsidian on the undersides of ceilings
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_CEILING, NETHERRACK),
                                // Obsidian on the undersides of floors (though less common in Nether caves)
                                SurfaceRules.ifTrue(SurfaceRules.UNDER_FLOOR, NETHERRACK),
                                SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, DEEP_NETHERRACK),
                                // Default to glowstone if not under a ceiling or floor
                                NETHERRACK))
        );

    }
    public static SurfaceRules.RuleSource makeEndDunesRules() {
        // Default to end stone
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.END_DUNES), END_SAND),
                // Default to end stone
                SurfaceRules.ifTrue(SurfaceRules.DEEP_UNDER_FLOOR, ROTTED_END_STONE),
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, END_SAND)
        );
        }






    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
