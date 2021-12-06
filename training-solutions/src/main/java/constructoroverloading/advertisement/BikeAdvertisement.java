package constructoroverloading.advertisement;

import java.util.List;

public class BikeAdvertisement {

    private String shortDescription;
    private int price;
    private List<String> extras;
    private String brand;
    private String serialNumber;

    public BikeAdvertisement(String shortDescription, int price) {
        this.shortDescription = shortDescription;
        this.price = price;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand) {
        this(shortDescription, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand, List<String> extras) {
        this(shortDescription, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String shortDescription, int price, String brand, List<String> extras, String serialNumber) {
        this(shortDescription, price, brand, extras);
        this.serialNumber = serialNumber;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
