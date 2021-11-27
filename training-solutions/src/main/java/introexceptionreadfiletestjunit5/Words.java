package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.List;

public class Words {


    public String getFirstWordWithA(Path path) {
        List<String> allLines = readLines(path);
        return getLines(allLines);
    }

    public List<String> readLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public String getLines(List<String> allLines) {

        for (String line : allLines) {
            if ("a".equals(("" + line.charAt(0)).toLowerCase())) {
                return line;
            }
        }
        return "A";
    }
}
