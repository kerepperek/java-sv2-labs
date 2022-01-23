package collectionscomp;

import java.text.Collator;
import java.util.*;

public class School {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());

        Student student1 = new Student("Ákos", 112);
        Student student2 = new Student("Sanyi", 133);
        Student student3 = new Student("Babi", 123);
        Student student4 = new Student("Zoli", 118);
        Student student5 = new Student("Budó", 121);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);

        Map<String, Integer> studentsOrder = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));
        studentsOrder.put(student1.getName(), student1.getHeight());
        studentsOrder.put(student2.getName(),student2.getHeight());
        studentsOrder.put(student3.getName(), student3.getHeight());
        studentsOrder.put(student4.getName(), student4.getHeight());
        studentsOrder.put(student5.getName(), student5.getHeight());

        System.out.println(studentsOrder);
    }
}
