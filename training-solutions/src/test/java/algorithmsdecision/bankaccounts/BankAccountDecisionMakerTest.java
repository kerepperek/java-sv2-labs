package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    List<BankAccount> accounts = Arrays.asList(
            new BankAccount("Kerep Perek", "123345678-12345678-00000001", 600000),
            new BankAccount("Sándor Mátyás", "123345678-12345678-00000002", 200000),
            new BankAccount("Töhötöm Dömötör", "123345678-12345678-00000003", 1100000)
    );

    @Test
    void testContainsBalanceGreaterThan() {
        BankAccountDecisionMaker badm = new BankAccountDecisionMaker();
        assertTrue(badm.containsBalanceGreaterThan(accounts, 300000));
        assertFalse(badm.containsBalanceGreaterThan(accounts, 2000000));
    }
}