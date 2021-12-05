package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testGetWordsStartWith() {
        Prefix word = new Prefix();
        List<String> words = Arrays.asList("sárkány", "telefon", "sapka", "specializált", "párna", "tenisz");
        List<String> result = word.getWordsStartWith(words, "te");

        assertEquals(2, result.size());
        assertTrue(result.contains("tenisz"));
        assertFalse(result.contains("sebtapasz"));
    }
}