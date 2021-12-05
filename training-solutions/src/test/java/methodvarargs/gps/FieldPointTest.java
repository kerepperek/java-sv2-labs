package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void testCreate() {
        FieldPoint fieldPoint = new FieldPoint(LocalDateTime.of(2021, 12, 3, 10, 11),
                46.154858, 17.785695);

        assertEquals(LocalDateTime.of(2021, 12, 3, 10, 11), fieldPoint.getTimeOfSetting());
        assertNull(fieldPoint.getTimeOfLogging());
        assertEquals(46.154858, fieldPoint.getLatitude());
        assertEquals(17.785695, fieldPoint.getLongitude());
    }

}