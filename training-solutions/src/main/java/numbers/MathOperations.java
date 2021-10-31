package numbers;

import java.util.Locale;
import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Számolja ki: 12 - 54 / (3 - 8.3) * 2= ");
        double number = scanner.nextDouble();
        System.out.println();
        double dbl = 12d - 54 / (3 - 8.3) * 2;
        if (Math.abs(dbl - number) < 0.0001) {
            System.out.println("OK");
        } else {
            System.out.println("Helyes:"+dbl+" Öné:"+number);
        }
    }
}
