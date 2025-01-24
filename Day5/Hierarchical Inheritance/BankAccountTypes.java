// definition of BankAccount class
class BankAccount {
    // declaring the attributes of this class
    protected String accountNumber;
    protected double balance;

    // defining the behaviour of this class
    protected void displayDetails() {
        System.out.println("this is a bank account class and its attributes are not defined yet!");
    }
}

// definition of SavingsAccount class that extends BankAccount class
class SavingsAccount extends BankAccount {
    // declaring the attributes of this class
    private double interestRate;

    // created a parameterized constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // overriding the displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Account number: " + this.accountNumber + ", Balance: " + this.balance + ", Interest-rate: " + this.interestRate);
    }

    // created a method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// definition of CheckingAccount class that extends BankAccount class
class CheckingAccount extends BankAccount {
    // declaring the attributes of this class
    private double withdrawalLimit;

    // created a parameterized constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.withdrawalLimit = withdrawalLimit;
    }

    // overriding the displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Account number: " + this.accountNumber + ", Balance: " + this.balance + ", Withdrawal Limit: " + this.withdrawalLimit);
    }

    // created a method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

// definition of FixedDepositAccount class that extends BankAccount class
class FixedDepositAccount extends BankAccount {
    // declaring the attributes of this class
    private int depositTimeInYears;

    // created a parameterized constructor
    FixedDepositAccount(String accountNumber, double balance, int depositTimeInYears) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.depositTimeInYears = depositTimeInYears;
    }

    // overriding the displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Account number: " + this.accountNumber + ", Balance: " + this.balance + ", Deposit Time: " + this.depositTimeInYears + " years");
    }

    // created a method to display the account type
    public void displayAccountType() {
        System.out.println("Account Type: Fix Deposit Account");
    }
}

public class BankAccountTypes {
    public static void main(String[] args) {
        // created the objects of all subclasses of BankAccount class
        SavingsAccount account1 = new SavingsAccount("01", 1000.0, 5);
        CheckingAccount account2 = new CheckingAccount("02", 2000.0, 500.0);
        FixedDepositAccount account3 = new FixedDepositAccount("03", 3000.0, 2);

        // displaying details of all accounts
        account1.displayAccountType();
        account1.displayDetails();

        account2.displayAccountType();
        account2.displayDetails();

        account3.displayAccountType();
        account3.displayDetails();
    }
}