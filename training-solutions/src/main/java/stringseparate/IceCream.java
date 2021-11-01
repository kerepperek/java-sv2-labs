package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IceCream {

    public static void main(String[] args) {

        List<String> actions = new ArrayList<>(List.of("csoki", "vanília", "eper", "citrom", "puncs"));
        StringBuilder sb = new StringBuilder();
        sb.append("Ma kaphtó: ");
        actions.iterator().forEachRemaining(i->{sb.append(i);sb.append(", ");});
        sb.delete(sb.length()-2,sb.length());
        sb.append(". Gyerekeknek féláron!");
        System.out.println(sb.substring(0,sb.length()-2));

        System.out.println(String.join(", ",actions));
        System.out.println(actions.stream().collect(Collectors.joining(", ")));
    }
}
