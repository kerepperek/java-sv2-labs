package introexceptionthrow;

public class Patient {

    private String name;
    private String socialSecurityNumber; // TAJ szám
    private int yearOfBirth;


    public Patient(String name, String ssn, int year) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Üres a név.");
        }
        if (year <= 1900) {
            throw new IllegalArgumentException("Nem valós születési dátum: " + year);
        }
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = year;
    }

    public static void main(String[] args) {

        Patient patient = new Patient("Kerep Perek", "322323", 1974);
        patient.printResult(patient);

        patient = new Patient("", "322323", 1974);
        patient.printResult(patient);

        patient = new Patient("Kerep Perek", "123456788", 1899);
        patient.printResult(patient);
    }
private void printResult(Patient patient){
    System.out.println(patient.getName());
    System.out.println(patient.getSocialSecurityNumber());
    System.out.println(patient.getYearOfBirth());

}
    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

}
