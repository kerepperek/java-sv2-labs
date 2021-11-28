package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> heights, int minimumHeight) {
        int count = 0;
        for (Integer height : heights) {
            if (height > minimumHeight) {
                count++;
            }
        }
        return count;
    }
}
