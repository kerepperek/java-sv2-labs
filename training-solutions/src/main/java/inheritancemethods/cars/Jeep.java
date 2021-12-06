package inheritancemethods.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Extra capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void drive(int km) {
        if (!isEnoughFuelJeep(km)) {
            throw new IllegalArgumentException("Not enough fuel available!");
        }
        double consumption = 1.0 * km * super.getFuelRate() / 100;

        if (extraFuel-consumption < 0) {
            modifyFuelAmount(extraFuel-consumption);
            extraFuel = 0;
        }else{
            modifyFuelAmount(-consumption);
            extraFuel -= consumption;
        }
    }


    private boolean isEnoughFuelJeep(int km) {
        return ((super.getFuel() + extraFuel) - km * super.getFuelRate() / 100) >= 0.0;
    }

    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}
