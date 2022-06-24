package net.mqxewww.moghcraft.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public enum ModWeaponsStats {
    LAZULI_GLINTSTONE_SWORD(
        79, 94, ModWeaponsTypes.STRAIGHT_SWORD, ModWeaponsObtainingDifficulty.A, 3.5F),
    BLASPHEMOUS_BLADE(
        121, 78, ModWeaponsTypes.GREAT_SWORD, ModWeaponsObtainingDifficulty.S, 13.5F);

    private final int physicalDamage;
    private final int otherDamage;
    private final ModWeaponsTypes weaponType;
    private final ModWeaponsObtainingDifficulty obtainingDifficulty;
    private final float weight;

    private ModWeaponsStats(
        int physicalDamage,
        int otherDamage,
        ModWeaponsTypes weaponType,
        ModWeaponsObtainingDifficulty obtainingDifficulty,
        float weight
    ) {
        this.physicalDamage = physicalDamage;
        this.otherDamage = otherDamage;
        this.weaponType = weaponType;
        this.obtainingDifficulty = obtainingDifficulty;
        this.weight = weight;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public int getOtherDamage() {
        return otherDamage;
    }

    public ModWeaponsTypes getWeaponType() {
        return weaponType;
    }

    public ModWeaponsObtainingDifficulty getObtainingDifficulty() {
        return obtainingDifficulty;
    }

    public float getWeight() {
        return weight;
    }

    public int getAttackDamage() {
        return (int) (this.getPhysicalDamage() * 0.10F + this.getOtherDamage() * 0.025 + this.getBonusAttackDamage());
    }

    public float getAttackSpeed() {
        return getWeaponType().getAttackSpeed();
    }

    public int getBonusAttackDamage() {
        return getObtainingDifficulty().getBonusAttackDamage();
    }

    public StatusEffect getStatusEffectOnHold() {
        return getStatusEffectInstanceOnHold() != null
            ? getStatusEffectInstanceOnHold().getEffectType()
            : null;
    }

    public StatusEffectInstance getStatusEffectInstanceOnHold() {
        if (getWeight() <= 3.5F) return new StatusEffectInstance(StatusEffects.SPEED, 60);
        if (getWeight() >= 18.0F) return new StatusEffectInstance(StatusEffects.SLOWNESS, 60, 1);
        if (getWeight() >= 11.5F) return new StatusEffectInstance(StatusEffects.SLOWNESS, 60);

        return null;
    }
}
