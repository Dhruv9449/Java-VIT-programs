// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Parent class
class Parent {
    // Default constructor
    public Parent() {
        System.out.println("Parent constructor");
    }

    // Parameterized constructor
    public Parent(int x) {
        System.out.println("Parent constructor with value " + x);
    }
}

// Child class
class Child extends Parent {
    // Default constructor
    public Child() {
        System.out.println("Child constructor");
    }

    // Parameterized constructor
    public Child(int y) {
        System.out.println("Child constructor with value " + y);
    }

    public Child(int x, int y) {
        super(x);
        System.out.println("Child constructor with value " + x + " and " + y);
    }
}

// Grandchild class
class Grandchild extends Child {
    // Default constructor
    public Grandchild() {
        System.out.println("Grandchild constructor");
    }
}

public class ConstructorsInheritance {
    public static void main(String[] args) {
        // Default constructors
        Grandchild grandchild = new Grandchild();
        System.out.println();

        // Parameterized constructors
        Child child = new Child(5);
        System.out.println();
        Child child2 = new Child(5, 10);
        System.out.println();
    }
}
