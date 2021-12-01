package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {

    @Test
    void testGetMax() {
        List<Integer> hillTops = Arrays.asList(300, 400, 500, 510, 430, 260,500);

        int maxHill = new Hill().getMax(hillTops);

        assertEquals(510, maxHill);
    }
}