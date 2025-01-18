import java.util.Scanner;

// definition of MobilePhone class
class MobilePhone{
	
	// definition of attributes of this class
    String brand, model;
    int price;

    // parameterized constructor to initialize attributes
    public MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // created the method to display mobile details
    public void displayDetails(){
        System.out.println("Brand name : " + brand);
        System.out.println("Model name : " + model);
        System.out.println("Price : " + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // input data
        String brand = sc.next();
        String model = sc.next();
        int price = sc.nextInt();

        // initialize class using object
        MobilePhone mobile = new MobilePhone(brand, model, price);

        // calling method to print details of mobile
        mobile.displayDetails();
		
		sc.close(); // closing the scanner object
    }
}
