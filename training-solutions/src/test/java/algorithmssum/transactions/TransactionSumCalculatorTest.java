package algorithmssum.transactions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionSumCalculatorTest {

    @Test
    void testSumAmountOfCreditEntries() {

        TransactionSumCalculator calculator = new TransactionSumCalculator();

        List<Transaction> transactions = Arrays.asList(
                new Transaction("12345678-12345678-12345678", TransactionOperation.CREDIT, 124586),
                new Transaction("87654321-87654321-87654321", TransactionOperation.CREDIT, 12112),
                new Transaction("55555555-55555555-00000000", TransactionOperation.DEBIT, -5454),
                new Transaction("10125222-00000000-54565464", TransactionOperation.CREDIT, 4545)
        );

        assertEquals(141243, calculator.sumAmountOfCreditEntries(transactions));
    }

}