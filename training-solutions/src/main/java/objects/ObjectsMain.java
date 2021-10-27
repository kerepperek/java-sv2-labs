package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

        new Book();
        System.out.println(new Book());

        Book emptyBook;
        //System.out.println(emptyBook);
        emptyBook = null;
        System.out.println(emptyBook);

        boolean result = (emptyBook == null);
        System.out.println(result);

        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);

        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        result = (anotherBook == book);
        System.out.println(result);

        anotherBook = book;
        System.out.println(anotherBook);

        result = (anotherBook == book);
        System.out.println(book == anotherBook);

        // gyakorló feladat Tömbök és listák

        Book[] Book = {new Book(), new Book(), new Book()};
        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());
        List<Book> bookList_ = new ArrayList<>();
        bookList_.add(new Book());
        bookList_.add(new Book());
        bookList_.add(new Book());

        System.out.println(Arrays.toString(Book));
        System.out.println(bookList);
        System.out.println(bookList_);

    }
}
