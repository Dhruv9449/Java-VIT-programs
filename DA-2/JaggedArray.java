// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class JaggedArray {
    public static void main(String[] args) {
        // Jagged Array
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        // Printing Jagged Array using for loop
        System.out.println("Printing Jagged Array using for loop");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        // Printing Jagged Array using for-each loop
        System.out.println("Printing Jagged Array using for-each loop");
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }

    }
}
