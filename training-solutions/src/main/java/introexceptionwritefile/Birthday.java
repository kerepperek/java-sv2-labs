package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hány születésnapot rögzít?");

        int number = 0;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Not a real number", e);
        }

        List<String> birthdays = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            System.out.print("Születésnapos neve: ");
            String name = scanner.nextLine();
            System.out.print("Dátum: ");
            String birthdaydate = scanner.nextLine();
            birthdays.add(name + ", " + birthdaydate);
        }


        Path path = Paths.get("training-solutions/src/main/resources/birthdaylist.txt");
        try {
            Files.write(path, birthdays);
        } catch (IOException e) {
            throw new IllegalStateException("Error writing file.", e);
        }
    }
}
