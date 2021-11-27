package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    private Recipe recipe = new Recipe();

    @Test
    public void testaddIngredients() {
        Path path = Paths.get("training-solutions/src/test/resources/recipe.txt");
        recipe.addIngredients(path);

        assertEquals("liszt", recipe.getRecipes().get(0));
    }

    @Test
    public void testaddIngredientsWithWrongFileName() {
        Path path = Paths.get("training-solutions/src/test/resources/recipeX.txt");

        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(path));
        assertEquals("Can not read file.", e.getMessage());
    }

}