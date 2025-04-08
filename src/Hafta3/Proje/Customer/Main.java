package Hafta3.Proje.Customer;

import java.util.Scanner;

public class Main {
    public static final String USER_NOT_FOUND = "No such user found.";

    static CustomerService service = new CustomerService();

    static OrderService orderService = new OrderService();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choose;
        service.listCostumer();
        while(true){

            showMenu();
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose){
                case 1:
                    addCustomer();
                    break;
                case 2:
                    deleteCustomer();
                    break;
                case 3:
                    getAndUpdateCustomer();
                    break;
                case 4 :
                    listCustomer();
                    break;
                case 5:
                    addOrder();
                    break;
                case 6:
                    update();
                    break;
                case 7:
                    orderService.listOrder();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Wrong Value");
                    break;
            }
        }
    }

    public static void showMenu(){
        System.out.println("---------------");
        System.out.println("Welcome Customer Management System");
        System.out.println("Our operations");
        System.out.println("1-)Add Customer");
        System.out.println("2-)Delete Customer");
        System.out.println("3-)Update Customer");
        System.out.println("4-)List all Customer");
        System.out.println("5-)Add Order");
        System.out.println("6-)Update Payment");
        System.out.println("7-)List all Orders");
        System.out.println("Press 8 to exit.");
        System.out.println("Choose your operation.");
    }

    public static void addCustomer(){
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter Phone number:");
        String phone = scanner.nextLine();
        System.out.println("Enter Email Address");
        String email = scanner.nextLine();

        service.addCostumer(name,phone,email);
    }

    public static void listCustomer(){
        service.listCostumer();
    }

    public static boolean isThereId(int id){
        for (Customer customer : service.getCustomerList()){
            if (customer.getCustomer_Id() == id){
                return true;
            }
        }
        return false;
    }

    public static void getAndUpdateCustomer(){
        System.out.println("Enter the id number you want to update");
        int id = scanner.nextInt();

        Customer customer = findCustomerById(id);
        if (customer != null){
                printCustomerInformation(customer);
                CustomerService.updateCustomer(customer);
                printCustomerInformation(customer);
        }else{
                System.out.println(USER_NOT_FOUND);
            }
        }

    public static void deleteCustomer(){
        System.out.println("Enter the id number you want to delete");
        int num = scanner.nextInt();

        if (service.customerList.removeIf(n -> n.getCustomer_Id() == num)){
            listCustomer();
        }else{
            System.out.println(USER_NOT_FOUND);
        }
    }

    public static void printCustomerInformation(Customer customer){
        System.out.println("ID = " + customer.getCustomer_Id());
        System.out.println("1-Name = " +  customer.getName());
        System.out.println("2-Address = " + customer.getAddress());
        System.out.println("3-Email = " + customer.getEmail());
        System.out.println("4-Phone = " + customer.getPhoneNumber());
        }

    public static void addOrder(){
        System.out.println("Enter the id of the user you want to order.");
        int idNum = scanner.nextInt();
        scanner.nextLine();

        if (findCustomerById(idNum) == null){
            System.out.println(USER_NOT_FOUND);
        }else{

            System.out.println("Enter the product.");
            String product = scanner.nextLine();

            System.out.println("Enter the price of the .");
            double price = scanner.nextDouble();

            Customer customer = findCustomerById(idNum);
            orderService.addOrder(product,price,customer);
        }
    }



    public static Customer findCustomerById(int id){

       for (Customer customer : service.getCustomerList()){
           if (customer.getCustomer_Id() == id){
               return customer;
           }
       }
       return null;
    }

    public static void update(){
        System.out.println("Enter the name of the product whose status you want to change");
        String str = scanner.nextLine();

        for (Order order : orderService.orderList){
            if (order.getProduct().equals(str)) {
                orderService.updatePayment(order);
            }
        }
    }
}
