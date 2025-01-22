// definition of Company class to represent the company entity
public class Company {
    // declaring attribute to store the name of the company
    String companyName;

    // created a parameterized constructor to initialize the company name
    Company(String companyName) {
        this.companyName = companyName;
    }

    // creating objects of the Department class, representing composition
    Department development = new Department("Development");
    Department testing = new Department("Testing");
    Department hr = new Department("HR");

    // definition of the main method to demonstrate composition relationship
    public static void main(String[] args) {
        // creating an object of Company class with a given name
        Company c = new Company("Capgemini");

        // displaying the details of the company and its departments with employees
        System.out.println("Company Name: " + c.companyName);
        System.out.println("Department Name: " + c.development.name);
        System.out.println("Employee Name: " + c.development.e1.name);
        System.out.println("Employee Designation: " + c.development.e1.deignation);
        System.out.println("Employee Salary: " + c.development.e1.Sallary);
        System.out.println("Employee Name: " + c.development.e2.name);
        System.out.println("Employee Designation: " + c.development.e2.deignation);
        System.out.println("Employee Salary: " + c.development.e2.Sallary);
        System.out.println("Employee Name: " + c.development.e3.name);
        System.out.println("Employee Designation: " + c.development.e3.deignation);
        System.out.println("Employee Salary: " + c.development.e3.Sallary);

        // deleting the company object to demonstrate composition
        c = null;

        // handling NullPointerException to show that department and employees are also deleted
        try {
            System.out.println("Employee Salary: " + c.development.e1.Sallary);
        } catch (NullPointerException e) {
            System.out.println("Company does not exist");
            System.out.println("After deleting the company, the department and employee objects will also be deleted");
        }
    }
}

// definition of Department class to represent departments within the company
class Department {
    // declaring attribute to store the department name
    String name;

    // created a parameterized constructor to initialize the department name
    Department(String name) {
        this.name = name;
    }

    // creating objects of the Employee class within the department
    Employee e1 = new Employee("Aayush", "Developer", 10000);
    Employee e2 = new Employee("Kumar", "Tester", 20000);
    Employee e3 = new Employee("Shrivastav", "HR", 30000);
}

// definition of Employee class to represent employees in a department
class Employee {
    // declaring attributes to store employee details
    String name, deignation;
    int Sallary;

    // created a parameterized constructor to initialize employee details
    Employee(String name, String deignation, int Sallary) {
        this.name = name;
        this.deignation = deignation;
        this.Sallary = Sallary;
    }
}
