package Hafta3.Proje.Kitapçı.Model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productList;
    private User user;
    private Double total;

    public Order(List<Product> productList, User user) {
        this.productList = productList;
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Double getTotal() {

        double total = 0;
        for (Product product : productList) {
            total += product.getPrice();
        }
        return total;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productList=" + productList +
                ", user=" + user +
                ", total=" + getTotal() +
                '}';
    }
}
