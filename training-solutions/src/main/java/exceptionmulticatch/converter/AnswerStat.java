package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter converter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.converter = binaryStringConverter;
    }

    public int answerTruePercent(String answers) {
        boolean[] booleans = convert(answers);
        int sumTrues = 0;
        for (boolean b : booleans) {
            if (b) {
                sumTrues++;
            }
        }
        return (int) Math.round((double) sumTrues / booleans.length * 100);
    }

    public boolean[] convert(String checkboxes) {
        try {
            return converter.binaryStringToBooleanArray(checkboxes);
        } catch (NullPointerException | IllegalArgumentException ex) {
            throw new InvalidBinaryStringException(ex);
        }
    }
}
