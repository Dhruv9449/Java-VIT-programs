// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

public class LoopingApplications {
    public static void main(String[] args) {

        // Multiplication table
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

        // Sum of numbers
        System.out.println("Enter a Number: ");
        int m = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= m; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of " + m + " Number is " + sum);

        // Factorial
        System.out.println("Enter a Number: ");
        int p = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= p; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
        ;

        // Count digit of number
        System.out.println("Enter a Number");
        int s = sc.nextInt();

        int count = 0;
        while (s > 0) {
            s = s / 10;
            count++;
        }
        System.out.println(count);

        // Armstrong number
        System.out.println("Enter a Number");
        int t = sc.nextInt();

        int u = t;
        int v = 0;
        int w;

        while (u > 0) {
            w = u % 10;
            u = u / 10;
            v = v + (w * w * w);
        }

        if (t == v) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        // Reverse a number
        System.out.println("Enter a Number");
        int x = sc.nextInt();

        int y = x;
        int z = 0;
        int a;

        while (y > 0) {
            a = y % 10;
            y = y / 10;
            z = z * 10 + a;
        }
        System.out.println(z);

        // Palindrome number
        System.out.println("Enter a Number");
        int b = sc.nextInt();

        int c = b;
        int d = 0;
        int e;

        while (c > 0) {
            e = c % 10;
            c = c / 10;
            d = d * 10 + e;
        }

        if (b == d) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
