import java.util.Scanner;

// definition of Taxable interface
interface Taxable {
    float calculateTax();
    void getTaxDetails();
}

// definition of abstract Product class
abstract class Product implements Taxable {
    // declaring the attributes of this class
    protected String ProductId, name;
    protected float price;

    // defining the behaviour of this class :-

    // created an abstract method calculateDiscount()
    protected abstract float calculateDiscount();

    // created an abstract methods set() and finalPriceCalculator() to set the attributes in child classes without any ambiguity
    abstract public void set(String ProductId, String name, float price);
    abstract public float finalPriceCalculator();

    // created a concrete method displayDetails()
    protected void displayDetails() {
        System.out.println("Name of the Product: " + this.name + "\nID: " + this.ProductId + "\nPrice: " + this.price + "\nDiscount: " + calculateDiscount());
        getTaxDetails();
    }

    // providing definition of method from implemented interface, Taxable
    @Override
    public float calculateTax() {
        if(this instanceof Electronics)
            return (this.price * 18 / 100); // 18% tax
        if(this instanceof Clothing)
            return (this.price * 12 /100); // 12% tax
        return 0;
    }
}

// definition of Electronics class
class Electronics extends Product {
    // declaring the attributes of this class
    private float finalPrice, discount, tax;

    // defining the behaviour of this class :-

    // overriding setter method of Product class
    @Override
    public void set(String ProductId, String name, float price) {
        this.name = name;
        this.ProductId = ProductId;
        this.price = price;
        this.discount = calculateDiscount();
        this.tax = calculateTax();
        this.finalPrice = finalPriceCalculator();
    }

    // creating getter methods
    public String getName() {
        return this.name;
    }

    public String getProductID() {
        return this.ProductId;
    }

    public float getPrice() {
        return this.price;
    }

    public float getFinalPrice() {
        return this.finalPrice;
    }

    // overriding the method from Taxable interface
    @Override
    public void getTaxDetails() {
        System.out.println("Tax on this product is " + this.tax);
    }

    // overriding the abstract method of Product class
    @Override
    protected float calculateDiscount() {
        this.discount = (price * 25 / 100); // reducing 25% of the price
        return this.discount;
    }

    // overriding the abstract method of Product class
    @Override
    public float finalPriceCalculator() {
        return this.price + this.tax - this.discount;
    }

    // overriding the displayDetails method of Product class
    @Override
    public void displayDetails() {
        System.out.println("Name of the Product: " + this.getName() + "\nID: " + this.getProductID() + "\nPrice: " + this.getPrice() +  "\nDiscount: " + this.calculateDiscount() + "\nFinal Price: " + this.getFinalPrice());
        getTaxDetails();
    }
}

// definition of Clothing class
class Clothing extends Product {
    // declaring the attributes of this class
    private float finalPrice, discount, tax;

    // defining the behaviour of this class :-

    // overriding setter method of Product class
    @Override
    public void set(String ProductId, String name, float price) {
        this.name = name;
        this.ProductId = ProductId;
        this.price = price;
        this.discount = calculateDiscount();
        this.tax = calculateTax();
        this.finalPrice = finalPriceCalculator();
    }

    // creating getter methods
    public String getName() {
        return this.name;
    }

    public String getProductID() {
        return this.ProductId;
    }

    public float getPrice() {
        return this.price;
    }

    public float getFinalPrice() {
        return this.finalPrice;
    }

    // overriding the method from Taxable interface
    @Override
    public void getTaxDetails() {
        System.out.println("Tax on this product is " + this.tax);
    }

    // overriding the abstract method of Product class
    @Override
    protected float calculateDiscount() {
        this.discount = (price * 25 / 100); // reducing 25% of the price
        return this.discount;
    }

    // overriding the abstract method of Product class
    @Override
    public float finalPriceCalculator() {
        return this.price + this.tax - this.discount;
    }

    // overriding the displayDetails method of Product class
    @Override
    public void displayDetails() {
        System.out.println("Name of the Product: " + this.getName() + "\nID: " + this.getProductID() + "\nPrice: " + this.getPrice() +  "\nDiscount: " + this.calculateDiscount() + "\nFinal Price: " + this.getFinalPrice());
        getTaxDetails();
    }
}

// definition of Groceries class
class Groceries extends Product {
    // declaring the attributes of this class
    private float finalPrice, discount, tax;

    // defining the behaviour of this class :-

    // overriding setter method of Product class
    @Override
    public void set(String ProductId, String name, float price) {
        this.name = name;
        this.ProductId = ProductId;
        this.price = price;
        this.discount = calculateDiscount();
        this.tax = calculateTax();
        this.finalPrice = finalPriceCalculator();
    }

    // creating getter methods
    public String getName() {
        return this.name;
    }

    public String getProductID() {
        return this.ProductId;
    }

    public float getPrice() {
        return this.price;
    }

    public float getFinalPrice() {
        return this.finalPrice;
    }

    // overriding the method from Taxable interface
    @Override
    public void getTaxDetails() {
        System.out.println("Tax on this product is " + this.tax);
    }

    // overriding the abstract method of Product class
    @Override
    protected float calculateDiscount() {
        this.discount = (price * 25 / 100); // reducing 25% of the price
        return this.discount;
    }

    // overriding the abstract method of Product class
    @Override
    public float finalPriceCalculator() {
        return this.price + this.tax - this.discount;
    }

    // overriding the displayDetails method of Product class
    @Override
    public void displayDetails() {
        System.out.println("Name of the Product: " + this.getName() + "\nID: " + this.getProductID() + "\nPrice: " + this.getPrice() +  "\nDiscount: " + this.calculateDiscount() + "\nFinal Price: " + this.getFinalPrice());
        getTaxDetails();
    }
}

// definition of ProductManagementSystem class
public class ECommercePlatform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for Product details
        System.out.println("Enter number of Products: ");
        int numberOfProducts = sc.nextInt();

        // created an array of references of Product class
        Product [] Products = new Product[numberOfProducts];

        // iterating through a for loop to get input for the Products
        for (int i = 0; i < numberOfProducts; i++) {
            // created variables for taking inputs for the attributes of Products
            System.out.println("Enter Name of Product-" + (i+1));
            String name = sc.nextLine();
            name = sc.nextLine(); // to avoid conflicts while taking inputs

            System.out.println("Enter ID of Product-" + (i+1));
            String productID = sc.next();

            System.out.println("Enter Price of Product-" + (i+1));
            float price = sc.nextFloat();

            // initializing objects
            Products[i] = (productID.charAt(0) == 'C')? new Clothing() :(productID.charAt(0) == 'E')? new Electronics() : new Groceries();

            // setting attribute values
            Products[i].set(productID, name, price);

            // getting the details of Product
            Products[i].displayDetails();
        }
    }
}