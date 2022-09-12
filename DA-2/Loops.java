// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Loops {
    public static void main(String[] args) {
        // While loop
        System.out.println("While loop");
        int i = 1;
        while (i < 100)

        {
            System.out.println(i);
            i = i * 2;
        }
        System.out.println("");

        // Do-While loop
        System.out.println("Do-While loop");
        int j = 1;
        do {
            System.out.println(j);
            j = j * 2;
        } while (j < 100);
        System.out.println("");

        // For loop
        System.out.println("For loop");
        for (int k = 1; k < 100; k = k * 2) {
            System.out.println(k);
        }
        System.out.println("");

        // For-Each loop
        System.out.println("For-Each loop");
        int arr[] = { 1, 2, 8, 16, 32, 64 };
        for (int x : arr) {
            System.out.println(x);
        }
        System.out.println("");
    }
}
