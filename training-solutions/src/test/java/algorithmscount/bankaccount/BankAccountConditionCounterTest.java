package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void testCountWithBalanceGreaterThan() {
        List<BankAccount> bankAccounts = Arrays.asList(
                new BankAccount("Kerep Perek", "123456789-123456789-00000000", 21425),
                new BankAccount("Sári Mári", "123456789-00000000-00000001", 586),
                new BankAccount("Back Black", "123456789-00000000-00000002", 11548)
        );

        assertEquals(2, new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts, 1000));
        assertEquals(3, new BankAccountConditionCounter().countWithBalanceGreaterThan(bankAccounts, 500));
    }

}