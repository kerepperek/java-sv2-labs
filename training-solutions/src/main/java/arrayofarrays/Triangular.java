package arrayofarrays;

public class Triangular {

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        triangular.triangularMatrix(9);
    }

    public void triangularMatrix(int size) {
        int[][] matrix = new int[size][];
        for (int counter = 0; counter < size; counter++) {
            matrix[counter] = new int[counter + 1];
            for (int subcounter = 0; subcounter < counter + 1; subcounter++) {
                matrix[counter][subcounter] = counter;
                System.out.print(matrix[counter][subcounter]+" ");
            }
            System.out.println();
        }
    }
}
