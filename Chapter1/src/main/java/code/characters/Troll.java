package code.characters;

public class Troll extends Character {

    @Override
    public void fight() {
        System.out.println("Troll attack: ");
        weapon.useWeapon();
    }
}
