// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Q2 {
    public void seiveOfEratosthenes(int n) {
        // Creating an array of booleans to represent the numbers in the range
        boolean[] prime = new boolean[n + 1];

        // Making all the values true
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }

        // Looping through the array
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Updating all multiples of p
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Printing all the prime numbers
        System.out.println("Prime numbers are: ");
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.seiveOfEratosthenes(600);
    }

}
