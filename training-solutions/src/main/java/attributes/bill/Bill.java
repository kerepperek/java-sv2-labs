package attributes.bill;

public class Bill {

    public static void main(String[] args) {

        BillItem b1 = new BillItem("product", 10, 2, 27);

        System.out.println(b1.getProduct());
        System.out.println(b1.getPrice());
        System.out.println(b1.getQuantity());
        System.out.println(b1.getVatPercent());
        System.out.println( b1.calculateTotalPrice() );

    }
}
