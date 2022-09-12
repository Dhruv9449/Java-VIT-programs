// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class StringPractise4 {
    public static void main(String[] args) {

        String str1 = "Pyramid";
        String str2 = "pyramid";
        String str7 = new String("Pyramid");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str2);
        System.out.println(str1 == str7);

        String str3 = "china wall";
        String str4 = new String("china tall");

        System.out.println(str3.equals(str4));
        System.out.println(str3.compareTo(str4));

        String str5 = "the great wall ";
        String str6 = "of china";
        System.out.println(str5.contains("wall"));
        System.out.println(str5.concat(str6));
        System.out.println(str5 + str6);
    }
}
