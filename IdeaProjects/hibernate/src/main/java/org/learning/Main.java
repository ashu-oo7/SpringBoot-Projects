package org.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien alien = new Alien();
        alien.setName("Prakhar");
        alien.setId(2);
        alien.setDescription("Second Alien");

        Configuration con = new Configuration();
        con.addAnnotatedClass(Alien.class);
        con.configure();

        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(alien);

        transaction.commit();

        session.close();
        sessionFactory.close();



    }
}
