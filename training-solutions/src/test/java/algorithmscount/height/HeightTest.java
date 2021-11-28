package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {

        Height height = new Height();
        int expected = height.countChildrenWithHeightGreaterThan(
                Arrays.asList(155, 159, 145, 141, 143, 159, 150)
                , 150);

        assertEquals(3, expected);
    }
}