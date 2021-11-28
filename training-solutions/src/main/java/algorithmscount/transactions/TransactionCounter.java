package algorithmscount.transactions;

import java.util.List;

public class TransactionCounter {

    public int countEntryLessThan(List<Transaction> transactions, int maximumAmount) {
        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionType() == TransactionType.CREDIT && transaction.getAmount() < maximumAmount) {
                count++;
            }
        }
        return count;
    }

}
