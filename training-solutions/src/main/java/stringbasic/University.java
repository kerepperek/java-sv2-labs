package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean areEqual(Student student, Student anotherStudent) {
        Boolean isNeptunIdEquals = student.getNeptunId().equals(anotherStudent.getNeptunId());
        Boolean isEduIdEquals = student.getEduId().equals(anotherStudent.getEduId());
        return isNeptunIdEquals && isEduIdEquals;
    }

    @Override
    public String toString() {
        return "University{" +
                "students=" + students +
                '}';
    }
}
