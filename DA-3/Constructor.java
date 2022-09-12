// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Rectangle class
class ConstructorRectangle {
    public double length;
    public double breadth;

    // Default constructor
    public ConstructorRectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    public ConstructorRectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overloading constructor
    public ConstructorRectangle(double side) {
        length = side;
        breadth = side;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

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

// Cylinder class
class ConstructorCylinder {
    public double radius;
    public double height;

    // Default constructor
    public ConstructorCylinder() {
        radius = 0;
        height = 0;
    }

    // Parameterized constructor
    public ConstructorCylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Overloading constructor
    public ConstructorCylinder(double radius) {
        this.radius = radius;
        height = 0;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double drumArea() {
        return 2 * Math.PI * radius * height;
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

public class Constructor {
    public static void main(String[] args) {
        // Rectangle
        System.out.println("Rectangle");
        ConstructorRectangle r1 = new ConstructorRectangle();
        ConstructorRectangle r2 = new ConstructorRectangle(10, 20);
        ConstructorRectangle r3 = new ConstructorRectangle(10);

        System.out.println("Area of r1: " + r1.area());
        System.out.println("Perimeter of r1: " + r1.perimeter());
        System.out.println("Is r1 a square: " + r1.isSquare());
        System.out.println();

        System.out.println("Area of r2: " + r2.area());
        System.out.println("Perimeter of r2: " + r2.perimeter());
        System.out.println("Is r2 a square: " + r2.isSquare());
        System.out.println();

        System.out.println("Area of r3: " + r3.area());
        System.out.println("Perimeter of r3: " + r3.perimeter());
        System.out.println("Is r3 a square: " + r3.isSquare());
        System.out.println();

        System.out.println("----------------------------------------");

        // Cylinder
        System.out.println("Cylinder");
        ConstructorCylinder c1 = new ConstructorCylinder();
        ConstructorCylinder c2 = new ConstructorCylinder(10, 20);
        ConstructorCylinder c3 = new ConstructorCylinder(10);

        System.out.println("Lid area of c1: " + c1.lidArea());
        System.out.println("Drum area of c1: " + c1.drumArea());
        System.out.println("Circumference of c1: " + c1.circumference());
        System.out.println("Total surface area of c1: " + c1.totalSurfaceArea());
        System.out.println("Volume of c1: " + c1.volume());
        System.out.println();

        System.out.println("Lid area of c2: " + c2.lidArea());
        System.out.println("Drum area of c2: " + c2.drumArea());
        System.out.println("Circumference of c2: " + c2.circumference());
        System.out.println("Total surface area of c2: " + c2.totalSurfaceArea());
        System.out.println("Volume of c2: " + c2.volume());
        System.out.println();

        System.out.println("Lid area of c3: " + c3.lidArea());
        System.out.println("Drum area of c3: " + c3.drumArea());
        System.out.println("Circumference of c3: " + c3.circumference());
        System.out.println("Total surface area of c3: " + c3.totalSurfaceArea());
        System.out.println("Volume of c3: " + c3.volume());
        System.out.println();
    }
}
