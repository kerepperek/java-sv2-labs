package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }
        List<Integer> ballPool = getBalls(ballCount);
        Collections.shuffle(ballPool);
        List<Integer> result = ballPool.subList(0, lotteryType);
        Collections.sort(result);
        return result;
    }

    private List<Integer> getBalls(int ballCount) {
        List<Integer> ballPool = new ArrayList<>();
        for (int i = 1; i <= ballCount; i++) {
            ballPool.add(i);
        }
        return ballPool;
    }
}
