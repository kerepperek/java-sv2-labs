package attributes.book;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Book-book");
        System.out.println(book.getTitle());

        book.setTitle("Book-----");
        System.out.println(book.getTitle());
    }
}
