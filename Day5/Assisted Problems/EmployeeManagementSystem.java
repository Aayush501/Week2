// definition of Employee class
class Employee {
    // declaring the attributes of this class
    protected String name, id;
    protected float salary;

    // defining the behaviour of this class
    protected void displayDetails(){
        System.out.println("This is Employee class.");
    }
}

// definition of Manager class that inherits the Employee class
class Manager extends Employee {
    // declaring attributes of this class
    private int teamSize;

    // created a parameterized constructor to provide the attributes with user defined values
    Manager(String name, String id, float salary, int teamSize) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.teamSize = teamSize;
    }

    // overriding the displayDetails method
    @Override
    protected void displayDetails() {
        System.out.println("Name of manager: " + this.name + "\nID: " + this.id + "\nSalary: " + this.salary + "\nThis manager manages the team of " + this.teamSize + " people.\n");
    }
}

// definition of Developer class that inherits the Employee class
class Developer extends Employee {
    // declaring the attributes of this class
    private String programmingLanguage;

    // created a parameterized constructor to provide the attributes with user defined values
    Developer(String name, String id, float salary, String programmingLanguage) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.programmingLanguage = programmingLanguage;
    }

    // overriding the displayDetails method
    @Override
    protected void displayDetails() {
        System.out.println("Name of developer: " + this.name + "\nID: " + this.id + "\nSalary: " + this.salary + "\nThis Developer works on " + this.programmingLanguage + " programming language.\n");
    }
}

// definition of Intern class that inherits the Employee class
class Intern extends Employee {
    // declaring the attributes of this class
    private int internshipPeriodInMonths;

    // created a parameterized constructor to provide the attributes with user defined values
    Intern(String name, String id, float salary, int internshipPeriodInMonths) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.internshipPeriodInMonths = internshipPeriodInMonths;
    }

    // overriding the displayDetails method
    @Override
    protected void displayDetails() {
        System.out.println("Name of developer: " + this.name + "\nID: " + this.id + "\nSalary: " + this.salary + "\nThis intern will be serving the organization for " + this.internshipPeriodInMonths + "months.\n");
    }
}

// definition of EmployeeManagementSystem class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // created the object of Employee class and calling the displayDetails method
        Employee employee = new Employee();
        employee.displayDetails();

        // created an object of Manager class
        Manager employee1 = new Manager("Aayush", "M01", 1000.0f, 15);
        employee1.displayDetails(); // calling the overridden function

        // created an object of Developer class
        Developer employee2 = new Developer("Kumar", "D01", 750.0f, "Java");
        employee2.displayDetails(); // calling the overridden function

        // created an object of Intern class
        Intern employee3 = new Intern("Ashu", "I01", 300.0f, 3);
        employee3.displayDetails(); // calling the overridden function

    }
}
