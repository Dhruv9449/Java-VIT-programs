// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class NumberSystemCheck {
    public static void main(String[] args) {

        int b = 100110010;

        String str = String.valueOf(b);

        System.out.println(str.matches("[01]+"));

        String str1 = "B234AB";
        System.out.println(str1.matches("[0-9A-F]+"));

        String str2 = "20/10/2022";
        System.out.println(str2.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

    }

}
