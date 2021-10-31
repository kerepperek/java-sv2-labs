package stringbasic.characters;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a szót: ");
        String word=scanner.nextLine();
        System.out.println();

        String checkword="";
        System.out.println("Betűzd le egyesével a szót ("+word.length()+ "):");
        for(int counter=0;counter<word.length();counter++) checkword+= scanner.nextLine().toCharArray()[0];

        System.out.println("A betűk össszeolvasva: " + checkword);
        System.out.println(word.equalsIgnoreCase(checkword)?"Egyeznek!":"Nem egyeznek");
    }
}
