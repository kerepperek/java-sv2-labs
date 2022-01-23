package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsedCars {

    private List<Car> cars;

    public UsedCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrice() {
        List<Car> result = new ArrayList<>(cars);
        result.sort((car1, car2) -> Integer.valueOf(car1.getPrice()).compareTo(car2.getPrice()));
        return result;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> result = new ArrayList<>(cars);
        result.sort((car1, car2) -> Double.valueOf(car1.getLength()).compareTo(car2.getLength()));
        Collections.reverse(result);
        return result;
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                result.add(car);
            }
        }
        result.sort((car1, car2) -> car1.getType().compareTo(car2.getType()));
        return result;
    }
}
