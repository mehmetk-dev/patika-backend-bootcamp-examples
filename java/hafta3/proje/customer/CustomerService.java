package hafta3.proje.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    static Scanner scanner = new Scanner(System.in);
    List<Customer> customerList = new ArrayList<>();

    public void addCostumer(String name, String phoneNumber, String email) {
        Customer customer = new Customer(name, phoneNumber, email);
        customerList.add(customer);
    }

    public void listCostumer() {

        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public static void updateCustomer(Customer customer) {

        System.out.println("Which information would you like to update?");
        int choise = scanner.nextInt();
        scanner.nextLine();

        if (choise == 1) {
            System.out.println("Please enter new name");
            String name = scanner.nextLine();
            customer.setName(name);
        } else if (choise == 2) {
            System.out.println("Please enter new address");
            String address = scanner.nextLine();
            customer.setAddress(address);
        } else if (choise == 3) {
            System.out.println("Please enter new email");
            String email = scanner.nextLine();
            customer.setEmail(email);
        } else if (choise == 4) {
            System.out.println("Please enter new phone");
            String phone = scanner.nextLine();
            customer.setPhoneNumber(phone);
        } else {
            System.out.println("Wrong value");
        }
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public String toString() {
        return "CustomerService{" +
                "customerList=" + customerList +
                '}';
    }
}
