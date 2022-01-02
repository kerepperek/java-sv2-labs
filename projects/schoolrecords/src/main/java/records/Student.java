package records;

import java.util.ArrayList;
import java.util.List;


public class Student {

    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public List<Mark> getMarks() {
        return marks;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        double sum = 0;
        for (Mark mark : marks) {
            sum += mark.getMarkType().getMark();
        }
        return Math.round(sum / marks.size() * 100) * .01;
    }

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0;
        int pcs = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                pcs++;
                sum += mark.getMarkType().getMark();
            }
        }
        return Math.round(sum / pcs * 100) * .01;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" marks: ");
        for (Mark mark : marks) {
            sb.append(mark.getSubject().getSubjectName()).append(": ")
                    .append(mark.getMarkType().getMarkTypeName())
                    .append("(").append(mark.getMarkType().getMark()).append(")");
        }
        return sb.toString();
    }
}
