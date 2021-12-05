package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount = new BankAccount("Kerep Perek", "12345678-12345678-12345678", 2000000);

    @Test
    void testCreateBankAccount() {

        assertEquals("12345678-12345678-12345678", bankAccount.getAccountNumber());
        assertEquals(2000000, bankAccount.getBalance());

    }

    @Test
    void testWithdraw() {
        bankAccount.withdraw(200000);
        assertEquals(1800000, bankAccount.getBalance());
        assertFalse(bankAccount.withdraw(1801000));

    }

    @Test
    void testDeposit() {
        bankAccount.deposit(50000);
        assertEquals(2050000, bankAccount.getBalance());
        assertTrue(bankAccount.deposit(50000));

    }

}