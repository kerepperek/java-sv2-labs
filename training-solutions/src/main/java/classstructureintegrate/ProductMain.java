package classstructureintegrate;
import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Példa az osztály attribútumok kezelésére 1.1");
        System.out.println("----------------------------------------------");


        System.out.print("A termék neve: ");
        String name = scanner.nextLine();
        System.out.print("A termék alapára (Ft):");
        int pricemodification = scanner.nextInt();

        Product product = new Product(name, pricemodification);

        System.out.print("Az engedmény Ft-ban:");
        pricemodification = scanner.nextInt();
        System.out.println();
        product.decreasePrice(pricemodification);
        System.out.println("Ár a rögzítés után:");
        System.out.println(product.getName() + ": " + product.getPrice() + "Ft.");

        System.out.print("Az áremelés Ft-ban:");
        pricemodification = scanner.nextInt();
        System.out.println();
        product.increasePrice(pricemodification);
        System.out.println("Ár az áremelés után:");
        System.out.println(product.getName() + ": " + product.getPrice() + "Ft.");
    }
}
