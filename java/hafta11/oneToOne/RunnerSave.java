package hafta11.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave {

    public static void main(String[] args) {

        Computer c1 = new Computer(1L, "Casper", "Excalibur");
        Computer c2 = new Computer(2L, "Monster", "Abra");
        Computer c3 = new Computer(3L, "MSI", "Gaming");

        Student s1 = new Student(1L, 31, "Mehmet", c1);
        Student s2 = new Student(2L, 32, "Murat", c2);
        Student s3 = new Student(3L, 33, "Emre", c3);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Computer.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        session.persist(c1);
        session.persist(c2);
        session.persist(c3);
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);


        session.getTransaction().commit();
        session.close();
    }
}
