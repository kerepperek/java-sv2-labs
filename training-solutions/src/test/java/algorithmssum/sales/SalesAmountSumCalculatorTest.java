package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountSumCalculatorTest {

    @Test
    void testSumAmount() {
        SalesAmountSumCalculator calculator = new SalesAmountSumCalculator();

        List<Salesperson> salespersons = Arrays.asList(
                new Salesperson("Saler1", 110),
                new Salesperson("Saler2", 1230),
                new Salesperson("Saler3", 431),
                new Salesperson("Saler4", 152)
        );

        assertEquals(1923, calculator.sumAmount(salespersons));
    }
}