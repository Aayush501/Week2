import java.util.Scanner; // importing Scanner class

// definition of Student class
class Student {
	// created the attributes of Student
	// keeping attributes private to maintain data security
	private String name, rollNumber, grade;
	private double physicsMarks, chemistryMarks, mathsMarks, totalMarks, percentage;
	
	// created the method setAttributes to set the values of attributes
	public void setAttributes(String name, String rollNumber, double[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		physicsMarks = marks[0];
		chemistryMarks = marks[1];
		mathsMarks = marks[2];
	}
	
	// created the method to calculate the grade and result of the student
	private void calculateGrade() {
		totalMarks = physicsMarks + chemistryMarks + mathsMarks;
		percentage = ( totalMarks / 300.0 ) * 100; // percentage = ( gained marks / maximum marks ) * 100
		grade = (percentage < 33)? "F" :(percentage < 40)? "D" :(percentage < 55)? "C" :(percentage < 60)? "C+" :(percentage < 65)? "B" :(percentage < 70)? "B+" :(percentage < 85)? "A" :(percentage < 95)? "A+" : "A++";
	}
	
	// created the method to display the grade and result of the student
	public void displayGrade() {
		calculateGrade(); // grade and result calculated
		
		// displaying the grade and result
		System.out.println("Total marks: " + totalMarks + "\nPercentage: " + percentage + "\nGrade: " + grade);
	}
}


// definition of StudentReport class
public class StudentReport {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, noOfStudents, and taking input for that 
		// this variable stores the number of students for which the report is required
		int noOfStudents = input.nextInt();
		
		// created an array of Student class objects
		Student [] students = new Student[noOfStudents];
		
		// taking inputs for each student's attributes
		for (int i=0; i < noOfStudents; i++) {
			// created two variables, name and rollNumber, and an array to store the marks of student in various subjects
			String name, rollNumber;
			double [] marks = new double [3];
			
			// taking inputs for the attributes
			String empty = input.nextLine(); // to clear the buffer
			System.out.print("name: ");
			name = input.nextLine();
			
			System.out.print("Roll Number: ");
			rollNumber = input.next();
			
			System.out.println("Enter marks for physics, chemistry, and maths respectively: ");
			marks[0] = input.nextDouble();
			marks[1] = input.nextDouble();
			marks[2] = input.nextDouble();
			
			// initializing and setting the attributes for this student
			students[i] = new Student();
			students[i].setAttributes(name, rollNumber, marks);
			
			// displaying the result for this student
			students[i].displayGrade();
			
			System.out.println();
		}
		
		input.close(); // closing the scanner object
	}
}