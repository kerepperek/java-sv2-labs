package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {

    private List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("4 macska felmászott a 3 méter magas fára. 12 tűzoltó jött megmenteni 2 kocsival.");
        System.out.println(digits.getNumbers());
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void addDigitsToList(String text) {
        char[] chars = text.toCharArray();
        for (char letter : chars)
            if (Character.isDigit(letter))
                numbers.add(Integer.parseInt(String.valueOf(letter)));
    }

}
