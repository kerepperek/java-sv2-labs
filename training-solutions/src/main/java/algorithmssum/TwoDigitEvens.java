package algorithmssum;

public class TwoDigitEvens {

    public int getSum() {
        int sum = 0;
        for (int counter = 11; counter < 100; counter += 2) {
            if (counter % 5 != 0) {
                sum += counter;
            }
        }
        return sum;
    }
}
