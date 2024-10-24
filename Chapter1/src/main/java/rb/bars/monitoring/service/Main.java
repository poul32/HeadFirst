package rb.bars.monitoring.service;

import rb.bars.monitoring.service.characters.Character;
import rb.bars.monitoring.service.characters.King;
import rb.bars.monitoring.service.weapons.AxeBehavior;

public class Main {

    public static void main(String[] args) {
        Character character = new King();
        character.setWeapon(new AxeBehavior());
        character.fight();
    }
}