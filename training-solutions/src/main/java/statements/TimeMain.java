package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Első időpont (óó:pp:mm):");
        String[]  time1= scanner.next().split(":", 3);
        Time timeClass1 = new Time(Integer.parseInt(time1[0]), Integer.parseInt(time1[1]),Integer.parseInt( time1[2]));

        System.out.print("Második időpont (óó:pp:mm):");
        String[]  time2= scanner.next().split(":", 3);;
        Time timeClass2 = new Time(Integer.parseInt(time2[0]),Integer.parseInt(time2[1]), Integer.parseInt(time2[2]));

        System.out.println("Az első időpont " + timeClass1.toString() + " = " + timeClass1.getInMinutes() + " perc");
        System.out.println("A második időpont " + timeClass2.toString() + " = " + timeClass2.getInSeconds() + " másodperc");
        System.out.println("Az első korábbi, mint a második: " + timeClass1.earlierThan(timeClass2));
    }
}
