package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGetMarriage() {
        Man man = new Man("Kerep Perek", new ArrayList<>(Arrays.asList(
                new RegisterDate("Születése napja", LocalDate.of(1974, 9, 20)))));

        Woman woman = new Woman("Sándor Eszter", new ArrayList<>(Arrays.asList(
                new RegisterDate("Születése napja", LocalDate.of(1975, 11, 10)))));

        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals("Kerep Perek", man.getName());
        assertEquals("Kerepné Sándor Eszter", woman.getName());
        assertEquals(2, man.getRegisterDates().size());
        assertEquals(LocalDate.now(), man.getRegisterDates().get(1).getDate());
    }

}