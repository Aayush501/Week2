// definition of Animal class
class Animal {
    // declaring the attributes of this class
    protected String name;
    protected int age;

    // defining the behaviour of this class
    protected void makeSound(){
        System.out.println("Animal makes some sound.");
    }
}

// definition of Dog class that inherits the Animal class
class Dog extends Animal {
    // created a parameterized constructor to provide the attributes with user defined values
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // overriding the makeSound method
    @Override
    protected void makeSound() {
        System.out.println(this.name + " barks.");
    }

    // displaying the attributes of dog
    public void displayDog() {
        System.out.println(this.name + " is a dog and it's age is " + this.age);
    }
}

// definition of Cat class that inherits the animal class
class Cat extends Animal {
    // created a parameterized constructor to provide the attributes with user defined values
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // overriding the makeSound method
    @Override
    protected void makeSound() {
        System.out.println(this.name + " meows.");
    }

    // displaying the attributes of dog
    public void displayCat() {
        System.out.println(this.name + " is a cat and it's age is " + this.age);
    }
}

// definition of Bird class that inherits the animal class
class Bird extends Animal {
    // created a parameterized constructor to provide the attributes with user defined values
    Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // overriding the makeSound method
    @Override
    protected void makeSound() {
        System.out.println(this.name + " chirps.");
    }

    // displaying the attributes of dog
    public void displayBird() {
        System.out.println(this.name + " is a bird and it's age is " + this.age);
    }
}

// definition of AnimalHierarchy class
public class AnimalHierarchy {
    public static void main(String[] args) {
        // created the object of Animal class and calling the makeSound method
        Animal animal = new Animal(); // this prints "Animal makes some sound"

        // created an object of Dog class
        Dog dog = new Dog("fluffy", 3);
        dog.displayDog();
        dog.makeSound(); // calling the overridden function

        // created an object of Cat class
        Cat cat = new Cat("kukku", 2);
        cat.displayCat();
        cat.makeSound(); // calling the overridden function

        // created an object of Bird class
        Bird sparrow = new Bird("chi-chi", 1);
        sparrow.displayBird();
        sparrow.makeSound(); // calling the overridden function

    }
}
