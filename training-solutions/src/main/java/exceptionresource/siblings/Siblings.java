package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path) {
        List<String> siblings = new ArrayList<>();

        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                String firstName = sc.nextLine();
                siblings.add(lastName + " " + firstName);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return siblings;
    }
}
