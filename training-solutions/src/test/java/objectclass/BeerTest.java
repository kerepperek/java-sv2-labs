package objectclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeerTest {

    @Test
    void testIsEqual(){
        Beer one=new Beer("Dreher",234);
        Beer two=new Beer("Dreher",999);
        Beer three=new Beer("Dreher",234);
        Book four=new Book("JDreher","234");

        assertFalse(one.equals(two));
        assertFalse(two.equals(three));
        assertTrue(one.equals(three));
        assertFalse(one.equals(four));
    }

}