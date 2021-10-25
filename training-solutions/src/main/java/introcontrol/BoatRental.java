package introcontrol;

import java.util.Scanner;
import java.util.Arrays;

public class BoatRental {

    public static void main(String[] args) {
        int[] boats = {5, 3, 2};

        Scanner scanner = new Scanner(System.in);
        System.out.print("A csoport létszáma?");
        int groupnumber = scanner.nextInt();
        int free=groupnumber;
        int capacity=Arrays.stream(boats).sum();

        for (int counter = 0; counter < boats.length; counter++) {
            if (free > (counter==boats.length-1?0:boats[counter + 1])) {
                int placesinboat =(free>=boats[counter])?boats[counter]:free;
                System.out.println(boats[counter] + " férőhelyes csónakban utazik " + placesinboat + " utas.");
                free -= placesinboat;
            }
        }
            System.out.println(free > 0?"Ennyien maradtak a parton:"+free:"Megmaradt helyek száma: "+(capacity-groupnumber));
    }
}