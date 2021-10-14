package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Kovács Pál");
        client.setYear(1958);
        client.setAddress("2143 Kistarcsa, Kossuth utca 2.");

        System.out.println("Példányostott osztályba eltárolt adatok visszaolvasása!");
        System.out.println("Név: " + client.getName());
        System.out.println("Születési év: " + client.getYear());
        System.out.println("Lakcím: " + client.getAddress());

        client.migrate("2143 Kistarcsa, Kossuth utca 2/B.");
        System.out.println("Megváltoztatott cím: " + client.getAddress());
    }
}
