package records;

import java.util.*;

public class SchoolRecordController {

    ClassRecords classRecords;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private List<Subject> subjects = Arrays.asList(
            new Subject("földrajz"),
            new Subject("matematika"),
            new Subject("biológia"),
            new Subject("zene"),
            new Subject("fizika"),
            new Subject("kémia"),
            new Subject("történelem"));

    private List<Tutor> tutors = Arrays.asList(
            new Tutor("Bárdosi Zoltán", Arrays.asList(new Subject("földrajz"))),
            new Tutor("Fazekas Tibor", Arrays.asList(new Subject("matematika"))),
            new Tutor("Bérs Árpád", Arrays.asList(new Subject("biológia"))),
            new Tutor("Nagy Csilla", Arrays.asList(new Subject("zene"))),
            new Tutor("Seres Árpád", Arrays.asList(new Subject("fizika"))),
            new Tutor("Zeng Ziou", Arrays.asList(new Subject("kémia"))),
            new Tutor("Kerekes Ádám", Arrays.asList(new Subject("történelem"))));

    public static void main(String[] args) {

        SchoolRecordController src = new SchoolRecordController();
        src.setUp();
        src.runmenu();
    }

    private void setUp() {
        classRecords = new ClassRecords("9.évfolyam A osztály", new Random(5));
        Student student = new Student("Kovács Rita");
        student.grading(new Mark(MarkType.A, subjects.get(0), tutors.get(0)));
        student.grading(new Mark(MarkType.C, subjects.get(2), tutors.get(2)));
        student.grading(new Mark(MarkType.D, subjects.get(3), tutors.get(3)));
        classRecords.addStudent(student);

        student = new Student("Nagy Béla");
        student.grading(new Mark(MarkType.A, subjects.get(4), tutors.get(4)));
        student.grading(new Mark(MarkType.B, subjects.get(2), tutors.get(2)));
        student.grading(new Mark(MarkType.D, subjects.get(0), tutors.get(0)));
        classRecords.addStudent(student);

        student = new Student("Varga Márton");
        student.grading(new Mark(MarkType.A, subjects.get(5), tutors.get(5)));
        student.grading(new Mark(MarkType.C, subjects.get(3), tutors.get(3)));
        student.grading(new Mark(MarkType.D, subjects.get(1), tutors.get(1)));
        classRecords.addStudent(student);

    }

    public void runmenu() {
        Scanner scanner = new Scanner(System.in);
        int menuidx = 0;
        do {
            printMenu();
            menuidx = scanner.nextInt();
            scanner.nextLine();
            switch (menuidx) {
                case 1:
                    printStudentsName();
                    break;
                case 2:
                    findStudentsByName();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    repetition();
                    break;
                case 6:
                    printClassAverage();
                    break;
                case 7:
                    printSubjectAverage();
                    break;
                case 8:
                    printListStudyResult();
                    break;
                case 9:
                    printStudentResult();
                    break;
                case 10:
                    printStudentSubjectResult();
                    break;
            }
        } while (menuidx != 11);
        System.out.println("Program vége.");
    }

