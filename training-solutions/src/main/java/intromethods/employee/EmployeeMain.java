package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Kerep Perek",2000,800000);

        System.out.println("Név: " + employee.getName());
        System.out.println("Foglalkoztatva: " + employee.getHiringYear());
        System.out.println("Fizetés: " + employee.getSalary());

        employee.raiseSalary(50_000);
        employee.setName("Kerep Sándor");

        System.out.println(employee);
    }
}
