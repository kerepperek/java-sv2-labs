package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {

    private List<String> bunch = new LinkedList<>();

    public void addFlower(String flower) {
        bunch.add(flower);
    }

    public List<String> getBunch() {
        return new LinkedList<>(bunch);
    }

    public void addFlowerInTheMiddle(String flower) {
        int i = bunch.size() / 2;
        if (bunch.size() % 2 == 0) {
            bunch.add(i, flower);
        } else {
            bunch.add(i, flower);
            bunch.add(i + 2, flower);
        }
    }
}
