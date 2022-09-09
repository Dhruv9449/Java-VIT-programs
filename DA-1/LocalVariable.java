// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class LocalVariable {
    public class EmployeeSalary {

        public void getSalary() {
            // Declaring local variable
            double salary;

            // Declaring and initializing local variables
            int workingDays = 25, salaryPerDay = 1000;

            // Initializing local variable
            salary = workingDays * salaryPerDay;

            // Printing local variable
            System.out.println("Salary of the employee: " + salary);
        }
    }

    public static void main(String[] args) {
        LocalVariable object = new LocalVariable();
        EmployeeSalary employeeSalary = object.new EmployeeSalary();

        // Viewing local variable salary by calling the method it was declared in
        employeeSalary.getSalary();
    }
}