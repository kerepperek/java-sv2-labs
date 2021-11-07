package junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GentlemanTest {

    @Test
    void testSayHello() {
        String sayHello = new Gentleman().sayHello("John Doe");
        assertEquals("Hello John Doe", sayHello);
    }

    @Test
    void testSayHelloNull() {
        String sayHello = new Gentleman().sayHello(null);
        assertEquals("Hello Anonymous", sayHello);
    }
}