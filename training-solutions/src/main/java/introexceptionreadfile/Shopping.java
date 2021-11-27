package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Shopping {

    public static void main(String[] args) {

        try {
            List<String> shopping = Files.readAllLines(Paths.get("training-solutions/src/main/resources/shoppinglist.txt"));
            System.out.println(shopping);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
