package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {

    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> results) {
        Map<VoteResult, Integer> result = new HashMap<>();
        for (VoteResult v : results.values()) {
            if (!result.containsKey(v)) {
                result.put(v, 0);
            }
            result.put(v, result.get(v) + 1);
        }
        return result;
    }
}
