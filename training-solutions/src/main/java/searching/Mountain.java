package searching;

import java.util.Arrays;

public class Mountain {

    private int[] peakHeights;

    public Mountain(int[] pikeHeights) {
        this.peakHeights = pikeHeights;
    }

    public boolean searchPeak(Peak peak) {
        boolean result = Arrays.binarySearch(peakHeights, peak.getHeight())>=0;
        return result;
    }

    public int[] getPeakHeights() {
        return peakHeights;
    }

}
