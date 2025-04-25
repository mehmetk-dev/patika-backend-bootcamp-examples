package hafta3.proje.customer;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    List<Order> orderList = new ArrayList<>();
    public String newOrderStatus = "Waiting";
    public String paidStatus = "Paid";

    public void addOrder(String product, double price,Customer customer){

        Order order = new Order(product,price,newOrderStatus,customer);

        customer.setOrder(order);
        orderList.add(order);
    }
    public void listOrder(){

        for (Order order : orderList){
            System.out.println(order);
        }
    }

    public void updatePayment(Order order){
        order.setPaymentStatus(paidStatus);
    }

}
