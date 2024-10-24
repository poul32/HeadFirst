package rb.bars.monitoring.service.characters;

public class King extends Character {

    @Override
    public void fight() {
        System.out.println("King attack:");
        weapon.useWeapon();
    }
}
