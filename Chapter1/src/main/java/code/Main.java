package code;

import code.characters.Character;
import code.characters.King;
import code.weapons.AxeBehavior;

public class Main {

    public static void main(String[] args) {
        Character character = new King();
        character.setWeapon(new AxeBehavior());
        character.fight();
    }
}