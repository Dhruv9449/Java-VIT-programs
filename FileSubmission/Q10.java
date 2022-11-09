// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.io.*;
import java.lang.Math;
import java.util.*;

class Q10 {
    public static void primeFactors(int n, HashSet<Integer> h) {
        while (n % 2 == 0) {
            h.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                h.add(i);
                n /= i;
            }
        }

        if (n > 2) {
            h.add(n);
        }
    }

    static void printFactors(HashSet<Integer> H) {
        TreeSet ts = new TreeSet(H);
        Iterator it = ts.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        HashSet<Integer> h = new HashSet<>();
        primeFactors(n, h);
        printFactors(h);
    }
}
