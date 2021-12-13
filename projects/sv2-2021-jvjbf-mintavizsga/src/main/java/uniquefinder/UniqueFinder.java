package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> getUniqueChars(String string){
        if(string==null){
            throw new IllegalArgumentException("Text is null.");
        }
        List<Character> result=new ArrayList<>();
        for(char c:string.toCharArray()){
            if(isUniqueChar(result,c)) {
                result.add(c);
            }
        }
        return result;
    }
    public boolean isUniqueChar(List<Character> charList,char c){
       return !charList.contains(c);
    }
}
