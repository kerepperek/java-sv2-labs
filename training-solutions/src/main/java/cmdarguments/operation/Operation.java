package cmdarguments.operation;

public class Operation {
    public static void main(String[] args) {
        for (String szo : args) {
            if (szo.equals("/list")) {
                System.out.println("Listázás");
            } else if (szo.equals("/add")) {
                System.out.println("Hozzáadás");
            } else if (szo.equals("/delete")) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
