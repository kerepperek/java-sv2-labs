package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Thomas Mann", "Der Zauberberg");

        book.register("1924");
        System.out.println("---------------------------------------------");
        System.out.println("Tárolt adatok visszaolvasása!");
        System.out.println("Szerző: " + book.getAuthor());
        System.out.println("Cím: " + book.getTitle());
        System.out.println("Regisztrációs szám: " + book.getRegNumber());
    }
}
