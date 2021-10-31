package mathproblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Division {

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(12);
        division.getRightNumbers(new int[]{2, 5, 23, 56, -36, 45, 78, 14, -8, 4, 10});
    }

    public void getDivisors(int number) {
        IntStream.rangeClosed(1, number)
                .filter(elem -> number % elem == 0)
                .forEach(elem -> {
                    System.out.println(number + " osztója: " + elem);
                });
    }

    public void getRightNumbers(int[] number) {
        for (int counter = 1; counter < number.length; counter++)
            if (number[counter] % counter == 0) System.out.print(number[counter] + " ");
    }
}
