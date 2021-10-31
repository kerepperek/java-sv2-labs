package stringconcat.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Kerep Perek", "kontroller", 350_000);

        System.out.println(employee.getName());
        System.out.println(employee.getJob());
        System.out.println(employee.getWages());

        System.out.println(employee);
    }
}
