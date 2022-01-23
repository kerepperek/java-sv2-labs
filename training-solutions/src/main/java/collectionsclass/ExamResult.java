package collectionsclass;

import java.util.Objects;

public class ExamResult {

    private String name;
    private int points;

    public ExamResult(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult other = (ExamResult) o;
        return points == other.points && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, points);
    }
}
