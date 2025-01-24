// definition of Person class
class Person {
    // declaring the attributes of this class
    protected String name;
    protected int age;

    // defining the behaviour of this class
    protected void displayRole() {
        System.out.println("this is a Person class and its attributes are not defined yet!");
    }
}

// definition of Teacher class that extends Person class
class Teacher extends Person {
    // declaring the attributes of this class
    private String subject;

    // created a parameterized constructor
    Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    // overriding the displayRole() method
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    // created a method to display the details
    public void displayDetails() {
        System.out.println("Name: " + this.name + ", age: " + this.age + ", Subject: " + this.subject);
    }
}

// definition of Student class that extends Person class
class Student extends Person {
    // declaring the attributes of this class
    private String grade;

    // created a parameterized constructor
    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // overriding the displayRole() method
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // created a method to display the details
    public void displayDetails() {
        System.out.println("Name: " + this.name + ", age: " + this.age + ", grade: " + this.grade);
    }
}

// definition of Staff class that extends Person class
class Staff extends Person {
    // declaring the attributes of this class
    private float salary;

    // created a parameterized constructor
    Staff(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // overriding the displayRole() method
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // created a method to display the details
    public void displayDetails() {
        System.out.println("Name: " + this.name + ", age: " + this.age + ", Salary: " + this.salary);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        // created the objects of all subclasses of Person class
        Teacher person1 = new Teacher("Person-A", 25, "Java");
        Student person2 = new Student("Person-B", 15, "A");
        Staff person3 = new Staff("Person-C", 25, 20000);

        // displaying details of all persons
        person1.displayDetails();
        person1.displayRole();

        person2.displayDetails();
        person2.displayRole();

        person3.displayDetails();
        person3.displayRole();
    }
}