import java.util.Scanner;

// definition of Circle class
class Circle{
	// created the attributes of this class which is a double variable radius
    double radius;

    // parameterized contructor to initialize radius
    public Circle(double radius){
        this.radius = radius;
    }

    // defined the method to print area of circle
    public void printArea(){
        // area of circle = pi * radius * radius
        System.out.println("Area of circle : " + Math.PI * radius * radius);
    }
}

// definition of AreaOfCircle class
public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in); // object of scanner class
        // input radius
        double radius = sc.nextDouble();

        // creating instance of a class using object
        Circle circle = new Circle(radius);
        // calling printArea function from class Circle
        circle.printArea(); 
		
		sc.close(); // closing the scanner object
    }
}
