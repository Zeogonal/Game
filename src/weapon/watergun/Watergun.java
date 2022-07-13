package weapon.watergun;
import weapon.Weapon;

public class Watergun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Пш-пш");
    }
}
