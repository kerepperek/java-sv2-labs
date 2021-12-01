package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> list) {
        int max = list.get(0);
        for (int temp : list) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
