// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Infiniteloop {
    public static void main(String[] args) {
        // Infinite loop
        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
        }

        // Byte infinite loop
        byte j = 1; // Also unreachable statement
        while (true) {
            System.out.println(j);
            j++;
        }
    }
}
