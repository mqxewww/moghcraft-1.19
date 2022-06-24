package net.mqxewww.moghcraft.item.materials;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;

public class PerfectNetherStar extends Item {
    public PerfectNetherStar() {
        super(new FabricItemSettings().group(ItemGroup.MATERIALS).rarity(Rarity.EPIC));
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
