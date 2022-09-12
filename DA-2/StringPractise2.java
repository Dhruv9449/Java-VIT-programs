// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class StringPractise2 {
    public static void main(String[] args) {
        String str = new String("   Dhruv   ");

        System.out.println(str.length());
        int len = str.length();
        System.out.println(len);

        String str1 = str.toUpperCase();
        System.out.println(str1);

        str = str.trim();
        System.out.println(str);

        String str2 = str.substring(3);
        System.out.println(str2);

        String str3 = str.substring(2, 4);
        System.out.println(str3);

        String str4 = str.replace('D', 'd');
        System.out.println(str4);

        System.out.println(str4 + " " + str);
    }
}
