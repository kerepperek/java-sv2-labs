package lambdastreams.bookstore;

public class Book {

    private String title;
    private int yearOfPublish;
    private int price;
    private int pcs;

    public Book(String title, int yearOfPublish, int price, int pcs) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
        this.price = price;
        this.pcs = pcs;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public int getPrice() {
        return price;
    }

    public int getPcs() {
        return pcs;
    }
}
