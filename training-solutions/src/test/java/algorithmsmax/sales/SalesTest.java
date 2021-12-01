package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salespersons = Arrays.asList(
            new Salesperson("Kerep Perek", 5800, 8000),
            new Salesperson("Sereg Kerek",  6500, 8000),
            new Salesperson("Török Györök", 9600, 8000),
            new Salesperson("Gulyás Péter", 11300, 8000)
    );

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {
        Sales sales = new Sales();

        assertEquals(11300, sales.selectSalesPersonWithMaxSalesAmount(salespersons).getAmount());
        assertEquals(8000, sales.selectSalesPersonWithMaxSalesAmount(salespersons).getTarget());
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        Sales sales = new Sales();

        assertEquals(11300, sales.selectSalesPersonWithFurthestAboveTarget(salespersons).getAmount());
        assertEquals(8000, sales.selectSalesPersonWithFurthestAboveTarget(salespersons).getTarget());
        assertEquals(3300, sales.selectSalesPersonWithFurthestAboveTarget(salespersons).getdiffToTarget());
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {
        Sales sales = new Sales();

        assertEquals(5800, sales.selectSalesPersonWithFurthestBelowTarget(salespersons).getAmount());
        assertEquals(8000, sales.selectSalesPersonWithFurthestBelowTarget(salespersons).getTarget());
        assertEquals(-2200, sales.selectSalesPersonWithFurthestBelowTarget(salespersons).getdiffToTarget());
    }
}