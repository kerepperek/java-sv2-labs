package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.PI);
        System.out.println(circleCalculator.calculateArea(12));
        System.out.println(circleCalculator.calculatePerimeter(12));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(13, 12));
        System.out.println(cylinderCalculator.calculateSurfaceArea(14, 15));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(13, 12));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(14, 15));

    }
}
