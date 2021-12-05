package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("Születése napja", LocalDate.of(1975, 9, 10));
        Man man = new Man("Kerep Perekné", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("Kerep Perekné", man.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals(LocalDate.of(1975, 9, 10), man.getRegisterDates().get(0).getDate());
    }
}