package introexceptiontrace.numbers;

import java.util.Arrays;

public class NumbersMain {

    public static void main(String[] args) {
        Change change = new Change();
        int[] result = change.changeNumbers();

        System.out.println(Arrays.toString(result));
    }
}
/*
RandomOperation osztály getNumbers metódusában a for ciklus indexe tovább halad a tömb méreténél.
 */