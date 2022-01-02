package records;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public Random getRandom() {
        return random;
    }

    public List<Student> getStudents() {
        return students;
    }

    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }
        for (Student student_ : students) {
            if (student_.getName().equals(student.getName())) {
                return false;
            }
        }
        students.add(student);
        return true;
    }

    public boolean removeStudent(Student student) {
        for (Student student_ : students) {
            if (student_.getName().equals(student.getName())) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public double calculateClassAverage() {
        if (students.size() == 0) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double sum = 0;
        int pcs = 0;
        for (Student student : students) {
            if(student.calculateAverage()==0){
                throw new ArithmeticException("No marks present, average calculation aborted!");
            }
            sum += student.calculateAverage();
            pcs++;
        }

        return Math.round(sum / pcs * 100) * .01;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0;
        int pcs = 0;
        for (Student student : students) {
            if (student.calculateSubjectAverage(subject) > 0) {
                sum += student.calculateSubjectAverage(subject);
                pcs++;
            }

        }

        return Math.round(sum / pcs * 100) * .01;
    }


    public Student findStudentByName(String name) {

            if (students.size() == 0) {
                throw new IllegalStateException("No students to search!");
            }
            if(name.isEmpty()||name.isBlank()){
                throw new IllegalArgumentException("Student name must not be empty!");
            }

        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! "+name);
    }

    public Student repetition() {
        if (students.size() == 0) {
            throw new IllegalStateException("No students to select for repetition!");
        }
      //  return students.get(random);

        return students.get(new Random().nextInt(students.size()));
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> result = new ArrayList<>();
        for (Student student : students) {
            result.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return result;
    }


    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student student : students) {
            sb.append(student.getName()).append(", ");
        }
        if(sb.length()>0){
            sb.delete(sb.length()-2,sb.length());
        }
        return sb.toString();
    }
}
