package conversions;

public class TooBigNumber {

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(10));
    }

    public long getRightResult(int number) {
        long back = 2_147_483_647;
        back += number;
        return back;
    }

}
