// definition of Order class
class Order {
    // declaring the attributes of this class
    protected String orderID, orderDate;

    // created a parameterized constructor to provide attributes with user defined values
    Order(String orderID, String  orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    // defining the behaviour of this class
    protected void getOrderStatus() {
        System.out.println("Order received on " + this.orderDate + " with order ID " + this.orderID);
    }
}

// definition of ShippedOrder class which inherits the Order class
class ShippedOrder extends Order {
    // declaring the attributes of this class
    protected String trackingNumber;
    protected String shippingDate;

    // created a parameterized constructor to provide attributes with user defined values
    ShippedOrder(String orderID, String orderDate, String trackingNumber) {
        super(orderID, orderDate);
        this.trackingNumber = trackingNumber;
        this.shippingDate = "18-01-2025";
    }

    // overriding the getOrderStatus method
    @Override
    protected void getOrderStatus() {
        System.out.println("product with order ID " + this.orderID + " and " + this.trackingNumber + " tracking-number is shipped on " + this.shippingDate);
    }
}

// definition of DeliveredOrder class
class DeliveredOrder extends ShippedOrder {
    // declaring the attributes of this class
    private String deliveryDate;

    // created a parameterized constructor to provide attributes with user defined values
    DeliveredOrder(String orderID, String orderDate, String trackingNumber) {
        super(orderID, orderDate, trackingNumber);
        this.deliveryDate = "24-01-2025";
        this.getOrderStatus();
    }

    // overriding the getOrderStatus method
    @Override
    protected void getOrderStatus() {
        System.out.println("product with order-ID " + this.orderID + ", and tracking-number " + this.trackingNumber + ", was ordered on " + this.orderDate + ", then it was shipped on " + this.shippingDate + ", and it got delivered by " + this.deliveryDate);
    }

}

// definition of class
public class OnlineRetailOrderManagement {
    public static void main(String[] args)  {
        /*
            created object of DeliveredOrder class and providing values of all required attributes
            this object creation will follow a multilevel inheritance hierarchy
            this object creation will provide us with the order details
        */
        DeliveredOrder order = new DeliveredOrder("001", "17-01-2025", "Order-A-17-01");
    }
}