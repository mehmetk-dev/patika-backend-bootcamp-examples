package Hafta3.Proje.Kitapçı.Services;

import Hafta3.Proje.Kitapçı.Model.Order;
import Hafta3.Proje.Kitapçı.Model.Product;
import Hafta3.Proje.Kitapçı.Model.User;

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
