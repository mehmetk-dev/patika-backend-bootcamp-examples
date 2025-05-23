package hafta11.oneToOne_birateral;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {

    public static void main(String[] args) {

        Computer02 c1 = new Computer02(1L,"Casper","Excalibur");
        Computer02 c2 = new Computer02(2L,"Monster","Abra");
        Computer02 c3 = new Computer02(3L,"MSI","Gaming");

        Student02 s1 = new Student02(1L,31,"Mehmet",c1);
        Student02 s2 = new Student02(2L,32,"Murat",c2);
        Student02 s3 = new Student02(3L,33,"Emre",c3);

        c1.setStudent02(s1);
        c2.setStudent02(s2);
        c3.setStudent02(s3);

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student02.class)
                .addAnnotatedClass(Computer02.class)
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
