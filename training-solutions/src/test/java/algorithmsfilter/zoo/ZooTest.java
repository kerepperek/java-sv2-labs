package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {


    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        List<Animal> animals = Arrays.asList(new Animal("kutya", 4),
                new Animal("őz", 4),
                new Animal("sikló", 0),
                new Animal("fürj", 1)
);
        Zoo zoo=new Zoo(animals);

        List<Animal> result = zoo.getAnimalsWithNumberOfLegsGiven(4);
        assertEquals(2, result.size());
    }
}