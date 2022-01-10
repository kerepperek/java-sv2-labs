package interfacedefaultmethods.cloth;

public interface Square {

    default int getNumberOfSides() {
        return 4;
    }

    default double getLengthOfDiagonal() {
        double side = getSide();
        return Math.sqrt(2 * Math.pow(side,2));
    }

    default double getPerimeter() {
        double side = getSide();
        return 4 * side;
    }

    default double getArea() {
        double side = getSide();
        return Math.pow(side,2);
    }

    double getSide();
}
