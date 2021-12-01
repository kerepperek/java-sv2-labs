package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson maxSalesPerson = null;
        for (Salesperson salesperson : sales) {
            if (maxSalesPerson == null || salesperson.getAmount() > maxSalesPerson.getAmount()) {
                maxSalesPerson = salesperson;
            }
        }
        return maxSalesPerson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson maxSalesPerson = null;
        for (Salesperson salesperson : sales) {
            if (maxSalesPerson == null||
                    (salesperson.getdiffToTarget() > 0 && salesperson.getdiffToTarget() > maxSalesPerson.getdiffToTarget())) {
                maxSalesPerson = salesperson;
            }
        }
        return maxSalesPerson;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson minSalesPerson = null;
        for (Salesperson salesperson : sales) {
            if (minSalesPerson == null|| (salesperson.getdiffToTarget() < 0 && salesperson.getdiffToTarget() < minSalesPerson.getdiffToTarget())) {
                minSalesPerson = salesperson;
            }
        }
        return minSalesPerson;
    }
}
