// definition of Device class
class Device {
    // declaring the attributes of this class
    protected String deviceID, status;

    // defining the behaviour of this class
    protected void displayStatus(){
        System.out.println("This is a Device and it's attributes are undefined yet.");
    }
}

// definition of Thermostat class that extends the Device class
class Thermostat extends Device {
    // declaring the attributes of this class
    private String temperatureSetting;

    // created a parameterized constructor to provide attributes with user defined attributes
    Thermostat(String deviceID, String status, String temperatureSetting) {
        this.deviceID = deviceID;
        this.status = status;
        this.temperatureSetting = temperatureSetting;
    }

    // overriding displayInfo method
    @Override
    protected void displayStatus() {
        System.out.println("This is a thermostat whose ID is " + this.deviceID + ", and currently it is " + this.status + ", with the temperature setting of " + this.temperatureSetting);
    }
}

// definition of SmartHome class
public class SmartHome {
    public static void main(String[] args) {
        // created variables to define the attributes of Thermostat class
        String deviceID = "TH-01", status = "On", temperatureSetting = "Low";

        // created the object of Thermostat class and calling the overridden method
        Thermostat Thermostat1 = new Thermostat(deviceID, status, temperatureSetting);
        Thermostat1.displayStatus();
    }
}