package hafta3.proje.customer;

import java.time.LocalDate;

public class Order {

    private String product;
    private double price;
    private String paymentStatus;
    private LocalDate orderDate;
    private Customer customer;


    public Order(String product, double price, String paymentStatus,Customer customer) {
        this.product = product;
        this.price = price;
        this.paymentStatus = paymentStatus;
        this.orderDate = LocalDate.now();
        this.customer = customer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
