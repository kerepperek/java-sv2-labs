package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {

    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        List<String> allLines = paulStreetBoys.readLines();
        paulStreetBoys.printLines(allLines);
    }

    public List<String> readLines() {
        try {
            return Files.readAllLines(Paths.get("training-solutions/src/main/resources/palutcaifiuk.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void printLines(List<String> allLines) {
        for (String line : allLines) {
            if (line.equals("Nemecsek Ernő")) {
                System.out.println(line.toLowerCase());
            } else {
                System.out.println(line);
            }
        }
    }
}


