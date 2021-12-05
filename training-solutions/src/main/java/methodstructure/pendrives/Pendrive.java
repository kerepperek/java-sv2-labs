package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }


    public void risePrice(int percent) {
        price += price * (percent / 100.0);
    }

    public int comparePricePerCapacity(Pendrive other) {
        double thisPricePerCapacity = (double) price / capacity;
        double otherPricePerCapacity = (double) other.price / other.capacity;
        if (thisPricePerCapacity > otherPricePerCapacity ) {
            return 1;
        }
        if (thisPricePerCapacity < otherPricePerCapacity ) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other) {
        return this.price < other.price;
    }

      public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
