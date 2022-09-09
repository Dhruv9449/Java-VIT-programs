// JAVA DA - 1
// by Dhruv Rajeshkumar Shah
// 21BCE0611

public class Variable {
    public static void main(String[] args) {
        long hoursWorked = 40;
        double payRate = 25.0, taxRate = 0.10, taxPayable;

        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Payment Amount: " + (hoursWorked * payRate));

        taxPayable = hoursWorked * payRate * taxRate;
        System.out.println("Tax Payable: " + taxPayable);

    }
}
