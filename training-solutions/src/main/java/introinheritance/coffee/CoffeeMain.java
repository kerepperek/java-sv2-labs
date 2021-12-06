package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Omnia");
        coffee.setPrice(678);

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Lavazza");
        cappuccino.setPrice(1754);

        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
