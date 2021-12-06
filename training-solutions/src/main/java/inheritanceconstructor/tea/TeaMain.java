package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("tea", 1050);
        System.out.println(tea.getName());
        System.out.println(tea.getPrice());

        HerbalTea herbalTea = new HerbalTea("herbal tea", 950);
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}
