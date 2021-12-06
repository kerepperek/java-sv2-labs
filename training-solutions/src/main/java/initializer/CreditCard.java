package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    private static final List<Rate> RATES = new ArrayList<>();

    private long balance;

    public CreditCard(long balance, Currency currency, List<Rate> upload) {
        RATES.addAll(upload);
        this.balance = Math.round(balance * getConversionFactor(currency));
    }

    public CreditCard(long balance, Currency currency) {
        this.balance = Math.round(balance * getConversionFactor(currency));
    }

    static{
       // RATES.addAll(upload);

    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public boolean payment(long amount, Currency currency) {
        long value = Math.round(amount * getConversionFactor(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }

    private double getConversionFactor(Currency currency) {
        for (Rate rate : RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }
}
