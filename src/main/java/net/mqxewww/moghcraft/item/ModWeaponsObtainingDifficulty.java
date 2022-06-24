package net.mqxewww.moghcraft.item;

public enum ModWeaponsObtainingDifficulty {
    A(4),
    B(2),
    C(1),
    D(-1);

    private final int bonusAttackDamage;

    private ModWeaponsObtainingDifficulty(int bonusAttackDamage) {
        this.bonusAttackDamage = bonusAttackDamage;
    }

    public int getBonusAttackDamage() {
        return bonusAttackDamage;
    }
}
