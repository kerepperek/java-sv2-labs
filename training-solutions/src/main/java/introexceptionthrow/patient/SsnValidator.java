package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn) {
        if (ssn.length() != 9||!isInteger(ssn))
            return false;
        try {
            int sum = 0;
            for (int counter = 0; counter < ssn.length() - 1; counter += 2) {
                sum += Integer.parseInt(""+ssn.charAt(counter)) * 3;
            }
            for (int counter = 1; counter < ssn.length() - 1; counter += 2) {
                sum += Integer.parseInt(""+ssn.charAt(counter)) * 7;
            }
            return (Integer.parseInt(""+ssn.charAt(8)) == (sum % 10));
        } catch (IllegalArgumentException e) {
            return false;
        }
    }
 private boolean isInteger(String s){
        try{
            int i=Integer.parseInt(s);
        }catch(Exception e){
            throw new IllegalArgumentException("Az azonosító nem szám.");
        }
        return true;
 }

}
