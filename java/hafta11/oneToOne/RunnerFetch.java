package hafta11.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Computer.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Student student1 = session.get(Student.class, 1L);

        session.getTransaction().commit();
        session.close();

        System.out.println(student1);
    }
}
