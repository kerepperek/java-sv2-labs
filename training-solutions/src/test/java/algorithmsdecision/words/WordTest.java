package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        Word word = new Word();
        List<String> words = Arrays.asList("szalmazsák", "kerítés", "tök", "körtefa","baba");

        assertTrue(word.containsLongerWord(words, "sakál"));
        assertFalse(word.containsLongerWord(words, "telefonkagyló"));
    }
}