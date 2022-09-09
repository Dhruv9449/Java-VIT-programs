// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class BitwiseOperations {
    public static void main(String[] args) {
        int x = 0b1010;
        int y = 0b0110;

        // Bitwise AND
        System.out.println("Bitwise AND: " + (x & y));

        // Bitwise OR
        System.out.println("Bitwise OR: " + (x | y));

        // Bitwise XOR
        System.out.println("Bitwise XOR: " + (x ^ y));

        // Bitwise NOT
        System.out.println("Bitwise NOT: " + (~x));

        // Left shift
        System.out.println("Left shift: " + (x << 1));

        // Right shift
        System.out.println("Right shift: " + (x >> 1));
    }
}
