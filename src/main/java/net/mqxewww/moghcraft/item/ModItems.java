package net.mqxewww.moghcraft.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.mqxewww.moghcraft.MoghCraftMod;
import net.mqxewww.moghcraft.item.materials.GlitteringLapisLazuli;
import net.mqxewww.moghcraft.item.weapons.LazuliGlintstoneSword;

public class ModItems {
    public static final Item GLITTERING_LAPIS_LAZULI = registerItem(
        "glittering_lapis_lazuli", new GlitteringLapisLazuli()
    );

    public static final Item LAZULI_GLINTSTONE_SWORD = registerItem(
        "lazuli_glintstone_sword", new LazuliGlintstoneSword()
    );

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoghCraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoghCraftMod.LOGGER.debug(MoghCraftMod.MOD_ID + " : Registering ModItems.");
    }
}
