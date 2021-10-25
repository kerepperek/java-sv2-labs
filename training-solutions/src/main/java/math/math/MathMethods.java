package math.math;

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(10,100));
        System.out.println(Math.min(10,100));
        System.out.println(Math.PI);
        System.out.println(Math.round(Math.PI*100)*.01);
        System.out.println(Math.round(18/19*100)*.01);
        System.out.println(Math.abs(-145));
        System.out.println(Math.negateExact(1));
        System.out.println(Math.addExact(146,147));
        System.out.println(Math.subtractExact(100,15));
        System.out.println(Math.multiplyExact(100,15));
        System.out.println(Math.pow(3.1434,2.14));
        System.out.println(Math.incrementExact(34));
        System.out.println(Math.decrementExact(34));
        System.out.println(Math.random());
    }
}
