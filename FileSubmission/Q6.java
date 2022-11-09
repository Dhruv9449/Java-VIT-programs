import java.util.*;

// JAVA File Submission
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Person class
class Person {

    // Constructor
    public Person(String firstName, String occupation, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    String firstName;
    String occupation;
    int age;
}

public class Q6 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();

        // Adding people to the list
        people.add(new Person("Dhruv", "Student", 19));
        people.add(new Person("Rudrank", "Student", 19));
        people.add(new Person("Chirantan", "Student", 19));
        people.add(new Person("John", "Student", 20));
        people.add(new Person("Jane", "Student", 18));
        people.add(new Person("Jack", "Student", 21));
        people.add(new Person("Jill", "Student", 17));
        people.add(new Person("Joe", "Student", 22));
        people.add(new Person("Jenny", "Student", 16));
        people.add(new Person("Jen", "Student", 23));

        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }
        });

        for (Person p : people) {
            System.out.println(p.firstName + " " + p.age);
        }
    }

}
