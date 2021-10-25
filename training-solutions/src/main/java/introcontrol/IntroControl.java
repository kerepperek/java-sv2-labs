package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        } else {
            return number - 10;
        }
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        } else {
            return "not zero";
        }
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        } else {
            return "";
        }
    }

    public int calculateBonus(int sale) {
        if (sale >= 1000000) {
            return (int)(sale * .1);
        } else {
            return 0;
        }
    }

    public int calculateConsumption(int prev, int next) {
        if (prev <= next) {
            return next - prev;
        } else {
            return 10000 - prev + next;
        }
    }

    public void printNumbers(int max) {
        for (int step = 0; step <= max; step++) {
            System.out.println(step);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int step = min; step <= max; step++) {
            System.out.println(step);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {

            for (int step = a; step <= b; step+=((b>a)?1:-1)) {
                System.out.println(step);
            }
    }

    public void printOddNumbers(int max) {
        for (int step = 1; step <= max; step += 2) {
            System.out.println(step);
        }
    }
}