package interfacestaticmethods.schoolchild;

public class LowerClassSchoolChild implements PrimarySchoolChild {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LowerClassSchoolChild() {
    }

    public LowerClassSchoolChild(String name) {
        this.name = name;
    }
    public LowerClassSchoolChild(int age) {
        this.age = age;
    }
    public LowerClassSchoolChild(String name, int age) {
        this(name);
        this.age = age;
    }


}
