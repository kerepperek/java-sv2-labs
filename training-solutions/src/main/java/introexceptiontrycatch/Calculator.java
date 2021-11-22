package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator v 1.0");
        System.out.println("----------------");
        System.out.print("1. szám:");
        int number1 = 0;
        int number2 = 0;

        try {
            number1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("2. szám:");
            number2 = scanner.nextInt();
            scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("A megadott érték nem szám. Kilépek.");
            return;
        }

        System.out.println("Válasszon alapműveletet!");
        System.out.println("1. Összeadás");
        System.out.println("2. Kivonás");
        System.out.println("3. Szorzás");
        System.out.println("4. Osztás");
        String operation = scanner.nextLine();
        System.out.print("Eredmény: ");
        try {
            switch (operation) {
                case "1":
                    System.out.println(number1 + number2);
                    break;
                case "2":
                    System.out.println(number1 - number2);
                    break;
                case "3":
                    System.out.println(number1 * number2);
                    break;
                case "4":
                    System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println("Nincs ilyen alapművelet.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Nullát adott meg osztónak!");
        }

    }
}
