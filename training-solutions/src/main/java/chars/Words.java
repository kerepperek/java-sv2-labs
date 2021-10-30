package chars;

import java.util.stream.Collectors;

public class Words {

    public static void main(String[] args) {
        Words words=new Words();
        System.out.println(words.pushWord("alma"));
    }

    public String pushWord(String word){
        return word.codePoints().map(i -> (char)(i+1)).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
