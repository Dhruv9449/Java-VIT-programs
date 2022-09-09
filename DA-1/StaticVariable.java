// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class StaticVariable {
    // Declaring static variables
    public static int marks;

    // Declaring and initializing static variables
    public static String name = "Dhruv";

    public static void main(String[] args) {
        // Accessing static variables without creating object
        StaticVariable.marks = 99;

        System.out.println("Name: " + StaticVariable.name);
        System.out.println("Marks: " + StaticVariable.marks);

        // Creating 3 objects
        StaticVariable obj1 = new StaticVariable();
        StaticVariable obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();

        // Accessing static variables using objects
        System.out.println("Name of object 1: " + obj1.name);
        System.out.println("Name of object 2: " + obj2.name);
        System.out.println("Name of object 3: " + obj3.name);

        // Accessing static variables directly
        System.out.println("Marks: " + marks);

        // Changing value of static variable using object
        obj1.name = "Dhruv Rajeshkumar Shah";

        // Accessing static variables again
        System.out.println("Name of object 1: " + obj1.name);
        System.out.println("Name of object 2: " + obj2.name);
        System.out.println("Name of object 3: " + obj3.name);

    }

}
