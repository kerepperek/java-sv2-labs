package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Island {

    public static void main(String[] args) {
        Island island = new Island();
        Scanner scanner = new Scanner(System.in);
        List<String> importantThings = new ArrayList<>(List.of("kulacs", "kés", "kovakő"));

        System.out.println("A három dolog, amit fontosnak talál egy lakatlan szigeten:" + importantThings);
        System.out.print("Melyiket cseréli le?");
        int counter = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Mire cseréli?");
        String newthing = scanner.nextLine();

        importantThings.set(counter-1, newthing);

        System.out.println("A fontos dolgok listája így alakult:");
        System.out.println(importantThings);
    }
}
