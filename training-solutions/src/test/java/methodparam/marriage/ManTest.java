package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("Születése napja", LocalDate.of(1974, 9, 20));
        Man man = new Man("Kerep Perek", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("Kerep Perek", man.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals(LocalDate.of(1974, 9, 20), man.getRegisterDates().get(0).getDate());
    }

}