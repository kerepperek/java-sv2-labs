package statements;

public class Investment {
    static final double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active = true;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int day) {
        return 0.01*fund*interestRate*day/365;
    }

    public double close(int day) {
        double result=active?0.00+fund+getYield(day)*(1-cost*.01):0;
        active=false;
        return result;
    }
}
