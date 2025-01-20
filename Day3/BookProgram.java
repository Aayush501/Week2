// definition of book class
class Book {
    // declaring the attributes of this class
    static String libraryName = "Library-Static";
    private final String isbn;
    private String title, author;
    // declaring private to ensure data security

    // created a parameterized constructor to provide the attributes with user defined values
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // created a static method to display the name of the library
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // created a method to get the details of the book
    void displayBookDetails() {
        System.out.println("Book Name: " + this.title + ", Author: " + this.author + ", ISBN: " + this.isbn);
    }
}

// definition of BookProgram Class
public class BookProgram {
    public static void main(String[] args) {
        // created array of objects of Book Class
        Book[] obj = new Book[5];

        // initializing the objects with user defined values using for loop
        for (int i = 0; i < 5; i++) {
            obj[i] = new Book("Book-"+(i+1), "Writer-" + (i+1), "000-0-0-"+(i+1));
        }

        // displaying the name of the library
        Book.displayLibraryName();

        // displaying the details of books if they are objects of Book class
        for (int i = 0; i < 5; i++) {
            if(obj[i] instanceof Book) { // using instanceof operator to check if object is an instance of Book class
                obj[i].displayBookDetails();
            }
        }
    }
}