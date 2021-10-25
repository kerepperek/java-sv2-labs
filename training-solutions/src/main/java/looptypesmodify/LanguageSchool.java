package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Hajs Márta"));
        students.add(new Student("Tágas Zorán"));
        students.add(new Student("Bálint György"));
        students.add(new Student("Sárga Répa"));
        System.out.println(students.size());

        students.get(1).setActive(false);
        students.get(2).setActive(false);

        List<Student> deleteList = new ArrayList<>();
        for (Student student : students) {
            if (!student.isActive()) {deleteList.add(student);}
        }
        students.removeAll(deleteList);

        System.out.println(students.size());
    }
}

