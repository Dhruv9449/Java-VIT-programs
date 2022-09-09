// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        // Arithmatic operators
        c = a + b;
        System.out.println("Sum: " + c);

        c = a - b;
        System.out.println("Difference: " + c);

        c = a * b;
        System.out.println("Product: " + c);

        c = a / b;
        System.out.println("Quotient: " + c);

        c = a % b;
        System.out.println("Remainder: " + c);

        // Relational operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical operators
        System.out.println("a > 0 && b > 0: " + (a > 0 && b > 0));
        System.out.println("a > 0 || b > 0: " + (a > 0 || b > 0));
        System.out.println("!(a > 0): " + !(a > 0));

        // Bitwise operators
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
        System.out.println("a >>> 1: " + (a >>> 1));

        // Assignment operators
        c = a;
        System.out.println("c = a: " + c);
        c += a;
        System.out.println("c += a: " + c);
        c -= a;
        System.out.println("c -= a: " + c);
        c *= a;
        System.out.println("c *= a: " + c);
        c /= a;
        System.out.println("c /= a: " + c);
        c %= a;
        System.out.println("c %= a: " + c);
        c &= a;
        System.out.println("c &= a: " + c);
        c ^= a;
        System.out.println("c ^= a: " + c);
        c |= a;
        System.out.println("c |= a: " + c);
    }
}
