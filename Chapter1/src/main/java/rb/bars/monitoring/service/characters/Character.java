package rb.bars.monitoring.service.characters;

import rb.bars.monitoring.service.weapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
