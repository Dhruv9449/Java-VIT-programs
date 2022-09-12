// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

class PrivateRectangle {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length; // This is a keyword that refers to the current object(Not taught in class yet)
        } else {
            this.length = 0;
        }
    }

    public void setBreadth(double breadth) {
        if (breadth > 0) {
            this.breadth = breadth;
        } else {
            this.breadth = 0;
        }
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        PrivateRectangle r1 = new PrivateRectangle();
        r1.setLength(10);
        r1.setBreadth(10);
        System.out.println("Length: " + r1.getLength());
        System.out.println("Breadth: " + r1.getBreadth());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        System.out.println("Is Square: " + r1.isSquare());
    }
}
