// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Rectangle class
class Rectangle {
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

// Cuboid class extended from rectangle
class Cuboid extends Rectangle {
    public double height;

    // Constructor
    public Cuboid(double length, double breadth, double height) {
        super(length, breadth); // Super keyword is used to call the constructor of the parent class
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }
}

public class ConstructorsInheritance2 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(7, 10, 5);
        System.out.println("Cuboid area: " + cuboid.area()); // Inheriting area() from Rectangle
        System.out.println("Cuboid volume: " + cuboid.volume());
    }
}