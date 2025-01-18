import java.util.Scanner;

class BankAccount {
	Scanner sc = new Scanner(System.in); // object of scanner class
	// created the attributes of BankAccount
	// keeping attributes private ensures data security 
	private String accountHolder, accountNumber;
	private double balance = 0; // initial balance 
	
	
	// method for depositing money
	public void depositeMoney() {
		System.out.println("Enter amount: ");
		double depositingBalance = sc.nextDouble(); // taking input for how much amount user wants to deposite
		
		System.out.println("your previous balance: " + balance);
		balance += depositingBalance; // adding deposited amount to balance
		System.out.println("your current balance: " + balance);
	}
	
	// method for withdrawing money
	public void withdrawMoney() {
		System.out.println("Enter amount: ");
		double withdrawAmount = sc.nextDouble(); // taking input for how much amount user wants to withdraw
		
		// checking if the amount entered by user is valid or not
		if (withdrawAmount > balance) { // user cannot withdraw money if withdrawAmount is greater than current balance
			System.out.println("Insufficient Balance");
		} else {
			System.out.println("your previous balance: " + balance);
			balance -= withdrawAmount; // subtracting withdrawed amount from balance
			System.out.println("your current balance: " + balance);
		}
	}
	
	// method for printing the account balance
	public void viewBalance() {
		System.out.println("your current balance: " + balance);
	}
}

public class ATM {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in); // object of scanner class
		
		// created an integer variable to let user choose the functionality, that user wants to use
		int functionality;
		
		System.out.println("Choose: \n1 => for depositing money\n2 => for withdrawing money\n3 => for displaying account balance");
		functionality = sc.nextInt(); // taking input for functionality
		
		BankAccount account = new BankAccount(); // object of BankAccount class
		
		switch (functionality) { // calling function according to chosen functionality
			case 1 :
				account.depositeMoney();
				break;
			case 2 :
				account.withdrawMoney();
				break;
			case 3 :
				account.viewBalance();
				break;
			default :
				System.out.println("not a valid choice");
		}
		
		sc.close(); // closing the scanner object
	}
}