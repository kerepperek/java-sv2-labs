package sorting;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient patient, Patient otherPatient) {
        return patient.getTime().compareTo(otherPatient.getTime());
    }
}
