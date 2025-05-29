package hafta13.layeneredArchitecture.services.abstarcts;

import hafta13.layeneredArchitecture.entities.Customer;

import java.util.List;

public interface ICustomerService {

    void save(Customer customer);

    Customer findById(int id);

    void deleteById(int id);

    void update(Customer customer);

    List<Customer> findAll();
}
