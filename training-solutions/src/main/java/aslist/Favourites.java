package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        Favourites favourites = new Favourites();
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteQuestions = new ArrayList<>(List.of("Kedvenc filme? ", "Kedvenc színésze?", "Kedvenc színe?","Kedvenc állata?"));
        List<String> favouriteThings = new ArrayList<>();

        for(String question:favouriteQuestions){
            System.out.print(question);
            String get = scanner.nextLine();
            favouriteThings.add(get);
        }

        System.out.println(favouriteThings.size());
        System.out.println(favouriteThings);
    }
}
