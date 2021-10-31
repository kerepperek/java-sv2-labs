package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number) {
        return (double)((int) number);
    }

    public byte[] convertIntArrayToByteArray(int[] numbers) {
        byte[] back = new byte[numbers.length];
        for (int counter = 0; counter < numbers.length; counter++) {
            back[counter] = (numbers[counter] > 0 && numbers[counter] < 127)? (byte) numbers[counter]: -1;
        }
        return back;
    }

    public int getFirstDecimal(double number) {
        return  (int)((number - (int) number) *10);
    }
}
