package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {

    private int amountByCity;
    public Aid(int amount) {
        this.amountByCity = amount;
    }

    public int getAmount() {
        return amountByCity;
    }

    public List<String> countAmountsOfAid(Path path) {
        List<String> result = new ArrayList<>();
        try {
            List<String> readedLines = Files.readAllLines(path);
            for (String s : readedLines) {
                String[] temp = s.split(" ");
                int residents = Integer.parseInt(temp[1]);
                int amountPerResident = amountByCity / residents;
                result.add(temp[0] + " " + amountPerResident);
            }
        } catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
            throw new IllegalStateException("Something went wrong while counting.", ex);
        }
        return result;
    }
}
