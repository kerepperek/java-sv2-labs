package collectionsset;

import java.util.*;

public class QuestionGame {

    private List<RightAnswer> rightAnswers;

    public QuestionGame(List<RightAnswer> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }

    public Set<String> drawWinners() {
        Set<String> result = new HashSet<>();
        Random random = new Random();
        while (result.size() != 5) {
            if (rightAnswers.size() == 0) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int i = random.nextInt(rightAnswers.size());
            result.add(rightAnswers.get(i).getNameOfSolver());
            rightAnswers.remove(i);
        }
        return result;
    }

    public List<RightAnswer> getRightAnswers() {
        return new ArrayList<>(rightAnswers);
    }
}
