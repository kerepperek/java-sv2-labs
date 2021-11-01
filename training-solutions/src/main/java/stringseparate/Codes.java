package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class Codes {

    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> codeList = new ArrayList<>(List.of("2343", "T57fbj", "xtcu45", "f578GVHd", "5456jlkj"));
        System.out.println(codes.getCodesStartWithLetter(codeList));
    }

    public String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder();

        codes.stream().filter(i -> Character.isLetter(i.charAt(0)))
                .forEach(i -> {sb.append(i);sb.append(", ");});
        sb.delete(sb.length()-2,sb.length());
        return sb.toString();
    }
}
