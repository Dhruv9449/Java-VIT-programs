// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class StringFormatting {
    public static void main(String[] args) {
        String name = "Dhruv";
        int age = 19;
        double cgpa = 9.5;
        String lang = "Java";

        // String Formatting
        System.out.printf("My name is %s, I am %d years old and my CGPA is %.2f\n", name, age, cgpa);
        System.out.printf("I am learning %20s", lang);
    }
}