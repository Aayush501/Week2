import java.util.ArrayList;
import java.util.List;

// definition of Product class to represent individual products
class Product {
    private String name;  // stores the name of the product
    private double price; // stores the price of the product

    // created a parameterized constructor to initialize product attributes
    public Product(String name, double price) {
        this.name = name;   // assigning name to instance variable
        this.price = price; // assigning price to instance variable
    }

    // created a method to get the product name
    public String getName() {
        return name;
    }

    // created a method to get the product price
    public double getPrice() {
        return price;
    }
}

// definition of Order class to aggregate multiple Product objects
class Order {
    private List<Product> products; // list to store product objects
    private Customerr customer;      // stores the associated customer

    // created a constructor to initialize order attributes
    public Order(Customerr customer) {
        this.customer = customer;      // assigning customer to instance variable
        this.products = new ArrayList<>(); // initializing empty product list
    }

    // created a method to add a product to the order
    public void addProduct(Product product) {
        products.add(product); // adding product to the list
    }

    // created a method to get the list of products in the order
    public List<Product> getProducts() {
        return products;
    }

    // created a method to get the associated customer
    public Customerr getCustomer() {
        return customer;
    }

    // created a method to calculate total order price by summing product prices
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// definition of Customerr class to represent customers placing orders
class Customerr {
    private String name; // stores the customer's name
    private List<Order> orders; // list to store customer orders

    // created a constructor to initialize customer attributes
    public Customerr(String name) {
        this.name = name;      // assigning name to instance variable
        this.orders = new ArrayList<>(); // initializing empty order list
    }

    // created a method to get the customer's name
    public String getName() {
        return name;
    }

    // created a method to place an order by adding it to the list
    public void placeOrder(Order order) {
        orders.add(order); // adding order to the list
    }

    // created a method to get the list of placed orders
    public List<Order> getOrders() {
        return orders;
    }
}

// definition of Ecommerce class to demonstrate the order process
public class ECommerce {
    public static void main(String[] args) {
        // creating a customer
        Customerr customer = new Customerr("Customer-A");

        // creating product objects with name and price
        Product product1 = new Product("Product-A", 1000.00);
        Product product2 = new Product("Product-B", 2000.00);

        // creating an order associated with the customer
        Order order = new Order(customer);

        // adding products to the order
        order.addProduct(product1);
        order.addProduct(product2);

        // placing the order for the customer
        customer.placeOrder(order);

        // displaying customer details and order summary
        System.out.println("Customer: " + customer.getName());
        System.out.println("Order Total: " + order.getTotalPrice());
        System.out.println("Products in the Order:");
        for (Product product : order.getProducts()) {
            System.out.println("- " + product.getName() + ":  " + product.getPrice());
        }
    }
}
