package net.mqxewww.moghcraft.item.weapons;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.mqxewww.moghcraft.item.ModToolMaterials;
import net.mqxewww.moghcraft.item.ModWeaponsStats;
import net.mqxewww.moghcraft.item.ModWeaponsTypes;

public class LazuliGlintstoneSword extends SwordItem {
    public LazuliGlintstoneSword() {
        super(
            ModToolMaterials.GLITTERING_LAPIS_LAZULI,
            ModWeaponsStats.LAZULI_GLINTSTONE_SWORD.getAttackDamage(),
            ModWeaponsTypes.STRAIGHT_SWORD.getAttackSpeed(),
            new FabricItemSettings().group(ItemGroup.COMBAT)
        );
    }
}
