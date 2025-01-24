import java.time.Year; // importing year class to store the year of publication

// definition of Book class
class Book {
    // declaring the attributes of this class
    protected String title;
    protected Year publicationYear;

    // defining the behaviour of this class
    protected void displayInfo(){
        System.out.println("This is a book and it's attributes are undefined yet.");
    }
}

// definition of Author class that extends the Book class
class Author extends Book {
    // declaring the attributes of this class
    private String name, bio;

    // created a parameterized constructor to provide attributes with user defined attributes
    Author(String name, String bio, String publishedBook, Year publicationYear) {
        this.name = name;
        this.bio = bio;
        this.title = publishedBook;
        this.publicationYear = publicationYear;
    }

    // overriding displayInfo method
    @Override
    protected void displayInfo() {
        System.out.println("Author " + this.name + "'s bio: " + this.bio + "\n" + this.name + " has published " + this.title + " in year " + this.publicationYear);
    }
}

// definition of BooksAndAuthors class
public class BooksAndAuthors {
    public static void main(String[] args) {
        // created variables to define the attributes of Author class
        String name = "Aayush Kumar";
        String bio = "I am a book writer.";
        String publishedBook = "Book-1";
        Year publicationYear = Year.of(2021);

        // created the object of Author class and calling the overridden method
        Author author1 = new Author(name, bio, publishedBook, publicationYear);
        author1.displayInfo();
    }
}