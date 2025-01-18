import java.util.Arrays;
import java.util.Scanner;

class CartItem {
    // defined the attributes of this class
    static String[] availableItems = {"Item-A", "Item-B", "Item-C", "Item-D", "Item-E", "Item-F", "Item-G", "Item-H"}; // will be  defined by admin
    static double[] costOfItems = {110, 120, 130, 140, 150, 160, 170, 180}; // will be  defined by admin
    private int[] quantities = {0,0,0,0,0,0,0,0};
    private String[] cartItems = {"","","","","","","",""};

    // defining a method to add an item to the cart
    public void addToCart() {
        System.out.println("Available items: " + Arrays.toString(availableItems));
        System.out.println("Which item do you want to add to cart?");
        Scanner scanner = new Scanner(System.in); // object of scanner class
        String item = scanner.nextLine(); // taking input for the item to be added
        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt(); // taking input for quantity

        boolean checked = true; // to check if item is already in cart or not
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].equals(item)) {
                quantities[i] += quantity;
                checked = false;
                break;
            }
        }
        if (checked) { // if item is not already in cart
            for (int i = 0; i < availableItems.length; i++) {
                if (availableItems[i].equals(item)) {
                    quantities[i] += quantity;
                    cartItems[i] = item;
                    break;
                }
            }
        }
        System.out.println("Item added to cart successfully");
    }

    // defining a method to remove an item from the cart
    public void removeFromCart() {
        System.out.println("Items in cart are:" + Arrays.toString(cartItems));
        System.out.println("Which item do you want to remove?");
        Scanner sc = new Scanner(System.in); // object of scanner class
        String item = sc.nextLine(); // taking input for the item to be removed

        // iterating through cartItems to remove the desired item from cart
        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].equals(item)) {
                quantities[i]--;
                if(quantities[i] == 1) {
                    cartItems[i] = ""; // removing the item
                }
            }
        }
        System.out.println("Item removed from cart successfully");
    }

    // defining a method to get the total cost from the cart
    public void viewTotalCost() {
        System.out.println("Your Bill");

        //iteration to get the printed bill
        double totalCost = 0; // integer variable to get the total cost
        for (int i = 0; i < cartItems.length; i++) {
            if (!cartItems[i].equals("")) {
                System.out.println("item: " + cartItems[i] + " quantity: " + quantities[i] + " cost: " + costOfItems[i]);
                totalCost += quantities[i] * costOfItems[i];
            }
        }
        System.out.println("Total cost: " + totalCost); // printing the total cost
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class
        CartItem  ci = new CartItem(); // object of CartItem class

        // running this program till user prompts to exit program
        try {
            while(true) { // so that user can use functionalities multiple times
                // created an integer variable to let user choose the functionality, that user wants to use
                int functionality;

                System.out.println("Choose: \n1 => for adding an item into cart\n2 => for removing an item from cart\n3 => for displaying total cost\n4 => to exit this program");
                functionality = sc.nextInt(); // taking input for functionality

                switch (functionality) { // calling function according to chosen functionality
                    case 1 :
                        ci.addToCart();
                        break;
                    case 2 :
                        ci.removeFromCart();
                        break;
                    case 3 :
                        ci.viewTotalCost();
                        break;
                    case 4 :
                        throw new RuntimeException();
                    default :
                        System.out.println("not a valid choice");
                }
            }
        } catch (Exception e) {
            sc.close(); // closing the scanner object
            System.out.println("program finished");
        }
    }
}