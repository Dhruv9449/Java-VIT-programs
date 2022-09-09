// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class InstanceVariable {

    public class AreaOfShapes {
        // Declaring instance variables
        double breadth;
        double length;
        double areaOfRectangle;
        double areaOfSquare;
    }

    public static void main(String[] args) {
        InstanceVariable object = new InstanceVariable();

        // Creating new object of AreaOfShapes class
        AreaOfShapes rectangle1 = object.new AreaOfShapes();

        // Initializing instance variables
        rectangle1.breadth = 10;
        rectangle1.length = 20;
        rectangle1.areaOfRectangle = rectangle1.breadth * rectangle1.length;

        // Displaying instance variables
        System.out.println("Length of rectangle: " + rectangle1.length);
        System.out.println("Breadth of rectangle: " + rectangle1.breadth);
        System.out.println("Area of rectangle: " + rectangle1.areaOfRectangle);

        System.out.println();

        // Creating second object of AreaOfShapes class
        AreaOfShapes square1 = object.new AreaOfShapes();

        // Initializing instance variables
        square1.breadth = 10;
        square1.length = 10;
        square1.areaOfSquare = square1.breadth * square1.length;

        // Displaying instance variables
        System.out.println("Length of square: " + square1.length);
        System.out.println("Breadth of square: " + square1.breadth);
        System.out.println("Area of square: " + square1.areaOfSquare);
    }
}
