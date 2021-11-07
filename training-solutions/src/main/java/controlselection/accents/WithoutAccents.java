package controlselection.accents;

import java.util.Arrays;

public class WithoutAccents {
    public static final String[] ACCENTS = new String[]{"áéíóöőúüűÁÉÍÓÖŐÚÜŰ", "aeiooouuuAEIOOOUUU"};

 /*   public static void main(String[] args) {
        WithoutAccents withoutAccents = new WithoutAccents();
        System.out.println(withoutAccents.getWoAccent("á".charAt(0)));
        System.out.println(withoutAccents.getWoAccent("ó".charAt(0)));
        System.out.println(withoutAccents.getWoAccent("a".charAt(0)));
        System.out.println(withoutAccents.getWoAccent("g".charAt(0)));
    }
*/
    public char getWoAccent(char character) {
        int idx = ACCENTS[0].indexOf(character);
        if (idx >= 0) {
            return ACCENTS[1].charAt(idx);
        }
        return character;
    }
}
