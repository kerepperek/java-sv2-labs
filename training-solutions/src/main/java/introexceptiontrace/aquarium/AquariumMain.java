package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        aquarium.addFish(new Fish("hal1", "szürke"));
        aquarium.addFish(new Fish("hal2", "piros"));
        aquarium.addFish(new Fish("hal3", "kék"));

        System.out.println(aquarium.getNumberOfFish());
    }
}
/*
Aquarium osztályban nincs példányosítva a lista, így null értéket ad vissza a getNumberOfFish
 */