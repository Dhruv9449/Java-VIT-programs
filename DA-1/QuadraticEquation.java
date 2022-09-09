// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, r1, r2;
        System.out.println("Enter the value of a, b and c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = (b * b) - (4 * a * c);
        if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else if (d == 0) {
            r1 = r2 = -b / (2 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else {
            System.out.println("Roo1ts are imaginary");
        }
    }
}
