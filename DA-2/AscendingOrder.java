// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class AscendingOrder {
    public static void main(String[] args) {
        // Array of languages
        String languages[] = { "Python", "JavaScript", "C", "C++", "Java", "PHP", "C#" };

        // Sorting array
        java.util.Arrays.sort(languages);

        // Printing the sorted array
        for (String language : languages) {
            System.out.println(language);
        }
    }
}
