package introconstructors;

import java.time.LocalDate;

public class CyclingTour{
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Szolnok körül", LocalDate.of(2021,11,12));
        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());

        cyclingTour.registerPerson(96);

        cyclingTour.ride(52);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());
    }

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public void registerPerson(int person){
        numberOfPeople+=person;
    }

    public void ride(double km){
        kms+=km;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }

}
