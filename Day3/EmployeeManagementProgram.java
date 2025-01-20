// definition of Employee class
class Employee {
    // declaring the attributes of this class
    static String companyName = "Company-Static";
    static int totalEmployees = 0;
    private final int id;  // final variable to ensure ID immutability
    private String name, designation;  // private to ensure data security

    // created a parameterized constructor to provide the attributes with user-defined values
    Employee(int id, String name, String designation) {
        // using this keyword to resolve ambiguity
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;  // incrementing the total employee count
    }

    // created a static method to display the total number of employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    // created a method to display the employee details
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Designation: " + designation);
    }
}

// definition of EmployeeManagementProgram class
public class EmployeeManagementProgram {
    public static void main(String[] args) {
        // created array of objects of Employee class
        Employee[] employees = new Employee[5];

        // initializing the objects with user-defined values using for loop
        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee(i + 1, "Employee-" + (i + 1), "Designation-" + (i + 1));
        }

        // displaying the total number of employees
        Employee.displayTotalEmployees();

        // displaying the details of employees if they are objects of Employee class
        for (int i = 0; i < 5; i++) {
            if (employees[i] instanceof Employee) { // using instanceof operator to check if object is an instance of Employee class
                employees[i].displayEmployeeDetails();
            }
        }
    }
}
