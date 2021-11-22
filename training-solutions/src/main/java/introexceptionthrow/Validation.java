package introexceptionthrow;

public class Validation {

    public void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nem adott meg valós nevet!");
        }
    }

    public void validateAge(String ageString) {
        if (ageString.trim().length() == 0) {
            throw new IllegalArgumentException("Nem adott meg életkort!");
        }
        int age=0;
        try{
            age = Integer.parseInt(ageString);
        }
        catch(Exception e){
                throw new IllegalArgumentException("Rossz számadat életkornak!");

        }

        if (age > 120) {
            throw new IllegalArgumentException("Nem valós életkort adott meg!");
        }
    }
}
