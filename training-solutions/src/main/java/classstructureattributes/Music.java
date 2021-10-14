package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Példa az osztály attribútumok kezelésére 1.2");
        System.out.println("--------------------------------");
        System.out.print("A kedvenc zeneszámod előadója:");
        song.band = scanner.nextLine();
        System.out.print("Címe:");
        song.title = scanner.nextLine();
        System.out.print("Hossza?");
        song.length = scanner.nextInt();
        System.out.println("---------------------------------------------");
        System.out.println("Tárolt adatok visszaolvasása!");
        System.out.println(song.band+" - "+song.title+" ("+song.length+" perc)");
    }
}
