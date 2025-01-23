// definition of Student class
public class Student {
    // declaring the attributes of this class
    private String name, id;
    private Subject subject1 = new Subject("", ""); // demonstrating aggregation between Student and Subject objects
    private Subject subject2 = new Subject("", "");
    private Subject[] subjects = {subject1, subject2};
    private float[] marks;

    // created a parameterized constructor to provide attributes with user defined values
    Student(String name, String id, float[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // definition of main function
    public static void main(String[] args) {
        // defining marks for student
        float[] marks = {90f, 95f};

        // created the object of Student class
        Student student1 = new Student("john", "1", marks);

        // created an object of GradeCalculator class
        GradeCalculator gradeCalculator1 = new GradeCalculator();

        // printing the grade of the student1
        System.out.println("grade of " + student1.name + " is: " + gradeCalculator1.calculateGrade(marks));
    }
}

// definition of Subject class
class Subject {
    // declaring the attributes of this class
    private String name, id;

    // created a parameterized constructor to provide attributes with user defined values
    Subject(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

// definition of GradeCalculator class
class GradeCalculator {
    // defining the behaviour of this class
    public String calculateGrade(float[] marks) {
        float totalScore = 0;

        // iterating through marks
        for (int i = 0; i < marks.length; i++) {
            totalScore += marks[i];
        }

        // returning the grade according to the total score
        return (totalScore >= 150f)? "A" :(totalScore >= 100)? "B":(totalScore >= 66)? "C" : "F";
    }
}