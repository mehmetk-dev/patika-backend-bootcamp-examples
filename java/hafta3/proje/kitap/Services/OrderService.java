package hafta3.proje.kitap.Services;

import hafta3.proje.kitap.Model.Order;
import hafta3.proje.kitap.Model.Product;
import hafta3.proje.kitap.Model.User;

import java.util.ArrayList;
import java.util.List;

public class OrderService {


    private static List<Order> orderList = new ArrayList<>();


    public void createOrder(List<Product> productList, User user){

        Order order = new Order(productList,user);
        orderList.add(order);
    }
    public void listOrders(){
        for (Order order : orderList){
            System.out.println(order);
        }
    }
    public void listOrdersByEmail(User email){
        for (Order order: orderList){
            if (order.getUser().getEmail().equals(email)){
                System.out.println(order);
            }
        }
    }

}
