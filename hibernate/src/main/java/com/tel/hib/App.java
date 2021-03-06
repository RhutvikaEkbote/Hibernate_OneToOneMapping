package com.tel.hib;

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
    	
    	Laptop l=new Laptop();
    	l.setLid(1);
    	l.setLname("Lenovo");
    	
    	Laptop lap=new Laptop();
    	lap.setLid(2);
    	lap.setLname("Dell");
    	
    	Alien a= new Alien();
    	a.setAid(100);
    	a.setAname("rhutu");
    	a.setLaptop(l);
    	
    	Alien ali= new Alien();
    	ali.setAid(200);
    	ali.setAname("prashant");
    	ali.setLaptop(lap);
    	
    	 Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);//class
         //ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
         SessionFactory sf = con.buildSessionFactory();//interface
         Session session = sf.openSession(); //interface// it will give you object of session
         
         session.beginTransaction();
         
         session.save(a);
        session.save(ali);
         session.save(l);
         session.save(lap);
         
    session.getTransaction().commit();
    }
}
