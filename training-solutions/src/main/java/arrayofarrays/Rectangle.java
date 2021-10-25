package arrayofarrays;

public class Rectangle {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectangularMatrix(9);
    }

    public void rectangularMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int counter = 0; counter < size; counter++) {
            for (int subcounter = 0; subcounter < size; subcounter++) {
                matrix[counter][subcounter] = counter;
                System.out.print(matrix[counter][subcounter] + " ");
            }
            System.out.println();
        }
    }
}