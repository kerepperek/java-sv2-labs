package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class WordsTest {

    private Words words = new Words();

    @Test
    public void testGetFirstWordWithA() {
        Path path = Paths.get("training-solutions/src/test/resources/words.txt");
        String firstWordWithA = words.getFirstWordWithA(path);

        assertEquals("alma", firstWordWithA);
    }

    @Test
    public void testGetFirstWordWithAWithoutA() {
        Path path = Paths.get("training-solutions/src/test/resources/wordswoa.txt");
        String firstWordWithA = words.getFirstWordWithA(path);

        assertEquals("A", firstWordWithA);
    }

    @Test
    public void testGetFirstWordWithAWithWrongFileName() {
        Path path = Paths.get("training-solutions/src/test/resources/wordsX.txt");

        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(path));
        assertEquals("Can not read file.", e.getMessage());
    }

}