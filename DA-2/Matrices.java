// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Matrices {
    public static void main(String[] args) {
        // Matrix 1
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Matrix 2
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Matrice addition
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Printing sum of matrices
        System.out.println("Printing sum of matrices");

        for (int[] row : sum) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }

        // Matrix multiplication
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Printing product of matrices
        System.out.println("Printing product of matrices");

        for (int[] row : product) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
