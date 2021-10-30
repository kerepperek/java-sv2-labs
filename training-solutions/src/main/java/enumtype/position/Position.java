package enumtype.position;

public enum Position {
    CFO(2_000_000, "kocsi"),
    FM(1_500_000, "kocso"),
    CEO(3_000_000, "kocsi");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
