// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class StringPractise3 {
    public static void main(String[] args) {

        String str1 = "Mr. Dhruv Shah";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah", 4));
        System.out.println(str1.endsWith("Dhruv"));
        System.out.println(str1.charAt(4));

        for (int i = 0; i < str1.length(); i++)
            System.out.println(str1.charAt(i));

        String str2 = "www.udemy.co.in";
        System.out.println(str2.indexOf("."));
        System.out.println(str2.indexOf(".", 4));
        System.out.println(str2.indexOf("udemy"));
        System.out.println(str2.lastIndexOf("."));
    }
}
