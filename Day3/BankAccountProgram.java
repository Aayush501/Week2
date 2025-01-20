// definition of BankAccount Class
class BankAccount {
    // declaring the attributes of this class
    static String bankName = "Bank-Static";
    static int totalNoOfAccounts = 0;
    private final String accountNumber;
    private String accountHolderName; // private to make data secure

    // created a parameterized constructor to provide attributes with user defined values
    BankAccount(String accountNumber, String accountHolderName) {
        // using this keyword to resolve ambiguity
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalNoOfAccounts++;
    }

    // created a static method to get the total number of accounts
    static int getTotalAccounts() {
        return totalNoOfAccounts;
    }

    // created a method to get the details of the account
    void displayAccountDetails() {
        System.out.println("Account number: " + accountNumber + ", Account Holder Name: " + accountHolderName + ", Bank: " + bankName);
    }
}

// definition of BankAccountProgram Class
public class BankAccountProgram {
    public static void main(String[] args) {
        // created array of objects of BankAccount Class
        BankAccount[] accounts = new BankAccount[5];

        // initializing the objects with user defined values using for loop
        for (int i=0; i<5; i++){
            accounts[i] = new BankAccount("AC-00" + (i+1), "Person " + (i+1));
        }

        // displaying the total number of accounts
        System.out.println("total number of accounts in " + BankAccount.bankName + " are " + BankAccount.getTotalAccounts()); // calling class level entities with class name

        // displaying the details of bank accounts if they are objects of BankAccount class
        for (int i = 0; i < 5; i++) {
            if (accounts[i] instanceof BankAccount) { // using instanceof operator to check if object is an instance of BankAccount class
                accounts[i].displayAccountDetails();
            }
        }
    }
}