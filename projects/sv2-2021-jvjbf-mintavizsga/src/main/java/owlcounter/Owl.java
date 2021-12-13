package owlcounter;

public class Owl {
    private String county;
    private int pcs;

    public Owl(String county, int pcs) {
        this.county = county;
        this.pcs = pcs;
    }

    public String getCounty() {
        return county;
    }

    public int getPcs() {
        return pcs;
    }
}
