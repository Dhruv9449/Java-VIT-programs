import rectangle.*;

class Cuboid extends rectangle.Rectangle {
    int height;

    public Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume() {
        return getArea() * height;
    }

    public int getSurfaceArea() {
        return 2 * (getArea() + getLength() * height + getWidth() * height);
    }

    public void printCuboid() {
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + height);
        System.out.println("Volume: " + getVolume());
        System.out.println("Surface Area: " + getSurfaceArea());
    }
}

public class CuboidTest {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(5, 10, 15);
        cuboid.printCuboid();
    }
}