package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ";
        System.out.println(prefix);

        String name = "John Doe";
        System.out.println(name);

        String message = prefix + name;
        System.out.println(message);

        message = message + 444;
        System.out.println(message);

        boolean b = message.equals("Hello John Doe");
        System.out.println(b);

        boolean c = message.equals("Hello John Doe444");
        System.out.println(c);

        String dblempty = "" + "";
        System.out.println(dblempty);
        System.out.println(dblempty.length());

        String string = "Abcde";
        System.out.println(string.length());
        System.out.println(string.charAt(0) + ", " + string.charAt(2));
        System.out.println(string.substring(0, 3));
    }
}
