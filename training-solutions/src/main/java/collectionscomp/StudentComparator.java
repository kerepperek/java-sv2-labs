package collectionscomp;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student, Student otherStudent) {
        return Integer.valueOf(student.getHeight()).compareTo(otherStudent.getHeight());
    }
}
