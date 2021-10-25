package finalmodifier;

public class CylinderCalculatorBasedOnCircle {

    public double calculateVolume(double r, double h) {
        CircleCalculator circleCalculator=new CircleCalculator();
        return circleCalculator.calculateArea(r) * h;
    }

    public double calculateSurfaceArea(double r, double h) {
        CircleCalculator circleCalculator=new CircleCalculator();
        return 2 * circleCalculator.calculateArea(r) + circleCalculator.calculatePerimeter(r) * h;
    }
}