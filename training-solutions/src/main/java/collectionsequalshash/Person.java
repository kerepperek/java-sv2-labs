package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String ssn;

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Sándor Krisztina", 11, "234234234");
        Person person2 = new Person("Sándor Krisztina", 24, "56546546456");
        Person person3 = new Person("Kovácsné Sándor Krisztina", 11, "234234234");

        System.out.println(person1.equals(person2));

        System.out.println(person1.equals(person3));
        System.out.println(person3.equals(person1));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Person person = (Person) other;
        return Objects.equals(this.ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssn);
    }


}