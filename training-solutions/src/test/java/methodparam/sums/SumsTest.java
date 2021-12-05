package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumsTest {

    @Test
    void testCreate() {
        Sums sums = new Sums(50.1, -12.5);

        assertEquals(50.1, sums.getSumPositives(), 0.01);
        assertEquals(-12.5, sums.getSumNegatives(), 0.01);
    }

}