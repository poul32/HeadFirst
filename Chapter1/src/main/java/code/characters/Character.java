package code.characters;

import code.weapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
