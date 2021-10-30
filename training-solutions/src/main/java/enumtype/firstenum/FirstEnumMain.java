package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {

    public static void main(String[] args) {

        System.out.println(Continent.AFRIKA);
        System.out.println(Continent.AMERIKA);
        System.out.println(Continent.ÁZSIA);
        System.out.println(Continent.EURÓPA);
        System.out.println(Continent.ANKTARTISZ);
        System.out.println(Continent.AUSZTRÁLIA);
        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("CSENDES"));
        System.out.println(Ocean.valueOf("INDIAI"));
        System.out.println(Ocean.valueOf("ATLANTI"));

        System.out.println(Football.KAPUS.name());
        System.out.println(Football.CSATÁR.name());
        System.out.println(Football.HÁTVÉD.name());
    }
}
