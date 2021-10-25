package introdate;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee(1975, 05, 05, "Kerepeszki Gábor");
        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());

        employee.setName("Dr. Janus Serrate");
        System.out.println(employee.getName());
    }
}
