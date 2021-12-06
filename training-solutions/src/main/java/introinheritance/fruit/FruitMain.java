package introinheritance.fruit;

public class FruitMain {

    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("fruit");
        fruit.setWeight(2.1);

        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        Grape grape = new Grape();
        grape.setName("grape");
        grape.setWeight(3.2);
        grape.setType("Kékfrankos");

        System.out.println(grape.getName());
        System.out.println(grape.getWeight());
        System.out.println(grape.getType());

        Apple apple = new Apple();
        apple.setName("apple");
        apple.setWeight(20);
        apple.setPieces(100);

        System.out.println(apple.getName());
        System.out.println(apple.getWeight());
        System.out.println(apple.getPieces());

        GoldenDelicious golden = new GoldenDelicious();
        golden.setName("Golden Delicious");
        golden.setWeight(10);
        golden.setPieces(50);

        System.out.println(golden.getName());
        System.out.println(golden.getWeight());
        System.out.println(golden.getPieces());
        System.out.println(golden.getColour());

        Starking starking = new Starking();
        starking.setName("Starking");
        starking.setWeight(11);
        starking.setPieces(50);

        System.out.println(starking.getName());
        System.out.println(starking.getWeight());
        System.out.println(starking.getPieces());
        System.out.println(starking.getColour());
    }
}
