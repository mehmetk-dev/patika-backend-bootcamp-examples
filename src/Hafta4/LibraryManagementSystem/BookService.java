package Hafta4.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Locale;

public class BookService {

    private ArrayList<Book> books = new ArrayList<>();

    public boolean addBook(String title,String author,String ISBN) {

        Book book = new Book(title,author,ISBN);
            if (isBookExists(ISBN)) {
                return false;
            }
        books.add(book);
        return true;
    }

        public void listBooks() {

            if (books.isEmpty()) {
                System.out.println("No books found.");
                return;
            }

            System.out.println("All books:");
            System.out.println("--------------------");

            for (Book book : books) {
                printBookInfo(book);
            }
        }

    public void searchBookByTitle(String title){

        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().contains(title)){
                if (!found){
                    System.out.println("Founded books:");
                    System.out.println("--------------------");
                    found = true;
                }
                printBookInfo(book);
            }
        }

        if (!found){
            System.out.println("Book not found.");
        }
    }

    public void checkOutBook(String isbn) {

        boolean found = false;

        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                found = true;
                if(!book.isAvaible()) {
                    System.out.println("Book is already checked out.");
                }else {
                    book.setAvailable(false);
                    System.out.println("Book checked out successfully.");
                }
                return;
            }
        }

        if (!found) {
                System.out.println("Book not found.");
        }
    }

    public void returnBook(String isbn) {

        boolean found = false;

        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                found = true;
                if (book.isAvaible()){
                    System.out.println("Book is already available.");
                }else {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully.");
                }
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public boolean isBookExists(String ISBN) {
        for (Book b : books) {
            if (b.getISBN().equals(ISBN)) {
                return true;
            }
        }
        return false;
    }

    public static void printBookInfo(Book book){
        System.out.println("Title: "+ book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("ISBN: " + book.getISBN());
        System.out.println("Status: " + (book.isAvaible() ? "Available" : "Borrowed"));
        System.out.println("--------------------");
    }
}
