package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        List<String> allLines = new Poem().readLines();
        for(String line:allLines) {
            System.out.print(line.charAt(0));
        }
    }

    public List<String> readLines() {
        try {
            return Files.readAllLines(Paths.get("training-solutions/src/main/resources/poem.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
