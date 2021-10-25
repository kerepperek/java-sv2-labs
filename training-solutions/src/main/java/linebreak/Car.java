package linebreak;

public class Car {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getBrandAndTypeInSeparateLines("Volkswagen", "Passat"));
    }

    private String getBrandAndTypeInSeparateLines(String brand, String type) {
        return brand + "\n" + type;
    }

}