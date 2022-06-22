package net.mqxewww.moghcraft.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.mqxewww.moghcraft.item.ModToolMaterials;

public class LazuliGlintstoneSword extends SwordItem {
    public LazuliGlintstoneSword() {
        super(
            ModToolMaterials.GLITTERING_LAPIS_LAZULI,
            7,
            -1.8F,
            new FabricItemSettings().group(ItemGroup.COMBAT)
        );
    }
}
