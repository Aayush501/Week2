
import java.util.ArrayList;
import java.util.List;

// created a School class to represent a school entity
class School
{
    private String name; // declaring private attribute for school name
    private List<Student> students; // declaring private attribute to store student objects

    // created a parameterized constructor to get the school name from the user
    public School(String name)
    {
        this.name = name;
        this.students = new ArrayList<>(); // initializing the students list
    }

    // created a method to add a student to the school
    public void addStudent(Student student)
    {
        students.add(student);
    }

    // created a method to get the list of students
    public List<Student> getStudents()
    {
        return students;
    }

    // created a method to get the name of the school
    public String getName()
    {
        return name;
    }
}

// created a Student class to represent student entity
class Student
{
    private String name; // declaring private attribute for student name
    private List<Course> courses; // declaring private attribute to store course objects

    // created a parameterized constructor to get the student name from the user
    public Student(String name)
    {
        this.name = name;
        this.courses = new ArrayList<>(); // initializing the courses list
    }

    // created a method to enroll the student in a course
    public void enroll(Course course)
    {
        courses.add(course);
        course.addStudent(this);
    }

    // created a method to view the list of enrolled courses
    public List<Course> viewCourses()
    {
        return courses;
    }

    // created a method to get the name of the student
    public String getName()
    {
        return name;
    }
}

// created a Course class to represent course entity
class Course
{
    private String name; // declaring private attribute for course name
    private List<Student> students; // declaring private attribute to store student objects

    // created a parameterized constructor to get the course name from the user
    public Course(String name)
    {
        this.name = name;
        this.students = new ArrayList<>(); // initializing the students list
    }

    // created a method to add a student to the course
    public void addStudent(Student student)
    {
        students.add(student);
    }

    // created a method to view the list of students enrolled in the course
    public List<Student> viewStudents()
    {
        return students;
    }

    // created a method to get the name of the course
    public String getName()
    {
        return name;
    }
}

// created a ManageSchool class to demonstrate the relationship between School, Student, and Course
public class ManageSchool
{
    public static void main(String[] args) {
        // created a School object
        School school = new School("School-A");

        // created Student objects
        Student student1 = new Student("Student-1");
        Student student2 = new Student("Student-2");

        // created Course objects
        Course course1 = new Course("Physics");
        Course course2 = new Course("Chemistry");

        // enrolling students in courses
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);

        // adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // displaying students in the school
        System.out.println("Students in " + school.getName() + ":");
        for (Student student : school.getStudents()) {
            System.out.println(student.getName());
        }

        // displaying courses of a specific student
        System.out.println("Courses of " + student1.getName() + ":");
        for (Course course : student1.viewCourses()) {
            System.out.println(course.getName());
        }

        // displaying students in a specific course
        System.out.println("Students in Physics course:");
        for (Student student : course1.viewStudents()) {
            System.out.println(student.getName());
        }
    }
}

