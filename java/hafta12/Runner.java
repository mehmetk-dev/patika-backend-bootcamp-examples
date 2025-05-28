package hafta12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        Customer customer = new Customer();
        customer.setAge(30);
        customer.setName("mehmet");
        customer.setEmail("mehmetkerem");

        Product product = Product.builder()
                .name("araba")
                .price(1200)
                .stock(1)
                .customer(customer)
                .build();

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

        List<Object[]> result = session.createQuery(
                "SELECT p.name, p.price, c.name " +
                        "FROM Product p JOIN p.customer c", Object[].class
        ).getResultList();

        for (Object[] row : result) {
            System.out.println("Ürün: " + row[0] + ", Fiyat: " + row[1] + ", Müşteri: " + row[2]);
        }


        List<Product> products = session.createQuery(
                        "FROM Product p WHERE p.customer.name = :name", Product.class)
                .setParameter("name", "mehmet")
                .getResultList();

        List<Object[]> result2 = session.createQuery(
                        "SELECT c.name, COUNT(p) " +
                                "FROM Customer c JOIN c.products p " +
                                "GROUP BY c.name", Object[].class)
                .getResultList();

        for (Object[] row : result2) {
            System.out.println("Müşteri: " + row[0] + ", Ürün Sayısı: " + row[1]);
        }

        List<Customer> customers3 = session.createQuery(
                        "SELECT DISTINCT p.customer FROM Product p WHERE p.stock > 5", Customer.class)
                .getResultList();


        List<Object[]> result4 = session.createQuery(
                        "SELECT p.name, (p.price * p.stock) " +
                                "FROM Product p", Object[].class)
                .getResultList();

        for (Object[] row : result4) {
            System.out.println("Ürün: " + row[0] + ", Toplam Değer: " + row[1]);
        }


        List<Object[]> result5 = session.createQuery(
                        "SELECT c.name, p.name " +
                                "FROM Customer c LEFT JOIN c.products p", Object[].class)
                .getResultList();

        for (Object[] row : result5) {
            System.out.println("Müşteri: " + row[0] + ", Ürün: " + row[1]);
        }

        List<Product> expensive = session.createQuery(
                        "FROM Product p WHERE p.price > (SELECT AVG(price) FROM Product)", Product.class)
                .getResultList();


        session.getTransaction().commit();
        session.close();
    }
}
