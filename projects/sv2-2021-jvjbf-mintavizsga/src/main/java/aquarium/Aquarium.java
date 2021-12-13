package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    protected final static int CAPACITY = 20;
    protected final static int  LIVING_SPACE= 5;
    List<Fish> fishes = new ArrayList<>();

    public void addFish(Fish fish) {
        if(fishes.size()*LIVING_SPACE+fish.getWeight()>CAPACITY){
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        fishes.add(fish);
    }

    public void feed() {
        for (Fish fish : fishes) {
            fish.feed();
        }
    }

    public void removeFish(int maxWeight) {
        List<Fish> overWeightedFishes = new ArrayList<>();
        for (Fish fish : fishes) {
            if (fish.getWeight() > maxWeight) {
                overWeightedFishes.add(fish);
            }
        }
        fishes.removeAll(overWeightedFishes);
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish fish : fishes) {
              result.add(fish.toString());
        }
        return result;
    }

    public int getNumberOfFishWithMemoryLoss() {
        int result = 0;
        for (Fish fish : fishes) {
            if (fish.hasMemoryLoss()) {
                result++;
            }
        }
        return result;
    }

    public boolean isThereFishWithGivenColor(String color){
        for (Fish fish : fishes) {
            if (fish.getColor().equals(color)) {
                return true;
            }
        }
        return false;
    }

    public Fish getSmallestFish(){
        Fish smallestFish=fishes.get(0);
        int smallestWeight=fishes.get(0).getWeight();
        for (Fish fish : fishes) {
            if (fish.getWeight()<smallestWeight) {
                smallestWeight=fish.getWeight();
                smallestFish=fish;
            }
        }
        return smallestFish;
    }


}
