package activity;

public class Coordinate {
    double latitude;
    double longitude;
    final static double[] LATITUDE_RANGE={-90,90};
    final static double[] LONGITUDE_RANGE={-180,180};

    public Coordinate(double latitude, double longitude) {
    if(failCoordinates(latitude,longitude)){
        throw new IllegalArgumentException("Not valid!");
    }
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private boolean failCoordinates(double latitude, double longitude){
        return latitude<LATITUDE_RANGE[0]||latitude>LATITUDE_RANGE[1]
                ||longitude<LONGITUDE_RANGE[0]||longitude>LONGITUDE_RANGE[1];
    }
}
