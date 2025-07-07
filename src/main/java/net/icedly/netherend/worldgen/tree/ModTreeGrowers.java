package net.icedly.netherend.worldgen.tree;

import net.icedly.netherend.EndandNether;
import net.icedly.netherend.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower HELLBARK = new TreeGrower(EndandNether.MOD_ID + ":hellbark",
            Optional.empty(), Optional.of(ModConfiguredFeatures.HELLBARK_KEY), Optional.empty());

}
