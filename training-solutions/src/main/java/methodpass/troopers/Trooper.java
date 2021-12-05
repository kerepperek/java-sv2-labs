package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;

    public Trooper(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        this.position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public double distanceFrom(Position position) {
        return this.position.distanceFrom(position);
    }


    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        this.position = target;
    }


}
