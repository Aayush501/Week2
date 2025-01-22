// importing required packages for using ArrayList and List
import java.util.ArrayList;
import java.util.List;

// definition of Faculty class to represent individual faculty members
class Faculty {
    private String name;  // stores the name of the faculty member

    // parameterized constructor to initialize the name of the faculty member
    public Faculty(String name) {
        this.name = name;  // assigning the name to the instance variable
    }

    // getter method to retrieve the name of the faculty member
    public String getName() {
        return name;  // returning the faculty member's name
    }
}

// definition of Department class to represent departments in the university
class Departmentt {
    private String name;  // stores the name of the department
    private List<Faculty> faculties;  // list to store the faculty members of this department

    // parameterized constructor to initialize the department's name and the faculty list
    public Departmentt(String name) {
        this.name = name;  // assigning the department name to the instance variable
        this.faculties = new ArrayList<>();  // initializing an empty faculty list
    }

    // method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);  // adding the faculty member to the department's faculty list
    }

    // getter method to retrieve the department's name
    public String getName() {
        return name;  // returning the department's name
    }

    // getter method to retrieve the list of faculty members
    public List<Faculty> getFaculties() {
        return faculties;  // returning the list of faculties in the department
    }
}

// definition of University class to represent the university containing departments
class University {
    private String name;  // stores the name of the university
    private List<Departmentt> Departmentts;  // list to store the departments in the university

    // parameterized constructor to initialize the university's name and department list
    public University(String name) {
        this.name = name;  // assigning the university name to the instance variable
        this.Departmentts = new ArrayList<>();  // initializing an empty department list
    }

    // method to add a department to the university
    public void addDepartmentt(Departmentt Departmentt) {
        Departmentts.add(Departmentt);  // adding a department to the university's department list
    }

    // getter method to retrieve the university's name
    public String getName() {
        return name;  // returning the university's name
    }

    // getter method to retrieve the list of departments in the university
    public List<Departmentt> getDepartmentts() {
        return Departmentts;  // returning the list of departments in the university
    }

    // method to delete the university, which also deletes all associated departments (composition)
    public void deleteUniversity() {
        Departmentts.clear();  // clearing the department list, effectively deleting all departments
    }
}

// main class to demonstrate aggregation and composition relationships in a university system
public class FacultyAndDepartment {
    public static void main(String[] args) {
        // creating Faculty members
        Faculty faculty1 = new Faculty("Faculty-1");  // creating a Faculty object
        Faculty faculty2 = new Faculty("Faculty-2");  // creating another Faculty object

        // creating Departments
        Departmentt csDepartmentt = new Departmentt("Computer Science");  // creating Computer Science department
        Departmentt mathDepartmentt = new Departmentt("Mathematics");  // creating Mathematics department

        // adding Faculty members to respective Departments
        csDepartmentt.addFaculty(faculty1);  // adding faculty1 to the Computer Science department
        mathDepartmentt.addFaculty(faculty2);  // adding faculty2 to the Mathematics department

        // creating University object
        University university = new University("University-Technological");  // creating the university

        // adding Departments to the University
        university.addDepartmentt(csDepartmentt);  // adding Computer Science department to the university
        university.addDepartmentt(mathDepartmentt);  // adding Mathematics department to the university

        // displaying the details of the university, departments, and faculties
        System.out.println("University: " + university.getName());  // displaying the university name
        for (Departmentt dept : university.getDepartmentts()) {  // iterating over each department in the university
            System.out.println("Department: " + dept.getName());  // displaying department name
            for (Faculty faculty : dept.getFaculties()) {  // iterating over each faculty member in the department
                System.out.println("Faculty: " + faculty.getName());  // displaying faculty member name
            }
        }

        // deleting the university and its associated departments (demonstrating composition)
        university.deleteUniversity();  // deleting the university, which removes all departments
        System.out.println("University deleted. Departments: " + university.getDepartmentts().size());  // confirming the deletion of departments

        // Faculty members still exist independently (demonstrating aggregation)
        System.out.println("Independent Faculty: " + faculty1.getName());  // displaying faculty1 name independently
        System.out.println("Independent Faculty: " + faculty2.getName());  // displaying faculty2 name independently
    }
}
