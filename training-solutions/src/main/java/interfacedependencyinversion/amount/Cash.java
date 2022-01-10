package interfacedependencyinversion.amount;

public class Cash implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int remainder = amount % 5;
        int result = 0;
        if (remainder <= 2) {
            result = amount - remainder;
        } else {
            result += amount - remainder + 5;
        }
        return result;
    }
}
