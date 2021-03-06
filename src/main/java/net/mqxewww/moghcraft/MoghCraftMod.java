package net.mqxewww.moghcraft;

import net.fabricmc.api.ModInitializer;
import net.mqxewww.moghcraft.block.ModBlocks;
import net.mqxewww.moghcraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoghCraftMod implements ModInitializer {
	public static final String MOD_ID = "moghcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
