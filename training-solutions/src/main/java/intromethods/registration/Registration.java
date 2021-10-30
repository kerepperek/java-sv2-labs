package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Registration registration = new Registration();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registration page:");

        System.out.print("Your first name? ");
        String firstName = scanner.nextLine();

        System.out.print("Your last name? ");
        String lastName = scanner.nextLine();

        System.out.print("Your birth year? ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Your birth month? ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Your birth day? ");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Your e-mail? ");
        String email = scanner.nextLine();

        Person person = new Person(registration.getName(firstName, lastName), registration.getDateOfBirth(year, month, day), email);
        System.out.println("Registered data:");
        System.out.println(person);

    }
    public String getName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public LocalDate getDateOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }
}