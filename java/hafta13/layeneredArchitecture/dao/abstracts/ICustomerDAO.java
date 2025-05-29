package hafta13.layeneredArchitecture.dao.abstracts;

import hafta13.layeneredArchitecture.entities.Customer;

import java.util.List;

public interface ICustomerDAO {

    void save(Customer customer);

    Customer findById(int id);

    void update(Customer customer);

    void delete(Customer customer);

    List<Customer> findAll();

    Customer findByMail(String mail);
}
