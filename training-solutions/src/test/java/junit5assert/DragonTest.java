package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    Dragon dragon = new Dragon("Dragon", 3, 2.2);
    @Test
    void testName() {
        assertEquals("Dragon", dragon.getName());
        assertNotEquals("Dragon", dragon.getName());
    }

    @Test
    void testNumberOfHeads() {
        assertEquals(3, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 3);
        assertFalse(dragon.getNumberOfHeads() == 4);
        assertEquals(true, dragon.getNumberOfHeads() == 3);
        assertEquals(false, dragon.getNumberOfHeads() == 4);
    }

    @Test
    void testHeight() {
        assertEquals(2.2, dragon.getHeight(), 0.00005);
    }

    @Test
    void testNull() {
        Dragon anotherDragon = null;

        assertNotNull(dragon);
        assertNull(anotherDragon);
    }

    @Test
    void testSameObjects() {
        Dragon anotherDragon = dragon;

        assertSame(dragon, anotherDragon);
    }

    @Test
    void testNotSameObjects() {
        Dragon dragon2 = new Dragon("Big Dragon", 5, 4.1);

        assertNotSame(dragon, dragon2);
    }

}