package Hafta3.Proje.Kitapçı;

import Hafta3.Proje.Kitapçı.Model.Author;
import Hafta3.Proje.Kitapçı.Model.Book;
import Hafta3.Proje.Kitapçı.Model.Product;
import Hafta3.Proje.Kitapçı.Services.AuthorService;
import Hafta3.Proje.Kitapçı.Services.ProductService;
import Hafta3.Proje.Kitapçı.Services.UserService;

import java.time.LocalDate;

public class PatikaBooks {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.createUser("Mehmet","mehmetkerem@gmail.com","mehmet619");
        userService.createUser("Mehmet","mehmetkerem@gmail.com","mehmet619");
        userService.createUser("Mehmet","mehmetkerem@gmail.com","mehmet619");
        userService.listUsers();

        AuthorService authorService = new AuthorService();
        authorService.createAuthor("Mehmet","Kerem");
        Author author = authorService.findAuthor("Mehmet");

        ProductService productService = new ProductService();
        productService.createProduct("Java",100,author, LocalDate.of(2021,1,1));
        productService.createProduct("Python",200,author, LocalDate.of(2021,1,1));
        productService.createProduct("C++",300,author, LocalDate.of(2021,1,1));
        productService.listProducts();
    }
}
