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
            }catch (InputMismatchException e){
                System.out.println("Invalid option!");
                continue;
            }

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayAllBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    bookCheckout();
                    break;
                case 5:
                    bookReturn();
                    break;
                case 6:
                    System.out.println("Thank you for using our service");
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

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

    public static void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine().trim();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine().trim();

        if (isEmptyField(title, author, isbn)) {
            System.out.println("Please enter all fields.");
            return;
        }
        boolean added = bookService.addBook(title, author, isbn);

        if (added) {
            System.out.println("Book added successfully.");
        } else {
            System.out.println("A book with this ISBN already exists.");
        }
    }

    public static void displayAllBooks(){
        bookService.listBooks();
    }

    public static void searchBook(){
        System.out.print("Enter the title of the book you want to search for:");
        String title = scanner.nextLine().trim();
        if (title.isEmpty()) {
            System.out.println("Book title cannot be empty.");
        } else {
            bookService.searchBookByTitle(title);
        }
    }

    public static void bookCheckout(){
        System.out.print("Enter the ISBN of the book you want to check out:");
        String isbn = scanner.nextLine().trim();
        if (isEmptyField(isbn)){
            System.out.println("ISBN cannot be empty.");
            return;
        }
        bookService.checkOutBook(isbn);
    }

    public static void bookReturn(){
        System.out.print("Enter the ISBN of the book you want to return:");
        String isbn = scanner.nextLine().trim();
        if (isEmptyField(isbn)){
            System.out.println("ISBN cannot be empty.");
            return;
        }
        bookService.returnBook(isbn);
    }

    public static boolean isEmptyField(String... fields){
       for (String field : fields) {
            if (field.isEmpty()) {
                return true;
            }
       }
       return false;
    }
}
