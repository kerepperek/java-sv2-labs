package introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg számot:");
        int number = scanner.nextInt();

        if (number > 100) {
            System.out.println("Nagyobb, mint száz.");
        } else {
            System.out.println("Kisebb, vagy egyenlő százzal.");
        }
    }
}