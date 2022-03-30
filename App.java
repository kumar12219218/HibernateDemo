package com.simplilearn.webapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  
    	Configuration configuration=new Configuration();
    	configuration.configure("Hibernate.cfg.xml");
    	configuration.addAnnotatedClass(Song1.class);
    	SessionFactory sessionFactory=configuration.buildSessionFactory();
    	Session session=sessionFactory.openSession();
        Song1 s=new Song1();
        s.setId(2);
        s.setSinger("hema");
        s.setSongName("emantavo");
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();
        System.out.println("song saved... chech db..");
        
    }
}
