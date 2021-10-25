package arrays;

import java.util.Arrays;

public class ArraysMain {

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println("numberOfDaysAsString:" + arraysMain.numberOfDaysAsString());

        System.out.println("multiplicationTableAsString:");
        System.out.println(arraysMain.multiplicationTableAsString(10));

        System.out.println("sameTempValues:");
        System.out.println(arraysMain.sameTempValues(new double[]{10.2, 12.5, 15.7}, new double[]{10.2, 12.5, 15.7}));
        System.out.println(arraysMain.sameTempValues(new double[]{10.2, 12.5, 15.7}, new double[]{10.0, 12.5, 15.7}));

        System.out.println("sameTempValuesDaylight:");
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{10.2, 12.5, 15.7}, new double[]{10.2, 12.5, 15.7}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{10.2, 12.5, 15.7}, new double[]{10.2, 12.5}));
        System.out.println(arraysMain.sameTempValuesDaylight(new double[]{10.2, 12.5, 15.7}, new double[]{10.0, 12.5}));

        System.out.println("wonLottery:");
        int[] megtett = new int[]{45, 34, 55, 1, 68};
        int[] kihuzott = new int[]{1, 45, 34, 55, 68};
        System.out.println("   Nyertem? " + arraysMain.wonLottery(megtett, kihuzott));
        System.out.println("   Megtett: " + Arrays.toString(megtett));
        System.out.println("   Kihúzott: " + Arrays.toString(kihuzott));
    }

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] matrix = new int[size][size];
        for (int counter = 0; counter < size; counter++) {
            for (int subcounter = 0; subcounter < size; subcounter++) {
                matrix[counter][subcounter] = (counter + 1) * (subcounter + 1);
            }
        }
        return Arrays.deepToString(matrix);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int min = min(day.length, anotherDay.length);
        double[] day1 = Arrays.copyOfRange(day, 0, min);
        double[] day2 = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(day1, day2);
    }

    private int min(int day1, int day2) {
        if (day1 < day2) {
            return day1;
        } else {
            return day2;
        }
    }

    public boolean wonLottery(int[] megtett, int[] kihuzott) {
        int[] megtettcopy = Arrays.copyOf(megtett, megtett.length);
        int[] kihuzottcopy = Arrays.copyOf(kihuzott, kihuzott.length);
        Arrays.sort(megtettcopy);
        Arrays.sort(kihuzottcopy);
        return Arrays.equals(megtettcopy, kihuzottcopy);
    }
}
