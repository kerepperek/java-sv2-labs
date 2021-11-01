package formatlocaleprintf;

import java.time.LocalDate;
import java.util.*;

public class Run {

    private List<Double> kms;
    private String user;

    public static void main(String[] args) {
        Run run = new Run("Kerep Perek");
        run.addRun(5.8);
        System.out.println(run.printFormattedRunText());
        run.addRun(5.9);
        System.out.println(run.printFormattedRunText());
    }

    public Run( String user) {
        this.kms = new ArrayList<>();
        this.user = user;
    }
    public void addRun(double km){
        kms.add(km);
    }
    public String printFormattedRunText(){
       return String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %f km-t futottál. Csak így tovább!,",
                user, LocalDate.now().toString(),kms.size(),kms.get(kms.size() - 1));
    }

}
