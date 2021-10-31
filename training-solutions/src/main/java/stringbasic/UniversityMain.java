package stringbasic;

import java.util.Arrays;
import java.util.List;

public class UniversityMain {

    public static void main(String[] args) {
        Person person = new Person("Kerep Perek", "kerepperek@gmail.com", "234234234","11600900-00000016-00254585", "+36 30 58456528");
        Student student = new Student(person, "29328483", "8238478234");
        student.setCardId("324234");
        University university = new University();
        university.addStudent(student);

        Student student2 = new Student(person, "234234", "3453453453");
        university.addStudent(student2);
        Student student3 = new Student(person, "29328483", "8238478234");
        university.addStudent(student3);
        List<Student> students = university.getStudents();
        System.out.println(students);

        System.out.println(university.areEqual(student, student2));
        System.out.println(university.areEqual(student, student3));


    }
}
