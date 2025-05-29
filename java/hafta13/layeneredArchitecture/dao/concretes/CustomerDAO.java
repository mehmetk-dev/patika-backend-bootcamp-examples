package hafta13.layeneredArchitecture.dao.concretes;

import hafta13.layeneredArchitecture.core.HibernateSession;
import hafta13.layeneredArchitecture.dao.abstracts.ICustomerDAO;
import hafta13.layeneredArchitecture.entities.Customer;
import org.hibernate.Session;
import org.hibernate.query.SelectionQuery;

import java.util.List;

public class CustomerDAO implements ICustomerDAO {

    private final Session session;

    public CustomerDAO() {
        this.session = HibernateSession.getSession();
    }


    @Override
    public void save(Customer customer) {
        this.session.beginTransaction();
        session.persist(customer);
        this.session.getTransaction().commit();
    }

    @Override
    public Customer findById(int id) {
        return this.session.get(Customer.class, id);
    }

    @Override
    public void update(Customer customer) {
        this.session.beginTransaction();
        session.persist(customer);
        this.session.getTransaction().commit();
    }

    @Override
    public void delete(Customer customer) {
        this.session.beginTransaction();
        this.session.remove(customer);
        this.session.getTransaction().commit();
    }

    @Override
    public List<Customer> findAll() {
        return this.session.createSelectionQuery("FROM Customer", Customer.class).getResultList();
    }

    @Override
    public Customer findByMail(String mail) {
        SelectionQuery<Customer> query = session.createSelectionQuery("FROM Customer WHERE email = :mail", Customer.class);
        query.setParameter("mail", mail);
        return query.getSingleResultOrNull();
    }
}
