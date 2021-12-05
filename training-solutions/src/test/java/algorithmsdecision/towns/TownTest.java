package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        Town town = new Town();
        List<Integer> habitants = Arrays.asList(2000, 5000, 3000, 21345, 87654);

        assertTrue(town.containsFewerHabitants(habitants, 4200));
        assertFalse(town.containsFewerHabitants(habitants, 10));
    }
}