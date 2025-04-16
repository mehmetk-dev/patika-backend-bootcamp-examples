package Hafta3.Proje.Kitapçı.Services;

import Hafta3.Proje.Kitapçı.Model.Author;
import Hafta3.Proje.Kitapçı.Model.Book;
import Hafta3.Proje.Kitapçı.Model.Magazine;
import Hafta3.Proje.Kitapçı.Model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void createProduct(String name, double price,Author author,LocalDate releaseDate){
        Product book = new Book(name,price,author,releaseDate);
        products.add(book);
    }

    public void createProduct(String name, double price){
        Product magazine = new Magazine(name,price);
        products.add(magazine);
    }

    public void listProducts(){
        for (Product product : products){
            System.out.println(product);
        }
    }

    public Product findProductByName(String productName) {
        Product foundProduct = null;

        for (Product product : products){
            if (product.getName().equals(productName)){
                foundProduct = product;
                break;
            }
        }
        return foundProduct;
    }
}
