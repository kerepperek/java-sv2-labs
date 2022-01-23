package searching;

import java.time.LocalDate;
import java.util.Objects;

public class LostProperty implements Comparable<LostProperty> {

    private String regNumber;
    private String shortDescription;
    private LocalDate dateOfRegistration;

    public LostProperty(String shortDescription, LocalDate dateOfRegistration) {
        this.shortDescription = shortDescription;
        this.dateOfRegistration = dateOfRegistration;
    }

    public LostProperty(String regNumber, String shortDescription, LocalDate dateOfRegistration) {
        this.regNumber = regNumber;
        this.shortDescription = shortDescription;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LostProperty other = (LostProperty) o;
        return Objects.equals(shortDescription, other.shortDescription) && Objects.equals(dateOfRegistration, other.dateOfRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortDescription, dateOfRegistration);
    }

    @Override
    public int compareTo(LostProperty other) {
        if (shortDescription.compareTo(other.shortDescription) == 0) {
            return dateOfRegistration.compareTo(other.dateOfRegistration);
        } else {
            return shortDescription.compareTo(other.shortDescription);
        }
    }
}
