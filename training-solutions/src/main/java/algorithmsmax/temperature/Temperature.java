package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> list){
        int min = list.get(0);
        for (int temp : list) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}
