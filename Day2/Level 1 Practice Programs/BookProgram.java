// definition of Book class
class Book {

    // declaring the attributes of this class
    // declaring the attributes as private to maintain the data security
    private String title, author;
    private float price;

    // creating the non-parameterized constructor
    Book () {
        // assigning default values to the attributes
        title = "unknown";
        author = "undefined";
        price = 0.0f;

        // displaying the values of the attributes
        System.out.println("By non-parameterized constructor: ");
        System.out.println("\ttitle: " + this.title + ", author: " + this.author + ", price: " + this.price);
    }

    // creating the parameterized constructor
    Book (String title, String author, float price) {
        // assigning actual values to the attributes
        this.title = title;
        this.author = author;
        this.price = price;

        // displaying the values of the attributes
        System.out.println("By parameterized constructor: ");
        System.out.println("\ttitle: " + this.title + ", author: " + this.author + ", price: " + this.price);
    }
}

// definition of BookProgram class
public class BookProgram {
    public static void main(String[] args) {
        // creating the object of Book class
        Book book = new Book(); // default values to the variable should have been assigned

        // providing the actual values to book object attributes using parameterized constructor
        book = new Book("New Book", "Author-A", 500.0f);
    }
}
