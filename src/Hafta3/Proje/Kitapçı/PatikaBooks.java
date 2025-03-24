package Hafta3.Proje.Kitapçı;

import Hafta3.Proje.Kitapçı.Model.*;
import Hafta3.Proje.Kitapçı.Services.AuthorService;
import Hafta3.Proje.Kitapçı.Services.OrderService;
import Hafta3.Proje.Kitapçı.Services.ProductService;
import Hafta3.Proje.Kitapçı.Services.UserService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class PatikaBooks {
    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.listUsers();

        AuthorService authorService = new AuthorService();
        authorService.createAuthor("Mehmet","Kerem");
        Author author = authorService.findAuthor("Mehmet");

        ProductService productService = new ProductService();
        productService.createProduct("Java",100,author, LocalDate.of(2021,1,1));
        productService.createProduct("Python",200,author, LocalDate.of(2021,1,1));
        productService.createProduct("C++",300,author, LocalDate.of(2021,1,1));
        productService.createProduct("Javas",100);

        OrderService orderService = new OrderService();

        Scanner scanner = new Scanner(System.in);

        while (true){


            System.out.println("1.Müşteri Kaydı");
            System.out.println("2.Sipariş Ver");
            System.out.println("3.Siparişlerimi görüntüle");
            System.out.println("4.Ürünleri görüntüle");
            System.out.println("5.Çıkış.");

            int choise =scanner.nextInt();
            scanner.nextLine();

            switch (choise){
                case 1:
                    System.out.println("Elektronik Mailinizi giriniz: ");
                    String email = scanner.nextLine();
                    System.out.println("İsminizi giriniz: ");
                    String name = scanner.nextLine();
                    System.out.println("Şifrenizi giriniz: ");
                    String password = scanner.nextLine();
                    userService.createUser(name,email,password);
                case 2:
                    System.out.println("Müşteri email adersini giriniz:");
                    String email1 = scanner.nextLine();
                    User foundEmail = userService.findEmail(email1);
                    System.out.println("Ürün ismini giriniz:");
                    String productName = scanner.nextLine();
                    Product foundProductName = productService.findProductByName(productName);
                    orderService.createOrder(List.of(foundProductName),foundEmail);
                    break;
                case 3:
                    System.out.println("Müşteri email adersini giriniz:");
                    String email2 = scanner.nextLine();
                    User foundEmail2 = userService.findEmail(email2);
                    orderService.listOrdersByEmail(foundEmail2);
                case 4:
                    System.out.println("-----Ürün Listesi-----");
                    productService.listProducts();
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz işlem seçtiniz!!!!!!!");
            }
        }
    }
}
