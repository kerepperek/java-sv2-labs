package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sorban adjon meg öt számot, én összeadom!");

        int osszeg = 0;
        for (int counter = 1; counter < 6; counter++) {
            System.out.print(counter+". ");
            int number = scanner.nextInt();
            osszeg += number;
        }
        System.out.println("Az összegük: " + osszeg);
    }
}
