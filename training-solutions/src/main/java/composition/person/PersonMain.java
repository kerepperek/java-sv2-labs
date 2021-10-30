package composition.person;

public class PersonMain {

    public static void main(String[] args) {
        PersonMain personMain = new PersonMain();

        Person person = new Person("Kerep Perek", "85458544MA");
        Address address = new Address("Magyarország", "Kistarcsa", "Kisfaludy Sándor 34.", "2143");
        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Kerep Sanyi", "34234234GH");
        person.getAddress().correctData("Magyarország", "Budapest", "Harmat utca 72", "1103");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

    }
}