    public void printMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1. Diákok nevének listázása");
        System.out.println("2. Diák név alapján keresése");
        System.out.println("3. Diák létrehozása");
        System.out.println("4. Diák név alapján törlése");
        System.out.println("5. Diák feleltetése");
        System.out.println("6. Osztályátlag kiszámolása");
        System.out.println("7. Tantárgyi átlag kiszámolása");
        System.out.println("8. Diákok átlagának megjelenítése");
        System.out.println("9. Diák átlagának kiírása");
        System.out.println("10. Diák tantárgyhoz tartozó átlagának kiírása");
        System.out.println("11. Kilépés");
        System.out.println("---------------------------------------");
    }

    private void printStudentsName() {
        System.out.println(classRecords.listStudentNames());
    }

    private void findStudentsByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Tanuló adatainak listázása." + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "A tanuló neve:" + ANSI_RESET);
        String name = scanner.nextLine();
        try{
            System.out.println(classRecords.findStudentByName(name));
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    private void removeStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Diák törlése a naplóból." + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "A diák neve:" + ANSI_RESET);
        String name = scanner.nextLine();
        Student student = classRecords.findStudentByName(name);
        classRecords.removeStudent(student);
        System.out.println(ANSI_BLUE + (classRecords.getStudents().size() + 1) + " diákból " + classRecords.getStudents().size() + " maradt." + ANSI_RESET);
    }

    private void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Új tanuló felvitele az osztályba." + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "A diák neve:" + ANSI_RESET);
        String name = scanner.nextLine();
        classRecords.addStudent(new Student(name));
        System.out.println(ANSI_BLUE + "Összesen " + (classRecords.getStudents().size()) + " diákot tartunk már nyílván." + ANSI_RESET);
    }

    private void printClassAverage() {
        try {
            System.out.println(ANSI_BLUE + "Az osztály átlag: " + classRecords.calculateClassAverage() + ANSI_RESET);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    private void printSubjectAverage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Tantárgy eredményének listázása." + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Tantárgy neve:" + ANSI_RESET);
        String name = scanner.nextLine();
        try {
            Subject subject=getSubjectByName(name);
            System.out.println(ANSI_BLUE + "A tantárgyi  átlag: " + classRecords.calculateClassAverageBySubject(subject) + ANSI_RESET);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void repetition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Feleltetés." + ANSI_RESET);
        Student student = classRecords.repetition();
        System.out.println(ANSI_YELLOW + "A kiválasztott diák a naplóból: " + student.getName() + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "Milyen érdemjegyet kapott (betűvel A-D)? " + ANSI_RESET);
        String mark = scanner.nextLine();
        Subject subject = null;
        String subjectName = "";
        while (subjectName == "") {
            System.out.print("Tantárgy: ");
            subjectName = scanner.nextLine();
            if (subjectName.equals("x")) {
                return;
            }
            subject = getSubjectByName(subjectName);
            if (subject == null) {
                System.out.println("Nincs ilyen tantárgy! Próbálja újra! Ha x-et ír, kilép a menüpontból.");
                subjectName = "";
            }
        }
        Tutor tutor = null;
        String tutorName = "";
        while (tutorName == "") {
            System.out.print(ANSI_YELLOW + "Oktató neve: " + ANSI_RESET);
            tutorName = scanner.nextLine();
            if (tutorName.equals("x")) {
                return;
            }
            tutor = getTutorByName(tutorName);
            if (tutor == null) {
                System.out.println("Nincs ilyen nevű tanár! Próbálja újra! Ha x-et ír, kilép a menüpontból.");
                tutorName = "";
            }
        }

        student.grading(new Mark(MarkType.valueOf(mark), subject, tutor));

    }

    private void printListStudyResult() {
        System.out.println(ANSI_BLUE + "Dákok átlagának listázása" + ANSI_RESET);
        for (StudyResultByName srb : classRecords.listStudyResults()) {
            System.out.println(ANSI_BLUE + srb.getStudentName() + "(" + srb.getStudyAverage() + ")" + ANSI_RESET);
        }

    }

    private void printStudentResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Tanuló eredményének listázása." + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "A diák neve:" + ANSI_RESET);
        String name = scanner.nextLine();
        try {
            Student student = classRecords.findStudentByName(name);
            System.out.println(student.calculateAverage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void printStudentSubjectResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Tanuló tantárgyi eredményének listázása." + ANSI_RESET);
        System.out.print(ANSI_YELLOW + "A diák neve:" + ANSI_RESET);
        String name = scanner.nextLine();
        Student student = classRecords.findStudentByName(name);
        System.out.println(student.calculateAverage());

    }

    private Subject getSubjectByName(String name) {
        for (Subject subject : subjects) {
            if (subject.getSubjectName().equals(name)) {
                return subject;
            }
        }
        return null;
    }

    private Tutor getTutorByName(String name) {
        for (Tutor tutor : tutors) {
            if (tutor.getName().equals(name)) {
                return tutor;
            }
        }
        return null;
    }


}
