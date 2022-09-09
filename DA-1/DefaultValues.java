// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class DefaultValues {
    // Declaring primitive data types
    byte byte1;
    short short1;
    int int1;
    long long1;
    float float1;
    double double1;
    char char1;
    boolean boolean1;

    // Declaring reference data types
    String string1;
    DefaultValues defaultValues1;

    // Method for printing default values
    public void getDefaultValues() {
        System.out.println("Default value of byte: " + byte1);
        System.out.println("Default value of short: " + short1);
        System.out.println("Default value of int: " + int1);
        System.out.println("Default value of long: " + long1);
        System.out.println("Default value of float: " + float1);
        System.out.println("Default value of double: " + double1);
        System.out.println("Default value of char: " + char1);
        System.out.println("Default value of boolean: " + boolean1);
        System.out.println("Default value of String: " + string1);
        System.out.println("Default value of DefaultValues: " + defaultValues1);
    }

    public static void main(String[] args) {
        DefaultValues object = new DefaultValues();
        object.getDefaultValues();
    }
}
