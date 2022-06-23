package net.mqxewww.moghcraft.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public enum ModWeaponsStats {
    LAZULI_GLINTSTONE_SWORD(79, 94, 5, 3.5F);

    private final int physicalDamage;
    private final int otherDamage;
    private final int obtainingDifficulty;
    private final float weight;

    private ModWeaponsStats(int physicalDamage, int otherDamage, int obtainingDifficulty, float weight) {
        this.physicalDamage = physicalDamage;
        this.otherDamage = otherDamage;
        this.obtainingDifficulty = obtainingDifficulty;
        this.weight = weight;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getOtherDamage() {
        return otherDamage;
    }

    public int getObtainingDifficulty() {
        return obtainingDifficulty;
    }

    public float getWeight() { return weight; }

    public int getAttackDamage() {
        return (int) (this.getPhysicalDamage() * 0.10F + this.getOtherDamage() * 0.025 + this.getObtainingDifficulty());
    }

    public StatusEffect getStatusEffectOnHold() {
        if (getWeight() <= 3.5F) return StatusEffects.SPEED;
        if (getWeight() >= 11.5F) return StatusEffects.SLOWNESS;
        if (getWeight() >= 18.0F) return StatusEffects.SLOWNESS;

        return null;
    }

    public StatusEffectInstance getStatusEffectInstanceOnHold() {
        if (getWeight() <= 3.5F) return new StatusEffectInstance(StatusEffects.SPEED, 60);
        if (getWeight() >= 11.5F && getWeight() < 18.0F) return new StatusEffectInstance(StatusEffects.SLOWNESS, 60);
        if (getWeight() >= 18.0F) return new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 1);

        return null;
    }
}
