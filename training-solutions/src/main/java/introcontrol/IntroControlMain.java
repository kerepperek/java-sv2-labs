package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();

        System.out.println("subtractTenIfGreaterThanTen");
        System.out.println(introControl.subtractTenIfGreaterThanTen(25));
        System.out.println(introControl.subtractTenIfGreaterThanTen(10));

        System.out.println("describeNumber");
        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(5));

        System.out.println("greetingToJoe");
        System.out.println(introControl.greetingToJoe("Kate"));
        System.out.println(introControl.greetingToJoe("Joe"));

        System.out.println("calculateBonus");
        System.out.println(introControl.calculateBonus(100));
        System.out.println(introControl.calculateBonus(2000000));

        System.out.println("calculateConsumption");
        System.out.println(introControl.calculateConsumption(4500, 6000));
        System.out.println(introControl.calculateConsumption(6000, 4500));

        System.out.println("printNumbers");
        introControl.printNumbers(5);

        System.out.println("printNumbersBetween");
        introControl.printNumbersBetween(5, 8);

        System.out.println("printNumbersBetweenAnyDirection");
        introControl.printNumbersBetweenAnyDirection(1, 10);

        System.out.println("printNumbersBetweenAnyDirection backward");
        introControl.printNumbersBetweenAnyDirection(10, 1);

        System.out.println("printOddNumbers");
        introControl.printOddNumbers(8);
        System.out.println("printOddNumbers");
        introControl.printOddNumbers(9);
    }
}
