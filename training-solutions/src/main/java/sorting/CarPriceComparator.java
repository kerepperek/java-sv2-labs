package sorting;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

    @Override
    public int compare(Car car, Car otherCar) {
        return Integer.valueOf(car.getPrice()).compareTo(otherCar.getPrice());
    }
}
