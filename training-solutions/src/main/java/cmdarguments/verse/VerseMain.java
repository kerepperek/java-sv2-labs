package cmdarguments.verse;

public class VerseMain {
    public static void main(String[] args) {
        for (String szo : args) {System.out.print(szo + " ");}
        System.out.println();

        for (int counter= args.length - 1; counter >= 0; counter--) {
            System.out.print(args[counter] + " ");
        }
    }
}
