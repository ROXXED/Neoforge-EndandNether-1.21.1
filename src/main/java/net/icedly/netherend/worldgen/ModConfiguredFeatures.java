package net.icedly.netherend.worldgen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import org.apache.commons.codec.language.bm.Rule;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SULFUR_ORE_KEY = registerKey("sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_BLACK_OPAL_ORE_KEY = registerKey("black_opal_ore");


    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {


        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        register(context, NETHER_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.SULFUR_NETHER_ORE.get().defaultBlockState(),9));

        register(context, END_BLACK_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
                ModBlocks.BLACK_OPAL_END_ORE.get().defaultBlockState(),9));

    }





    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, name));







    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
