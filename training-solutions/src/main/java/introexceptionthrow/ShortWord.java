package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy legfeljebb 5 betűs szót:");
        String word = scanner.nextLine();
        if (word.length() > 5) {
            throw new IllegalArgumentException("Túl hosszú szó!");
        }
        for (char character : word.toCharArray()) {
            if (!Character.isLetter(character)) {
                throw new IllegalArgumentException("Idegen karakter a szóban: " + word);
            }
        }
        System.out.println("A megadott szó: " + word);
    }
}
