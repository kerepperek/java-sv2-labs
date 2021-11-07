package controlselection.greetings;


import java.time.LocalTime;

public class Greetings {

  /*  public static void main(String[] args) {
        Greetings greetings = new Greetings();

        System.out.println(greetings.Napszak(LocalTime.of(8, 0)));
        System.out.println(greetings.Napszak(LocalTime.of(12, 0)));
        System.out.println(greetings.Napszak(LocalTime.of(23, 0)));
    }
*/
    public String Napszak(LocalTime time) {

        if (time.isAfter(LocalTime.of(20, 0))) {
            return "jó éjt";
        } else if (time.isAfter(LocalTime.of(18, 30))) {
            return "jó estét";
        } else if (time.isAfter(LocalTime.of(9, 0))) {
            return "jó napot";
        } else if (time.isAfter(LocalTime.of(5, 0))) {
            return "jó reggelt";
        }
        return "jó éjt";
    }
}
