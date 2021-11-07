package junit5assert;

import java.util.Arrays;

public class Numbers {

    public static void main(String[] args) {
        Numbers numbers=new Numbers();
        int[] numberArray = new int[]{2, 8, 5, 6, 2, 3, 9};
        System.out.println(Arrays.toString(numbers.getEvenNumbers(numberArray)));
    }
    public int[] getEvenNumbers(int[] numbers){
        for(int counter=0;counter<numbers.length;counter++){
            if(numbers[counter]%2!=0){
                numbers[counter]=0;
            }
        }
        return numbers;
    }
}
