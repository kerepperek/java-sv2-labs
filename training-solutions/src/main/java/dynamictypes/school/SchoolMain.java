package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School("iskola", 12);
        School primarySchool = new PrimarySchool("Arany János Általános Iskola", 8);
        School secondarySchool = new SecondarySchool("Madách Imre Gimnázium", 4);

        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}
