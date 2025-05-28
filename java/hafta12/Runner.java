package hafta12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Runner {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();

        Customer customer = new Customer();
        customer.setAge(30);
        customer.setName("mehmet");
        customer.setEmail("mehmetkerem");

        session.beginTransaction();

        session.persist(customer);

        session.getTransaction().commit();
        session.close();
    }
}
