package introexceptiontrycatch;

import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("elmaradott", "java", "",null);

        try {
            for (String word : words) {
                System.out.println(word.charAt(0));
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
