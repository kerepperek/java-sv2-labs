package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> freezer = new ArrayList<>();
        freezer.add("tengeri hal");
        freezer.add("paradicsom");
        freezer.add("zöldbab");
        freezer.add("disznó hús");
        freezer.add("csirkemell");

        System.out.println(freezer);
        System.out.println(freezer.size());

        freezer.remove("zöldbab");
        freezer.remove("paradicsom");

        System.out.println(freezer);
        System.out.println(freezer.size());
    }
}
