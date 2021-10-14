package classstructureattributes;

import java.util.Scanner;

public class ClientMain{

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Példa az osztály attribútumok kezelésére 1.1");
        System.out.println("");
        System.out.print("Név:");
        client.name = scanner.nextLine();
        System.out.print("Születési év:");
        client.year = scanner.nextInt();
        client.address = scanner.nextLine();
        System.out.print("Lakcím:");
        client.address = scanner.nextLine();
        System.out.println("---------------------------------------------");
        System.out.println("Tárolt adatok visszaolvasása!");
        System.out.println("Név: " + client.name);
        System.out.println("Születési év: " + client.year);
        System.out.println("Lakcím: " + client.address);
    }
}