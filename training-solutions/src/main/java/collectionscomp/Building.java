package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public String toString() {
        return "Building{" +
                "levels=" + levels +
                '}';
    }

    @Override
    public int compareTo(Building o) {
        return Integer.valueOf(levels).compareTo(o.levels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Main Building", 11200, 3));
        buildings.add(new Building("Star Building", 5600, 5));
        buildings.add(new Building("Krakko Corner", 13200, 4));
        buildings.add(new Building("Pólus Center", 21200, 2));
        buildings.add(new Building("Duna Plaza", 13500, 2));

        System.out.println(buildings);
    }
}
