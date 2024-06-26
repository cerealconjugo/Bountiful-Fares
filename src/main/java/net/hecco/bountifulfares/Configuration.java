package net.hecco.bountifulfares;

import com.google.gson.GsonBuilder;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.loader.api.FabricLoader;
import net.hecco.bountifulfares.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;

public class Configuration {

    private static final File CONFIG_FILE = new File(FabricLoader.getInstance().getConfigDir().toFile(), "bountifulfares.json");

    private boolean enableItemGuideTooltips = true;
    private boolean generateVanillaWildCrops = true;
    private boolean generateAppleTrees = true;
    private boolean generateOrangeTrees = true;
    private boolean generateLemonTrees = true;
    private boolean generatePlumTrees = true;
    private boolean generateAllFruitTreesInFlowerForest = false;
    private boolean generateForestTeaShrubs = false;
    private boolean generateForestWalnutTrees = false;


    public Configuration() {
    }

    public static Configuration load() {
        Configuration configuration = new Configuration();
        if (!CONFIG_FILE.exists()) {
            save(configuration);
        }

        Reader reader;
        try {
            reader = Files.newBufferedReader(CONFIG_FILE.toPath());
            configuration = (new GsonBuilder().setPrettyPrinting().create()).fromJson(reader, Configuration.class);
            reader.close();
        } catch (IOException e) {
            BountifulFares.LOGGER.error("Error while trying to load configuration file. Default configuration used.", e);
        }

        return configuration;
    }

    public static void save(Configuration config) {
        try {
            Writer writer = Files.newBufferedWriter(CONFIG_FILE.toPath());
            (new GsonBuilder().setPrettyPrinting().create()).toJson(config, writer);

            writer.close();
        } catch (IOException e) {
            BountifulFares.LOGGER.error("Error while trying to save configuration file.", e);
        }
    }

    public boolean isEnableItemGuideTooltips() {
        return enableItemGuideTooltips;
    }

    public void setEnableItemGuideTooltips(boolean bool) {
        enableItemGuideTooltips = bool;
    }

    public boolean isGenerateVanillaWildCrops() {
        return generateVanillaWildCrops;
    }

    public void setGenerateVanillaWildCrops(boolean bool) {
        generateVanillaWildCrops = bool;
    }

    public boolean isGenerateAppleTrees() {
        return generateAppleTrees;
    }

    public void setGenerateAppleTrees(boolean bool) {
        generateAppleTrees = bool;
    }

    public boolean isGenerateOrangeTrees() {
        return generateOrangeTrees;
    }

    public void setGenerateOrangeTrees(boolean bool) {
        generateOrangeTrees = bool;
    }

    public boolean isGenerateLemonTrees() {
        return generateLemonTrees;
    }

    public void setGenerateLemonTrees(boolean bool) {
        generateLemonTrees = bool;
    }

    public boolean isGeneratePlumTrees() {
        return generatePlumTrees;
    }

    public void setGeneratePlumTrees(boolean bool) {
        generatePlumTrees = bool;
    }

    public boolean isGenerateAllFruitTreesInFlowerForest() {
        return generateAllFruitTreesInFlowerForest;
    }

    public void setGenerateAllFruitTreesInFlowerForest(boolean bool) {
        generateAllFruitTreesInFlowerForest = bool;
    }

    public boolean isGenerateForestTeaShrubs() {
        return generateForestTeaShrubs;
    }

    public void setGenerateForestTeaShrubs(boolean bool) {
        generateForestTeaShrubs = bool;
    }

    public boolean isGenerateForestWalnutTrees() {
        return generateForestWalnutTrees;
    }

    public void setGenerateForestWalnutTrees(boolean bool) {
        generateForestWalnutTrees = bool;
    }

    private static double limit(double min, double max, double value) {
        if (value > max) {
            return max;
        }

        return Math.max(value, min);
    }

    private static int limit(int min, int max, int value) {
        if (value > max) {
            return max;
        }

        return Math.max(value, min);
    }
}
