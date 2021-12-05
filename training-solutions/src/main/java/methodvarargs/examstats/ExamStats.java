package methodvarargs.examstats;

public class ExamStats {

    private double maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        int numberOfTopGrades = 0;
        for (int result : results) {
            if (result > ((0.0 + limitInPercent) / 100) * maxPoints) {
                numberOfTopGrades++;
            }
        }
        return numberOfTopGrades;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results) {
        if (results == null || results.length == 0) {
            throw new IllegalArgumentException("Number of results must not be empty!");
        }

        for (int result : results) {
            if (result < ((0.0 + limitInPercent) / 100) * maxPoints) {
                return true;
            }
        }
        return false;
    }
}
