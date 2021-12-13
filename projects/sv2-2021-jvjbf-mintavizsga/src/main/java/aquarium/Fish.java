package aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;
    private boolean hasMemoryLoss=false;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getStatus(){
        return this.toString();
    }

    public abstract void feed();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addWeight(int weight) {
        this.weight += weight;
    }
    public boolean hasMemoryLoss(){
        return hasMemoryLoss;
    }

    public void setMemoryLoss(boolean hasMemoryLoss) {
        this.hasMemoryLoss = hasMemoryLoss;
    }

    @Override
    public String toString() {
        return  name +
                ", weight: " + weight +
                ", color: " + color  +
                ", short-term memory loss: " + hasMemoryLoss;
    }
}
