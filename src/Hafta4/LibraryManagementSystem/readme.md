# Library Management System

Welcome to the **Library Management System** project. This project is a simple Java-based application that allows users to manage a library by adding, listing, searching, checking out, and returning books.

## Features

- **Add a New Book:**
    - Enter book title, author, and ISBN.
    - Prevent duplicate entries by checking ISBN.

- **Display All Books:**
    - Lists all books in the library with details including title, author, ISBN, and status.

- **Search for a Book by Title:**
    - Search functionality is case-insensitive.
    - If multiple books match the search criteria, all matching books are displayed (with "Founded books:" printed only once).

- **Check Out a Book:**
    - Mark a book as checked out by providing its ISBN.
    - Prevent checking out if the book is already checked out.

- **Return a Book:**
    - Mark a book as available again by providing its ISBN.
    - Provides a message if the book is already available.

- **User-Friendly Console Menu:**
    - Displays menu options and handles invalid input gracefully using try-catch blocks for `InputMismatchException`.

## Project Structure

- **LibrarySystem.java:**  
  Contains the `main` method, displays the menu, and handles user input.

- **BookService.java:**  
  Contains the business logic for managing books (adding, listing, searching, checking out, and returning). Also provides helper methods like `printBookInfo` and `isBookExists`.

- **Book.java:**  
  Represents the book entity with attributes such as title, author, ISBN, and availability. It includes getters and setters for these fields.

## Requirements

- Java JDK 8 or higher.

## How to Compile and Run

1. **Compile the Project:**  
   Open your terminal (or command prompt) and navigate to the project directory. Then compile the Java source files:

   ```bash
   javac -d bin src/Hafta4/LibraryManagementSystem/*.java

2. **Run the Application:**
After compilation, run the application from the bin directory:
      ```bash
   java Hafta4.LibraryManagementSystem.LibrarySystem
3. **Using the Application:**

   The application will display a menu with the following options:

- 1. Add a new book
- 2. Display all books
- 3. Search for a book by title
- 4. Check out a book
- 5. Return a book
- 6. Exit

Enter the corresponding number for the desired action. Invalid inputs (e.g., non-numeric entries) are handled gracefully.

**Error Handling**

- InputMismatchException:

If the user enters a non-numeric value when a number is expected (for example, in the menu selection), the program catches the exception and displays an "Invalid option!" message.

- Empty Field Validation:

The application checks that required fields (book title, author, ISBN) are not empty before proceeding with any operation.

**Contributing**    
Contributions are welcome! Feel free to fork the repository, make improvements, and submit a pull request.

**License**

This project is provided under the MIT License.


   