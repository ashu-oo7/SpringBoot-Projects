package org.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Configuration con = new Configuration();
        con.addAnnotatedClass(Customer.class).addAnnotatedClass(Orders.class);
        con.configure();
        List<Orders> orders = new ArrayList<>();
        Orders order1 = new Orders();
        order1.setName("Lemon Tea");

        Customer customer = new Customer();
        customer.setName("Lewis");
        customer.setAddress("Lorem ipsum dolor sit amet");

        order1.setCustomer(customer);

        orders.add(order1);


        customer.setOrders(orders);

        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(customer);
        session.persist(order1);

        transaction.commit();

        session.close();
        sessionFactory.close();



    }
}
