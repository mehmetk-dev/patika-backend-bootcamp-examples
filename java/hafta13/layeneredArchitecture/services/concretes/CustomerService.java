package hafta13.layeneredArchitecture.services.concretes;

import hafta13.layeneredArchitecture.dao.concretes.CustomerDAO;
import hafta13.layeneredArchitecture.entities.Customer;
import hafta13.layeneredArchitecture.services.abstarcts.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {

    private final CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = new CustomerDAO();
    }

    @Override
    public void save(Customer customer) {
        Customer mailCustomer = customerDAO.findByMail(customer.getEmail());
        if (mailCustomer != null) {
            throw new RuntimeException(customer.getEmail() + " mail zaten kayıtlı.");
        }
        customerDAO.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerDAO.findById(id);
    }

    @Override
    public void deleteById(int id) {
        Customer customer = customerDAO.findById(id);
        customerDAO.delete(customer);
    }

    @Override
    public void update(Customer customer) {
        Customer checkCustomerMail = customerDAO.findByMail(customer.getEmail());
        if (checkCustomerMail != null && checkCustomerMail.getId() != customer.getId()){
            throw new RuntimeException(customer.getEmail() + " mail zaten kayıtlı.");
        }
        customerDAO.update(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerDAO.findAll();
    }
}
