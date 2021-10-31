package operators;

public class HeadingNorth {
    public static void main(String[] args) {
        HeadingNorth north = new HeadingNorth();

        System.out.println(north.getNumberOfNewDirections());
    }

    public int getNumberOfNewDirections() {
        int turnpcs = 2, degrees=30;
        while (degrees<360) {
            degrees += 10;
            turnpcs++;
        }
        return turnpcs;
    }
}
