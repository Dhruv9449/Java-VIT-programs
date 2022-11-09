// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws Exception {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int i = 0;
        int sum = 0;
        int count = 0;
        while (i != -1) {
            i = Integer.parseInt(br.readLine());
            if (i != -1) {
                sum += i;
                count++;
            }
        }

        float avg = (float) sum / count;
        System.out.println("Average: " + avg);
    }
}