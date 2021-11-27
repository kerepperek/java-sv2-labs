package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TrackPoints {


    public List<String> readLines() {
        try {
            return Files.readAllLines(Paths.get("training-solutions/src/main/resources/tracking.csv"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void printLines(List<String> allLines) {
        int height = 0;
        boolean init = true;
        for (String line : allLines) {
            int lineHeight = Integer.parseInt(line.split(";")[2]);
            if (init) {
                height = lineHeight;
                init=false;
            } else {
                System.out.println(lineHeight-height);
                height=lineHeight;
            }
        }
    }
}
