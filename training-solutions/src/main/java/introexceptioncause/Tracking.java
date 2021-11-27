package introexceptioncause;

import java.util.List;

public class Tracking {

    public static void main(String[] args) {
        TrackPoints trackPoints = new TrackPoints();
        List<String> allLines = trackPoints.readLines();
        trackPoints.printLines(allLines);
    }
}
