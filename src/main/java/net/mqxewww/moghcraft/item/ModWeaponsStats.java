package net.mqxewww.moghcraft.item;

public enum ModWeaponsStats {
    LAZULI_GLINTSTONE_SWORD(79, 94, 5);

    private final int physicalDamage;
    private final int otherDamage;
    private final int obtainingDifficulty;

    private ModWeaponsStats(int physicalDamage, int otherDamage, int obtainingDifficulty) {
        this.physicalDamage = physicalDamage;
        this.otherDamage = otherDamage;
        this.obtainingDifficulty = obtainingDifficulty;
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

    public int getAttackDamage() {
        return (int) (this.getPhysicalDamage() * 0.10F + this.getOtherDamage() * 0.025 + this.getObtainingDifficulty());
    }
}
