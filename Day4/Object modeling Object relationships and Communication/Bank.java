// importing required package for using ArrayList
import java.util.ArrayList;

// definition of Bank class to represent the bank
public class Bank {
    // declaring an ArrayList to store Customer objects, demonstrating association
    private ArrayList<Customer> accounts = new ArrayList<Customer>();

    // created a constructor to initialize the accounts list
    Bank() {
        this.accounts = new ArrayList<Customer>(); // initializing an empty list of customers
    }

    // created a method to add a customer to the bank
    public void add(Customer c) {
        accounts.add(c); // adding customer object to the accounts list
    }

    // definition of the main method to demonstrate association
    public static void main(String[] args) {
        // creating an object of Bank class to represent a bank
        Bank b = new Bank();

        // creating Customer objects and initializing them with details
        Customer c1 = new Customer("Person-A", 1, 1000);
        Customer c2 = new Customer("Person-B", 2, 2000);
        Customer c3 = new Customer("Person-C", 3, 3000);

        // adding customers to the bank to establish the association
        b.accounts.add(c1);
        b.accounts.add(c2);
        b.accounts.add(c3);

        // displaying the balance details of all customers
        for (Customer c : b.accounts) {
            c.displayBalance();
        }

        // performing operations on customer accounts
        c1.addBalance(20000);  // adding balance to customer 1's account
        c1.withdrawBalance(412421);  // attempting to withdraw an amount greater than balance
        c1.withdrawBalance(900);  // withdrawing an amount within the balance
    }
}

// definition of Customer class to represent bank customers
class Customer {
    // declaring the attributes of this class
    private String name;  // stores the name of the customer
    private int AccountNumber;  // stores the account number of the customer
    private float balance;  // stores the balance amount of the customer

    // created a parameterized constructor to initialize attributes
    Customer(String name, int AccountNumber, float balance) {
        this.name = name;  // assigning the name to the instance variable
        this.AccountNumber = AccountNumber;  // assigning the account number to the instance variable
        this.balance = balance;  // assigning the balance to the instance variable
    }

    // created a method to display the balance of the customer
    void displayBalance() {
        System.out.println("Name: " + name + " Account Number: " + AccountNumber + " Balance: " + balance);
    }

    // created a method to add balance to the customer's account
    void addBalance(float amount) {
        balance += amount;  // updating the balance with the added amount
        System.out.println("Amount added successfully and the updated balance is: " + balance);
    }

    // created a method to withdraw balance from the customer's account
    void withdrawBalance(float amount) {
        if (balance >= amount) {
            balance -= amount;  // deducting the withdrawal amount from balance
            System.out.println("Amount withdrawn successfully and the updated balance is: " + balance);
        } else {
            System.out.println("Insufficient balance");  // displaying message for insufficient balance
        }
    }
}
