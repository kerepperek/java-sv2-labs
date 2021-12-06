package inheritancemethods.plane;

public class PriorityPassenger extends Passenger {

    private final int percent;

    public PriorityPassenger(String name, int priceOfPlaneTicket, int percent) {
        super(name, priceOfPlaneTicket);
        this.percent = percent;
    }

    @Override
    public int getPriceOfPlaneTicket() {
        return (int) (super.getPriceOfPlaneTicket() * ((100.0 + percent) / 100.0));
    }

    public int getPercent() {
        return percent;
    }
}
