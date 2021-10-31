package numbers;

import java.util.Scanner;

public class Percent {


    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mi a szám? " );
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Hány százalékát számoljam ki? ");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Az eredmény: " + percent.getValue(number1, number2));

        System.out.println();
        System.out.print("Mi a szám? " );
        number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Hány százaléka ennek a kiszámolandó szám? ");
        number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Az eredmény: " + percent.getBase(number1, number2));

        System.out.println();
        System.out.print("Mi a szám? " );
        number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Mi a másik szám? ");
        number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Az eredmény: " + percent.getPercent(number1, number2));

    }

    public double getValue(int number1, int number2) {
        return  number1 / 100d * number2;
    }

    public double getBase(int number1, int number2) {
        return (double) number1 / number2 * 100;
    }

    public double getPercent(int number1, int number2) {
        return (double) number2 /  number1 * 100;
    }
}
