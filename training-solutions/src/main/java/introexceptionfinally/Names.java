package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {

    public static void main(String[] args) {

        Names name = new Names();

        try {
            List<String> nameList = Files.readAllLines(Paths.get("training-solutions/src/main/resources/names.txt"));
            System.out.println(name.getDr( nameList));
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.", e);
        } finally {
            System.out.println("End of reading.");
        }

        try {
            List<String> nameList = Files.readAllLines(Paths.get("training-solutions/src/main/resources/nameswodr.txt"));
            System.out.println(name.getDr( nameList));
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file.", e);
        } finally {
            System.out.println("End of reading.");
        }
    }

    private String getDr( List<String> nameList) {
        for (String s : nameList) {
            if (s.startsWith("dr")) {
                return s;
            }
        }
        return "";
    }
}
