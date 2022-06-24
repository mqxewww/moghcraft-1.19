package net.mqxewww.moghcraft.item;

public enum ModWeaponsObtainingDifficulty {
    S(6),
    A(5),
    B(4),
    C(3),
    D(2),
    E(1),
    F(0);

    private final int bonusAttackDamage;

    private ModWeaponsObtainingDifficulty(int bonusAttackDamage) {
        this.bonusAttackDamage = bonusAttackDamage;
    }

    public int getBonusAttackDamage() {
        return bonusAttackDamage;
    }
}
