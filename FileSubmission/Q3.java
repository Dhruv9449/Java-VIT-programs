// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Q3 {
    public int[] fibonacci() {
        int a = 1;
        int b = 1;
        int c = 0;
        int sum = 0;
        System.out.print(a + " " + b + " ");
        sum = a + b;
        do {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            sum = sum + c;
        } while (c < 1000);

        return new int[] { b, sum };
    }

    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[] arr = q3.fibonacci();
        System.out.println("Last number: " + arr[0]);
        System.out.println("Sum of the series: " + arr[1]);
    }

}
