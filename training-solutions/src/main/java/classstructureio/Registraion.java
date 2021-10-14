package classstructureio;
import java.util.Scanner;
public class Registraion {
    public static void main(String[] args) {
        System.out.println("Regisztráció");
        System.out.println("------------");
        System.out.println("Kérem, adja meg nevét és e-mail címét!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Neve:");
        String name = scanner.nextLine();
        System.out.print("Email címe:");
        String email = scanner.nextLine();
        System.out.println("\nRegisztrált adatai a következtők:");
        System.out.println("Neve: " + name);
        System.out.println("Email címe: " + email);
    }
}
