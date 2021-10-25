package locavariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(5.25, true);
        System.out.println(distance.getDistanceInKm() + " Pontosság: " + distance.isExact());

        int intDistanceInKm = (int) distance.getDistanceInKm();
        System.out.println("Egészértéke: "+intDistanceInKm);
    }
}