package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public List<String> validate(List<String> measured) {
        List<String> faultLines = new ArrayList<>();
        for (String line : measured) {
            if (!isValid(line)) {
                faultLines.add(line);
            }
        }
        return faultLines;
    }

    private boolean isValid(String line) {
        String[] parts = line.split(",");
        try {
            return isEnoughParts(parts)
                    && isLineNumber(parts[0])
                    && isMeasuredDouble(parts[1])
                    && isValidName(parts[2]);
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    private boolean isEnoughParts(String[] parts) {
        return parts.length >= 3;
    }

    private boolean isLineNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isMeasuredDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isValidName(String s) {
        String[] nameParts = s.split(" ");
        return nameParts.length >= 2;
    }

}
