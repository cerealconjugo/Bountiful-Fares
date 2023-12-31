package net.hecco.bountifulcuisine.block.entity;

import net.hecco.bountifulcuisine.block.custom.ChamomileCandleBlock;
import net.hecco.bountifulcuisine.effect.ModEffects;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class ChamomileCandleBlockEntity extends BlockEntity {
    private static BooleanProperty isLit;
    public ChamomileCandleBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CHAMOMILE_CANDLE_BLOCK_ENTITY, pos, state);
        isLit = ((ChamomileCandleBlock)state.getBlock()).getLit();
    }
    public static void tick(World world, BlockPos pos, BlockState state, ChamomileCandleBlockEntity blockEntity) {
        if (world.getTime() % 25L == 0L) {
            Box box = new Box(pos).expand(3);
            List<PlayerEntity> list = world.getNonSpectatingEntities(PlayerEntity.class, box);
            if (state.get(isLit)) {
                if (!world.isClient() && !list.isEmpty()) {
                    for (PlayerEntity playerEntity : list) {
                        StatusEffectInstance existingEffect = playerEntity.getStatusEffect(ModEffects.EBULLIENCE);
                        if (existingEffect == null) {
                            playerEntity.addStatusEffect(new StatusEffectInstance(ModEffects.EBULLIENCE, 50, 0, true, false, true));
                        } else if (existingEffect.isAmbient() || existingEffect.getAmplifier() < 0 || existingEffect.isDurationBelow(50)) {
                            playerEntity.addStatusEffect(new StatusEffectInstance(ModEffects.EBULLIENCE, 50, 0, true, false, true));
                        }
                    }
                }
            }
        }
    }
}
