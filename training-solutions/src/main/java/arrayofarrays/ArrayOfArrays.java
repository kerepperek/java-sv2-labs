package arrayofarrays;

public class ArrayOfArrays {

    public static void main(String[] args) {
        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();
        int[][] testArray = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        arrayOfArrays.printArrayOfArrays(testArray);
    }

    public void printArrayOfArrays(int[][] a) {
        for (int suba[] : a) {
            for (int elem : suba) {System.out.print(elem+" ");}
            System.out.println();
        }
    }
}
