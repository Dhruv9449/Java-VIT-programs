// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Q4 {
    public void leapYears(int start, int end) {
        System.out.println("Leap years are: ");
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (i % 4 == 0) {
                if (i % 100 == 0) {
                    if (i % 400 == 0) {
                        System.out.print(i + " ");
                        num++;
                    }
                } else {
                    System.out.print(i + " ");
                    num++;
                }
            }
        }
        System.out.println("\nNumber of leap years: " + num);
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        q4.leapYears(1900, 2021);
    }
}
