// definition of Customer class
public class Customer {
    /* declaring the attributes of this class
       declaring attributes private for data security */
    private String name;
    private Product[] purchases;
    private int[] quantities;

    // created a parameterized constructor to provide attributes with user defined values
    Customer(String name, Product[] purchases, int[] quantities) {
        this.name = name;
        this.purchases = purchases; // representing the composition
        this.quantities = quantities;
    }

    // definition of main function
    public static void main(String[] args) {
        // defining the values of the attributes
        String name = "Alice";
        Product product1 = new Product("Apple", "A1", 3.0);
        Product product2 = new Product("Milk", "M2", 2.0);
        Product[] purchases = {product1, product2};
        int[] quantities = {2,1};

        BillGenerator bill = new BillGenerator(); // representation of aggregation
        Customer customer1 = new Customer(name, purchases, quantities);

        // displaying the bill of the customer1
        System.out.println("total bill = $" + bill.generateBill(purchases, quantities));
    }
}

// definition of Product class
class Product {
    // declaring the attributes of this class
    private String name, id;
    Double price;

    // created a parameterized constructor to provide attributes with user defined values
    Product(String name, String id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
}

// definition of BillGenerator class
class BillGenerator {
    // defining the behaviour of this class
    public double generateBill(Product[] purchases, int [] quantities) { // object of Product class as a parameter shows association between BillGenerator and Product
        double totalBill = 0;

        for (int i = 0; i < purchases.length; i++) {
            totalBill += purchases[i].price * quantities[i];
        }

        return totalBill;
    }
}