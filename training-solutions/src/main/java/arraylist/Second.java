package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 9, 42, 67, 4, 0, 76, 14, 84, 35, 92));

        for (int counter = 1; counter < numbers.size(); counter += 2) {
            System.out.println(numbers.get(counter));
        }
    }
}