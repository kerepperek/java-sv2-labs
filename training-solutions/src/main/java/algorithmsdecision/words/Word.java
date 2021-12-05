package algorithmsdecision.words;

import java.util.List;

public class Word {

    public boolean containsLongerWord(List<String> words, String filterWord) {
        boolean hasLonger = false;
        for (String w : words) {
            if (w.length() > filterWord.length()) {
                hasLonger = true;
            }
        }
        return hasLonger;
    }
}
