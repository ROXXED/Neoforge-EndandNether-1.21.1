package net.icedly.netherend.worldgen;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> HELLBARK_PLACED_KEY = registerKey("hellbark_placed");

    public static final ResourceKey<PlacedFeature> JAZIA_PLACED_KEY = registerKey("jazia_placed");

    public static final ResourceKey<PlacedFeature> NETHER_SULFUR_ORE_PLACED_KEY = registerKey("nether_sulfur_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_AMBER_ORE_PLACED_KEY = registerKey("nether_amber_ore_placed");
    public static final ResourceKey<PlacedFeature> END_BLACK_OPAL_ORE_PLACED_KEY = registerKey("end_black_opal_ore_placed");
    public static final ResourceKey<PlacedFeature> END_BISMUTH_ORE_PLACED_KEY = registerKey("end_bismuth_ore_placed");
    public static final ResourceKey<PlacedFeature> END_PINK_GARNET_ORE_PLACED_KEY = registerKey("end_pink_garnet_ore_placed");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, HELLBARK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.HELLBARK_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.HELLBARK_SAPLING.get()));

        register(context, NETHER_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_RUBY_ORE_KEY),
                ModOrePlacements.commonOrePlacement(16,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_AMBER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_AMBER_ORE_KEY),
                ModOrePlacements.commonOrePlacement(12,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NETHER_SULFUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_SULFUR_ORE_KEY),
                ModOrePlacements.commonOrePlacement(24,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_BLACK_OPAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_BLACK_OPAL_ORE_KEY),
                ModOrePlacements.commonOrePlacement(9,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_BISMUTH_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_BISMUTH_ORE_KEY),
                ModOrePlacements.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_PINK_GARNET_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_PINK_GARNET_ORE_KEY),
                ModOrePlacements.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, JAZIA_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.JAZIA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}