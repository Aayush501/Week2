import java.util.Scanner;

// definition of Department interface
interface Department {
    String assignDepartment();
    void getDepartmentDetails();
}

// definition of Employee class
abstract class Employee implements Department {
    // declaring the attributes of this class
    protected String employeeId, name;
    protected float baseSalary;

    // defining the behaviour of this class :-

    // created an abstract method calculateSalary()
    protected abstract float calculateSalary();

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String employeeId, String name, float baseSalary);

    // created a concrete method displayDetails()
    protected void displayDetails() {
        System.out.println("Name of the employee: " + this.name + "\nID: " + this.employeeId + "\nBase Salary: " + this.baseSalary + "\nSalary cash in hand: " + calculateSalary());
    }

    // providing definition of method from implemented interface, Department
    @Override
    public String assignDepartment() {
        return (this.baseSalary < 5000f)? "Department-B" : "Department-A";
    }
}

// definition of FullTimeEmployee class
class FullTimeEmployee extends Employee {
    // declaring the attributes of this class
    private float cashInHandSalary;

    // defining the behaviour of this class :-

    // overriding setter method of Employee class
    @Override
    public void set(String employeeId, String name, float baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.cashInHandSalary = calculateSalary();
    }

    // creating getter methods
    public String getName() {
        return this.name;
    }

    public String getEmployeeID() {
        return this.employeeId;
    }

    public float getBaseSalary() {
        return this.baseSalary;
    }

    public float getCashInHandSalary() {
        return this.cashInHandSalary;
    }

    // overriding the method from Department interface
    @Override
    public void getDepartmentDetails() {
        System.out.println(this.name + " works in " + assignDepartment() + " department.");
    }

    // overriding the abstract method of Employee class
    @Override
    protected float calculateSalary() {
        this.cashInHandSalary = this.baseSalary - (baseSalary * 8 / 100); // reducing 8% of the base salary
        return this.cashInHandSalary;
    }

    // overriding the displayDetails method of Employee class
    @Override
    public void displayDetails() {
        System.out.println("Name of the employee: " + this.getName() + "\nID: " + this.getEmployeeID() + "\nBase Salary: " + this.getBaseSalary() + "\nSalary cash in hand: " + this.getCashInHandSalary());
        getDepartmentDetails();
    }
}

// definition of PartTimeEmployee class
class PartTimeEmployee extends Employee {
    // declaring the attributes of this class
    private float cashInHandSalary;

    // defining the behaviour of this class :-

    // overriding setter method of Employee class
    @Override
    public void set(String employeeId, String name, float baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.cashInHandSalary = calculateSalary();
    }

    // creating getter methods
    public String getName() {
        return this.name;
    }

    public String getEmployeeID() {
        return this.employeeId;
    }

    public float getBaseSalary() {
        return this.baseSalary;
    }

    public float getCashInHandSalary() {
        return this.cashInHandSalary;
    }

    // overriding the method from Department interface
    @Override
    public void getDepartmentDetails() {
        System.out.println(this.name + " works in " + assignDepartment() + " department.");
    }

    // overriding the abstract method of Employee class
    @Override
    protected float calculateSalary() {
        this.cashInHandSalary = this.baseSalary - (baseSalary * 8 / 100); // reducing 8% of the base salary
        return this.cashInHandSalary;
    }

    // overriding the displayDetails method of Employee class
    @Override
    public void displayDetails() {
        System.out.println("Name of the employee: " + this.getName() + "\nID: " + this.getEmployeeID() + "\nBase Salary: " + this.getBaseSalary() + "\nSalary cash in hand: " + this.getCashInHandSalary());
        getDepartmentDetails();
    }
}

// definition of EmployeeManagementSystem class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for employee details
        System.out.println("Enter number of employees: ");
        int numberOfEmployees = sc.nextInt();

        // created an array of references of Employee class
        Employee [] employees = new Employee[numberOfEmployees];

        // iterating through a for loop to get input for the employees
        for (int i = 0; i < numberOfEmployees; i++) {
            // created variables for taking inputs for the attributes of employees
            System.out.println("Enter Name of Employee-" + (i+1));
            String name = sc.nextLine();
            name = sc.nextLine(); // to avoid conflicts while taking inputs

            System.out.println("Enter ID of Employee-" + (i+1));
            String employeeID = sc.next();

            System.out.println("Enter Base Salary of Employee-" + (i+1));
            float baseSalary = sc.nextFloat();

            // initializing objects
            employees[i] = (baseSalary < 5000f)? new PartTimeEmployee() : new FullTimeEmployee();

            // setting attribute values
            employees[i].set(employeeID, name, baseSalary);

            // getting the details of employee
            employees[i].displayDetails();
        }
    }
}