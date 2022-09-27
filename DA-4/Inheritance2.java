// JAVA DA - 4
// by Dhruv Rajeshkumar Shah
// 21BCE0611

// Account class
class Account {
    private int accNo;
    private String name;
    private double balance;
    private long phoneNo;
    private String DOB;
    private String address;

    // Constructor
    public Account(int accNo, String name, double balance, long phoneNo, String DOB, String address) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
        this.address = address;
    }

    // Getters
    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getDOB() {
        return DOB;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}

// Savings Account class extended from Account
class SavingsAccount extends Account {
    // Constructor
    public SavingsAccount(int accNo, String name, double balance, long phoneNo, String DOB, String address) {
        super(accNo, name, balance, phoneNo, DOB, address);
    }

    // Method to deposit money
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    // Fixed deposit method
    public void fixedDeposit(double amount, int years) {
        setBalance(getBalance() + amount * years);
    }

    // Liquidate fixed deposit method
    public void liquidateFixedDeposit(double amount, int years) {
        setBalance(getBalance() - amount * years);
    }
}

// Loan Account class extended from Account
class LoanAccount extends Account {
    private int interestRate;

    // Constructor
    public LoanAccount(int accNo, String name, double balance, long phoneNo, String DOB, String address,
            int interestRate) {
        super(accNo, name, balance, phoneNo, DOB, address);
        this.interestRate = interestRate;
    }

    // Calculate interest method
    public void calculateInterest() {
        setBalance(getBalance() + getBalance() * interestRate / 100);
    }

    // Method to pay EMI
    public void payEMI(double amount) {
        setBalance(getBalance() - amount);
    }

    // Method to top up loan
    public void topUpLoan(double amount) {
        setBalance(getBalance() + amount);
    }

    // Method to repay loan
    public void repayLoan(double amount) {
        setBalance(getBalance() - amount);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        // Savings account
        System.out.println("Savings Account");
        SavingsAccount savingsAccount = new SavingsAccount(123456789, "Dhruv Shah", 10000, 1234567890, "01/01/2001",
                "Mumbai");
        savingsAccount.deposit(1000);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(500);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
        savingsAccount.fixedDeposit(10000, 5);
        System.out.println("Balance after fixed deposit: " + savingsAccount.getBalance());
        savingsAccount.liquidateFixedDeposit(10000, 5);
        System.out.println("Balance after liquidating fixed deposit: " + savingsAccount.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println();

        // Loan account
        System.out.println("Loan Account");
        LoanAccount loanAccount = new LoanAccount(987654321, "Dhruv Shah", 10000, 1234567890, "01/01/2001", "Mumbai",
                10);
        loanAccount.calculateInterest();
        System.out.println("Balance after interest calculation: " + loanAccount.getBalance());
        loanAccount.payEMI(1000);
        System.out.println("Balance after paying EMI: " + loanAccount.getBalance());
        loanAccount.topUpLoan(10000);
        System.out.println("Balance after topping up loan: " + loanAccount.getBalance());
        loanAccount.repayLoan(10000);
        System.out.println("Loan Account Balance: " + loanAccount.getBalance());
    }
}
