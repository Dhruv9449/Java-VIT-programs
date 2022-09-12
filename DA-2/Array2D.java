// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Array2D {
    public static void main(String[] args) {
        // 2D Array
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // Printing 2D Array using for loop
        System.out.println("Printing 2D Array using for loop");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        // Printing 2D Array using for-each loop
        System.out.println("Printing 2D Array using for-each loop");
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
    }
}
