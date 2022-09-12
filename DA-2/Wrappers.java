// JAVA DA - 2
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Wrappers {
    public static void main(String[] args) {
        // Decalring and initializing primitive variables
        byte b = 10;
        short s = 20;
        int i = 10;
        long l = 100;
        float f = 10.5f;
        double d = 10.5;
        char c = 'a';
        boolean bool = true;

        // Wrapping primitive variables into objects
        Byte byteObj = b;
        Short shortObj = s;
        Integer intObj = i;
        Long longObj = l;
        Float floatObj = f;
        Double doubleObj = d;
        Character charObj = c;
        Boolean boolObj = bool;

        // Printing the values of objects
        System.out.println("Printing the values of objects");
        System.out.println("Byte object: " + byteObj);
        System.out.println("Short object: " + shortObj);
        System.out.println("Integer object: " + intObj);
        System.out.println("Long object: " + longObj);
        System.out.println("Float object: " + floatObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("");

        // Unwrapping objects into primitive variables
        byte byteVar = byteObj;
        short shortVar = shortObj;
        int intVar = intObj;
        long longVar = longObj;
        float floatVar = floatObj;
        double doubleVar = doubleObj;
        char charVar = charObj;
        boolean boolVar = boolObj;

        // Printing the values of primitive variables
        System.out.println("Printing the values of primitive variables");
        System.out.println("Byte variable: " + byteVar);
        System.out.println("Short variable: " + shortVar);
        System.out.println("Integer variable: " + intVar);
        System.out.println("Long variable: " + longVar);
        System.out.println("Float variable: " + floatVar);
        System.out.println("Double variable: " + doubleVar);
        System.out.println("Character variable: " + charVar);
        System.out.println("Boolean variable: " + boolVar);
    }
}
