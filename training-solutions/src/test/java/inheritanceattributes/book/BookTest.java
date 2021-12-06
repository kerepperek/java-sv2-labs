package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testCreate() {
        Book book = new Book("1000 acres", 12);

        assertEquals("1000 acres", book.getTitle());
        assertEquals(12, book.price);
    }

    @Test
    void testPurchase() {

        Book book = new Book("1000 acres", 2600);

        assertEquals(5200, book.purchase(2));
    }
}