package net.mqxewww.moghcraft.item.weapons;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import net.mqxewww.moghcraft.item.ModToolMaterials;
import net.mqxewww.moghcraft.item.ModWeaponsStats;

public class BlasphemousBlade extends SwordItem {
    public BlasphemousBlade() {
        super(
            ModToolMaterials.PERFECT_NETHER_STAR,
            ModWeaponsStats.BLASPHEMOUS_BLADE.getAttackDamage(),
            ModWeaponsStats.BLASPHEMOUS_BLADE.getAttackSpeed(),
            new FabricItemSettings().group(ItemGroup.COMBAT).rarity(Rarity.EPIC)
        );
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && selected) {
            LivingEntity target = (LivingEntity) entity;

            if (target.hasStatusEffect(ModWeaponsStats.BLASPHEMOUS_BLADE.getStatusEffectOnHold())) return;

            target.addStatusEffect(ModWeaponsStats.BLASPHEMOUS_BLADE.getStatusEffectInstanceOnHold());
        }
    }
}
