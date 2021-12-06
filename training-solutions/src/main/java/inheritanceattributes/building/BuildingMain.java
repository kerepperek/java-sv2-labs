package inheritanceattributes.building;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("Building", 3001, 3);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        SchoolBuilding schoolBuilding = new SchoolBuilding("School Building", 4005, 4, 20);
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());

    }

}
