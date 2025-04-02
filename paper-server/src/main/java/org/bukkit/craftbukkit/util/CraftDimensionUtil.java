package org.bukkit.craftbukkit.util;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.LevelStem;

public final class CraftDimensionUtil {

    private CraftDimensionUtil() {
    }

    public static ResourceKey<Level> getMainDimensionKey(Level world) {
        ResourceKey<LevelStem> typeKey = world.getTypeKey();
        if (typeKey == LevelStem.OVERWORLD) {
            return Level.OVERWORLD;
        }

        return world.dimension();
    }
}
