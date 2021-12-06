package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testCreate() {
        Dog dog = new Dog("Rex", 1, Species.MIXTURE);

        assertEquals("Rex", dog.getName());
        assertEquals(1, dog.getAge());
        assertEquals(Species.MIXTURE, dog.getSpecies());
        assertEquals(0L, dog.getCodeNumber());
    }

}