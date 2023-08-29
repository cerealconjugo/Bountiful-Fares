package net.hecco.bountifulcuisine.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hecco.bountifulcuisine.BountifulCuisine;
import net.hecco.bountifulcuisine.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static ItemGroup BOUNTIFUL_CUISINE = Registry.register(Registries.ITEM_GROUP, new Identifier(BountifulCuisine.MOD_ID, "bountiful_cuisine"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bountiful_cuisine"))
                    .icon(() -> new ItemStack(ModItems.PASSION_FRUIT)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.APPLE_LOG);
                        entries.add(ModBlocks.APPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_APPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_APPLE_WOOD);
                        entries.add(ModBlocks.APPLE_LEAVES);
                        entries.add(ModBlocks.BLOSSOMING_APPLE_LEAVES);
                        entries.add(Items.APPLE);
                        entries.add(ModBlocks.GIANT_APPLE_BLOCK);
                        entries.add(ModBlocks.APPLE_SAPLING);
                        entries.add(ModBlocks.ORANGE_LOG);
                        entries.add(ModBlocks.ORANGE_WOOD);
                        entries.add(ModBlocks.STRIPPED_ORANGE_LOG);
                        entries.add(ModBlocks.STRIPPED_ORANGE_WOOD);
                        entries.add(ModBlocks.ORANGE_LEAVES);
                        entries.add(ModBlocks.BLOSSOMING_ORANGE_LEAVES);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModBlocks.GIANT_ORANGE_BLOCK);
                        entries.add(ModBlocks.ORANGE_SAPLING);
                        entries.add(ModBlocks.LEMON_LOG);
                        entries.add(ModBlocks.LEMON_WOOD);
                        entries.add(ModBlocks.STRIPPED_LEMON_LOG);
                        entries.add(ModBlocks.STRIPPED_LEMON_WOOD);
                        entries.add(ModBlocks.LEMON_LEAVES);
                        entries.add(ModBlocks.BLOSSOMING_LEMON_LEAVES);
                        entries.add(ModItems.LEMON);
                        entries.add(ModBlocks.GIANT_LEMON_BLOCK);
                        entries.add(ModBlocks.LEMON_SAPLING);
                        entries.add(ModBlocks.PLUM_LOG);
                        entries.add(ModBlocks.PLUM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PLUM_LOG);
                        entries.add(ModBlocks.STRIPPED_PLUM_WOOD);
                        entries.add(ModBlocks.PLUM_LEAVES);
                        entries.add(ModBlocks.BLOSSOMING_PLUM_LEAVES);
                        entries.add(ModItems.PLUM);
                        entries.add(ModBlocks.GIANT_PLUM_BLOCK);
                        entries.add(ModBlocks.PLUM_SAPLING);
                        entries.add(ModItems.HOARY_SEEDS);
                        entries.add(ModBlocks.HOARY_FIG_SAPLING);
                        entries.add(ModBlocks.HOARY_LOG);
                        entries.add(ModBlocks.HOARY_WOOD);
                        entries.add(ModBlocks.STRIPPED_HOARY_LOG);
                        entries.add(ModBlocks.STRIPPED_HOARY_WOOD);
                        entries.add(ModBlocks.HOARY_PLANKS);
                        entries.add(ModBlocks.HOARY_STAIRS);
                        entries.add(ModBlocks.HOARY_SLAB);
                        entries.add(ModBlocks.HOARY_FENCE);
                        entries.add(ModBlocks.HOARY_FENCE_GATE);
                        entries.add(ModBlocks.HOARY_DOOR);
                        entries.add(ModBlocks.HOARY_TRAPDOOR);
                        entries.add(ModBlocks.HOARY_PRESSURE_PLATE);
                        entries.add(ModBlocks.HOARY_BUTTON);
                        entries.add(ModItems.HOARY_SIGN);
                        entries.add(ModItems.HOARY_HANGING_SIGN);
                        entries.add(ModItems.HOARY_BOAT);
                        entries.add(ModItems.HOARY_CHEST_BOAT);
                        entries.add(ModBlocks.HOARY_LEAVES);
                        entries.add(ModItems.CITRUS_JUICE_BOTTLE);
                        entries.add(ModItems.CITRIC_ACID);
                        entries.add(ModItems.CANDIED_ORANGE);
                        entries.add(ModItems.CANDIED_LEMON);
                        entries.add(ModBlocks.TRELLIS);
                        entries.add(ModItems.PASSION_FRUIT);
                        entries.add(ModItems.ELDERBERRIES);
                        entries.add(Items.GLOW_BERRIES);
                        entries.add(ModItems.LAPISBERRIES);
                        entries.add(ModItems.LAPISBERRY_SEEDS);
                        entries.add(ModItems.WILD_CARROT);
                        entries.add(ModItems.WILD_POTATO);
                        entries.add(ModItems.WILD_WHEAT_SEEDS);
                        entries.add(ModItems.WILD_BEETROOT_SEEDS);
                        entries.add(ModItems.FELDSPAR);
                        entries.add(ModBlocks.FELDSPAR_BLOCK);
                        entries.add(ModItems.CERAMIC_CLAY);
                        entries.add(ModBlocks.CERAMIC_CLAY_BLOCK);
                        entries.add(ModItems.CERAMIC_TILE);
                        entries.add(ModBlocks.CERAMIC_TILES);
                        entries.add(ModBlocks.CERAMIC_TILE_STAIRS);
                        entries.add(ModBlocks.CERAMIC_TILE_SLAB);
                        entries.add(ModBlocks.CHECKERED_CERAMIC_TILES);
                        entries.add(ModBlocks.FERMENTATION_VESSEL);
                        entries.add(ModItems.ELDERBERRY_WINE);
                        entries.add(ModItems.FARMERS_HAT);
                    }).build());
    public static void registerItemGroups() {
        BountifulCuisine.LOGGER.info("Registering Item Group Entries for " + BountifulCuisine.MOD_ID);
    }
}
