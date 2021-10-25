package looptypesmodify;

import java.util.Arrays;


public class EveryThird {

    public static void main(String[] args) {
      EveryThird everyThird=new EveryThird();
      int[] numbers= new int[]{2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
      int[] newnumbers=everyThird.changeToZero(numbers);
      System.out.println(Arrays.toString(newnumbers));
    }

    public int[]  changeToZero(int[] numbers){
       for(int counter=numbers.length-1;counter>=0;counter-=3) {
           numbers[counter] = 0;
       }
       return numbers;
    }
}