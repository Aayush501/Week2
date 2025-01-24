// definition of Course class
class Course {
    // declaring the attributes of this class
    protected String courseName;
    protected int durationInMonths;

    // created a parameterized constructor to provide attributes with user defined values
    Course(String courseName, int durationInMonths) {
        this.courseName = courseName;
        this.durationInMonths = durationInMonths;
    }
}

// definition of OnlineCourse class which inherits the Course class
class OnlineCourse extends Course {
    // declaring the attributes of this class
    protected String platform;
    protected boolean isRecorded;

    // created a parameterized constructor to provide attributes with user defined values
    OnlineCourse(String courseName, int courseDurationInMonths, String platform, boolean isRecorded) {
        super(courseName, courseDurationInMonths);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

// definition of PaidOnlineCourse class which inherits the Course class
class PaidOnlineCourse extends OnlineCourse {
    // declaring the attributes of this class
    private double fee, discountPercentage;

    // created a parameterized constructor to provide attributes with user defined values
    PaidOnlineCourse(String courseName, int courseDurationInMonths, String platform, boolean isRecorded, double fee, double discountPercentage) {
        super(courseName, courseDurationInMonths, platform, isRecorded);
        this.fee = fee;
        this.discountPercentage = discountPercentage;
    }

    // defining a method to get the discounted fee
    private double getDiscountedFee(double fee, double discountPercentage) {
        return fee-((fee*discountPercentage)/100);
    }

    // defining the behaviour of this class
    public void getCourseDetails() {
        System.out.println("Name of the course: " + this.courseName + "\nDuration: " + this.durationInMonths + "months\nPlatform: " + this.platform + "\nIs this course recorded: " + ((this.isRecorded)? "Yes" : "No") + "\nActual fee: " + this.fee + "Rs.\nDiscount: " + this.discountPercentage + "%\nDiscounted fee: " + getDiscountedFee(this.fee, this.discountPercentage) + "Rs.");
    }
}

// definition of EducationalCourseHierarchy class
public class EducationalCourseHierarchy {
    public static void main(String[] args)  {
        /*
            created object of PaidOnlineCourse class and providing values of all required attributes
            this object creation will follow a multilevel inheritance hierarchy
            this object creation will provide us with the details of the course
        */
        PaidOnlineCourse course1 = new PaidOnlineCourse("Java", 3, "Google Classroom", true, 5000, 18);

        // getting the details of the course
        course1.getCourseDetails();
    }
}