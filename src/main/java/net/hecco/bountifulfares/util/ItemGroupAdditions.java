package net.hecco.bountifulfares.util;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hecco.bountifulfares.BountifulFares;
import net.hecco.bountifulfares.block.ModBlocks;
import net.hecco.bountifulfares.item.ModItems;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class ItemGroupAdditions {
    public static void registerItemGroupAdditions() {
//        BountifulFares.LOGGER.info("Adding Items to Vanilla Tabs from " + BountifulFares.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.addAfter(Items.OAK_FENCE_GATE, ModBlocks.OAK_PICKETS);
            entries.addAfter(Items.SPRUCE_FENCE_GATE, ModBlocks.SPRUCE_PICKETS);
            entries.addAfter(Items.BIRCH_FENCE_GATE, ModBlocks.BIRCH_PICKETS);
            entries.addAfter(Items.JUNGLE_FENCE_GATE, ModBlocks.JUNGLE_PICKETS);
            entries.addAfter(Items.ACACIA_FENCE_GATE, ModBlocks.ACACIA_PICKETS);
            entries.addAfter(Items.DARK_OAK_FENCE_GATE, ModBlocks.DARK_OAK_PICKETS);
            entries.addAfter(Items.MANGROVE_FENCE_GATE, ModBlocks.MANGROVE_PICKETS);
            entries.addAfter(Items.CHERRY_FENCE_GATE, ModBlocks.CHERRY_PICKETS);
            entries.addAfter(Items.BAMBOO_FENCE_GATE, ModBlocks.BAMBOO_PICKETS);
            entries.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WALNUT_LOG);
            entries.addAfter(ModBlocks.WALNUT_LOG, ModBlocks.WALNUT_WOOD);
            entries.addAfter(ModBlocks.WALNUT_WOOD, ModBlocks.STRIPPED_WALNUT_LOG);
            entries.addAfter(ModBlocks.STRIPPED_WALNUT_LOG, ModBlocks.STRIPPED_WALNUT_WOOD);
            entries.addAfter(ModBlocks.STRIPPED_WALNUT_WOOD, ModBlocks.WALNUT_PLANKS);
            entries.addAfter(ModBlocks.WALNUT_PLANKS, ModBlocks.WALNUT_STAIRS);
            entries.addAfter(ModBlocks.WALNUT_STAIRS, ModBlocks.WALNUT_SLAB);
            entries.addAfter(ModBlocks.WALNUT_SLAB, ModBlocks.WALNUT_FENCE);
            entries.addAfter(ModBlocks.WALNUT_FENCE, ModBlocks.WALNUT_FENCE_GATE);
            entries.addAfter(ModBlocks.WALNUT_FENCE_GATE, ModBlocks.WALNUT_PICKETS);
            entries.addAfter(ModBlocks.WALNUT_PICKETS, ModBlocks.WALNUT_DOOR);
            entries.addAfter(ModBlocks.WALNUT_DOOR, ModBlocks.WALNUT_TRAPDOOR);
            entries.addAfter(ModBlocks.WALNUT_TRAPDOOR, ModBlocks.WALNUT_PRESSURE_PLATE);
            entries.addAfter(ModBlocks.WALNUT_PRESSURE_PLATE, ModBlocks.WALNUT_BUTTON);
            entries.addAfter(ModBlocks.WALNUT_BUTTON, ModBlocks.HOARY_LOG);
            entries.addAfter(ModBlocks.HOARY_LOG, ModBlocks.HOARY_WOOD);
            entries.addAfter(ModBlocks.HOARY_WOOD, ModBlocks.STRIPPED_HOARY_LOG);
            entries.addAfter(ModBlocks.STRIPPED_HOARY_LOG, ModBlocks.STRIPPED_HOARY_WOOD);
            entries.addAfter(ModBlocks.STRIPPED_HOARY_WOOD, ModBlocks.HOARY_PLANKS);
            entries.addAfter(ModBlocks.HOARY_PLANKS, ModBlocks.HOARY_STAIRS);
            entries.addAfter(ModBlocks.HOARY_STAIRS, ModBlocks.HOARY_SLAB);
            entries.addAfter(ModBlocks.HOARY_SLAB, ModBlocks.HOARY_FENCE);
            entries.addAfter(ModBlocks.HOARY_FENCE, ModBlocks.HOARY_FENCE_GATE);
            entries.addAfter(ModBlocks.HOARY_FENCE_GATE, ModBlocks.HOARY_PICKETS);
            entries.addAfter(ModBlocks.HOARY_PICKETS, ModBlocks.HOARY_DOOR);
            entries.addAfter(ModBlocks.HOARY_DOOR, ModBlocks.HOARY_TRAPDOOR);
            entries.addAfter(ModBlocks.HOARY_TRAPDOOR, ModBlocks.HOARY_PRESSURE_PLATE);
            entries.addAfter(ModBlocks.HOARY_PRESSURE_PLATE, ModBlocks.HOARY_BUTTON);
            entries.addAfter(Items.CRIMSON_FENCE_GATE, ModBlocks.CRIMSON_PICKETS);
            entries.addAfter(Items.WARPED_FENCE_GATE, ModBlocks.WARPED_PICKETS);
            entries.addAfter(Items.WARPED_BUTTON, ModBlocks.APPLE_LOG);
            entries.addAfter(ModBlocks.APPLE_LOG, ModBlocks.APPLE_WOOD);
            entries.addAfter(ModBlocks.APPLE_WOOD, ModBlocks.STRIPPED_APPLE_LOG);
            entries.addAfter(ModBlocks.STRIPPED_APPLE_LOG, ModBlocks.STRIPPED_APPLE_WOOD);
            entries.addAfter(ModBlocks.STRIPPED_APPLE_WOOD, ModBlocks.ORANGE_LOG);
            entries.addAfter(ModBlocks.ORANGE_LOG, ModBlocks.ORANGE_WOOD);
            entries.addAfter(ModBlocks.ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_LOG);
            entries.addAfter(ModBlocks.STRIPPED_ORANGE_LOG, ModBlocks.STRIPPED_ORANGE_WOOD);
            entries.addAfter(ModBlocks.STRIPPED_ORANGE_WOOD, ModBlocks.LEMON_LOG);
            entries.addAfter(ModBlocks.LEMON_LOG, ModBlocks.LEMON_WOOD);
            entries.addAfter(ModBlocks.LEMON_WOOD, ModBlocks.STRIPPED_LEMON_LOG);
            entries.addAfter(ModBlocks.STRIPPED_LEMON_LOG, ModBlocks.STRIPPED_LEMON_WOOD);
            entries.addAfter(ModBlocks.STRIPPED_LEMON_WOOD, ModBlocks.PLUM_LOG);
            entries.addAfter(ModBlocks.PLUM_LOG, ModBlocks.PLUM_WOOD);
            entries.addAfter(ModBlocks.PLUM_WOOD, ModBlocks.STRIPPED_PLUM_LOG);
            entries.addAfter(ModBlocks.STRIPPED_PLUM_LOG, ModBlocks.STRIPPED_PLUM_WOOD);
            entries.addAfter(ModBlocks.STRIPPED_PLUM_WOOD, ModBlocks.TRELLIS);
            entries.addAfter(ModBlocks.TRELLIS, ModBlocks.WALNUT_MULCH);
            entries.addAfter(ModBlocks.WALNUT_MULCH, ModBlocks.WALNUT_MULCH_BLOCK);
            entries.addAfter(Items.DARK_PRISMARINE, ModBlocks.PRISMARINE_BLOSSOM);
            entries.addAfter(Items.PURPUR_SLAB, ModBlocks.FELDSPAR_BLOCK);
            entries.addAfter(ModBlocks.FELDSPAR_BLOCK, ModBlocks.CUT_FELDSPAR_BLOCK);
            entries.addAfter(ModBlocks.CUT_FELDSPAR_BLOCK, ModBlocks.FELDSPAR_BRICKS);
            entries.addAfter(ModBlocks.FELDSPAR_BRICKS, ModBlocks.FELDSPAR_BRICK_STAIRS);
            entries.addAfter(ModBlocks.FELDSPAR_BRICK_STAIRS, ModBlocks.FELDSPAR_BRICK_SLAB);
            entries.addAfter(ModBlocks.FELDSPAR_BRICK_SLAB, ModBlocks.CERAMIC_CLAY_BLOCK);
            entries.addAfter(ModBlocks.CERAMIC_CLAY_BLOCK, ModBlocks.CERAMIC_TILES);
            entries.addAfter(ModBlocks.CERAMIC_TILES, ModBlocks.CERAMIC_TILE_STAIRS);
            entries.addAfter(ModBlocks.CERAMIC_TILE_STAIRS, ModBlocks.CERAMIC_TILE_SLAB);
            entries.addAfter(ModBlocks.CERAMIC_TILE_SLAB, ModBlocks.CERAMIC_PRESSURE_PLATE);
            entries.addAfter(ModBlocks.CERAMIC_PRESSURE_PLATE, ModBlocks.CERAMIC_BUTTON);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.addAfter(Items.CHERRY_LOG, ModBlocks.APPLE_LOG);
            entries.addAfter(ModBlocks.APPLE_LOG, ModBlocks.ORANGE_LOG);
            entries.addAfter(ModBlocks.ORANGE_LOG, ModBlocks.LEMON_LOG);
            entries.addAfter(ModBlocks.LEMON_LOG, ModBlocks.PLUM_LOG);
            entries.addAfter(Items.CHERRY_LOG, ModBlocks.WALNUT_LOG);
            entries.addAfter(ModBlocks.WALNUT_LOG, ModBlocks.HOARY_LOG);
            entries.addAfter(Items.FLOWERING_AZALEA_LEAVES, ModBlocks.APPLE_LEAVES);
            entries.addAfter(ModBlocks.APPLE_LEAVES, ModBlocks.FLOWERING_APPLE_LEAVES);
            entries.addAfter(ModBlocks.FLOWERING_APPLE_LEAVES, ModBlocks.ORANGE_LEAVES);
            entries.addAfter(ModBlocks.ORANGE_LEAVES, ModBlocks.FLOWERING_ORANGE_LEAVES);
            entries.addAfter( ModBlocks.FLOWERING_ORANGE_LEAVES, ModBlocks.LEMON_LEAVES);
            entries.addAfter(ModBlocks.LEMON_LEAVES, ModBlocks.FLOWERING_LEMON_LEAVES);
            entries.addAfter(ModBlocks.FLOWERING_LEMON_LEAVES, ModBlocks.PLUM_LEAVES);
            entries.addAfter(ModBlocks.PLUM_LEAVES, ModBlocks.FLOWERING_PLUM_LEAVES);
            entries.addAfter(ModBlocks.FLOWERING_PLUM_LEAVES, ModBlocks.WALNUT_LEAVES);
            entries.addAfter(ModBlocks.WALNUT_LEAVES, ModBlocks.HOARY_LEAVES);
            entries.addAfter(Items.CHERRY_SAPLING, ModBlocks.APPLE_SAPLING);
            entries.addAfter(ModBlocks.APPLE_SAPLING, ModBlocks.ORANGE_SAPLING);
            entries.addAfter(ModBlocks.ORANGE_SAPLING, ModBlocks.LEMON_SAPLING);
            entries.addAfter(ModBlocks.LEMON_SAPLING, ModBlocks.PLUM_SAPLING);
            entries.addAfter(ModBlocks.PLUM_SAPLING, ModBlocks.HOARY_APPLE_SAPLING);
            entries.addAfter(ModBlocks.HOARY_APPLE_SAPLING, ModBlocks.WALNUT_SAPLING);
            entries.addAfter(Items.SNIFFER_EGG, ModBlocks.WILD_WHEAT);
            entries.addAfter(ModBlocks.WILD_WHEAT, ModBlocks.WILD_CARROTS);
            entries.addAfter(ModBlocks.WILD_CARROTS, ModBlocks.WILD_POTATOES);
            entries.addAfter(ModBlocks.WILD_POTATOES, ModBlocks.WILD_BEETROOTS);
            entries.addAfter(ModBlocks.WILD_BEETROOTS, ModBlocks.WILD_LEEKS);
            entries.addAfter(ModBlocks.WILD_LEEKS, ModBlocks.WILD_MAIZE);
            entries.addAfter(ModBlocks.WILD_MAIZE, ModBlocks.WILD_PASSION_FRUIT_VINE);
            entries.addAfter(ModBlocks.WILD_PASSION_FRUIT_VINE, ModBlocks.WILD_ELDERBERRY_VINE);
            entries.addAfter(Items.KELP, ModBlocks.SPONGEKIN);
            entries.addAfter(ModBlocks.SPONGEKIN, ModBlocks.PRISMARINE_BLOSSOM);
            entries.addAfter(Items.LILY_OF_THE_VALLEY, ModBlocks.CHAMOMILE_FLOWERS);
            entries.addAfter(ModBlocks.CHAMOMILE_FLOWERS, ModBlocks.HONEYSUCKLE);
            entries.addAfter(ModBlocks.HONEYSUCKLE, ModBlocks.VIOLET_BELLFLOWER);
            entries.addAfter(Items.BEETROOT_SEEDS, ModItems.MAIZE_SEEDS);
            entries.addAfter(ModItems.MAIZE_SEEDS, ModItems.LEEK_SEEDS);
            entries.addAfter(ModItems.LEEK_SEEDS, ModItems.TEA_BERRIES);
            entries.addAfter(ModItems.TEA_BERRIES, ModItems.SPONGEKIN_SEEDS);
            entries.addAfter(Items.PITCHER_POD, ModItems.LAPISBERRY_SEEDS);
            entries.addAfter(ModItems.LAPISBERRY_SEEDS, ModItems.HOARY_SEEDS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.addAfter(Items.LANTERN, ModBlocks.FELDSPAR_LANTERN);
            entries.addAfter(Items.GRINDSTONE, ModBlocks.GRISTMILL);
            entries.addAfter(Items.SOUL_CAMPFIRE, ModBlocks.GREEN_TEA_CANDLE);
            entries.addAfter(ModBlocks.GREEN_TEA_CANDLE, ModBlocks.BLACK_TEA_CANDLE);
            entries.addAfter(ModBlocks.BLACK_TEA_CANDLE, ModBlocks.CHAMOMILE_CANDLE);
            entries.addAfter(ModBlocks.CHAMOMILE_CANDLE, ModBlocks.HONEYSUCKLE_CANDLE);
            entries.addAfter(ModBlocks.HONEYSUCKLE_CANDLE, ModBlocks.BELLFLOWER_CANDLE);
            entries.addAfter(ModBlocks.BELLFLOWER_CANDLE, ModBlocks.TORCHFLOWER_CANDLE);
            entries.addAfter(ModBlocks.TORCHFLOWER_CANDLE, ModBlocks.WALNUT_CANDLE);
            entries.addAfter(ModBlocks.WALNUT_CANDLE, ModBlocks.FERMENTATION_VESSEL);
            entries.addAfter(Items.TINTED_GLASS, ModBlocks.TINGED_GLASS);
            entries.addAfter(Items.BAMBOO_HANGING_SIGN, ModItems.WALNUT_SIGN);
            entries.addAfter(ModItems.WALNUT_SIGN, ModItems.WALNUT_HANGING_SIGN);
            entries.addAfter(ModItems.WALNUT_HANGING_SIGN, ModItems.HOARY_SIGN);
            entries.addAfter(ModItems.HOARY_SIGN, ModItems.HOARY_HANGING_SIGN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(rEntries -> {
            rEntries.addAfter(Items.LEVER, ModBlocks.CERAMIC_LEVER);
            rEntries.addAfter(Items.STONE_BUTTON, ModBlocks.CERAMIC_BUTTON);
            rEntries.addAfter(Items.HEAVY_WEIGHTED_PRESSURE_PLATE, ModBlocks.CERAMIC_PRESSURE_PLATE);
            rEntries.addAfter(Items.WHITE_WOOL, ModBlocks.CERAMIC_TILES);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.addAfter(Items.LEAD, ModItems.SUN_HAT);
            entries.addAfter(Items.BRUSH, ModItems.ARTISAN_BRUSH);
            entries.addAfter(Items.BAMBOO_CHEST_RAFT, ModItems.WALNUT_BOAT);
            entries.addAfter(ModItems.WALNUT_BOAT, ModItems.WALNUT_CHEST_BOAT);
            entries.addAfter(ModItems.WALNUT_CHEST_BOAT, ModItems.HOARY_BOAT);
            entries.addAfter(ModItems.HOARY_BOAT, ModItems.HOARY_CHEST_BOAT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.addAfter(Items.EGG, ModItems.FLOUR);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.addAfter(Items.APPLE, ModItems.APPLE_COMPOTE_JAR);
            entries.addAfter(ModItems.APPLE_COMPOTE_JAR, ModItems.APPLE_CIDER_JAR);
            entries.addAfter(ModItems.APPLE_CIDER_JAR, ModBlocks.APPLE_BLOCK);
            entries.addAfter(ModBlocks.APPLE_BLOCK, ModItems.ORANGE);
            entries.addAfter(ModItems.ORANGE, ModItems.ORANGE_COMPOTE_JAR);
            entries.addAfter(ModItems.ORANGE_COMPOTE_JAR, ModBlocks.ORANGE_BLOCK);
            entries.addAfter(ModBlocks.ORANGE_BLOCK, ModItems.LEMON);
            entries.addAfter(ModItems.LEMON, ModItems.LEMON_COMPOTE_JAR);
            entries.addAfter(ModItems.LEMON_COMPOTE_JAR, ModBlocks.LEMON_BLOCK);
            entries.addAfter(ModBlocks.LEMON_BLOCK, ModItems.PLUM);
            entries.addAfter(ModItems.PLUM, ModItems.PLUM_COMPOTE_JAR);
            entries.addAfter(ModItems.PLUM_COMPOTE_JAR, ModItems.PLUM_CIDER_JAR);
            entries.addAfter(ModItems.PLUM_CIDER_JAR, ModBlocks.PLUM_BLOCK);
            entries.addAfter(ModBlocks.PLUM_BLOCK, ModItems.HOARY_APPLE);
            entries.addAfter(ModItems.HOARY_APPLE, ModItems.HOARY_COMPOTE_JAR);
            entries.addAfter(ModItems.HOARY_COMPOTE_JAR, ModItems.HOARY_CIDER_JAR);
            entries.addAfter(ModItems.HOARY_CIDER_JAR, ModBlocks.HOARY_APPLE_BLOCK);
            entries.addAfter(Items.ENCHANTED_GOLDEN_APPLE, ModBlocks.GOLDEN_APPLE_BLOCK);
            entries.addAfter(Items.MELON_SLICE, ModItems.SPONGEKIN_SLICE);
            entries.addAfter(Items.SWEET_BERRIES, ModItems.PASSION_FRUIT);
            entries.addAfter(ModItems.PASSION_FRUIT, ModItems.ELDERBERRIES);
            entries.addAfter(ModItems.ELDERBERRIES, ModItems.ELDERBERRY_WINE_BOTTLE);
            entries.addAfter(Items.GLOW_BERRIES, ModItems.LAPISBERRIES);
            entries.addAfter(ModItems.LAPISBERRIES, ModItems.LAPISBERRY_WINE_BOTTLE);
            entries.addAfter(Items.MILK_BUCKET, ModItems.GREEN_TEA_BOTTLE);
            entries.addAfter(Items.MILK_BUCKET, ModItems.GREEN_TEA_BOTTLE);
            entries.addAfter(ModItems.GREEN_TEA_BOTTLE, ModItems.BLACK_TEA_BOTTLE);
            entries.addAfter(ModItems.BLACK_TEA_BOTTLE, ModItems.CHAMOMILE_TEA_BOTTLE);
            entries.addAfter(ModItems.CHAMOMILE_TEA_BOTTLE, ModItems.HONEYSUCKLE_TEA_BOTTLE);
            entries.addAfter(ModItems.HONEYSUCKLE_TEA_BOTTLE, ModItems.BELLFLOWER_TEA_BOTTLE);
            entries.addAfter(ModItems.BELLFLOWER_TEA_BOTTLE, ModItems.TORCHFLOWER_TEA_BOTTLE);
            entries.addAfter(Items.HONEY_BOTTLE, ModItems.MEAD_BOTTLE);
            entries.addAfter(Items.BAKED_POTATO, ModItems.MUSHROOM_STUFFED_POTATO);
            entries.addAfter(ModItems.MUSHROOM_STUFFED_POTATO, ModItems.BERRY_STUFFED_POTATO);
            entries.addAfter(ModItems.BERRY_STUFFED_POTATO, ModItems.MAIZE_STUFFED_POTATO);
            entries.addAfter(Items.BEETROOT, ModItems.MAIZE);
            entries.addAfter(ModItems.MAIZE, ModItems.LEEK);
            entries.addAfter(ModItems.LEEK, ModItems.WALNUT);
            entries.addAfter(Items.BREAD, ModItems.MAIZE_BREAD);
            entries.addAfter(ModItems.MAIZE_BREAD, ModBlocks.ARTISAN_BREAD);
            entries.addAfter(Items.COOKIE, ModItems.WALNUT_COOKIE);
            entries.addAfter(ModItems.WALNUT_COOKIE, ModItems.ARTISAN_COOKIE);
            entries.addAfter(ModItems.ARTISAN_COOKIE, ModBlocks.PASSION_FRUIT_TART);
            entries.addAfter(ModBlocks.PASSION_FRUIT_TART, ModBlocks.ELDERBERRY_TART);
            entries.addAfter(ModBlocks.ELDERBERRY_TART, ModBlocks.GLOW_BERRY_TART);
            entries.addAfter(ModBlocks.GLOW_BERRY_TART, ModBlocks.SWEET_BERRY_TART);
            entries.addAfter(ModBlocks.SWEET_BERRY_TART, ModBlocks.LAPISBERRY_TART);
            entries.addAfter(Items.CAKE, ModBlocks.COCOA_CAKE);
            entries.addAfter(Items.PUMPKIN_PIE, ModBlocks.APPLE_PIE);
            entries.addAfter(ModBlocks.APPLE_PIE, ModBlocks.ORANGE_PIE);
            entries.addAfter(ModBlocks.ORANGE_PIE, ModBlocks.LEMON_PIE);
            entries.addAfter(ModBlocks.LEMON_PIE, ModBlocks.PLUM_PIE);
            entries.addAfter(ModBlocks.PLUM_PIE, ModBlocks.HOARY_PIE);
            entries.addAfter(Items.SPIDER_EYE, ModItems.CITRUS_ESSENCE);
            entries.addAfter(ModItems.CITRUS_ESSENCE, ModItems.CANDY);
            entries.addAfter(ModItems.CANDY, ModItems.PIQUANT_CANDY);
            entries.addAfter(ModItems.PIQUANT_CANDY, ModItems.SOUR_CANDY);
            entries.addAfter(ModItems.SOUR_CANDY, ModItems.BITTER_CANDY);
            entries.addAfter(ModItems.BITTER_CANDY, ModItems.CANDIED_APPLE);
            entries.addAfter(ModItems.CANDIED_APPLE, ModItems.CANDIED_PLUM);
            entries.addAfter(ModItems.CANDIED_PLUM, ModItems.CANDIED_ORANGE);
            entries.addAfter(ModItems.CANDIED_ORANGE, ModItems.CANDIED_LEMON);
            entries.addAfter(ModItems.CANDIED_LEMON, ModItems.FOREST_MEDLEY);
            entries.addAfter(ModItems.FOREST_MEDLEY, ModItems.ARID_MEDLEY);
            entries.addAfter(ModItems.ARID_MEDLEY, ModItems.MEADOW_MEDLEY);
            entries.addAfter(ModItems.MEADOW_MEDLEY, ModItems.COASTAL_MEDLEY);
            entries.addAfter(Items.RABBIT_STEW, ModItems.LEEK_STEW);
            entries.addAfter(ModItems.LEEK_STEW, ModItems.FISH_STEW);
            entries.addAfter(ModItems.FISH_STEW, ModItems.APPLE_STEW);
            entries.addAfter(ModItems.APPLE_STEW, ModItems.STONE_STEW);
            entries.addAfter(ModItems.STONE_STEW, ModItems.BOUNTIFUL_STEW);
            entries.addAfter(ModItems.BOUNTIFUL_STEW, ModItems.PASSION_GLAZED_SALMON);
            entries.addAfter(ModItems.PASSION_GLAZED_SALMON, ModItems.CRUSTED_BEEF);
            entries.addAfter(ModItems.CRUSTED_BEEF, ModItems.CRIMSON_CHOW);
            entries.addAfter(ModItems.CRIMSON_CHOW, ModItems.WARPED_CHOW);
            entries.addAfter(ModItems.WARPED_CHOW, ModItems.CUSTARD);
            entries.addAfter(ModItems.CUSTARD, ModItems.PIQUANT_CUSTARD);
            entries.addAfter(ModItems.PIQUANT_CUSTARD, ModItems.PASSION_CUSTARD);
            entries.addAfter(ModItems.PASSION_CUSTARD, ModItems.COCOA_CUSTARD);
            entries.addAfter(ModItems.COCOA_CUSTARD, ModItems.GLOWING_CUSTARD);
            entries.addAfter(ModItems.GLOWING_CUSTARD, ModItems.ANCIENT_CUSTARD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.WHEAT, ModItems.MAIZE);
            entries.addAfter(ModItems.MAIZE, ModItems.FLOUR);
            entries.addAfter(Items.SLIME_BALL, ModItems.FELDSPAR);
            entries.addAfter(ModItems.FELDSPAR, ModItems.CERAMIC_CLAY);
            entries.addAfter(ModItems.CERAMIC_CLAY, ModItems.CERAMIC_TILE);
            entries.addAfter(Items.BOWL, ModBlocks.CERAMIC_DISH);
            entries.addAfter(ModBlocks.CERAMIC_DISH, ModItems.JAR);
            entries.addAfter(Items.FIREWORK_STAR, ModItems.TEA_LEAVES);
            entries.addAfter(ModItems.TEA_LEAVES, ModItems.DRIED_TEA_LEAVES);
            entries.addAfter(ModItems.DRIED_TEA_LEAVES, ModItems.GREEN_TEA_BLEND);
            entries.addAfter(ModItems.GREEN_TEA_BLEND, ModItems.BLACK_TEA_BLEND);
            entries.addAfter(ModItems.BLACK_TEA_BLEND, ModItems.CHAMOMILE_TEA_BLEND);
            entries.addAfter(ModItems.CHAMOMILE_TEA_BLEND, ModItems.HONEYSUCKLE_TEA_BLEND);
            entries.addAfter(ModItems.HONEYSUCKLE_TEA_BLEND, ModItems.BELLFLOWER_TEA_BLEND);
            entries.addAfter(ModItems.BELLFLOWER_TEA_BLEND, ModItems.TORCHFLOWER_TEA_BLEND);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
            entries.add(ModBlocks.WHITE_JACK_O_STRAW);
            entries.add(ModBlocks.LIGHT_GRAY_JACK_O_STRAW);
            entries.add(ModBlocks.GRAY_JACK_O_STRAW);
            entries.add(ModBlocks.BLACK_JACK_O_STRAW);
            entries.add(ModBlocks.BROWN_JACK_O_STRAW);
            entries.add(ModBlocks.RED_JACK_O_STRAW);
            entries.add(ModBlocks.ORANGE_JACK_O_STRAW);
            entries.add(ModBlocks.YELLOW_JACK_O_STRAW);
            entries.add(ModBlocks.LIME_JACK_O_STRAW);
            entries.add(ModBlocks.GREEN_JACK_O_STRAW);
            entries.add(ModBlocks.CYAN_JACK_O_STRAW);
            entries.add(ModBlocks.LIGHT_BLUE_JACK_O_STRAW);
            entries.add(ModBlocks.BLUE_JACK_O_STRAW);
            entries.add(ModBlocks.PURPLE_JACK_O_STRAW);
            entries.add(ModBlocks.MAGENTA_JACK_O_STRAW);
            entries.add(ModBlocks.PINK_JACK_O_STRAW);
        });
//        if (FabricLoader.getInstance().isModLoaded(BountifulFares.ELS_AND_LS_DYES_MOD_ID)) {
//            ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
//                entries.addAfter(ModBlocks.BLACK_JACK_O_STRAW, ModBlocks.ACORN_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.BROWN_JACK_O_STRAW,ModBlocks.MAROON_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.RED_JACK_O_STRAW,ModBlocks.PEACH_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.PEACH_JACK_O_STRAW,ModBlocks.VERMILION_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.ORANGE_JACK_O_STRAW,ModBlocks.AMBER_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.YELLOW_JACK_O_STRAW,ModBlocks.BANANA_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.BANANA_JACK_O_STRAW,ModBlocks.ARTICHOKE_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.ARTICHOKE_JACK_O_STRAW,ModBlocks.MOLD_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.LIME_JACK_O_STRAW,ModBlocks.SAGE_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.SAGE_JACK_O_STRAW,ModBlocks.SAP_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.GREEN_JACK_O_STRAW,ModBlocks.SHAMROCK_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.SHAMROCK_JACK_O_STRAW,ModBlocks.MINT_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.CYAN_JACK_O_STRAW,ModBlocks.CERULEAN_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.LIGHT_BLUE_JACK_O_STRAW,ModBlocks.NAVY_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.BLUE_JACK_O_STRAW,ModBlocks.PERIWINKLE_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.PERIWINKLE_JACK_O_STRAW,ModBlocks.GRAPE_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.PURPLE_JACK_O_STRAW,ModBlocks.INDIGO_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.MAGENTA_JACK_O_STRAW,ModBlocks.MAUVE_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.MAUVE_JACK_O_STRAW,ModBlocks.VELVET_JACK_O_STRAW);
//                entries.addAfter(ModBlocks.VELVET_JACK_O_STRAW,ModBlocks.FUCHSIA_JACK_O_STRAW);
//            });
//        }
    }
}
