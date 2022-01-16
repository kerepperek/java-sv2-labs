package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {

    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> orderInLessons = new TreeSet<>();
        for (Student student : students) {
            orderInLessons.add(student.getHeight());
        }
        return orderInLessons;
    }

    public static void main(String[] args) {
        PhysicalEducation physicalEducation = new PhysicalEducation();

        List<Student> students = new ArrayList<>();
        students.add(new Student("c", 123));
        students.add(new Student("bg", 195));
        students.add(new Student("a", 112));
        students.add(new Student("w", 165));
        students.add(new Student("x", 165));

        System.out.println(physicalEducation.getOrderInLessons(students));
    }
}
