// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Increment {
    public static void main(String[] args) {
        int x = 5, y, z;
        // Post increment
        y = x++;
        System.out.println("Post increment: " + x + " " + y);

        // Pre increment
        z = ++x;
        System.out.println("Pre increment: " + x + " " + z);

        // Float increment
        float f = 5.5f;
        f++;
        System.out.println("Float increment: " + f);

        // Charater increment
        char c = 'a';
        c++;
        System.out.println("Character increment: " + c);

        // Byte increment
        byte b = 5;
        b++;
        System.out.println("Byte increment: " + b);
    }
}
