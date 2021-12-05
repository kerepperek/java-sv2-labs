package recursion;

import java.util.Arrays;

public class Palindrome {

    public boolean isPalindrome(String word) {

        if (word.length() > 1) {
            if (word.substring(0, 1).equals(word.substring(word.length() - 1, word.length()))) {
                return isPalindrome(word.substring(1, word.length()-1));
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

}
