// Assessment 2
// Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

// User defined exceptions

// Prime exception
class PrimeException extends Exception {
    @Override
    public String toString() {
        return "prime exception thrown";
    }
}

// Not prime exception
class NotPrimeException extends Exception {
    @Override
    public String toString() {
        return "not prime exception thrown";
    }
}

// Odd exception
class OddException extends Exception {
    @Override
    public String toString() {
        return "odd exception thrown";
    }
}

// Even exception
class EvenException extends Exception {
    @Override
    public String toString() {
        return "even exception thrown";
    }
}

public class ExceptionHandling {
    // Check prime or not prime
    static void checkPrime(int n) throws PrimeException, NotPrimeException {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            throw new NotPrimeException();
        } else {
            throw new PrimeException();
        }
    }

    // Check odd or even
    static void checkOddOrEven(int n) throws OddException, EvenException {
        if (n % 2 == 0) {
            throw new EvenException();
        } else {
            throw new OddException();
        }
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try {
            checkPrime(n);
        } catch (PrimeException e) {
            System.out.println(e);
        } catch (NotPrimeException e) {
            System.out.println(e);
        }
        try {
            checkOddOrEven(n);
        } catch (OddException e) {
            System.out.println(e);
        } catch (EvenException e) {
            System.out.println(e);
        }
        sc.close();
    }
}
