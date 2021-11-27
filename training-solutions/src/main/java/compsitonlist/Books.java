package compsitonlist;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    List<String> books = new ArrayList<>();

    public static void main(String[] args) {
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hány könyvcímet szeretne eltárolni?");
        int bookpcs = scanner.nextInt();
        scanner.nextLine();
        for (int counter = 1; counter <= bookpcs; counter++) {
            System.out.print(counter + ". könyv címe? ");
            books.addBook(scanner.nextLine());
        }

        System.out.println(books.getBooks());
        System.out.println("-------------------------------------------");
        System.out.print("Melyik könyvcímhez rögzíti a szerzőt? ");
        String title = scanner.nextLine();
        System.out.println("A szerzője? ");
        String author = scanner.nextLine();
        books.findBookAndSetAuthor(title, author);
        System.out.println(books.getBooks());

    }

    public void addBook(String title) {
        books.add(title);
    }

    public void findBookAndSetAuthor(String title, String author) {
        if (books.contains(title)) {
            int bookindex = books.indexOf(title);
            String fullTitle = author + ": " + books.get(bookindex);
            books.set(bookindex, fullTitle);
        }
    }

    public List<String> getBooks() {
        return books;
    }


}
