package introexceptiontrycatchtrace;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator=new Calculator();

        System.out.println("Calculator v 2.0");
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
            System.out.println(calculator.calculation(number1,number2,operation));
        } catch (ArithmeticException e) {
            System.out.println("Nullát adott meg osztónak!");
        }

    }
}
