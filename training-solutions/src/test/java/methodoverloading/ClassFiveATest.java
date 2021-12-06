package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {
    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void testGetTodayReferringStudent0() {
        String name = classFiveA.getTodayReferringStudent(2);

        assertEquals("Sáska Maris", name);
    }

    @Test
    void testGetTodayReferringStudent1() {
        String name = classFiveA.getTodayReferringStudent(Number.THREE);

        assertEquals("Bíbor Böbe", name);
    }

    @Test
    void testGetTodayReferringStudent2() {
        String name = classFiveA.getTodayReferringStudent("three");

        assertEquals("Bíbor Böbe", name);
    }

}