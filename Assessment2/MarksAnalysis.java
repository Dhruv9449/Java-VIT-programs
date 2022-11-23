// Assessment 2
// Dhruv Rajeshkumar Shah
// 21BCE0611

import java.util.Scanner;

// Student class
class Student {
    int StudentID, Age;
    String Fname, Lname;

    // Constructors
    Student() {
        this.StudentID = 0;
        this.Fname = "";
        this.Lname = "";
        this.Age = 0;
    }

    Student(int StudentID, String Fname, String Lname, int Age) {
        this.StudentID = StudentID;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Age = Age;
    }

    // Get Details
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.StudentID = sc.nextInt();
        System.out.print("Enter First Name: ");
        this.Fname = sc.next();
        System.out.print("Enter Last Name: ");
        this.Lname = sc.next();
        System.out.print("Enter Age: ");
        this.Age = sc.nextInt();
        // sc.close();
    }

}

public class MarksAnalysis extends Student {
    int Total;
    float Average;

    // Constructor
    MarksAnalysis() {
        super();
        this.Total = 0;
        this.Average = 0;
    }

    // Final Grade
    void finalGrade() {
        int sub1, sub2, sub3, sub4, sub5;
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Marks in Subject 1: ");
        sub1 = sc1.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        sub2 = sc1.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        sub3 = sc1.nextInt();
        System.out.print("Enter Marks in Subject 4: ");
        sub4 = sc1.nextInt();
        System.out.print("Enter Marks in Subject 5: ");
        sub5 = sc1.nextInt();

        this.Total = sub1 + sub2 + sub3 + sub4 + sub5;
        this.Average = this.Total / 5;

        String grade;
        if (this.Average >= 90) {
            grade = "S";
        } else if (this.Average >= 80) {
            grade = "A";
        } else if (this.Average >= 70) {
            grade = "B";
        } else if (this.Average >= 60) {
            grade = "C";
        } else if (this.Average >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Total Marks: " + this.Total);
        System.out.println("Average Marks: " + this.Average);
        System.out.println("Grade: " + grade);

    }

    // Print Details
    void printDetails() {
        System.out.println("Student ID: " + this.StudentID);
        System.out.println("First Name: " + this.Fname);
        System.out.println("Last Name: " + this.Lname);
        System.out.println("Age: " + this.Age);
    }

    // Main
    public static void main(String[] args) {
        MarksAnalysis obj = new MarksAnalysis();
        obj.getDetails();
        obj.printDetails();
        obj.finalGrade();
    }

}
