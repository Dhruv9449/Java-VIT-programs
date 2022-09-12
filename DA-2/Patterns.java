// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Patterns {
    public static void main(String[] args) {
        // Pattern 1
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        // Pattern 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }

        // Pattern 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println("");
        }

        // Pattern 4
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }

        // Pattern 5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format(j + " ");
            }
            System.out.println("");
        }

        // Pattern 6
        count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.format(count + " ");
            }
            System.out.println("");
        }

        // Pattern 7
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.format("* ");
            }
            System.out.println("");
        }

        // Pattern 8
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {

                System.out.format(j + " ");
            }
            System.out.println("");
        }

        // Pattern 9
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {

                System.out.format(i + " ");
            }
            System.out.println("");
        }

        // Pattern 10
        count = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                count++;
                System.out.format("%02d ", count);
            }
            System.out.println("");
        }

        // Pattern 11
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

        // Pattern 12
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i + j > 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }

        // Pattern 13
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * (5 - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
