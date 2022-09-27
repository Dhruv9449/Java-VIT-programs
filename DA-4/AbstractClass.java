// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Abstract class shape
abstract class Shape {
    public abstract double area();

    public abstract double perimeter();
}

// Rectangle class extended from shape
class Rectangle extends Shape {
    public double length;
    public double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}

// Circle class extended from shape
class Circle extends Shape {
    public double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 10);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        Circle circle = new Circle(7);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());
    }
}
