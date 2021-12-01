package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {


    @Test
    void testGetTrainerWithMaxAge() {
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Kerep Perek", 45),
                new Trainer("Teker Nyeker", 23),
                new Trainer("Dömötör Sömme", 49),
                new Trainer("Barack Bökke", 62)
        );

        Trainer maxAgeTrainer = new MaxAgeCalculator().getTrainerWithMaxAge(trainers);

        assertEquals("Barack Bökke", maxAgeTrainer.getName());
        assertEquals(62, maxAgeTrainer.getAge());
    }
}