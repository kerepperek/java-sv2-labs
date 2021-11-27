package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        try {
            List<String> neptunLines = neptun.loadFile(Paths.get("training-solutions/src/main/resources/neptun.csv"));
            List<String> codes=new ArrayList<>();
            for(String line:neptunLines){
                codes.add(line.split(",")[1]);
            }
            System.out.println(codes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> loadFile(Path path) throws Exception {
            List<String> neptun = Files.readAllLines(path);
            return neptun;
    }
}
