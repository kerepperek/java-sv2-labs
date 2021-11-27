package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("XVI.kerület", "VI.kerület", "III. kerület");
        try {
            Files.write(Paths.get("training-solutions/src/main/resources/roadmap.txt"), names);
        }
        catch (IOException e) {
            throw new IllegalStateException("Error writing file.", e);
        }
    }
}
