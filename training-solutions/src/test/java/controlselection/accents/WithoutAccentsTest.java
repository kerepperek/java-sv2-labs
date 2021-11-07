package controlselection.accents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentsTest {

    @Test
    void test() {
        assertEquals('e', new WithoutAccents().getWoAccent('é'));
        assertEquals('o', new WithoutAccents().getWoAccent('ő'));
        assertEquals('a', new WithoutAccents().getWoAccent('a'));
        assertEquals('.', new WithoutAccents().getWoAccent('.'));
    }
}