package sorting;

import java.util.Comparator;

public class CarConstructionComparator implements Comparator<Car> {

    @Override
    public int compare(Car car, Car otherCar) {
        return Integer.valueOf(car.getYearOfConstruction()).compareTo(otherCar.getYearOfConstruction());
    }
}
