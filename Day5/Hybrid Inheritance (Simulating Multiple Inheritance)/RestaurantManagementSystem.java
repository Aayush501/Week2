// definition of Person class
class Person {
    // declaring the attributes of this class
    protected String name, id;
}

// definition of Worker interface
interface Worker {
    void performDuties();
}

// definition of Chef class that extends Person class and implements Worker
class Chef extends Person implements Worker {

    // created a parameterized constructor
    Chef(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // overriding the performDuties method
    @Override
    public void performDuties() {
        System.out.println(this.name +" with ID " + this.id + " is a chef and cooks food.");
    }
}

// definition of Waiter class that extends Person class and implements Worker
class Waiter extends Person implements Worker {

    // created a parameterized constructor
    Waiter(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // overriding the performDuties method
    @Override
    public void performDuties() {
        System.out.println(this.name +" with ID " + this.id + " is a waiter and serves food.");
    }
}

// definition of RestaurantManagementSystem class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // created the objects of all subclasses of Person class
        Chef worker1 = new Chef("Worker-1", "C-01");
        Waiter worker2 = new Waiter("Worker-2", "W-01");

        // displaying details of all workers
        worker1.performDuties();
        worker2.performDuties();
    }
}