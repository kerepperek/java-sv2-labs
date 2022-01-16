package collectionsmap;

import java.util.Map;

public class Casting {

    public String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        int nextNumberKey = Integer.MAX_VALUE;
        for (Integer applicantKey : applicants.keySet()) {
            if (applicantKey > lastNumber && applicantKey < nextNumberKey) {
                nextNumberKey = applicantKey;
            }
        }
        return applicants.get(nextNumberKey);
    }
}
