package hafta3.proje.kitap.Services;

import hafta3.proje.kitap.Model.Author;
import hafta3.proje.kitap.Model.Book;
import hafta3.proje.kitap.Model.Magazine;
import hafta3.proje.kitap.Model.Product;

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
