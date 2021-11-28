package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumAmount(List<Salesperson> salesList) {
        int sum = 0;
        for (Salesperson salesperson : salesList) {
            sum += salesperson.getAmount();
        }
        return sum;
    }
}
