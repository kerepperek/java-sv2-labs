package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator v 1.0");
        System.out.println("Ez az alkalmazás két egész számot kér be, majd ad össze.");
        System.out.print("Első egész szám: ");
        int number1 = scanner.nextInt();
        System.out.print("Második egész szám: ");
        int number2 = scanner.nextInt();
        System.out.println("Elvégzett művelet: " + number1 + " + " + number2);
        System.out.println("Eredmény: " + (number1 + number2));
    }
}
