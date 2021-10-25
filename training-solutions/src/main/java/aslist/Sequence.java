package aslist;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        List<Integer> elements = new ArrayList<>(List.of(5,6 ));

        for (int counter = 2; counter < 9; counter++) {
            int number = elements.get(counter-1) * elements.get(counter - 2);
            elements.add(number);
        }

        System.out.println(elements);
        System.out.println(elements.size());
    }
}