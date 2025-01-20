//Sample Program 4: Shopping Cart System
//Create a Product class to manage shopping cart items with the following features:
//Static:
//A static variable discount shared by all products.
//A static method updateDiscount() to modify the discount percentage.
//This:
//Use this to initialize productName, price, and quantity in the constructor.
//        Final:
//Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
//Instanceof:
//Validate whether an object is an instance of the Product class before processing its details.


import java.util.Scanner;

// definition of Product Class
class Product {
    // declaring the attributes of this class
    // declaring attributes private to ensure data security
    static float discount;
    private String productName;
    private final String productID;
    private float price;
    private int quantity;

    // created a parameterized constructor to provide the attributes with user-defined values
    Product (String productName, String productID, float price, int quantity) {
        // using this keyword to resolve ambiguity
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    // created a static method to update the value of discount
    static void updateDiscount(float discount) {
        Product.discount = discount;
    }

    // created a method to calculate the discounted price of the product
    private float calculateDiscountedPrice(){ // private to ensure data security
        float totalPrice = price * quantity; // calculation for total price

        // discount = discount% * (total price / 100)
        // discounted price = total price - discount
        return totalPrice - (discount * (totalPrice / 100));
    }

    // created a method to display the details of the product
    void displayProductDetails() {
        System.out.println("Product: " + this.productName + ", ID: " + this.productID + ", Price: " + this.price + ", Quantity: " + this.quantity);
        System.out.println("Discounted price: " + calculateDiscountedPrice());
    }
}

// definition of ShoppingCartProgram Class
public class ShoppingCartProgram {
    public static void main(String[] args) {
        // created object of scanner class to get the input from user
        Scanner sc = new Scanner(System.in);

        // created an integer variable noOfProducts and taking input for that
        System.out.println("Enter the number of products you want to add:");
        int noOfProducts = sc.nextInt();

        // created an array of objects of Product class of size noOfProducts
        Product[] products = new Product[noOfProducts];

        // taking input for the attributes for the objects from the user using for loop
        for (int i = 0; i < noOfProducts; i++) {
            // created variables to store the values of the attributes
            String productName, productID;
            float price;
            int quantity;

            // taking inputs from user for the quantities
            System.out.print("Enter Name of the Product: ");
            productName = sc.nextLine(); // to avoid problems while taking inputs
            productName = sc.nextLine(); // it can contain spaces

            System.out.print("Enter ID of the Product: ");
            productID = sc.next(); // it should not contain spaces

            System.out.print("Enter Price of the Product: ");
            price = sc.nextFloat();

            System.out.print("Enter Quantity of the Product: ");
            quantity = sc.nextInt();

            products[i] = new Product(productName, productID, price, quantity);

            System.out.println();
        }

        // taking input for discount percentage
        System.out.println("Enter Discount Percentage:");
        float discount = sc.nextFloat();

        // updating the value of discount
        Product.updateDiscount(discount);

        // displaying details of products
        for (int i = 0; i < noOfProducts; i++) {
            if(products[i] instanceof Product){
                products[i].displayProductDetails();
            }
        }
    }
}