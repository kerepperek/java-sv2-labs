package controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hány elemét írjam ki a Fibonacci sorozatnak?");
        int maxnumber = scanner.nextInt();
        scanner.nextLine();

        int pointerPrev = 0, pointerPrevBefore = 1, pointer = 0;
        System.out.print("f[0]=0, ");
        for (int counter = 1; counter < maxnumber; counter++) {
            pointer = pointerPrev + pointerPrevBefore;
            pointerPrevBefore = pointerPrev;
            pointerPrev = pointer;
            System.out.print("f[" + counter + "]=" + pointer + ", ");
        }
        System.out.println();

        pointerPrev = 0;
        pointerPrevBefore = 1;
        pointer = 0;
        int counter = 1;
        System.out.print("f[0]=0, ");
        while (counter < maxnumber) {
            pointer = pointerPrev + pointerPrevBefore;
            pointerPrevBefore = pointerPrev;
            pointerPrev = pointer;
            System.out.print("f[" + counter + "]=" + pointer + ", ");
            counter++;
        }
    }
}
