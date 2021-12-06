package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    @Test
    void testToString() {
        //Given
        ShippedBook book = new ShippedBook("1000 acres", 2000, 600);
        //Then
        assertEquals("1000 acres: 2000 Ft, postaköltség: 600 Ft", book.toString());
    }

    @Test
    void testOrder() {
        //Given
        ShippedBook book = new ShippedBook("1000 acres", 2000, 600);
        //Then
        assertEquals(6600, book.order(3));
    }

    @Test
    void testPurchase() {
        //Given
        ShippedBook book = new ShippedBook("1000 acres", 2000, 600);
        //Then
        assertEquals(6000, book.purchase(3));
    }

}