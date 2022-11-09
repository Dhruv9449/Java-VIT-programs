// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Random;

public class Q9 {
    public static float getProbability(int y) {
        int x = 0;
        Random rand = new Random();
        for (int i = 0; i < y; i++) {
            int toss = rand.nextInt(2);
            if (toss == 0) {
                x++;
            }
        }
        return (float) x / y;
    }

    public static void main(String[] args) {
        int y = 100;
        System.out.println("Probabilty of getting heads in " + y + " tosses is " + getProbability(y));
        y = 1000;
        System.out.println("Probabilty of getting heads in " + y + " tosses is " + getProbability(y));
        y = 100000;
        System.out.println("Probabilty of getting heads in " + y + " tosses is " + getProbability(y));

    }
}
