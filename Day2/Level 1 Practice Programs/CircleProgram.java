// definition of Circle class
class Circle {

    // declaring the attributes of this class
    // declaring the attributes as private to maintain the data security
    private float radius;

    // creating the non-parameterized constructor
    Circle () {
        // assigning default value to the attribute
        this.radius = 0.0f;
//        // displaying the value of the attribute
//        System.out.println("By non-parameterized constructor: ");
//        System.out.println("\tradius: " + this.radius);

        // assigning value to the attribute using constructor chaining
        this(100.0f);
    }

    // creating the parameterized constructor
    Circle (float radius) {
        // assigning actual value to the attribute
        this.radius = radius;

        // displaying the value of the attribute
        System.out.println("By non-parameterized constructor: ");
        System.out.println("\tradius: " + this.radius);
    }
}

// definition of CircleProgram class
public class CircleProgram {
    public static void main(String[] args) {
        // creating the object of Circle class
        Circle Circle = new Circle(); // default values to the variable should have been assigned
    }
}
