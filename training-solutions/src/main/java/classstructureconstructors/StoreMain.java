package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store bookStore = new Store("Könyv");
        Store notebookStore = new Store("Jegyzetfüzet");
        System.out.println("Példa az osztály konstruktorra 1.1");
        System.out.println("----------------------------------------------");

        bookStore.store(100);
        notebookStore.store(500);
        System.out.println("Beérkezés utáni készletállomány:");
        System.out.println(bookStore.getProduct()+": "+bookStore.getStock());
        System.out.println(notebookStore.getProduct()+": "+notebookStore.getStock());

        bookStore.dispatch(10);
        notebookStore.dispatch(10);
        System.out.println();
        System.out.println("Kiszállítás utáni készletállomány:");
        System.out.println(bookStore.getProduct()+": "+bookStore.getStock());
        System.out.println(notebookStore.getProduct()+": "+notebookStore.getStock());

    }
}
