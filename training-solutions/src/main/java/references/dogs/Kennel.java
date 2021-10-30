package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {
        List<Dog> dogs=new ArrayList<>();

        Dog dog1 = new Dog("Rudi", 1, "rőtös");
        dogs.add(dog1);
        Dog dog2 = new Dog("Brúnó", 2, "pöttyös");
        dogs.add(dog2);
        Dog dog3 = new Dog("Herceg", 3, "barna");
        dogs.add(dog3);
        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("barna");
        System.out.println(dogs);

        Dog dog5 = new Dog("Sanyi", 5, "fekete");
        System.out.println(dog5);
        dog5 = dogs.get(1);
        System.out.println(dog5);
        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog6.setColour("fehér");
        System.out.println(dogs);

        List<Dog> dogs2 = dogs;

        Dog dog7 = dog4;
        dog7.setColour("homok");
        System.out.println(dogs2);
        dog2.setColour("foltos");
        System.out.println(dogs2);
        dog2 = null;
        System.out.println(dogs2);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2);

        Dog dog9 = dogs.get(1);
        dog9.setColour("nem meghatározható");
        System.out.println(dogs2);
    }
}
