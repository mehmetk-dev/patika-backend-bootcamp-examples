package hafta11.oneToOne_birateral;

import hafta11.oneToOne.Computer;
import hafta11.oneToOne.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {

    public static void main(String[] args) {

    SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
            .addAnnotatedClass(Student02.class)
            .addAnnotatedClass(Computer02.class)
            .buildSessionFactory();

    Session session = factory.openSession();

        session.beginTransaction();

    Student02 student1 = session.get(Student02.class,1L);

        session.getTransaction().commit();
        session.close();

        System.out.println(student1);
    }
}
