package hafta12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

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

        List<Customer> customers = session.createQuery("FROM Customer", Customer.class).getResultList();
        for (Customer c : customers) {
            System.out.println(c.getName() + " - " + c.getEmail());
        }

        List<Customer> adults = session.createQuery("FROM Customer WHERE age > 18", Customer.class).getResultList();

        Customer c = session.createQuery("FROM Customer WHERE email = :email", Customer.class)
                .setParameter("email", "mehmetkerem")
                .uniqueResult();

        List<String> names = session.createQuery("SELECT name FROM Customer", String.class).getResultList();


        Long count = session.createQuery("SELECT COUNT(*) FROM Customer", Long.class).uniqueResult();
        System.out.println("Toplam müşteri: " + count);

        List<Customer> sorted = session.createQuery("FROM Customer ORDER BY age DESC", Customer.class).getResultList();

        session.createQuery("UPDATE Customer SET email = :newEmail WHERE name = :name")
                .setParameter("newEmail", "yeniemail@example.com")
                .setParameter("name", "mehmet")
                .executeUpdate();


        session.createQuery("DELETE FROM Customer WHERE name = :name")
                .setParameter("name", "mehmet")
                .executeUpdate();


        List<Object[]> results = session.createQuery("SELECT age, COUNT(*) FROM Customer GROUP BY age", Object[].class).getResultList();

        for (Object[] row : results) {
            System.out.println("Age: " + row[0] + ", Count: " + row[1]);
        }

        session.persist(customer);

        session.getTransaction().commit();
        session.close();
    }
}
