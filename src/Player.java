import java.util.Scanner;
import weapon.Weapon;
import weapon.pistol.Pistol;
import weapon.automat.Automat;
import weapon.rpg.Rpg;
import weapon.slingshot.Slingshot;
import weapon.watergun.Watergun;


class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new Automat(),
                new Rpg(),
                new Slingshot(),
                new Watergun(),

        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= this.getSlotsCount() || slot < 0) {
            System.out.println("Некорректный номер. Попробуйте ещё раз, пожалуйста");
        } else {
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }

}
