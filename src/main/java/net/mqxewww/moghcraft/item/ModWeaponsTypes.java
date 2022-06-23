package net.mqxewww.moghcraft.item;

public enum ModWeaponsTypes {
    DAGGER(2.43F),
    AXE(1.91F),
    STRAIGHT_SWORD(1.62F),
    REAPER(1.28F),
    GREAT_SWORD(1.22F),
    COLOSSAL_SWORD(0.81F);

    private final float attackSpeed;

    private ModWeaponsTypes(float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public float getAttackSpeed() {
        return attackSpeed - 4F;
    }
}
