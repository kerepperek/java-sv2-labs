package primitivetypes.exam;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthDate;
    private int zipCode;
    private double average;

    public Person(String name, LocalDate birthDate, int zipCode, double average) {
        this.name = name;
        this.birthDate = birthDate;
        this.zipCode = zipCode;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getZipCode() {
        return zipCode;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", zipCode=" + zipCode +
                ", average=" + average +
                '}';
    }
}
