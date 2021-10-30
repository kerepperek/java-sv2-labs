package chars;

public class Whitespace {


    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("Elmegy a pap aludni."));
    }

    public String makeWhitespaceToStar(String text) {
        return text.codePoints().map(i -> Character.isWhitespace((char)i)?'*':(char)i).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}
