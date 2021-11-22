package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean valid = true;

        System.out.println("Üdvözöljük a regisztrációs oldalon!");
        System.out.println("----------------------------------");
        System.out.print("Adja meg a nevét: ");
        String name = scanner.nextLine();
        String age ="";
        try {
            validation.validateName(name);
            System.out.print("Adja meg az életkorát: ");
            age = scanner.nextLine();
            validation.validateAge(age);
        } catch (IllegalArgumentException e) {
            valid = false;
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Az alábbi adatokat adta meg: ");
        System.out.println("Neve: " + name);
        System.out.println("Életkora: " + age);
        System.out.println();

        if (valid) {
            System.out.println("Sikeres regisztráció!");
        } else {
            System.out.println("Nem volt sikeres a regisztráció!");
        }
    }
}
