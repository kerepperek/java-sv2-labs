package methodoverloading;

import java.util.Arrays;
import java.util.List;

public class ClassFiveA {

    private List<String> classMemberNames = Arrays.asList("Kerep Perek", "Sáska Maris", "Bíbor Böbe", "Toka Szalonna",
            "Báró Ráró", "John Doe", "Bill Board", "Szuper Sanyi");

    public String getTodayReferringStudent(int number) {
        return classMemberNames.get(number - 1);
    }

    public String getTodayReferringStudent(Number number) {
        return classMemberNames.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName) {
        Number number=Number.valueOf(numberName.toUpperCase());
        return classMemberNames.get(number.getValue() - 1);
    }
}
