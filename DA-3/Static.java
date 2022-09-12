// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

class StaticCar {
    // Static variable
    static long carCount = 0;

    // Final variable
    final long CARID = 100002343;

    // Static block
    static {
        System.out.println("Static block called");
    }

    // Constructor
    StaticCar() {
        carCount++;
    }

    // Static method
    static void printCarCount() {
        System.out.println("Number of cars: " + carCount);
    }

    // Final method
    final void printCarId() {
        System.out.println("Car ID: " + CARID);
    }
}

public class Static {
    public static void main(String[] args) {
        StaticCar.printCarCount();
        StaticCar car1 = new StaticCar();
        StaticCar car2 = new StaticCar();
        StaticCar car3 = new StaticCar();
        StaticCar.printCarCount();
        car1.printCarId();
        car2.printCarId();
        car3.printCarId();
    }

}
