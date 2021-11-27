package introexceptionfinally;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        int number = 99;
        System.out.println("Give some numbers.");
        while (number % 2 != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Not number!", e);
            } finally {
                System.out.println("End of round.");
            }
        }
        System.out.println("This was an even number. ");
    }
}
