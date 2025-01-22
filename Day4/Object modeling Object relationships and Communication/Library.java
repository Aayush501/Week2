// importing required package for using ArrayList
import java.util.*;

// definition of Book class to represent independent book entities
class Book {
    // declaring the attributes of this class
    String title;  // stores the title of the book
    String author; // stores the author of the book

    // created a parameterized constructor to initialize attributes
    Book(String title, String author) {
        this.title = title;  // assigning the title to the instance variable
        this.author = author; // assigning the author to the instance variable
    }
}

// definition of Library class to aggregate multiple Book objects
public class Library {
    // declaring an ArrayList to store Book objects, demonstrating aggregation
    private ArrayList<Book> books = new ArrayList<Book>();

    // created a constructor to initialize the books list
    Library() {
        this.books = new ArrayList<Book>(); // initializing an empty book list
    }

    // created a method to add a book to the library
    public void addBook(Book b) {
        books.add(b); // adding book object to the books list
    }

    // created a method to display the details of all books in the library
    void display() {
        // iterating through the book list to display each book's details
        for (Book b : books) {
            System.out.println(b.title + " : " + b.author);
        }
    }

    // definition of the main method to demonstrate aggregation
    public static void main(String[] args) {
        // creating an object of Library class to represent a library
        Library lib = new Library();

        // creating independent Book objects that exist outside the library
        Book b1 = new Book("Book-A", "Writer-A");
        Book b2 = new Book("Book-B", "Writer-B");
        Book b3 = new Book("Book-C", "Writer-C");

        // adding books to the library to show aggregation relationship
        lib.books.add(b1);
        lib.books.add(b2);
        lib.books.add(b3);

        // displaying the details of all books in the library
        lib.display();
    }
}
