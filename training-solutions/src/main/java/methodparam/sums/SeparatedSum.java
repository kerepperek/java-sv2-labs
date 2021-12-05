package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public String readFromFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get("training-solutions/src/main/resources/floatingnumbers.txt"));
            return lines.get(0);
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file, ioe");
        }
    }

    public Sums sum(String floatingNumbers) {
        double sumPositives = 0;
        double sumNegatives = 0;
        String[] numbers = floatingNumbers.replace(',', '.').split(";");
        for (String number : numbers) {
            if (Double.parseDouble(number)<0) {
                sumNegatives += Double.parseDouble(number);
            } else {
                sumPositives += Double.parseDouble(number);
            }
        }
        return new Sums(sumPositives, sumNegatives);
    }
}
