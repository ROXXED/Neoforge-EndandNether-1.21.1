package net.icedly.netherend.worldgen.biome;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.worldgen.biome.region.NetherRegion;
import net.icedly.netherend.worldgen.biome.region.OverworldRegion;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import terrablender.api.EndBiomeRegistry;
import terrablender.api.Regions;

public class ModBiomes {
    public static final ResourceKey<Biome> HELLBARK_FOREST = registerBiomeKey("hellbark_forest");
    public static final ResourceKey<Biome> END_DUNES = registerBiomeKey("end_dunes");

    public static void registerBiomes() {
        Regions.register(new OverworldRegion(ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, "endandnether_overworld"), 20));
        Regions.register(new NetherRegion(ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, "endandnether_nether"), 20));

        EndBiomeRegistry.registerHighlandsBiome(END_DUNES, 20);
    }

    public static void bootstrap(BootstrapContext<Biome> context) {
        var carver = context.lookup(Registries.CONFIGURED_CARVER);
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        register(context, HELLBARK_FOREST, ModNetherBiomes.hellbarkForest(placedFeatures, carver));
        register(context, END_DUNES, ModEndBiomes.endDunes(placedFeatures, carver));
    }


    private static void register(BootstrapContext<Biome> context, ResourceKey<Biome> key, Biome biome) {
        context.register(key, biome);
    }

    private static ResourceKey<Biome> registerBiomeKey(String name) {
        return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(EndandNether.MOD_ID, name));
    }
}
