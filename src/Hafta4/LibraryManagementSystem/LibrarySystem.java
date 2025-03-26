package Hafta4.LibraryManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibrarySystem {

    static Scanner scanner = new Scanner(System.in);
    static BookService bookService = new BookService();
    public static void main(String[] args) {
        System.out.println("Welcome to Library Management System");

        int choice;

        while(true){
            showMenu();

            try{
                choice = scanner.nextInt();
                scanner.nextLine();
            }catch (InputMismatchException e){ // Catch exception if the input is not an integer
                System.out.println("Invalid option!"); // Print error message if input is invalid
                continue; // Continue the loop and prompt the user again
            }

            switch (choice) {
                case 1:
                    addBook(); // Add a new book
                    break;
                case 2:
                    displayAllBooks(); // Display all books in the library
                    break;
                case 3:
                    searchBook();  // Search for a book by title
                    break;
                case 4:
                    bookCheckout();  // Check out a book
                    break;
                case 5:
                    bookReturn(); // Return a book
                    break;
                case 6:
                    System.out.println("Thank you for using our service"); // Exit the system
                    return;
                default:
                    System.out.println("Invalid option!"); // Handle invalid option selection
                    break;
            }
        }
    }

    // Helper method to check if any of the input fields are empty
    public static boolean isEmptyField(String... fields){
        for (String field : fields) {
            if (field.isEmpty()) {
                return true; // Return true if any field is empty
            }
        }
        return false; // Return false if all fields are filled
    }

    // Display the main menu with options for the user
    public static void showMenu(){
        System.out.println("\nPlease select an option:");
        System.out.println("1. Add a new book");
        System.out.println("2. Display all books");
        System.out.println("3. Search for a book by title");
        System.out.println("4. Check out a book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
        System.out.println("Enter your choice:");
    }

    // Add a new book to the library
    public static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine().trim();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine().trim();

        // Check if any field is empty
        if (isEmptyField(title, author, isbn)) {
            System.out.println("Please enter all fields.");
            return;
        }
        // Add the book if it doesn't already exist
        boolean added = bookService.addBook(title, author, isbn);

        // Confirm if the book was successfully added
        if (added) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("A book with this ISBN already exists.");  // Error message if book already exists
        }
    }
    // Display all books in the library
    public static void displayAllBooks(){
        bookService.listBooks(); // Call the method to list all books
    }
    // Search for a book by its title
    public static void searchBook(){
        System.out.print("Enter the title of the book you want to search for:");
        String title = scanner.nextLine().trim();
        if (title.isEmpty()) {
            System.out.println("Book title cannot be empty.");
        } else {
            bookService.searchBookByTitle(title); // Search for the book by title
        }
    }

    // Check out a book using its ISBN
    public static void bookCheckout(){
        System.out.print("Enter the ISBN of the book you want to check out:");
        String isbn = scanner.nextLine().trim();
        if (isEmptyField(isbn)){
            System.out.println("ISBN cannot be empty.");
            return;
        }
        bookService.checkOutBook(isbn);// Call the method to check out the book
    }
    // Return a book using its ISBN
    public static void bookReturn(){
        System.out.print("Enter the ISBN of the book you want to return:");
        String isbn = scanner.nextLine().trim();
        if (isEmptyField(isbn)){
            System.out.println("ISBN cannot be empty.");
            return;
        }
        bookService.returnBook(isbn); // Call the method to return the book
    }


}
