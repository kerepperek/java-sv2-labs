package exceptions.sum;

public class NumbersSum {

    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter should not be null!");
        }
        int result =0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter should not be null!");
        }
        int summarised;
        try {
            summarised = getParseSum(numbers);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Illegal numbers!");
        }
        return summarised;
    }

    private int getParseSum(String[] numbers) {
        int result =0;
        for (int i = 0; i < numbers.length; i++) {
            result += Integer.parseInt(numbers[i]);
        }
        return result;
    }

}
