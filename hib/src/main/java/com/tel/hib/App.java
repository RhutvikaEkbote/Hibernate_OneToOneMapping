package com.tel.hib;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Laptop lap=new Laptop();
    	lap.setBrand("hp");
    	lap.setPrice(9989);
    	
    	Laptop lapi= new Laptop();
    	lapi.setBrand("lenovo");
    	lapi.setPrice(76656);
    	
    	Alien a=new Alien();
    	
    	a.setAid(102);
    	a.setAname("kelu");
    	a.setColor("pink");
    	
    	
    	
    	Alien a1=new Alien();
    	a1.setAid(103);
    	a1.setAname("melu");
    	a1.setColor("blue");
    	
    	
    	
    	 Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);//class
         SessionFactory sf = con.buildSessionFactory();//interface
         Session session = sf.openSession(); //interface// it will give you object of session
         
         session.beginTransaction();
        
         Query q1 = session.createQuery("from Alien where aid=102");
         q1.setCacheable(true);
         a=(Alien) q1.uniqueResult();
    
         System.out.println(a);
         session.getTransaction().commit();
         session.close();
         
         
         
         Session session1 = sf.openSession();
         session1.beginTransaction();
         
         Query q2 = session1.createQuery("from Alien where aid=103 ");
         q2.setCacheable(true);
         a1=(Alien) q2.uniqueResult();
    
         System.out.println(a1);
         session1.getTransaction().commit();
         session1.close();
         
         
        
    }
}
