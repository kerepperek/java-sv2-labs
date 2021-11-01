package stringscanner;

import java.util.Scanner;

public class StringScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Íron be egy mondatot: ");
        String sentence = scanner.nextLine();

        Scanner wordscanner = new Scanner(sentence);
        while (wordscanner.hasNext()) {
            System.out.println(wordscanner.next());
        }
//******************************************************************
        System.out.println();
        System.out.println("Most ron be egy több tagú mondatot:");
        sentence = scanner.nextLine();
        Scanner taggedsentence = new Scanner(sentence).useDelimiter(", ");

        while (taggedsentence.hasNext()) {
            System.out.println(taggedsentence.next());
        }
    }
}
