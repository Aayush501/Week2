// definition of Person class
class Person {
    // declaring the attributes of this class
    // declaring the attributes as private to maintain the data security
    private String name, address, contact;

    // declaring the non-parameterized constructor
    Person() {
        name = "Person1";
        address = "Person Address";
        contact = "1234567890";

        // displaying the attributes
        System.out.println("attributes of person " + this);
        System.out.println("name: " + this.name + ", address: " + this.address + ", contact: " + this.contact);
    }

    // declaring the copy constructor
    Person(Person obj) {
        this.name = obj.name;
        this.address = obj.address;
        this.contact = obj.contact;

        // displaying the attributes
        System.out.println("attributes of person " + this);
        System.out.println("name: " + this.name + ", address: " + this.address + ", contact: " + this.contact);
    }
}

// definition of PersonProgram class
public class PersonProgram {
    public static void main(String[] args) {
        // creating the objects of Person class
        Person person1 = new Person(); // default values to the attributes should have been assigned
        Person person2 = new Person(person1); // assigning same attributes as person1 to person2
    }
}
