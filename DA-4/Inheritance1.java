// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Circle class
class Circle {
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

    public double circumference() {
        return perimeter();
    }
}

// Cylinder class extended from circle
class Cylinder extends Circle {
    public double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(7, 10);
        System.out.println("Cylinder area: " + cylinder.area()); // Inheriting area() from Circle
        System.out.println("Cylinder volume: " + cylinder.volume());
    }
}
