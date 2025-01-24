// definition of Vehicle class
class Vehicle {
    // declaring the attributes of this class
    protected String model;
    protected float maxSpeed;
}

// definition of Refuelable interface
interface Refuelable {
    void refuel();
}

// definition of PetrolVehicle class that extends Vehicle class and implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {

    // created a parameterized constructor
    PetrolVehicle(String model, float maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // overriding the refuel method
    @Override
    public void refuel() {
        System.out.println(this.model +" has " + this.maxSpeed + " max speed and is a PetrolVehicle and is now refueled.");
    }
}

// definition of ElectricVehicle class that extends Vehicle class
class ElectricVehicle extends Vehicle {

    // created a parameterized constructor
    ElectricVehicle(String model, float maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // created a method to recharge the vehicle
    public void charge() {
        System.out.println(this.model +" has " + this.maxSpeed + " max speed and is a ElectricVehicle and is now recharged.");
    }
}

// definition of VehicleManagementSystem class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // created the objects of all subclasses of Vehicle class
        PetrolVehicle vehicle1 = new PetrolVehicle("Model-1", 100.0f);
        ElectricVehicle vehicle2 = new ElectricVehicle("Model-2", 100.0f);

        // displaying details of all vehicles
        vehicle1.refuel();
        vehicle2.charge();
    }
}