import java.util.Scanner;

// definition of Book class
class Book{
	
	// definition of attributes of Book class
    String title, author;
    int price;

    // parameterized constructor to initialize attributes of book
    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // definition of the method to print book details
    public void printBookDetails(){
        System.out.println("Title of book : " + title);
        System.out.println("Author of book : " + author);
        System.out.println("Price of book : " + price);
    }
}

// definition of BookDetails class
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // input data
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();

        // initializing class using object
        Book book = new Book(title, author, price);
        // using printBookDetails method
        book.printBookDetails();
		
		sc.close(); // closing the scanner object
    }
}
