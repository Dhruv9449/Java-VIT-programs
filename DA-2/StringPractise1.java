// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class StringPractise1 {
    public static void main(String[] args) {
        String str1 = "Dhruv";
        System.out.println(str1);

        String str2 = "DHRUV";
        System.out.println(str2);

        char c[] = { 'D', 'h', 'r', 'u', 'v' };
        String str3 = new String(c);
        System.out.println(str3);

        byte b[] = { 68, 104, 114, 117, 118 };
        String str4 = new String(b);
        System.out.println(str4);

        String str5 = new String("Dhruv");
        System.out.println(str1 == str5);

    }
}
