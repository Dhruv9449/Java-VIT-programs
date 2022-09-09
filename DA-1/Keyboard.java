// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

public class Keyboard {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Scanning different types of input

        // String
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("String: " + str + "\n");

        // Character
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println("Character: " + ch + "\n");

        // Integer
        System.out.println("Enter an integer");
        int num = sc.nextInt();
        System.out.println("Integer: " + num + "\n");

        // Float
        System.out.println("Enter a float");
        float f = sc.nextFloat();
        System.out.println("Float: " + f + "\n");

        // Boolean
        System.out.println("Enter a boolean");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean: " + b + "\n");

        // Byte
        System.out.println("Enter a byte");
        byte by = sc.nextByte();
        System.out.println("Byte: " + by + "\n");

        // Binary
        System.out.println("Enter a number in binary");
        int bin = sc.nextInt(2);
        System.out.println("Binary: " + bin + "\n");

    }

}
