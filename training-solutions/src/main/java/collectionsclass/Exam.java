package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {

    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<ExamResult> ordered = new ArrayList<>(examResults);
        if (places > ordered.size()) {
            places = ordered.size();
        }
        Collections.sort(ordered, new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult result1, ExamResult result2) {
                return Integer.valueOf(result1.getPoints()).compareTo(result2.getPoints());
            }
        });
        Collections.reverse(ordered);

        List<String> result = new ArrayList<>();
        for (int i = 0; i < places; i++) {
            result.add(ordered.get(i).getName());
        }
        return result;
    }

    public List<ExamResult> getExamResults() {
        return new ArrayList<>(examResults);
    }
}
