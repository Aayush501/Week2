// definition of HotelBooking class
class HotelBooking {
    // declaring the attributes of this class
    // declaring the attributes as private to maintain the data security
    private  String guestName, roomType;
    private int nights;

    // creating non-parameterized constructor to provide attributes with default values
    HotelBooking() {
        guestName = "Guest1";
        roomType = "AC";
        nights = 4;

        // displaying the values of the attributes
        System.out.println("attributes of " + this);
        System.out.println("Guest name: " + this.guestName + "\nroom type: " + this.roomType + "\nnights: " + this.nights);
    }

    // creating parameterized constructor to provide attributes with user defined values
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;

        // displaying the values of the attributes
        System.out.println("attributes of " + this);
        System.out.println("Guest name: " + this.guestName + "\nroom type: " + this.roomType + "\nnights: " + this.nights);
    }

    // creating copy constructor to provide attributes with user defined values
    HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;

        // displaying the values of the attributes
        System.out.println("attributes of " + this);
        System.out.println("Guest name: " + this.guestName + "\nroom type: " + this.roomType + "\nnights: " + this.nights);
    }
}

// definition of HotelBookingProgram class
public class HotelBookingProgram {
    public static void main(String[] args) {
        // creating object of HotelBooking using non-parameterized constructor
        HotelBooking guest1 = new HotelBooking(); // guest1 has default values for attributes
        HotelBooking guest2 = new HotelBooking("guest2", "Non-AC", 6); // guest2 has user defined values for attributes
        HotelBooking guest3 = new HotelBooking(guest1); // guest1 has guest1 like values for attributes
    }
}