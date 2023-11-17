package net.hecco.bountifulcuisine.block.custom;

import net.hecco.bountifulcuisine.block.DyeableCeramicBlockInterface;
import net.hecco.bountifulcuisine.block.ModBlocks;
import net.hecco.bountifulcuisine.block.custom.entity.CeramicTilesBlockEntity;
import net.hecco.bountifulcuisine.block.custom.entity.CheckeredCeramicTilesBlockEntity;
import net.hecco.bountifulcuisine.block.custom.entity.ModBlockEntities;
import net.hecco.bountifulcuisine.block.enums.Flower;
import net.hecco.bountifulcuisine.entity.ModEntities;
import net.hecco.bountifulcuisine.item.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CeramicTilesBlock extends TransparentBlock implements DyeableCeramicBlockInterface {
    public CeramicTilesBlock(Settings settings) {
        super(settings);
    }
    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        if (CeramicTilesBlockEntity.getColor(world, pos) != CeramicTilesBlockEntity.DEFAULT_COLOR) {
            ItemStack stack = super.getPickStack(world, pos, state);
            return pickBlock(world,pos,stack);
        } else {
            return new ItemStack(ModBlocks.CERAMIC_TILES);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        int oldColor = CeramicTilesBlockEntity.getColor(world, pos);
        if ((itemStack.isOf(Items.SPONGE) || itemStack.isOf(Items.WET_SPONGE)) && CheckeredCeramicTilesBlockEntity.getColor(world, pos) != CheckeredCeramicTilesBlockEntity.DEFAULT_COLOR) {
            world.setBlockState(pos, ModBlocks.CHECKERED_CERAMIC_TILES.getStateWithProperties(state));
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BLOCK_BIG_DRIPLEAF_TILT_UP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (world.getBlockEntity(pos) instanceof CheckeredCeramicTilesBlockEntity checkeredCeramicTilesBlockEntity) {
                checkeredCeramicTilesBlockEntity.color = oldColor;
                checkeredCeramicTilesBlockEntity.markDirty();
                return ActionResult.SUCCESS;
            }
        }
        return ActionResult.PASS;
    }

    @Override
    public BlockState getAppearance(BlockState state, BlockRenderView renderView, BlockPos pos, Direction side, @Nullable BlockState sourceState, @Nullable BlockPos sourcePos) {
        return super.getAppearance(state, renderView, pos, side, sourceState, sourcePos);
    }
}