package constructoroverloading.bus;

public class SimpleTime {

    private final int hours;
    private final int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours, 0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.getHours(), time.getMinutes());
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getDifference(SimpleTime time) {
        return this.timeInt() - time.timeInt();
    }

    public String toString() {
        return hours + ":" + minutes;
    }

    private int timeInt() {
        return 60 * hours + minutes;
    }

}
