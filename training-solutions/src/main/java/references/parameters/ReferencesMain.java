package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person = new Person("Kerep Perek", 47);
        Person person2 = person;

        person2.setName("Kerep Serep");

        System.out.println(person.getName() + "/" + person.getAge());
        System.out.println(person2.getName() + "/" + person2.getAge());

        int number = 24;
        int number2 = number;
        number2++;

        System.out.println(number+"/"+number2);

        person2 = new Person("Hello Bello", 1);

        System.out.println(person.getName() + "/" + person.getAge());
        System.out.println(person2.getName() + "/" + person2.getAge());
    }
}
