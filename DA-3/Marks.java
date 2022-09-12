// JAVA DA - 3
// by Dhruv Rajeshkumar Shah
// 21BCE0611

class Student {
    public String name;
    public int rollNo;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 60) {
            return 'A';
        } else {
            return 'B';
        }
    }

    public String details() {
        return "Name: " + name + "\nRoll No: " + rollNo + "\nCourse: " + course + "\nMarks: " + m1 + ", " + m2 + ", "
                + m3 + "\nTotal: " + total() + "\nAverage: " + average() + "\nGrade: " + grade();
    }

    public String toString() {
        return details();
    }
}

public class Marks {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dhruv";
        s1.rollNo = 0611;
        s1.course = "B.Tech";
        s1.m1 = 99;
        s1.m2 = 88;
        s1.m3 = 98;

        // Printing details by calling details() method
        System.out.println(s1.details());
        System.out.println();

        // Printing details by calling toString() method
        System.out.println(s1);

    }
}
