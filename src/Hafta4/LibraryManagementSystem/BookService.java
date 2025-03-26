package Hafta4.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Locale;

public class BookService {

    // List to store all books
    private ArrayList<Book> books = new ArrayList<>();

    // Method to add a new book to the library
    public boolean addBook(String title,String author,String ISBN) {

        Book book = new Book(title,author,ISBN);
            if (isBookExists(ISBN)) {// Check if a book with the same ISBN already exists in the library
                return false;// Return false if the book exists (duplicate ISBN)
            }
        books.add(book);
        return true;// Return true if the book is added successfully
    }
        // Method to list all books in the library
        public void listBooks() {

            if (books.isEmpty()) { // Check if the library is empty
                System.out.println("No books found.");
                return;
            }

            System.out.println("All books:");
            System.out.println("--------------------");

            // Iterate through each book and print its details
            for (Book book : books) {
                printBookInfo(book);// Call the method to print book details
            }
        }
    // Method to search for a book by its title
    public void searchBookByTitle(String title){

        boolean found = false; // Flag to check if any book is found

        // Iterate through each book to check if the title contains the search query
        for (Book book : books) {
            if (book.getTitle().contains(title)){
                if (!found){
                    System.out.println("Founded books:");
                    System.out.println("--------------------");
                    found = true;
                }
                printBookInfo(book); // Print book details
            }
        }

        if (!found){ // If no book is found, print a message
            System.out.println("Book not found.");
        }
    }

    // Method to check out a book by its ISBN
    public void checkOutBook(String isbn) {

        boolean found = false;// Flag to check if the book exists

        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                found = true;
                if(!book.isAvaible()) { // Check if the book is already checked out
                    System.out.println("Book is already checked out.");
                }else {
                    book.setAvailable(false); // Mark the book as checked out
                    System.out.println("Book checked out successfully.");
                }
                return; // Exit the method after checking out the book
            }
        }

        if (!found) {  // If the book is not found, print a message
                System.out.println("Book not found.");
        }
    }

    // Method to return a book by its ISBN
    public void returnBook(String isbn) {

        boolean found = false; // Flag to check if the book exists

        // Iterate through the books list to find the book by ISBN
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                found = true;
                if (book.isAvaible()){ // If the book is already available, display a message
                    System.out.println("Book is already available.");
                }else {
                    book.setAvailable(true); // Mark the book as available (returned)
                    System.out.println("Book returned successfully.");
                }
            }
        }

        if (!found) { // If the book is not found, print a message
            System.out.println("Book not found.");
        }
    }

    // Method to check if a book already exists in the library based on ISBN
    public boolean isBookExists(String ISBN) {
        for (Book b : books) {
            if (b.getISBN().equals(ISBN)) {
                return true; // Return true if the book exists
            }
        }
        return false; // Return false if the book does not exist
    }

    // Helper method to print the details of a book
    public static void printBookInfo(Book book){
        System.out.println("Title: "+ book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Status: " + (book.isAvaible() ? "Available" : "Borrowed"));
        System.out.println("--------------------");
    }
}
