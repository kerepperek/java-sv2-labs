package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {

    public int countWithBalanceGreaterThan(List<BankAccount> accounts, int minimumBalance) {
        int count = 0;
        for (BankAccount account : accounts) {
            if (account.getBalance() > minimumBalance) {
                count++;
            }
        }
        return count;
    }
}
