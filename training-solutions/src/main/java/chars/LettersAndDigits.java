package chars;

public class LettersAndDigits {

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("bfa68fF;X");
    }

    public void printLetterOrDigit(String text) {
        char[] chars = text.toCharArray();
        for (char c : chars)
                System.out.println(c + (Character.isAlphabetic(c)?" : betű":(Character.isDigit(c)?" : számjegy":" : egyéb")));
    }
}
