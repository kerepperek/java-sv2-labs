package looptypes;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>(List.of("Nagy Ferenc", "Ó Mária", "Keresztes Ildikó", "Sebestyén Balázs", "Farkas Elemír", "Spanyol Nátha"));
        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }

    public void printStudyGroups(List<String> students) {
        for (String element : students) {
                System.out.println(element + ": "+(element.length() <= 10?1:2)+"-es tanulócsoport");
        }
    }
}
