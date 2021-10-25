package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        LocalDate date=LocalDate.of(1991, 1, 1);
        LocalTime startTime=LocalTime.of(7, 1);
        LocalTime endTime=LocalTime.of(12, 59);

        Performance performance = new Performance("Madonna", date, startTime,endTime);
        System.out.println(performance.getArtist());
        System.out.println(performance.getDate());
        System.out.println(performance.getStartTime());
        System.out.println(performance.getEndTime());
        System.out.println(performance.getInfo());
    }
}