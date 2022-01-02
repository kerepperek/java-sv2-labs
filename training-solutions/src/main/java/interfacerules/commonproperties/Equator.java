package interfacerules.commonproperties;

public class Equator implements Name, Length {
    private static final String NAME = "Equator";
    private static final double LENGTH = 40075;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getLength() {
        return LENGTH;
    }
}
