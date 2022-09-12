// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Bank account class
class BankAccount {
    public String name;
    public int accountNo;
    public double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public void transfer(BankAccount other, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            other.balance += amount;
        }
    }

    public String toString() {
        return "Name: " + name + "\nAccount No: " + accountNo + "\nBalance: " + balance;
    }
}

// Telivision class
class Television {
    public String brand;
    public int size;
    public int volume;
    public int chanNo;
    public boolean isSmart;

    public void turnOn() {
        System.out.println("Turning on the TV");
    }

    public void turnOff() {
        System.out.println("Turning off the TV");
    }

    public void changeChannel(int ch) {
        chanNo = ch;
        System.out.println("Changing channel to " + chanNo);
    }

    public void changeVolume(int v) {
        volume = v;
        System.out.println("Changing volume to " + volume);
    }

    public String toString() {
        return "Brand: " + brand + "\nSize: " + size + "\nIs Smart: " + isSmart;
    }
}

// Car class
class Car {
    public String brand;
    public String model;
    public int year;
    public int speed;

    public void start() {
        System.out.println("Starting the car");
    }

    public void stop() {
        System.out.println("Stopping the car");
    }

    public void accelerate(int s) {
        speed += s;
        System.out.println("Accelerating to " + speed);
    }

    public void brake(int s) {
        speed -= s;
        System.out.println("Braking to " + speed);
    }

    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nYear: " + year;
    }
}

// Main class
public class Exercise1 {
    public static void main(String[] args) {

        // Bank account
        System.out.println("Bank account");
        BankAccount acc1 = new BankAccount();
        acc1.name = "Dhruv Shah";
        acc1.accountNo = 123456789;
        acc1.balance = 10000;
        System.out.println(acc1);

        acc1.deposit(1000);
        System.out.println(acc1);
        acc1.withdraw(5000);
        System.out.println(acc1);
        acc1.transfer(acc1, 1000);
        System.out.println(acc1);
        System.out.println();

        // Television
        System.out.println("Television");
        Television tv1 = new Television();
        tv1.brand = "Samsung";
        tv1.size = 32;
        tv1.volume = 10;
        tv1.chanNo = 1;
        tv1.isSmart = true;
        System.out.println(tv1);

        tv1.turnOn();
        tv1.changeChannel(5);
        tv1.changeVolume(15);
        tv1.turnOff();
        System.out.println();

        // Car
        System.out.println("Car");
        Car car1 = new Car();
        car1.brand = "Lamborghini";
        car1.model = "Veneno";
        car1.year = 2014;
        car1.speed = 0;
        System.out.println(car1);

        car1.start();
        car1.accelerate(100);
        car1.brake(50);
        car1.stop();
    }
}
