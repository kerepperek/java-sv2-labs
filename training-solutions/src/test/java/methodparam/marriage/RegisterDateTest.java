package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("Születési napja", LocalDate.of(1974, 9, 20));

        assertEquals("Születési napja", registerDate.getDescription());
        assertEquals(LocalDate.of(1974, 9, 20), registerDate.getDate());
    }
}