package debug;

import java.util.Arrays;
import java.util.List;

public class Star {

    public static void main(String[] args) {
        Star star = new Star();
        int[] numbers = {1, 3, 5, 10, 12};
        star.writeStars(numbers);
    }


    public void writeStars(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int prev = (i>0)?numbers[i-1]:0;
            int stars = numbers[i] - prev;
            printStars(stars);
            prev = numbers[i];
            System.out.println();
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }
}
