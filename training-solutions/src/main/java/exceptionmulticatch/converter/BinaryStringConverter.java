package exceptionmulticatch.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String s) {
        if (s == null)
            throw new NullPointerException("Binary string is null.");
        if (s.length() == 0)
            throw new IllegalArgumentException("Binary string is empty.");
        boolean[] b = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c == '0' || c == '1'))
                throw new IllegalArgumentException("Binary string is not valid.");
            b[i] = (c == '1');
        }

        return b;
    }

    public String booleanArrayToBinaryString(boolean[] booleans) {
        if (booleans == null)
            throw new NullPointerException("Boolean array is null.");
        if (booleans.length == 0)
            throw new IllegalArgumentException("Boolean array is empty.");
        StringBuilder sb = new StringBuilder(booleans.length);
        for (boolean b:booleans) {
                sb.append(b?'1':'0');
        }
        return sb.toString();
    }
}
