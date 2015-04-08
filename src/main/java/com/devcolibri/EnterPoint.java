package com.devcolibri;

import com.devcolibri.entity.User;
import com.devcolibri.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by Andrew on 4/8/2015.
 */
public class EnterPoint {

    public static void main(String args[]){
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("ndrew");
        user.setLastName("olenteev");

        session.save(user);
        session.getTransaction().commit();
    }
}
