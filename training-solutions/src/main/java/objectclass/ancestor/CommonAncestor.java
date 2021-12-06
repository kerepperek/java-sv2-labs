package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {

        List<Object> objects=new ArrayList<>();

        objects.add(new Fruit());;
        objects.add(new Apple());
        objects.add(new Starking());
        objects.add(new Vegetable());

        objects.add("alma");
        objects.add("12!");
        objects.add("x");

        objects.add(LocalDate.now());
        objects.add(new int[]{1, 2, 3, 4, 5});
        objects.add(new ArrayList<>(Arrays.asList("egy", "kettő", "három")));

        System.out.println(objects);
    }
}
