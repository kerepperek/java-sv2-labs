package enumtype.position;

public class PositionMain {

    public static void main(String[] args) {

        Position CEO= Position.CEO;
        System.out.println("Pozíció: " + CEO + ", fizetése: " + CEO.getSalary() + " Ft, Juttatása: " +CEO.getBenefit());
    }
}
