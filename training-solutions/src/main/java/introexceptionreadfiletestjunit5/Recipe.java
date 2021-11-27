package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private List<String> recipes=new ArrayList<>();

    public void addIngredients(Path path){
        List<String> allLines = readLines(path);
        getLines(allLines);

    }
    public List<String> getRecipes() {
        return recipes;
    }
    public List<String> readLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public void getLines(List<String> allLines) {

        for (String line : allLines) {
           recipes.add(line.split(" ")[2]);
        }
    }
}
