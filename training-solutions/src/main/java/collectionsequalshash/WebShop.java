package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    private List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.addProduct(new Product("?", "0002"));
        webShop.addProduct(new Product("?", "0002"));
        webShop.addProduct(new Product("prod3", "0002"));
        webShop.addProduct(new Product("prod2", "0004"));
        webShop.addProduct(new Product("prod3", "0005"));

        System.out.println(webShop.findHowMany(new Product("prod3", "0002")));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int findHowMany(Product product) {
        int result = 0;
        for (Product p : products) {
            if (p.equals(product)) {
                result++;
            }
        }
        return result;
    }

}
