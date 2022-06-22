package net.mqxewww.moghcraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mqxewww.moghcraft.MoghCraftMod;
import net.mqxewww.moghcraft.block.custom.GlitteringLapisLazuliBlock;

public class ModBlocks {
    public static final Block GLITTERING_LAPIS_LAZULI_BLOCK = registerBlock(
        "glittering_lapis_lazuli_block",
        new GlitteringLapisLazuliBlock(),
        ItemGroup.BUILDING_BLOCKS
    );

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoghCraftMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(
            Registry.ITEM, new Identifier(MoghCraftMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group))
        );
    }

    public static void registerModBlocks() {
        MoghCraftMod.LOGGER.debug(MoghCraftMod.MOD_ID + "Registering ModBlocks.");
    }
}
