package hafta13.layeneredArchitecture.view;

import hafta13.layeneredArchitecture.dao.concretes.CustomerDAO;
import hafta13.layeneredArchitecture.entities.Customer;
import hafta13.layeneredArchitecture.services.concretes.CustomerService;

import java.util.List;

public class App {

    public static CustomerService customerService = new CustomerService(new CustomerDAO());

    public static void main(String[] args) {

//        Customer customer = new Customer();
//        customer.setAge(329);
//        customer.setName("umut");
//        customer.setEmail("patika@mail");
//
//        customerService.save(customer);

//        Customer customer  = customerService.findById(42);

//        customerService.deleteById(2);

//        List<Customer> customerList = customerService.findAll();
//        customerList.forEach(System.out::println);

        Customer customer = customerService.findById(1);
        customer.setEmail("patika@mail2 ");
        customerService.update(customer);
    }
}
