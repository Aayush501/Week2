// definition of Vehicle class
class Vehicle {
    // declaring the attributes of this class
    static double registrationFee = 500.0; // shared registration fee for all vehicles
    private final String registrationNumber;  // final variable to ensure registration number immutability
    private String ownerName;
    private String vehicleType;
    // kept attributes private to ensure data security

    // created a parameterized constructor to provide the attributes with user-defined values
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // created a static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // created a method to display the vehicle registration details
    void displayVehicleDetails() {
        System.out.println("Registration Number: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
    }
}

// definition of VehicleRegistrationProgram class
public class VehicleRegistrationProgram {
    public static void main(String[] args) {
        // created array of objects of Vehicle class
        Vehicle[] vehicles = new Vehicle[3];

        // initializing the objects with user-defined values
        vehicles[0] = new Vehicle("Reg001", "Person-1", "Car");
        vehicles[1] = new Vehicle("Reg002", "Person-2", "Bike");
        vehicles[2] = new Vehicle("Reg003", "Person-3", "Truck");

        // updating the registration fee
        Vehicle.updateRegistrationFee(1000.0);

        // displaying the details of vehicles if they are objects of Vehicle class
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Vehicle) { // using instanceof operator to check if object is an instance of Vehicle class
                vehicle.displayVehicleDetails();
            }
        }
    }
}
