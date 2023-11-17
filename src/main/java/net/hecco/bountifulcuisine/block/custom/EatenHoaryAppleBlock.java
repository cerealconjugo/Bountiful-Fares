package net.hecco.bountifulcuisine.block.custom;

import net.hecco.bountifulcuisine.block.ModBlocks;
import net.hecco.bountifulcuisine.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class EatenHoaryAppleBlock extends EatenFruitBlock {

    private static final VoxelShape[] NORTH_SHAPES = new VoxelShape[] {
            Stream.of(
                    Block.createCuboidShape(8, 0, 0, 16, 16, 16),
                    Block.createCuboidShape(0, 0, 8, 8, 16, 16),
                    Block.createCuboidShape(4, 16, 8, 12, 20, 12),
                    Block.createCuboidShape(8, 16, 4, 12, 20, 8)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 8, 16, 16, 16), Block.createCuboidShape(4, 16, 8, 12, 20, 12), BooleanBiFunction.OR),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 8, 8, 16, 16), Block.createCuboidShape(4, 16, 8, 8, 20, 12), BooleanBiFunction.OR)
    };
    private static final VoxelShape[] EAST_SHAPES = new VoxelShape[] {
            Stream.of(
                    Block.createCuboidShape(0, 0, 8, 16, 16, 16),
                    Block.createCuboidShape(0, 0, 0, 8, 16, 8),
                    Block.createCuboidShape(4, 16, 4, 8, 20, 12),
                    Block.createCuboidShape(8, 16, 8, 12, 20, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 8, 16, 16), Block.createCuboidShape(4, 16, 4, 8, 20, 12), BooleanBiFunction.OR),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 8, 16, 8), Block.createCuboidShape(4, 16, 4, 8, 20, 8), BooleanBiFunction.OR)
    };
    private static final VoxelShape[] SOUTH_SHAPES = new VoxelShape[] {
            Stream.of(
                    Block.createCuboidShape(0, 0, 0, 8, 16, 16),
                    Block.createCuboidShape(8, 0, 0, 16, 16, 8),
                    Block.createCuboidShape(4, 16, 4, 12, 20, 8),
                    Block.createCuboidShape(4, 16, 8, 8, 20, 12)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 0, 0, 16, 16, 8), Block.createCuboidShape(4, 16, 4, 12, 20, 8), BooleanBiFunction.OR),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(8, 0, 0, 16, 16, 8), Block.createCuboidShape(8, 16, 4, 12, 20, 8), BooleanBiFunction.OR)
    };
    private static final VoxelShape[] WEST_SHAPES = new VoxelShape[] {
            Stream.of(
                    Block.createCuboidShape(0, 0, 0, 16, 16, 8),
                    Block.createCuboidShape(8, 0, 8, 16, 16, 16),
                    Block.createCuboidShape(8, 16, 4, 12, 20, 12),
                    Block.createCuboidShape(4, 16, 4, 8, 20, 8)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get(),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(8, 0, 0, 16, 16, 16), Block.createCuboidShape(8, 16, 4, 12, 20, 12), BooleanBiFunction.OR),
            VoxelShapes.combineAndSimplify(Block.createCuboidShape(8, 0, 8, 16, 16, 16), Block.createCuboidShape(8, 16, 8, 12, 20, 12), BooleanBiFunction.OR)
    };
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(FACING) == Direction.NORTH) {
            return NORTH_SHAPES[state.get(SLICES)];
        } else if (state.get(FACING) == Direction.EAST) {
            return EAST_SHAPES[state.get(SLICES)];
        } else if (state.get(FACING) == Direction.SOUTH) {
            return SOUTH_SHAPES[state.get(SLICES)];
        } else if (state.get(FACING) == Direction.WEST) {
            return WEST_SHAPES[state.get(SLICES)];
        }
        return NORTH_SHAPES[state.get(SLICES)];
    }
    public EatenHoaryAppleBlock(Settings settings) {
        super(settings);
    }
    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(ModBlocks.HOARY_APPLE_BLOCK);
    }
}