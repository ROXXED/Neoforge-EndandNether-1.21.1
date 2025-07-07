package net.icedly.netherend.block.custom;

import net.icedly.netherend.block.ModBlocks;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ItemAbility;
import org.jetbrains.annotations.Nullable;

public class ModRotatedPillarBlock extends RotatedPillarBlock {
    public ModRotatedPillarBlock(Properties properties) {
        super(properties);
    }


    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem)
            if(state.is(ModBlocks.HELLBARK_LOG)) {
                return ModBlocks.STRIPPED_HELLBARK_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));

            }

        return super.getToolModifiedState(state, context, itemAbility, simulate);
    }
}
