package controladvanced.numbers;

import java.util.Scanner;

public class FobiddenSevens {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ettől a számtól írom ki a számsort:");
        int number = scanner.nextInt();
        scanner.nextLine();

        int counter = number;
        while (!(Integer.toString(counter).contains("7") && counter % 7 != 0)) {
            System.out.print((counter % 7 == 0 ? "X" : counter)+" ");
            counter++;
        }
        System.out.println();

        for (counter = number; counter >= number; counter++) {
            if (counter % 7 == 0) {
                System.out.print("X ");
                continue;
            }
            if (Integer.toString(counter).contains("7")) {
                break;
            }
            System.out.print(counter+" ");
        }
    }
}
