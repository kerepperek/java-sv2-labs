package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("KULCS", "KÁLYHA", "LÓ", "AJTÓ",
                "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA"));

        for (String elem : words) {
            if (elem.length() == 6) {
                System.out.println(elem);
            }
        }
    }
}
