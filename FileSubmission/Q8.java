// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]) {
        int n, i, temp, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");

        n = sc.nextInt();
        temp = n;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        double num = Math.pow(10, count - 1);
        i = (int) num;

        for (; i > 0; i /= 10) {
            int j;
            String x = null;
            j = n / i % 10;
            switch (j) {
                case 1:
                    x = "One";
                    break;
                case 2:
                    x = "Two";
                    break;
                case 3:
                    x = "Three";
                    break;
                case 4:
                    x = "Four";
                    break;
                case 5:
                    x = "Five";
                    break;
                case 6:
                    x = "Six";
                    break;
                case 7:
                    x = "Seven";
                    break;
                case 8:
                    x = "Eight";
                    break;
                case 9:
                    x = "Nine";
                    break;
                case 0:
                    x = "Zero";
                    break;
            }
            System.out.print(x + " ");
        }
    }
}
