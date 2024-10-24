package rb.bars.monitoring.service.characters;

public class Queen extends Character {

    @Override
    public void fight() {
        System.out.println("Queen attack: ");
        weapon.useWeapon();
    }
}
