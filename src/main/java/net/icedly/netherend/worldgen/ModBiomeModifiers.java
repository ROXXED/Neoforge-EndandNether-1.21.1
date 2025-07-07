package net.icedly.netherend.worldgen;

import net.icedly.netherend.EndandNether;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TREE_HELLBARK = registerKey("add_tree_hellbark");


    public static final ResourceKey<BiomeModifier> ADD_NETHER_SULFUR_ORE =registerKey("add_nether_sulfur_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_BLACK_OPAL_ORE =registerKey("add_black_opal_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);


    context.register(ADD_TREE_HELLBARK, new BiomeModifiers.AddFeaturesBiomeModifier((

            biomes.getOrThrow(Tags.Biomes.IS_NETHER)),
            HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.HELLBARK_PLACED_KEY)),
            GenerationStep.Decoration.VEGETAL_DECORATION));
    {


    }




        context.register(ADD_NETHER_SULFUR_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SULFUR_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_END_BLACK_OPAL_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_BLACK_OPAL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

    }


    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, name));
    }
}
