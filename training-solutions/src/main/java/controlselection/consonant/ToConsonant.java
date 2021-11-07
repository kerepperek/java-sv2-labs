package controlselection.consonant;

public class ToConsonant {

    public static final String VOWELS = "aeiou";

 /*   public static void main(String[] args) {
        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.getNextChar("e".charAt(0)));
        System.out.println(toConsonant.getNextChar("g".charAt(0)));
    }
*/
    public char getNextChar(char character) {
        switch (String.valueOf(character)) {
            case "a", "e", "i", "o", "u","A","E","I","O","U":
                return (char) (character + 1);
        }
        return character;
    }
}
