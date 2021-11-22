package introexceptiontrycatchtrace;

public class Calculator {

    public int calculation(int number1, int number2, String operation) {
        switch (operation) {
            case "1":
                return(number1 + number2);
            case "2":
                return(number1 - number2);
            case "3":
                return(number1 * number2);
            case "4":
                return(number1 / number2);
        }
        return 0;
    }
}
