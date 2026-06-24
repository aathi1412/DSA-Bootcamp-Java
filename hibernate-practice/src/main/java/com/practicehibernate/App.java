package com.practicehibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        // class name is a table name
        // variables are columns
        
        Student s1 = new Student();
        s1.setRollNo(103);
        s1.setName("Zoro");
        s1.setAge(20);

        // ---------configuration setup---------

        // Configuration config = new Configuration();
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(com.practicehibernate.Student.class).buildSessionFactory();
        Session session = factory.openSession();

        // Transaction used for add, update, delete and not for get data
        Transaction transaction = session.beginTransaction();

        // ---------add data
        // session.persist(s1);

        // ------------get date
        // Student s1 = session.find(Student.class, 101);  

        //  ------------ update date
        // session.merge(s1);

        // --------------delete date
        // session.remove(s1);  

        // Transaction commit used for add, update, delete and not for get data
        transaction.commit();
        System.out.println(s1);
        
    }
}
