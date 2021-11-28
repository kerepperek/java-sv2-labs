package algorithmscount.transactions;

import algorithmssum.transactions.TransactionOperation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void testCountEntryLessThan() {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("12345678-12345678-12345678", TransactionType.CREDIT, 124586),
                new Transaction("87654321-87654321-87654321", TransactionType.CREDIT, 12112),
                new Transaction("55555555-55555555-00000000", TransactionType.DEBIT, -5454),
                new Transaction("10125222-00000000-54565464", TransactionType.CREDIT, 4545)
        );

        assertEquals(2, new TransactionCounter().countEntryLessThan(transactions, 15000));
        assertEquals(3, new TransactionCounter().countEntryLessThan(transactions, 200000));
    }
}