package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {


        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés\n");

        System.out.print("Melyik menüpontot választja?");
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();

        if (line == 1) {
            System.out.println("\nFelhasználók listázása");
        }else if (line == 2) {
            System.out.println("\nFelhasználó felvétele");
        }
    }
}
