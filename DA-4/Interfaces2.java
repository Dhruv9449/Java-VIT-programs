// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Interface
interface Test {
    final static int X = 10;

    public abstract void meth1();

    public abstract void meth2();

    public static void meth3() {
        System.out.println("Static method of test");
    }
}

interface Test2 extends Test {
    void meth4();
}

class My implements Test2 {
    public void meth1() {
        System.out.println("Meth1");
    }

    public void meth2() {
        System.out.println("Meth2");
    }

    public void meth4() {
        System.out.println("Meth4");
    }
}

public class Interfaces2 {
    public static void main(String[] args) {
        My obj = new My();
        obj.meth1();
        obj.meth2();
        obj.meth4();
        Test.meth3();
        System.out.println(Test.X);
    }
}
