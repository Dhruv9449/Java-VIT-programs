// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q7 {

    static String reverseString(String str) {
        String[] words = str.split(" ");
        String rev = "";

        int i;
        for (i = 0; i < words.length; i++) {
            StringBuffer sb = new StringBuffer(words[i]);
            rev += sb.reverse().toString();
            rev += " ";
        }
        return rev;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text string");
        String str;
        try {
            str = br.readLine();
        } catch (Exception e) {
            System.out.println("Error reading input");
            return;
        }
        String rev = reverseString(str);
        System.out.println(rev);
    }
}
