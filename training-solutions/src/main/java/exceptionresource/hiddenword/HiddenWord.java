package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;


public class HiddenWord {

    public String getHiddenWord(Path path) {
        try (Scanner sc = new Scanner(path)) {
            return getWord(sc);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    private String getWord(Scanner scanner) {
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            char letter = getLetter(s);
            sb.append(letter);
        }
        return sb.toString();
    }

    private char getLetter(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return c;
            }
        }
        return ' ';
    }
}
