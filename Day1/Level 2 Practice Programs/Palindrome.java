import java.util.Scanner; //importing Scanner class

// definition of PalindromeChecker class
class PalindromeChecker {
    // created the attributes of the class
    private String text; // kept it private to maintain data security

    // created a method to check if a string is palindrome or not
    private boolean checkPalindrome() {
        // iterating through the text to find if it is a palindrome or not
        for (int i = 0; i < text.length() / 2; i++) {
            if(text.charAt(i) != text.charAt(text.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // created a method to display if a string is palindrome or not
    public void isPalindrome(String text) {
        this.text = text;
        if (checkPalindrome()) {
            System.out.println(text + " is a palindrome");
        } else {
            System.out.println(text + " is not a palindrome");
        }
    }
}

public  class Palindrome{
    public  static  void  main(String[] args){
        Scanner sc = new Scanner(System.in); // object of scanner class
        // created a string variable text and taking input for that
        String text = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker(); // object of PalindromeChecker class

        // checking if input text is palindrome
        pc.isPalindrome(text);

        sc.close();
    }
}