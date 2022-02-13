package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Track {
    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getFullElevation() {
        double result = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation() > 0) {
                result += trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation();
            }
        }
        return result;
    }

    public double getFullDecrease() {
        double result = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getElevation() - trackPoints.get(i - 1).getElevation() < 0) {
                result += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }
        return result;
    }

    public double getDistance() {
        double result = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            result += trackPoints.get(i).getDistanceFrom(trackPoints.get(i - 1));
        }
        return result;
    }

    public Coordinate findMinimumCoordinate() {
        Double minLatitude = trackPoints.stream()
                .mapToDouble(i -> i.getCoordinate().getLatitude())
                .min().orElse(0);
        Double minLongtude = trackPoints.stream()
                .mapToDouble(i -> i.getCoordinate().getLongitude())
                .min().orElse(0);
        return new Coordinate(minLatitude, minLongtude);
    }

    public Coordinate findMaximumCoordinate() {
        Double maxLatitude = trackPoints.stream()
                .mapToDouble(i -> i.getCoordinate().getLatitude())
                .max().orElse(0);
        Double maxLongtude = trackPoints.stream()
                .mapToDouble(i -> i.getCoordinate().getLongitude())
                .max().orElse(0);
        return new Coordinate(maxLatitude, maxLongtude);
    }

    public Double getRectangleArea() {
        Coordinate minCoordinate=findMinimumCoordinate();
        Coordinate maxCoordinate=findMaximumCoordinate();
      return (maxCoordinate.getLatitude()-minCoordinate.getLatitude())
              *(maxCoordinate.getLongitude()-minCoordinate.getLongitude());
    }

    public void loadFromGpx(InputStream is) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            Coordinate tmpCoordinate = null;
            while ((line = br.readLine()) != null) {
                if (line.indexOf("<trkpt", 0) > -1) {
                    String[] parts = line.split("\"");
                    tmpCoordinate = new Coordinate(Double.parseDouble(parts[1]), Double.parseDouble(parts[3]));
                    line = br.readLine();
                }
                if (line.indexOf("<ele", 0) > -1) {
                    String[] parts = line.split("<ele>");
                    String[] value = parts[1].split("</ele>");
                    trackPoints.add(new TrackPoint(tmpCoordinate, Double.parseDouble(value[0])));
                    line = br.readLine();
                }
            }
        } catch (IOException e) {

        }

    }

    public void addToList(String line) {

    }
}
