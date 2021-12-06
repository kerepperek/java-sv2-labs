package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {

    @Test
    void testModify() {
        assertEquals("SxEy", new ModifiedWord().modify("szemetes"));
        assertEquals("PxPy", new ModifiedWord().modify("papíros"));
        assertEquals("KxPy", new ModifiedWord().modify("kapafa"));
    }
}