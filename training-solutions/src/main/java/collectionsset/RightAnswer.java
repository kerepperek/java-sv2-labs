package collectionsset;

import java.util.Objects;

public class RightAnswer {

    private String nameOfSolver;

    public RightAnswer(String nameOfSolver) {
        this.nameOfSolver = nameOfSolver;
    }

    public String getNameOfSolver() {
        return nameOfSolver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RightAnswer rightAnswer = (RightAnswer) o;
        return nameOfSolver.equals(rightAnswer.nameOfSolver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSolver);
    }
}
