package records;

public class StudyResultByName {
    private String studentName;
    private double studyAverage;

    public StudyResultByName(String name, double avgMark) {
        this.studentName = name;
        this.studyAverage = avgMark;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studyAverage;
    }
}
