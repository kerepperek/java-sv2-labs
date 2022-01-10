package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

    private List<Ship> ships = new ArrayList<>();
    private int waitingPeople;
    private int waitingCargo;

    public void addShip(Ship newShip) {
        ships.add(newShip);
    }

    public void loadShip(int passengers, int cargoWeight) {
        int wPassengers = passengers;
        int wCargo = cargoWeight;
        for (Ship ship : ships) {
            if (ship instanceof CanCarryPassengers) {
                if (wPassengers > 0) {
                    wPassengers = ((CanCarryPassengers) ship).loadPassenger(wPassengers);
                }
            }
            if (ship instanceof CanCarryGoods) {
                if (wCargo > 0) {
                    wCargo = ((CanCarryGoods) ship).loadCargo(wCargo);
                }
            }
        }
        waitingPeople = wPassengers;
        waitingCargo = wCargo;
    }

    public int getWaitingPeople() {
        return waitingPeople;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }
}
