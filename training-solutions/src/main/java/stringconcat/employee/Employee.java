package stringconcat.employee;

public class Employee {

    private String name;
    private String job;
    private int wages;

    public Employee(String name, String job, int wages) {
        this.name = name;
        this.job = job;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getWages() {
        return wages;
    }

    @Override
    public String toString() {
        return name + " - " + job + " - " + wages + " Ft";
    }
}
