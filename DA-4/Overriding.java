// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Parent class
class ParentOverriding {
    public void print() {
        System.out.println("Parent class");
    }
}

// Child class
class ChildOverriding extends ParentOverriding {
    // Overriding the print() method
    public void print() {
        System.out.println("Child class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        ParentOverriding parent = new ParentOverriding();
        parent.print(); // Parent class

        ChildOverriding child = new ChildOverriding();
        child.print(); // Child class

        ParentOverriding parentChild = new ChildOverriding();
        parentChild.print(); // Dispatching to the child class

    }
}
