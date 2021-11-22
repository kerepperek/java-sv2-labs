package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {

        Adult adult = new Adult("Katona Sándor", 18);

        System.out.println(adult.getName());
        System.out.println(adult.getAge());

        adult = new Adult("Katona Klári", 17);

        System.out.println(adult.getName());
        System.out.println(adult.getAge());
    }
}
