//    Static:
//      A static variable universityName shared across all students.
//      A static method displayTotalStudents() to show the number of students enrolled.
//    This:
//      Use this in the constructor to initialize name, rollNumber, and grade.
//    Final:
//      Use a final variable rollNumber for each student that cannot be changed.
//    Instanceof:
//      Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.


import java.util.Scanner;
import java.util.SortedMap;

// definition of Student Class
class Student {
    // declaring the attributes of this class
    static String universityName = "University-Static";
    static int totalStudents = 0;
    private String name, grade;
    private final String rollNumber;
    // kept variables private to maintain data security

    // created a parameterized constructor to provide attributes with user defined values
    Student(String name, String rollNumber) {
        // using this to avoid ambiguity
        this.name = name;
        this.rollNumber = rollNumber;
        totalStudents++;
    }

    // created a method to display the name of the university
    static void displayUniversityName() {
        System.out.println("University Name : " + universityName);
    }

    // created a static method to display the total number of students
    static void displayTotalStudents() {
        System.out.println("Total enrolled students: " + totalStudents);
    }

    // created a method to update the grade of the student
    void updateGrade(String grade) {
        this.grade = grade;
    }

    // created a method to display the details of the students
    void displayStudentDetails() {
        System.out.println("Name: " + this.name + ", Roll Number: " + this.rollNumber + ", Grade: " + this.grade);
    }
}

// definition of StudentManagement class
public class StudentManagement {
    public static void main(String[] args) {
        // created the object of scanner class
        Scanner sc = new Scanner(System.in);

        // created an integer variable noOfStudents and taking input for that
        int noOfStudents = sc.nextInt();

        // created an array of objects of Student class of size noOfStudents
        Student[] students = new Student[noOfStudents];

        // taking input for the attributes of the objects from user
        for (int i = 0; i < noOfStudents; i++) {
            // created variables and taking input for them to get the attributes of objects
            System.out.print("Enter Name: ");
            String name = sc.nextLine(); // to avoid problems while taking inputs
            name = sc.nextLine(); // it can contain spaces

            System.out.print("Enter Roll Number: ");
            String rollNo = sc.next();

            System.out.print("Enter Grade: ");
            String grade = sc.next();

            students[i] = new Student(name,rollNo);
            students[i].updateGrade(grade);
        }

        // displaying details
        Student.displayUniversityName();
        Student.displayTotalStudents();

        for (int i = 0; i < noOfStudents; i++) {
            if (students[i] instanceof Student) {
                students[i].displayStudentDetails();
            }
        }
    }
}
