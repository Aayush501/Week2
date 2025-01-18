import java.util.Scanner;

// definition of employee class
// employee class stores the dtails of employee
class Employee {
	
	// defining the attributes of this class
	String name;
	int empID, salary;
	
	// method to display employee detail
	public void printDetails(String name, int empID, int salary){
		this.name = name;
		this.empID = empID;
		this.salary = salary;
		
		System.out.println("Employee name : " + name);
		System.out.println("Employee id : " + empID);
		System.out.println("Employee salary : " + salary);
	}
}

// definition of employee details class
public class EmployeeDetails{
	public static void main(String[]args){
		
			Scanner sc = new Scanner(System.in); // object of scanner class
			
			// taking inputs for setting attributes of employee class
			String name = sc.next();
			int empID = sc.nextInt();
			int salary = sc.nextInt();
			
			// initializing the class using object
			Employee em = new Employee();
			
			// calling printDetails function from class employee detail
			em.printDetails(name, empID, salary);
		
	}
}