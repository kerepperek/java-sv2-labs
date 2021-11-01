package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {

    public static void main(String[] args) {
        List<String> person= Arrays.asList("Kerep Perek","Sándor Kálmán");
        person.stream().forEach(i-> System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!\n",i));
    }
}
