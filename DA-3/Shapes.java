// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Circle class
class Circle {
    public double radius;

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

// Rectangle class
class Rectangle {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

// Square class
class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }

    public double volume() {
        return lidArea() * height;
    }
}

// Main class
public class Shapes {
    public static void main(String[] args) {
        // Circle
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Circle");
        System.out.println("Area: " + c.area());
        System.out.println("Perimeter: " + c.perimeter());
        System.out.println("Circumference: " + c.circumference());
        System.out.println();

        // Rectangle
        Rectangle r = new Rectangle();
        r.length = 5;
        r.breadth = 10;
        System.out.println("Rectangle");
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Is Square: " + r.isSquare());
        System.out.println();

        // Cylinder
        Cylinder cy = new Cylinder();
        cy.radius = 5;
        cy.height = 10;
        System.out.println("Cylinder");
        System.out.println("Lid Area: " + cy.lidArea());
        System.out.println("Circumference: " + cy.circumference());
        System.out.println("Total Surface Area: " + cy.totalSurfaceArea());
        System.out.println("Volume: " + cy.volume());
    }
}
