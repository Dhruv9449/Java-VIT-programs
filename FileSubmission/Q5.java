// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Q5 {
    public static int f(int n) {
        if (n == 0) {
            return 2;
        }
        return 1 + 1 / (1 + f(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(f(24));
    }
}
