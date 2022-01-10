package interfacedependencyinversion.amount;

public class BankAtm implements Payable {

    @Override
    public int getPayableAmount(int amount) {
        int result = (int)Math.ceil(.001 * amount) * 1000;
        return result;
    }
}
