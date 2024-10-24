package rb.bars.monitoring.service.weapons;

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Knife attack!");
    }
}
