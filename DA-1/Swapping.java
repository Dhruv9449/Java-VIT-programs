// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Swapping {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swapping: a = " + a + " b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping: a = " + a + " b = " + b);
    }
}