package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void writeBooks(Path path) {
        List<String> bookList = readList();
        List<String> bookNewList = new ArrayList<>();
        for (String book : bookList) {
            String[] tags = book.split(";");
            bookNewList.add(tags[2] + ": " + tags[1]);
        }
        writeFile(path, bookNewList);
    }

    private List<String> readList() {
        try {
            return Files.readAllLines(Paths.get("training-solutions/src/test/resources/books.txt"));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    private void writeFile(Path path, List<String> bookList) {
        try {
            Files.write(path, bookList);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }
}
