package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    List<String> owls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                owls.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }

    }

    public int getNumberOfOwls(String county) {
        int result = 0;
        for (String s : owls) {
            String[] split = s.split("=");
            if (split[0].equals(county)) {
                result += Integer.parseInt(split[1]);
            }
        }
        if(result==0){
            throw new IllegalArgumentException("No such county in Hungary!");
        }
        return result;
    }

    public int getNumberOfAllOwls(){
        int result = 0;
        for (String s : owls) {
                result += Integer.parseInt(s.split("=")[1]);
        }
        return result;
    }
}
