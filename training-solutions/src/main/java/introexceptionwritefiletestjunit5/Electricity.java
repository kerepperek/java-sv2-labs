package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {

    public void writeStreets(Path path) {
        List<String> streets = createList();
        try {
            Files.write(path, streets);
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file.", e);
        }
    }

    private List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add(LocalDate.now().toString());
        list.add("Harmat utca");
        list.add("Bakáts tér");
        list.add("Haránt köz");
        list.add("Haller utca");
        return list;
    }
}
