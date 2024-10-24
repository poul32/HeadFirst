package rb.bars.monitoring.service.weapons;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Axe attack!");
    }
}
