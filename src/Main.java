import java.util.Scanner;
import java.util.Arrays;
import weapon.Weapon;
import weapon.pistol.Pistol;
import weapon.automat.Automat;
import weapon.rpg.Rpg;
import weapon.slingshot.Slingshot;
import weapon.watergun.Watergun;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        Weapon[] weapons = new Weapon[5];
        weapons[0] = new Pistol();
        weapons[1] = new Automat();
        weapons[2] = new Rpg();
        weapons[3] = new Slingshot();
        weapons[4] = new Watergun();

        System.out.format("Выберите один из %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить "
                        + "или введите -1 чтобы выйти из игры%n",
                player.getSlotsCount()
        );
        int slot;

        while (true) {
            slot = Integer.parseInt(scanner.nextLine());
            if (slot == -1) {
                break;
            } else if (slot <= -2) {
                System.out.println("Введите корректный номер");
                continue;
            } else {
                player.shotWithWeapon(slot - 1);
            }
        }

        System.out.println("Игра окончена!");
    }
}
