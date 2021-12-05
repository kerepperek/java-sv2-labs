package algorithmsdecision.towns;

import java.util.List;

public class Town {

    public boolean containsFewerHabitants(List<Integer> list, int number) {
        boolean hasLower = false;
        for (int i : list) {
            if (i < number) {
                hasLower = true;
            }
        }
        return hasLower;
    }
}
