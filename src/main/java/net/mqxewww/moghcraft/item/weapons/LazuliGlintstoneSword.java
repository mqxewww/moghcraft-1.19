package net.mqxewww.moghcraft.item.weapons;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.world.World;
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

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && selected) {
            LivingEntity target = (LivingEntity) entity;

            if (target.hasStatusEffect(ModWeaponsStats.LAZULI_GLINTSTONE_SWORD.getStatusEffectOnHold())) return;

            target.addStatusEffect(ModWeaponsStats.LAZULI_GLINTSTONE_SWORD.getStatusEffectInstanceOnHold());
        }
    }
}
