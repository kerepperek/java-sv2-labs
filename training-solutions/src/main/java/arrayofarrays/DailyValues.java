package arrayofarrays;

import java.time.YearMonth;

public class DailyValues {

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
    }

    private void getValues(){
        int[][] matrix = new int[12][];
        for(int counter=1;counter<=12;counter++){
            YearMonth yearMonthObject = YearMonth.of(2021,counter);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            matrix[counter-1]=new int[daysInMonth];
            /*  for(int daycounter=0;daycounter<daysInMonth;daycounter++){
                matrix[counter-1][daycounter]=daycounter+1;
            }
            */
        }

        for (int[] month : matrix) {
            for (int elem : month) {
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }
}