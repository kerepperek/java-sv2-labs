package controliteration.division;

import java.util.Scanner;

public class Divison {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int maxnumber=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Hánnyal osztható számokat szeretne kapni?");
        int div=scanner.nextInt();
        scanner.nextLine();

        boolean comma=false;
        for(int counter=1;counter<=maxnumber;counter++){
            if(counter%div==0){
                System.out.print((comma?", ":"")+counter);
                comma=true;
            }
        }
        System.out.println();

        int counter=1;
        comma=false;
        while(counter<maxnumber){
            if(counter%div==0){
                System.out.print((comma?", ":"")+counter);
                comma=true;
            }
            counter++;
        }
    }
}
