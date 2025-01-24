// definition of Vehicle class
class Vehicle {
    // declaring the attributes of this class
    protected float maxSpeed;
    protected String fuelType;

    // defining the behaviour of this class
    protected void displayInfo(){
        System.out.println("This is a Vehicle.\n");
    }
}

// definition of Car class that inherits the Vehicle class
class Car extends Vehicle {
    // declaring attributes of this class
    private int seatCapacity;
    private String name, model;

    // created a parameterized constructor to provide the attributes with user defined values
    Car(String name, String model, int seatCapacity, float maxSpeed, String fuelType) {
        this.name = name;
        this.model = model;
        this.seatCapacity = seatCapacity;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // overriding the displayInfo method
    @Override
    protected void displayInfo() {
        System.out.println("This is a car with these features: \n\tName: " + this.name + "\tModel: " + this.model + "\n\tSeat capacity: " + this.seatCapacity + "\n\tMax Speed: " + this.maxSpeed + " km/h\n\tFuel type: " + this.fuelType + "\n");
    }
}

// definition of Truck class that inherits the Vehicle class
class Truck extends Vehicle {
    // declaring the attributes of this class
    private String name, model;
    private float price;

    // created a parameterized constructor to provide the attributes with user defined values
    Truck(String name, String model, float price, float maxSpeed, String fuelType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // overriding the displayInfo method
    @Override
    protected void displayInfo() {
        System.out.println("This is a truck with these features:\n\tName: " + this.name + "\tModel: " + this.model + "\n\tPrice: " + price + "Rs.\n\tMax Speed: " + this.maxSpeed + " km/h\n\tFuel type: " + this.fuelType + "\n");
    }
}

// definition of MotorCycle class that inherits the Vehicle class
class MotorCycle extends Vehicle {
    // declaring the attributes of this class
    private float groundClearanceInMilliMeter;
    private String name, model;

    // created a parameterized constructor to provide the attributes with user defined values
    MotorCycle(String name, String model, float groundClearanceInMilliMeter, float maxSpeed, String fuelType) {
        this.name = name;
        this.model = model;
        this.groundClearanceInMilliMeter = groundClearanceInMilliMeter;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // overriding the displayInfo method
    @Override
    protected void displayInfo() {
        System.out.println("This is a motor cycle with these features:\n\tName: " + this.name + "\tModel: " + this.model + "\n\tGround clearance in milli-meter: " + this.groundClearanceInMilliMeter + "\n\tMax Speed: " + this.maxSpeed + " km/h\n\tFuel type: " + this.fuelType + "\n");
    }
}

// definition of VehicleAndTransportSystem class
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // created an object of Vehicle class
        Vehicle vehicle = new Vehicle();
        vehicle.displayInfo();

        // created an object of Car class and calling the overridden method
        Car vehicle1 = new Car("SuperCar", "S-C-1", 2, 398.7f, "Petrol");
        vehicle1.displayInfo();

        // created an object of Truck class and calling the overridden method
        Truck vehicle2 = new Truck("BigBull", "B-B-1", 3000000, 77.2f, "Diesel");
        vehicle2.displayInfo();

        // created an object of MotorCycle class and calling the overridden method
        MotorCycle vehicle3 = new MotorCycle("RoadMaster", "R-M-1", 178.1f, 189.1f, "Petrol");
        vehicle1.displayInfo();
    }
}
