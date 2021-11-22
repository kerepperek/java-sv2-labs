package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adjon meg egy számot:");
        String str="";

        try {
            str = scanner.nextLine();
            int number=Integer.valueOf(str);
            if(number<=0){
                throw new IllegalArgumentException("Nem pozitív szám!");
            }
        } catch( Exception e){
            if(e.getMessage().equals("Nem pozitív szám!")){
                throw new IllegalArgumentException("Nem pozitív szám: " + str);
            }else{
                throw new IllegalArgumentException("Nem szám: " + str);
            }
        }


    }

}
