package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testIsEqual(){
        Book one=new Book("John Dow","End of the Life");
        Book two=new Book("John Dow","Pyramids");
        Book three=new Book("John Dow","End of the Life");
        Book four=one;

        assertFalse(one.equals(two));
        assertFalse(two.equals(three));
        assertTrue(one.equals(three));
        assertTrue(one.equals(four));
    }
}