package statements;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hours, int minutes, int seconds) {
        this.hour=hours;
        this.minute=minutes;
        this.second=seconds;
    }

    public int getInMinutes() {
        return hour*60+minute;
    }

    public int getInSeconds() {
        return getInMinutes()*60+second;
    }

    public boolean earlierThan(Time time) {
        return this.getInSeconds()<time.getInSeconds();
    }

    public String toString() {
        return hour+":"+minute+":"+second;
    }
}