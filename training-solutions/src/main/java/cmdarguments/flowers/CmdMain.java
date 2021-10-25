package cmdarguments.flowers;

public class CmdMain {

    public static void main(String[] args) {
        System.out.println(args.length);
        for (int counter = 0; counter < args.length; counter++) {
            int lineNumber = counter + 1;
            System.out.println(lineNumber + ". elem: " + args[counter]);
        }
    }
}