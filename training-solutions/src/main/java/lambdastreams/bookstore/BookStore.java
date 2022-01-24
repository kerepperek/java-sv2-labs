package lambdastreams.bookstore;

import java.util.List;
import java.util.Optional;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public Integer getNumberOfBooks() {
        return books.stream().reduce(0, (x, y) -> x + y.getPcs(), (x_, y_) -> x_ + y_);
    }

    public Optional<Book> findNewestBook() {
        return books.stream().max((a, b) -> a.getYearOfPublish() - b.getYearOfPublish());
    }

    public Integer getTotalValue() {
        return books.stream().reduce(0, (x, y) -> x + y.getPrice() * y.getPcs(), (x_, y_) -> x_ + y_);
    }
}
