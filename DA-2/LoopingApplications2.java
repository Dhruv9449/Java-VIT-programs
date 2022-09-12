// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

public class LoopingApplications2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arithmatic Progression
        System.out.println("Program to print AP Series");
        System.out.println("Enter a, d and n");
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int term = a;
        for (int i = 0; i < n; i++) {
            System.out.print(term + ",");
            term = term + d;
        }
        System.out.println("");

        // Geometric Progression
        System.out.println("Program to print GP Series");
        System.out.println("Enter a, r and n");
        int a1 = sc.nextInt();
        int r = sc.nextInt();
        int n1 = sc.nextInt();
        int term1 = a1;
        for (int i = 0; i < n1; i++) {
            System.out.print(term1 + ",");
            term1 = term1 * r;
        }
        System.out.println("");

        // Fibonacci Series
        System.out.println("Program to print Fibonacci Series");
        System.out.println("Enter n");
        int n2 = sc.nextInt();
        int a2 = 0;
        int b2 = 1;
        int c2;
        System.out.print(a2 + "," + b2 + ",");
        for (int i = 0; i < n2 - 2; i++) {
            c2 = a2 + b2;
            System.out.print(c2 + ",");
            a2 = b2;
            b2 = c2;
        }
    }
}
