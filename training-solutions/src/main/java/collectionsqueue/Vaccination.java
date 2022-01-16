package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> result = new PriorityQueue<>();
        for (Person person : people) {
            if (person.getAge() >= 18 && person.getAge() <= 65) {
                result.add(person.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();

        List<Person> person = new ArrayList<>();
        person.add(new Person("a", 12));
        person.add(new Person("d", 98));
        person.add(new Person("s", 32));
        person.add(new Person("e", 34));
        person.add(new Person("w", 25));
        person.add(new Person("q", 11));
        person.add(new Person("x", 19));

        Queue<Integer> vaccinationOrder = vaccination.getVaccinationOrder(person);

        System.out.println(vaccinationOrder);
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder);
    }
}
