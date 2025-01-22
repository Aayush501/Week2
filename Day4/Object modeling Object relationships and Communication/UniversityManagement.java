import java.util.*;

// definition of UniversityManagement class to demonstrate student, professor, and course relationships
public class UniversityManagement {
    public static void main(String[] args) {
        // created an object of Student class to represent a student
        Students students = new Students("Student-A", "1");

        // created an object of Professor class to represent a professor
        Professor professor = new Professor("Professor-A", "Department-A");

        // created an object of Coursee class to represent a course
        Coursee course = new Coursee("A1", "Course-A");

        // enrolling the student into the course, demonstrating association
        students.enrollingCourse(course);

        // assigning the professor to the course, demonstrating aggregation
        professor.assigningCourse(course);

        // collectively printing details of student, professor, and course
        System.out.println(students);
        System.out.println(professor);
        System.out.println(course);
    }
}

// definition of Student class to represent individual students
class Students {
    String name;  // stores the name of the student
    private String studentId;  // stores the student ID
    private Coursee course;  // stores the enrolled course

    // created a parameterized constructor to initialize student attributes
    public Students(String name, String studentId) {
        this.name = name;  // assigning name to instance variable
        this.studentId = studentId;  // assigning student ID to instance variable
    }

    // created a method to enroll the student in a course
    public void enrollingCourse(Coursee course) {
        this.course = course;  // assigning course to the student
        course.addingStudent(this);  // adding student to the course
    }

    // overriding toString method to display student details
    @Override
    public String toString() {
        return "Student name = " + name + " , Student studentId = " + studentId + " , Student course = " + course.gettingCourseName();
    }
}

// definition of Professor class to represent individual professors
class Professor {
    String name;  // stores the name of the professor
    private String department;  // stores the department of the professor
    private Coursee course;  // stores the assigned course

    // created a parameterized constructor to initialize professor attributes
    public Professor(String name, String department) {
        this.name = name;  // assigning name to instance variable
        this.department = department;  // assigning department to instance variable
    }

    // created a method to assign a professor to a course
    public void assigningCourse(Coursee course) {
        this.course = course;  // assigning course to professor
        course.settingProfessor(this);  // setting professor for the course
    }

    // overriding toString method to display professor details
    @Override
    public String toString() {
        return "Professor name = " + name + " , Professor department = " + department + " , Professor's course = " + course.gettingCourseName();
    }
}

// definition of Coursee class to represent individual courses
class Coursee {
    private String courseCode;  // stores the course code
    private String courseName;  // stores the course name
    private Professor professor;  // stores the assigned professor
    private List<Students> students;  // list to store enrolled students

    // created a parameterized constructor to initialize course attributes
    public Coursee(String courseCode, String courseName) {
        this.courseCode = courseCode;  // assigning course code to instance variable
        this.courseName = courseName;  // assigning course name to instance variable
        this.students = new ArrayList<>();  // initializing empty student list
    }

    // created a method to set the professor for the course
    public void settingProfessor(Professor professor) {
        this.professor = professor;  // assigning professor to course
    }

    // created a method to add a student to the course
    public void addingStudent(Students students) {
        this.students.add(students);  // adding student to the list
    }

    // created a method to get the course name
    public String gettingCourseName() {
        return courseName;  // returning course name
    }

    // overriding toString method to display course details
    @Override
    public String toString() {
        return "Course Code = " + courseCode + " , Course Name = " + courseName + " , Professor = " + professor.name + ", Students = " + students.size();
    }
}
