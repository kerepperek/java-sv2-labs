package operators;

public class OperatorsMain {

    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(Integer.toBinaryString(999));

        System.out.println(operators.isEven(999));

        System.out.println(operators.getResultOfDivision(16, 3));

        System.out.println(operators.isNull("ewrwer"));
        System.out.println(operators.isNull(null));

        System.out.println(operators.isEmpty(""));
        System.out.println(operators.isEmpty(null));
        System.out.println(operators.isEmpty("adfgdfg"));
    }
}
