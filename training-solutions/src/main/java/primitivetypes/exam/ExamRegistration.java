package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {

    public static void main(String[] args) {

        Exam exam = new Exam();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Neve? ");
        String name = scanner.nextLine();

        System.out.print("Születési éve? ");
        String yearString = scanner.nextLine();
        System.out.print("Születési hónapja? ");
        String monthString = scanner.nextLine();
        System.out.print("Születési napja? ");
        String dayString = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.of(Integer.parseInt(yearString), Integer.parseInt(monthString), Integer.parseInt(dayString));

        System.out.print("Iránytószáma? ");
        String zipCodeString = scanner.nextLine();
        int zipCode = Integer.parseInt(zipCodeString);

        System.out.print("Osztályzatainak átlaga?");
        String averageString = scanner.nextLine();
        double average = Double.parseDouble(averageString);

        Person person = new Person(name, dateOfBirth, zipCode, average);
        exam.addPerson(person);
        System.out.println(exam.getPersons());
    }
}
