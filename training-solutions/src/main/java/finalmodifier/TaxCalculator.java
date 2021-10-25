package finalmodifier;

public class TaxCalculator {

    public static final double TAXRATE = 0.27;

    public static void main(String[] args) {
        System.out.println(new TaxCalculator().tax(50));
        System.out.println(new TaxCalculator().priceWithTax(500));
    }

    public double tax(double price) {
        return price * TAXRATE;
    }

    public double priceWithTax(double price) {
        return price * (1 + TAXRATE);
    }
}