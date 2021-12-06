package abstractclass.gamecharacter;

public class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getDistance(Point otherPoint) {
        return (long) Math.sqrt(Math.pow(1.0 * x - otherPoint.getX(), 2) +
                        Math.pow(1.0 * y - otherPoint.getY(), 2)
        );
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

}
