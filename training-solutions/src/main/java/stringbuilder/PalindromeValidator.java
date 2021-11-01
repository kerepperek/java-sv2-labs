package stringbuilder;

public class PalindromeValidator {

    public static void main(String[] args) {

        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("Indul a pap aludni"));
        System.out.println(palindromeValidator.isPalindrome("Semantica"));
        System.out.println(palindromeValidator.isPalindrome("kerek"));
    }

    public boolean isPalindrome(String text) {
        text = text.trim().toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString().equalsIgnoreCase(text);
    }
}
