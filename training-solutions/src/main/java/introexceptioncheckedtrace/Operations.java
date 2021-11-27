package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Operations {

    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            List<String> neptunLines = operations.readFile(Paths.get("training-solutions/src/main/resources/underground.txt"));
            String result = operations.getDailySchedule(neptunLines);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private List<String> readFile(Path path) throws Exception {
        List<String> neptun = Files.readAllLines(path);
        return neptun;
    }

    private String getDailySchedule(List<String> stringList) {
        StringBuilder sb = new StringBuilder();


        List<String> filteredList = new ArrayList<>();

        sb.append(LocalDate.now().toString() + ",");
        for (String line : stringList) {
            if ("2".equals(""+line.charAt(0))) {
                sb.append(" " + line);
            }
        }
        System.out.println(filteredList);

        return sb.toString();
    }
}
