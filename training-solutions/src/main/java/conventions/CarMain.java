package conventions;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", "2.0 Diesel", 4, 5);

        car.addModelName("Passat");

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());

        car.setCarType("Suzuki");
        car.addModelName("Ignis");
        car.setEngineType("1.5");
        car.setDoors(5);
        car.setPersons(5);

        System.out.println(car.getCarType());
        System.out.println(car.getEngineType());
        System.out.println(car.getDoors());
        System.out.println(car.getPersons());
    }
}