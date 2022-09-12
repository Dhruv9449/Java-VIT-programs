// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class StringOperations {
    public static void main(String[] args) {

        String str1 = "a!B@c#1$2%3";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);

        String str2 = "      abc     def     gh   ijk    ";
        str2 = str2.replaceAll("\\s+", " ").trim();
        System.out.println(str2);

        String words[] = str2.split("\\s");

        System.out.println(words.length);

    }
}
