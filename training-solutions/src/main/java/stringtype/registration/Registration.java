package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserValidator userValidator = new UserValidator();

        System.out.print("Felhasználónév: ");
        String username = scanner.nextLine();
        if (userValidator.isValidUsername(username)) {
            System.out.print("Jelszó: ");
            String password = scanner.nextLine();

            System.out.print("Jelszó ellenőrzés: ");
            String password2 = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.println(userValidator.isValidPassword(password, password2) ? "jelszók egyeznek!" : "jelszók nem egyeznek!");
            System.out.println(userValidator.isValidEmail(email) ? "e-mail formátuma helyes" : "Helytelen e-mail formátum!");
        } else {
            System.out.println("Felhasználónevet kötelező megadni!");
        }
    }
}
