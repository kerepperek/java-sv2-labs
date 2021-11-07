package controladvanced.labels;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LabelsTest {

    @Test
    void testGetTableOfNumbers() {

        Labels labels = new Labels();

        int[][] table = labels.getTableOfNumbers(6);

        assertEquals(2, table[0][0]);
        assertEquals(9, table[2][5]);
        assertEquals(3, table[1][0]);
    }
}