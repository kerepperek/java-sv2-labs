package methodchain;

public class Grasshopper {

    private int position;

    public int getPosition() {
        return position;
    }

    public Grasshopper hopOnce(Direction direction) {
            position = position + (direction == Direction.POSITIVE ? 1 : -1);
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops() {
        this.hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE).hopOnce(Direction.NEGATIVE)
                .hopOnce(Direction.POSITIVE).hopOnce(Direction.POSITIVE);
    }
}
