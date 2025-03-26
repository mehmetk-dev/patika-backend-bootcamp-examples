package Hafta4.LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvaible;


    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvaible = true;
    }
    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvaible() {
        return isAvaible;
    }

    public void setAvailable(boolean available) {
        isAvaible = available;
    }
}


