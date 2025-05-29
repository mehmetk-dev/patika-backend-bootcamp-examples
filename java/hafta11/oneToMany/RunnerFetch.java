package hafta11.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(House.class)
                .addAnnotatedClass(Room.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        House h1 = session.get(House.class, 2L);
        session.getTransaction().commit();
        session.close();

        System.out.println(h1);
    }
}
