package enumtype.solarystem;

public enum SolarSystem {
  FÖLD(1),VÉNUSZ(2),PLÚTÓ(3),JUPITER(4);

    private int hold;

    SolarSystem(int hold) {
        this.hold = hold;
    }

    public int getHold() {
        return hold;
    }
}
